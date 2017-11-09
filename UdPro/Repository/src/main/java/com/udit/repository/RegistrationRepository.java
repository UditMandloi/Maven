package com.udit.repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.udit.model.RegistrationDTO;

@Repository
public class RegistrationRepository {
	
	public RegistrationRepository() {
		System.out.println("Registration Repository Object");
	}
	
	@Autowired
	private HibernateTemplate hibernateTemplate ;
	
	
	public List findbyEmail(RegistrationDTO registrationDTO) {
		List list = hibernateTemplate.find("select r.email from RegistrationDTO r where r.email=?",registrationDTO.getEmail());	
		return list;	
	}
	
	public void registrationSave(RegistrationDTO registrationDTO)
	{
		System.out.println("Inside Registration Repository");
		hibernateTemplate.save(registrationDTO);
		
	}

}
