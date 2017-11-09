package com.udit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udit.model.UserDTO;
import com.udit.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	public void loginService(UserDTO userDTO)
	{
		
		System.out.println("Inside Service");
		System.out.println(userDTO.getEmail());
		System.out.println(userDTO.getPassword());
		loginRepository.loginRepository(userDTO);
		loginRepository.getLogin(userDTO);
	}
	

}
