package com.udit.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udit.model.ProductDTO;
import com.udit.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService proser;
	
	@RequestMapping(value="/product",method= {RequestMethod.POST,RequestMethod.GET})
	public String proCon(Map<String, Object> map,@ModelAttribute("ProductDTO") ProductDTO pro,HttpServletRequest req)
	{
	
		if(req.getMethod().equals("GET"))
		{
			System.out.println("CONTROLLER GET CODE");
			ProductDTO prodto = new ProductDTO();
			map.put("ProductDTO", prodto);
			return "product";
		}
		else
		{
			System.out.println("CONTROLLER POST CODE");
			
			List list =proser.proSer(pro);
			map.put("pdto",list);
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				ProductDTO pdto=(ProductDTO)itr.next();
				System.out.println(pdto.getProname()+" "+pdto.getProprise()+" "+pdto.getProcode());
			}
			return "product";
		}
		
	}
	

}
