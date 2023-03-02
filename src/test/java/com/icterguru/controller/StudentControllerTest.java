/**
 * 
 */
/*
package com.icterguru.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.icterguru.entity.Student;
import com.icterguru.error.StudentNotFoundException;
import com.icterguru.service.IStudentService;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IStudentService stdService;
	
	private Student std;
	
	@BeforeEach
	public void setUp() throws Exception {

		System.out.println("Before each in StudentControllerTest.....");

		Student std = 
				Student.builder()
				.studentName("Mokter Hossain")
				.studentEmail("MokterHossain@gmail.com")
				.studentPhone("123456789")
				.studentNotes("Hi there, This is Mokter Hossain")				.build();
	}

	@Test
	
	void saveStudent() throws Exception {
		
		assertEquals("Hello World", "Hello World");
		
		Student inputStudent = 
		Student.builder()
		.studentName("Mokter Hossain")
		.studentEmail("MokterHossain@gmail.com")
		.studentPhone("123456789")
		.studentNotes("Hi there, This is Mokter Hossain")	
		.build();

		Mockito.when(stdService.saveStudentRecord(inputStudent));

 	
		mockMvc.perform(MockMvcRequestBuilders.post("/students")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\n" + 
						"\t\"studentName\": \"Mokter Hossain\",\n" + 
						"\t\"studentEmail\": \"MokterHossain@gmail.com\",\n" + 
						"\t\"studentPhone\": \"123456789\",\n" + 
						"\t\"studentNotes\": \"Hi there, This is Mokter Hossain\"\n" + 
						"}")).andExpect(MockMvcResultMatchers.status().isOk());
						
		
		//@ Minute 3:57  https://www.youtube.com/watch?v=zvR-Oif_nxg
	
			
	}

	@Test
		void fetchStudentById() throws StudentNotFoundException {
		
		assertEquals("Hello World", "Hello World");
		
		
		Mockito.when(stdService.fetchStudentRecordById(1))
		.thenReturn(std);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/students/1")
				.contentType(MediaType.APPLICATION_JSON))
				.addExpect(status().isOk())
				.andExpect(jsonPath("$.studentName").
				value(std.getStudentName()));
						
		
		//@ Minute 3:59  https://www.youtube.com/watch?v=zvR-Oif_nxg
	
	}

}
*/

