package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.conexion.Conexion;
import com.desafiolatam.dto.CursoDTO;

public class CursoDAO  implements InterfaceCRUD <CursoDTO>{
	
	private Connection cnn;
	private final String SQL_INSERT = "INSERT INTO curso(id_curso, descripcion,precio) VALUES (?,?,?)";
	private final String SQL_UPDATE = "UPDATE curso SET descripcion =?, precio = ? WHERE id_curso = ?";
	private final String SQL_DELETE = "DELETE from curso WHERE id_curso = ?";
	private final String SQL_SELECT_ALL = "SELECT id_curso, descripcion, precio FROM curso";
	private final String SQL_SELECT_ID = "SELECT id_curso,descripcion,precio FROM curso WHERE id_curso = ?";
	
	

	@Override
	public List<CursoDTO> findAll() {
		List <CursoDTO> cursos = new ArrayList<CursoDTO>();
		PreparedStatement ps;
		ResultSet rs;
		
		
		try {
			cnn = Conexion.obtenerConexion().getConexion();
			ps = cnn.prepareStatement(SQL_SELECT_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				CursoDTO cursoDto = new CursoDTO();
					cursoDto.setIdCurso(rs.getInt("id_curso"));
					cursoDto.setDescripcion(rs.getString("descripcion"));
					cursoDto.setPrecio(rs.getDouble("precio"));
					cursos.add(cursoDto);
			}
			Conexion.cerrarConexion(cnn);
			return cursos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public CursoDTO findById(Object id) {
		
		PreparedStatement ps;
		ResultSet rs;
		CursoDTO cursoDto = null;
		
		try {
			cnn = Conexion.obtenerConexion().getConexion();
			ps = cnn.prepareStatement(SQL_SELECT_ID);
			ps.setInt(1,(int)id);
			rs = ps.executeQuery();
			while(rs.next()) {
				cursoDto = new CursoDTO();
				cursoDto.setIdCurso(rs.getInt("id_curso"));
				cursoDto.setDescripcion(rs.getString("descripcion"));
				cursoDto.setPrecio(rs.getDouble("precio"));	
			}
			Conexion.cerrarConexion(cnn);
			return cursoDto;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
			
	}

	@Override
	public boolean create(CursoDTO objeto) {
		PreparedStatement ps;
		
		try {
			cnn = Conexion.obtenerConexion().getConexion();
			ps = cnn.prepareStatement(SQL_INSERT);
			ps.setInt(1, objeto.getIdCurso());
			ps.setString(2,objeto.getDescripcion());
			ps.setDouble(3,objeto.getPrecio());
			if(ps.executeUpdate() > 0) {
				return true;
			}

		} catch (SQLException e) {
				
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean update(CursoDTO objeto) {
		PreparedStatement ps;
		
		
		try {
			cnn = Conexion.obtenerConexion().getConexion();
			ps = cnn.prepareStatement(SQL_UPDATE);
			ps.setString(1,objeto.getDescripcion());
			ps.setDouble(2,objeto.getPrecio());
			ps.setInt(3, objeto.getIdCurso());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}

		} catch (SQLException e) {
				
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean delete(CursoDTO objeto) {
		
		PreparedStatement ps;
		
		try {
			cnn = Conexion.obtenerConexion().getConexion();
			ps= cnn.prepareStatement(SQL_DELETE);
			ps.setInt(1,objeto.getIdCurso());
			if(ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

}
