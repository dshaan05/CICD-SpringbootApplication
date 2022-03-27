package com.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpDAO {

	@Autowired
	EmRep empr;
	public Employee insert(Employee e) {
		return empr.save(e); 
	}
	
	public List<Employee> getall(){
		return empr.findAll();
	}
	
	
}
