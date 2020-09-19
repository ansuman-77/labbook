package com.cg.iter.programservice.service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.dao.TransientDataAccessException;
import org.springframework.stereotype.Service;

import com.cg.iter.programservice.entity.ProgramEntity;
import com.cg.iter.programservice.repository.ProgramRepository;

@Service
public class ProgramServiceImpl implements ProgramService {
	
	

	
	@Autowired
	ProgramRepository repo;
	
	


	@Override
	public ProgramEntity findProgramById(String Id) {
		
		Optional<ProgramEntity> programinfo= repo.findById(Id);
		if(programinfo.isPresent())
		{
			ProgramEntity program=programinfo.get();
			return program;
		}
		return null;
		
		
		
	}

	public boolean updateProgram(ProgramEntity program) {
	 if (program.equals(repo.findById(program.getId()).get()))
	 {
		repo.save(program);
		return true;
	 					}
	 else{return false;}
	
}

	@Override
	public boolean deleteProgramById(String Id) {
		if (Id.equals(repo.findById(Id).get().getId()) )
		{
			repo.deleteById(Id);
			return true;
		}
		else {
			return false;
		}

	}

	@Override
	public boolean addProduct(ProgramEntity program) {
		if (program.equals(repo.findById(program.getId())))
		{
		
		return false;
		}
		
		
		else
		{ 
			
			repo.save(program);
			return true;
		}
		
	
	}
			
			
			
		
}	
		
	
		
	


