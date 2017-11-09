package com.udit.controller.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.udit.model.RegistrationDTO;

@Controller
public class RegistrationControllerWebService {
	
	@RequestMapping(method=RequestMethod.GET,value="/registration/{id}")
	public @ResponseBody RegistrationDTO getRegistration(@PathVariable Integer id)
	{
		RegistrationDTO registrationDTO=new RegistrationDTO();
		registrationDTO.setId(id);
		registrationDTO.setFname("Udit");
		registrationDTO.setLname("Mandloi");
		
		System.out.println("WebService-controller");
		return registrationDTO;
	}
	
}
