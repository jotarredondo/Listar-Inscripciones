package com.desafiolatam.dao;

import java.util.List;

public interface InterfaceCRUD <Random> {
	
	public List<Random> findAll();

	public Random findById (Object id);
	
	public boolean create (Random objeto);
	
	public boolean update(Random objeto);
	
	public boolean delete(Random objeto);
		
	
	

}
