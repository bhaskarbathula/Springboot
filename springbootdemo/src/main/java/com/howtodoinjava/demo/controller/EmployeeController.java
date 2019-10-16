package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		employeesList.add(new Employee(1,"bathula","vijay","vbr431@gmail.com"));
	        employeesList.add(new Employee(3,"reddy","vijaya","vbr433@gmail.com"));
	        employeesList.add(new Employee(4,"malakonda reddy","bathula","kondareddy@gmail.com"));
	        employeesList.add(new Employee(4,"malakonda reddy","bathula","kondareddy@gmail.com"));
	        
		return employeesList;
    }

}
