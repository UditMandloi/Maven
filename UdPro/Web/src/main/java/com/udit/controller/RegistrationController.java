package com.udit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.udit.model.RegistrationDTO;
import com.udit.service.RegistrationService;
import com.udit.validator.RegistrationValidation;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationValidation registrationValidation ;
	
	@Autowired
	private RegistrationService registrationService ;
	
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showRegistration(Map<String, Object> map) {
		RegistrationDTO registrationDTO  = new RegistrationDTO();
		map.put("RegistrationDTO", registrationDTO);
		System.out.println("REGISTRATION GET CODE");
		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String checkRegistration(@ModelAttribute("RegistrationDTO")  RegistrationDTO registrationDTO,BindingResult result,final RedirectAttributes redirectAttributes) {
		
		registrationValidation.validate(registrationDTO, result);
		
		if(result.hasErrors())
		{
			return "registration";
		}
		else
		{
		System.out.println("Registration Success POST CODE");
		
		registrationService.registrationService(registrationDTO);
		
		redirectAttributes.addFlashAttribute("RegistrationDTO",registrationDTO);
		return "redirect:/login";
		}
	}

}
