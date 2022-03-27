package com.Employee;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Empcontroller {

	@Autowired
	EmpDAO dao;
	
	@RequestMapping("insert")
	public ModelAndView insert(@RequestParam("empno") int empno,@RequestParam("empname") String empname,HttpServletRequest req,HttpServletResponse res)
	{
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpno(empno);
		e.setEmpname(empname);
		Employee e1=dao.insert(e);
		if(e1!=null) {
			mv.setViewName("status");
		}
		return mv;
	}
	
	@RequestMapping("get")
	public ModelAndView get(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		List<Employee> e=dao.getall();
		mv.setViewName("display");
		mv.addObject("list", e);
		return mv;
	}
	
	
}
