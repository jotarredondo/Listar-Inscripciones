package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.conexion.Conexion;
import com.desafiolatam.dto.InscripcionDTO;

public class InscripcionDAO implements InterfaceCRUD <InscripcionDTO>{
	
	private Connection cnn;
	private final String SQL_SELECT_ALL = "SELECT id_insc, nombre, celular, id_curso, id_forma_de_pago FROM inscripcion";
	

	@Override
	public List<InscripcionDTO> findAll() {
		
		List <InscripcionDTO> inscripciones = new ArrayList<InscripcionDTO>();
		PreparedStatement ps;
		ResultSet rs;
		
		try {
			cnn = Conexion.obtenerConexion().getConexion();
			ps = cnn.prepareStatement(SQL_SELECT_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				InscripcionDTO inscripcionDto = new InscripcionDTO();
					inscripcionDto.setIdInsc(rs.getInt("id_insc"));
					inscripcionDto.setNombre(rs.getString("nombre"));
					inscripcionDto.setCelular(rs.getString("celular"));
					inscripcionDto.setIdCurso(rs.getInt("id_curso"));
					inscripcionDto.setIdFormaDePago(rs.getInt("id_forma_de_pago"));
					inscripciones.add(inscripcionDto);
			}
			Conexion.cerrarConexion(cnn);
			return inscripciones;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		return null;
	}

	@Override
	public InscripcionDTO findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(InscripcionDTO objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(InscripcionDTO objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(InscripcionDTO objeto) {
		// TODO Auto-generated method stub
		return false;
	}



}
