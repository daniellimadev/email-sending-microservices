package com.github.daniellimadev.microservice.user.producer;

import com.github.daniellimadev.microservice.user.DTOs.EmailDto;
import com.github.daniellimadev.microservice.user.entity.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(User user) {
        var emailDTO = new EmailDto();

        emailDTO.setUserId(user.getUserID());
        emailDTO.setEmailTo(user.getEmail());
        emailDTO.setSubject("Registration completed successfully!");
        emailDTO.setText(user.getName() + ", Welcome to)! \nThank you for registering, enjoy all the features of our platform now!");

        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }

}
