package com.udit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udit.model.RegistrationDTO;
import com.udit.model.UserDTO;
import com.udit.service.LoginService;
import com.udit.service.RegistrationService;

@Controller
public class WelCome {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcome() {
		System.out.println("WELCOME GET CODE ");
		return "welcome";
	}

	@RequestMapping(value = "/singlepage", method = RequestMethod.GET)
	public String showSinglePage() {
		System.out.println("SINGLEPAGE GET CODE");
		return "singlepage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(@ModelAttribute("RegistrationDTO") RegistrationDTO registrationDTO ,Map<String, Object> map) {
		
		System.out.println("UserName : "+registrationDTO.getFname());
		System.out.println("Password : "+registrationDTO.getPassword());
		UserDTO userDTO  = new UserDTO();
		map.put("UserDTO", userDTO);
		System.out.println("LOGIN GET CODE");
		return "login";
	}

	@RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("UserDTO") UserDTO userDTO ) {
		System.out.println("Login Success POST CODE");
		System.out.println(userDTO.getEmail());
		System.out.println(userDTO.getPassword());
		loginService.loginService(userDTO);
		return "submitLogin";
	}
}
