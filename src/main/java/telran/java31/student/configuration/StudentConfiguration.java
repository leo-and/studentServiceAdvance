package telran.java31.student.configuration;


import org.springframework.context.annotation.Configuration;

import telran.java31.student.service.StudentService;
import telran.java31.student.service.StudentServiceImpl;

@Configuration
public class StudentConfiguration {
	
	//@Bean
	public StudentService getStudentService() {
		return new StudentServiceImpl();
	}

}
