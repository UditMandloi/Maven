package com.udit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udit.model.ProductDTO;
import com.udit.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prores;
	
	public List proSer(ProductDTO prodto)
	{
		System.out.println("SERVICE");
		System.out.println("----------------------------");
		System.out.println(prodto.getProname()+" "+prodto.getProprise()+" "+prodto.getProcode());
		System.out.println("----------------------------");
		
		System.out.println("CALL proRes()");
		
		List list=prores.proRes(prodto);
		
		return list;
	
	}
}
