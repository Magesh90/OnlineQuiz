package com.OnlineQuiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineQuiz.Service.QuizService;
import com.OnlineQuiz.model.Question;

@Controller
public class QuestionController {
	@Autowired
	QuizService QuizServiceImpl;

	@RequestMapping("/question")
	public String getQuestion(Model model) {
		Question question = new Question();
		question.setQuestionNumber(1);
		ModelAndView mav=new ModelAndView("questions");
		question.setQuestion("What is Spring-Boot");
		mav.addObject("question", question);
		return "questions";
	}

	@ResponseBody
	@RequestMapping("/hello")
	String load() {
		return "Spring Boot Initializer " + QuizServiceImpl.generateQuestions();

	}
}
