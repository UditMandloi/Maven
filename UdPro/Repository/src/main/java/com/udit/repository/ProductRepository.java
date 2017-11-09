package com.udit.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.udit.model.ProductDTO;

@Repository
public class ProductRepository
{

	@Autowired
	private HibernateTemplate hibertemp;
	
	public List proRes(ProductDTO prodto)
	{
		System.out.println("hibertemp.save(prodto) Insert");
		hibertemp.save(prodto);
		System.out.println("REPOSITORY");
		System.out.println("----------------------------");
		System.out.println(prodto.getProname()+" "+prodto.getProprise()+" "+prodto.getProcode());
		System.out.println("----------------------------");
		
		System.out.println("SELECT QUERY");
		List list=hibertemp.find("from ProductDTO");
		return list;	
	}
}


