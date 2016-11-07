package com.OnlineQuiz.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ComponentScan({"com.OnlineQuiz.starter","com.OnlineQuiz.controller"})
public class OnlineQuizStarter {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OnlineQuizStarter.class, args);
	}

}
