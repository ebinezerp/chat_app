package com.chat_app.backend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
@ComponentScan("com.chat_app.backend")
public class AppWebSocketConfiguration extends AbstractWebSocketMessageBrokerConfigurer{

	    @Override
	    public void configureMessageBroker(MessageBrokerRegistry registry) {
	    	// TODO Auto-generated method stub
	    	registry.enableSimpleBroker("/topic");
	    	registry.setApplicationDestinationPrefixes("/app");
	    }
	    
	    public void registerStompEndpoints(StompEndpointRegistry registry) {
	    	System.out.println("hello");
	        registry.addEndpoint("/chat").setAllowedOrigins("*").withSockJS();
	    }
}
