package com.desafiolatam.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dto.CursoDTO;
import com.desafiolatam.facade.Facade;

/**
 * Servlet implementation class PreInscripcion
 */
@WebServlet("/PreInscripcion")
public class PreInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Facade facade = new Facade();
		List<CursoDTO> cursos = facade.findAll();
		request.setAttribute("cursos", cursos);
		
		RequestDispatcher rd = request.getRequestDispatcher("inscripcion.jsp");
		rd.forward(request, response);
		
		
	}



}
