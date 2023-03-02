/*
package com.icterguru.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.icterguru.entity.Student;
import com.icterguru.repository.IStudentRepository;

@SpringBootTest
public class StudentServiceTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	
	Student std;
	
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Before each in StudentServiceTest.....");
		std = new Student(); 

		std.setStudentName("Mokter Hossain");
		std.setStudentEmail("MokterHossain@gmail.com");
		std.setStudentPhone("123456789");
		std.setStudentPhone("Hi there, This is Mokter Hossain");
		
	Mockito.when(stdRepository.findByStudentNameIgnoreCase("Mokter Hossain")).thenReturn(std);

	

	
	}

	@AfterEach
	public void tearDown() throws Exception {

		System.out.println("After each.....");
	}


	@Autowired
	private IStudentService stdService;

	//@MockBean
	private IStudentRepository stdRepository;


	@Test
	public void whenStudentNameIsValid_thenStudentNameShouldBeFound() {

//		String stdName = "Mokter Hossain";
		//		String  foundStdName = stdService.fetchStudentByName(stdName).getStdName();
		//		assertEquals(stdName, foundStdName);
//		assertEquals("Hello World", "Hello World");
//		Student foundStdName = stdService.fetchStudentByName(stdName);
//		assertEquals(stdName, foundStdName.getStdName());
//		assertNotEquals("Hello World", "Hello World!!");


	}



}


*/