package com.cg.iter.programservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.iter.programservice.entity.ProgramEntity;

public interface ProgramService {
	public boolean addProduct(ProgramEntity program);
	public ProgramEntity findProgramById(String userId);
	public boolean updateProgram(ProgramEntity program);
	public boolean deleteProgramById(String Id);

}
