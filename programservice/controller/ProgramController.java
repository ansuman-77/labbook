package com.cg.iter.programservice.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.programservice.entity.ProgramEntity;
import com.cg.iter.programservice.service.ProgramService;
@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/programservice")
public class ProgramController {
	
	

	@Autowired
	ProgramService service;

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addProgram(@RequestBody ProgramEntity program )
	{
		if(program==null || program.name==null || program.Id==null || program.eligibility==null || program.duration==null || program.description==null||program.degreeCertificateOffered==null ) 
	{ 
		return "false";
		
		
	}
		boolean result=service.addProduct(program);
		return "success";
		

		
	}
	@RequestMapping(value="/findbyId",method=RequestMethod.POST)
	public Optional<ProgramEntity> findProgramById(@RequestParam("Id") String id)
	{
	if(id==null)
	{
		return null;
		
	}
	
	
		ProgramEntity result =service.findProgramById(id);
		System.out.println("program: " + result);
		return Optional.ofNullable(result);
		
	}
	
	
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateProgram(@RequestBody ProgramEntity program)
	{
		if(program==null || program.name==null || program.Id==null || program.eligibility==null || program.duration==null || program.description==null||program.degreeCertificateOffered==null ) 
		{ 
			return "false";
			
			
		}
		boolean result =service.updateProgram(program);
		return "true";
		
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteProgramById(@RequestParam("id") String Id)
	{
		if(Id==null)
		{
			return "false";
			
		}
		boolean result = service.deleteProgramById(Id);
		return "result";
		
	}
	
	
	

}
