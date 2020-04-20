package com.cg.iter.service;

import com.cg.iter.bean.Author;
import com.cg.iter.dao.AuthorDaoImpl;

public class AuthorServiceImpl implements AuthorService{

	AuthorDaoImpl dao = new AuthorDaoImpl();

		//adding author using dao object
		
	@Override
	public boolean addAuthor(Author author) {
		return dao.addAuthor(author);
	}

	//updating author using dao object
	@Override
	public Author updateAuthor(Author author) {
		return dao.updateAuthor(author);
	}

	//deleting author using dao object
	
	@Override
	public boolean deleteAuthor(Integer id) {
		return dao.deleteAuthor(dao.findAuthor(id));
	}
	
	////finding author using dao object
	public Author findAuthor(Integer id) {
		return dao.findAuthor(id); 


	}	

}
