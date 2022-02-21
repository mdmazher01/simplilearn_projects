package com.mazher.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
	
	
	@Autowired
	private MyRepos myRepo;
	
	public boolean addFeedback(Feedback f) {
		myRepo.save(f);
		return true;
	}
}
