package com.desafiolatam.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dto.InscripcionDTO;
import com.desafiolatam.facade.Facade;


/**
 * Servlet implementation class PreListarInscripciones
 */
@WebServlet("/PreListarInscripciones")
public class PreListarInscripciones extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PreListarInscripciones() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Facade facade = new Facade();
		List<InscripcionDTO>  inscripciones = facade.obtieneInscripciones();

		request.setAttribute("inscripcion", inscripciones);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("listaInscripciones.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		
	}

}
