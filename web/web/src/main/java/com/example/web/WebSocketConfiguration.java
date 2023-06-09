package com.example.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
    @Override
    /*
    the endpoint where the client will connect
    */
    public void registerStompEndpoints(StompEndpointRegistry registry) {
       registry.addEndpoint("/stomp-endpoint").withSockJS();
    }

    @Override
    /*
    enable a simple memory-based message broker
    to carry the greeting messages back to the client
    on destinations prefixed with /topic
    */
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }
}
