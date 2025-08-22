package com.premsai.springboot.learn_jap_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.premsai.springboot.learn_jap_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"Learn AWS Free","Prof. Fang Yuan"));
		repository.save(new Course(2,"Learn Azure Free","Prof. Fang Yuan"));
		repository.save(new Course(3,"Learn Devops Free","Prof. Fang Yuan"));
		
		//repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());	
		System.out.println(repository.findByAuthor("Prof. Fang Yuan"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Devops Free"));
		System.out.println(repository.findByName(""));
		
		
	}

}
