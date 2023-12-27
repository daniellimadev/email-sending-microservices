package com.github.daniellimadev.microservice.email.consumers;

import com.github.daniellimadev.microservice.email.DTO.EmailRecordDto;
import com.github.daniellimadev.microservice.email.entity.Email;
import com.github.daniellimadev.microservice.email.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;


    @RabbitListener(queues = "${broker.queue.email.name}" )
    public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {
        var email = new Email();
        BeanUtils.copyProperties(emailRecordDto, email);
        emailService.sendEmail(email);
    }

}
