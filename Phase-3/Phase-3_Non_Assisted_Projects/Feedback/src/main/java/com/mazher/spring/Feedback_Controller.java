package com.mazher.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Feedback_Controller {
	
	@Autowired
	private FeedbackService service;

	
	@GetMapping("/feedback")
	public ModelAndView index() {
	    return new ModelAndView("feed");
	}
	
	
	
	@PostMapping("/feedback")
	public String userRegister(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("email") String email , @RequestParam("feedback") String feedback) {
	Feedback f = new Feedback(firstname, lastname, email,feedback);
	boolean data= service.addFeedback(f);
	if(data) {
		return "Feedback added succesfully!";
	}
	else {
		return "Unable to add the feedback";
	}
		
	}

}
