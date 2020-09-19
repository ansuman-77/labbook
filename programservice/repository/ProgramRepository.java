 package com.cg.iter.programservice.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.iter.programservice.entity.ProgramEntity;
@Repository
public interface ProgramRepository extends CrudRepository<ProgramEntity, String> {


	

}
