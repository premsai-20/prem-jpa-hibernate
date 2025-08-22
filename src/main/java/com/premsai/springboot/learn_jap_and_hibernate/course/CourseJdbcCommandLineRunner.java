package com.premsai.springboot.learn_jap_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.premsai.springboot.learn_jap_and_hibernate.course.jdbc.CourseJdbcRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Learn AWS Free","Prof. Fang Yuan"));
		repository.insert(new Course(2,"Learn Azure Free","Prof. Fang Yuan"));
		repository.insert(new Course(3,"Learn Devops Free","Prof. Fang Yuan"));
		
		repository.deleteById(1);
		
		System.out.println(repository.selectById(2));
		System.out.println(repository.selectById(3));
		
	}

}
