package com.chat_app.backend.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.chat_app.backend.model.Message;
import com.chat_app.backend.model.OutputMessage;
import com.fasterxml.jackson.annotation.JsonFormat;

@Controller
@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		
		Message message=new Message();
		message.setMessage("hello");
		
		model.addAttribute("data",message);
		
		return "redirect:/test";
	}

	@MessageMapping("/chat/")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(@Payload Message message) {
		System.out.println("hello");
		return new OutputMessage(message, new Date());
	}
	
	
	@GetMapping("/test")
	public String test(@ModelAttribute("data")Message m,Model model)
	{
		System.out.println(m);
		System.out.println(m.getMessage());
		
		return "index";
	}
}
