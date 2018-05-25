package com.spk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spk.dto.EmpDTO;
import com.spk.service.EmpService;
@Controller
public class EmpController {
	@Autowired(required=true)
	@Qualifier(value="service")
	private EmpService service;
	public void setService(EmpService service) {
		this.service = service;
	}

	//public ModelAndView(String viewName, String modelName, Object modelObject)
	@RequestMapping("/add")
	public ModelAndView getEmps(HttpServletRequest request,HttpServletResponse response) {
	List<EmpDTO> dto=service.getEmps();	
	return new ModelAndView("ListEmps","empList",dto);
	}
}
