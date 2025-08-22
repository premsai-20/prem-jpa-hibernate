package com.premsai.springboot.learn_jap_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.premsai.springboot.learn_jap_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Learn AWS Free","Prof. Fang Yuan"));
		repository.insert(new Course(2,"Learn Azure Free","Prof. Fang Yuan"));
		repository.insert(new Course(3,"Learn Devops Free","Prof. Fang Yuan"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}

}
