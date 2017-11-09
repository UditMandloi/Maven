package com.udit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udit.model.RegistrationDTO;
import com.udit.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository ;
	
	public void registrationService(RegistrationDTO registrationDTO)
	{
		
		System.out.println("Inside Registration Service");

		registrationRepository.registrationSave(registrationDTO);

		
	}
}
