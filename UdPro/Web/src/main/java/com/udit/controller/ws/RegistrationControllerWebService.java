package com.udit.controller.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.udit.model.RegistrationDTO;
import com.udit.repository.RegistrationRepository;

@Controller
public class RegistrationControllerWebService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	
	
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
	
	@RequestMapping(value = "/registration/save", method = RequestMethod.POST)
	@ResponseBody
	public RegistrationDTO save(@RequestBody RegistrationDTO registrationDTO) {
		registrationRepository.registrationSave(registrationDTO);
		return registrationDTO;

	}
}
