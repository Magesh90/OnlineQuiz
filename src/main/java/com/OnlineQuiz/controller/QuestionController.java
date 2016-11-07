package com.OnlineQuiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.OnlineQuiz.model.Question;

@Controller
public class QuestionController {

	@RequestMapping("/question")
	public String getQuestion(Model model){
		Question question=new Question();
		question.setQuestionNumber(1);
		question.setQuestion("What is Spring-Boot");
		model.addAttribute("question", question);
		return "questionview";
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	String load() {
		return "Spring Boot Initializer";

	}
}
