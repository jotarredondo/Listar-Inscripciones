package com.desafiolatam.facade;

import java.util.List;

import com.desafiolatam.dao.CursoDAO;
import com.desafiolatam.dao.InscripcionDAO;
import com.desafiolatam.dto.CursoDTO;
import com.desafiolatam.dto.InscripcionDTO;

public class Facade {
	
	
	public List <CursoDTO> findAll (){
		CursoDAO cursoDao = new CursoDAO();
		return cursoDao.findAll();
	}

	public CursoDTO findById(Object id) {
		CursoDAO cursoDao = new  CursoDAO();
		return cursoDao.findById(id);	
	}
	
	public boolean create (CursoDTO cursoDto) {
		CursoDAO cursoDao = new CursoDAO();
		return cursoDao.create(cursoDto);
	}
	
	public boolean update(CursoDTO cursoDto) {
		CursoDAO cursoDao = new CursoDAO();
		return cursoDao.update(cursoDto);	
	}
	
	public boolean delete(CursoDTO cursoDto) {
		CursoDAO cursoDao = new CursoDAO();
		return cursoDao.delete(cursoDto);	
	}
	
	public List<InscripcionDTO> obtieneInscripciones (){
		InscripcionDAO inscripcionDao = new InscripcionDAO();
		return inscripcionDao.findAll();
	}
	
}
