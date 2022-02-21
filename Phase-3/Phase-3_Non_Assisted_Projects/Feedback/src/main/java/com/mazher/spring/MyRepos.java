package com.mazher.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepos extends CrudRepository<Feedback, Integer>{

}
