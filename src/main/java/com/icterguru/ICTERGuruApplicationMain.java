package com.icterguru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.icterguru.entity.Teacher;
import com.icterguru.repository.TeacherRepository;

@SpringBootApplication
@EnableConfigurationProperties
public class ICTERGuruApplicationMain implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ICTERGuruApplicationMain.class, args);
	}

	@Autowired
	private TeacherRepository teacherRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		//String lastName, String firstName, String email, String phone, String dept, String rank, String notes
		
		/*
		 * Teacher t1 = new Teacher("Hossain", "Mokter", "mokter@gmail.com", "11111111",
		 * "CS", "Professor", "Good teacher"); teacherRepository.save(t1); Teacher t2 =
		 * new Teacher("Hossain", "Mosaddek", "mosaddek@gmail.com", "20222222", "CSE",
		 * "Professor", "Good teacher"); teacherRepository.save(t2);
		 */	
	}

}
