package com.udit.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.udit.model.UserDTO;

@Repository
public class LoginRepository {
	public LoginRepository() {
		System.out.println("Login Repository Object");
	}
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List getLogin(UserDTO user) {


		List list = hibernateTemplate.find("from UserDTO u where u.id=1");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			UserDTO userDTO = (UserDTO) it.next();
			System.out.println("Email " + userDTO.getEmail());
			System.out.println("Password " + userDTO.getPassword());
			
		}
		
		return list;	
	}

	public void loginRepository(UserDTO dto)
	{
		System.out.println("Inside Repository");
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());
	}
}
