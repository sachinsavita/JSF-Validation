package com.displaydatausing.ListAndTable;

import java.util.*;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;
	
	public StudentDataUtil()
	{
		loadSampleData();
	}

	public void loadSampleData() {
		
		students = new ArrayList<>();
		
		students.add(new Student("Mary", "Cooper", "mary@gmail.com"));
		students.add(new Student("Jhon", "Doe", "jhon@gmail.com"));
		students.add(new Student("Kobe", "Brook", "kobe@gmail.com"));
		students.add(new Student("Steve", "Harvy", "steve@gmail.com"));
		
		
	}

	public List<Student> getStudents() {
		
		return students;
	}

	
	

}
