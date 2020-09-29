<%@page import="java.util.List"%>
<%@page import="com.desafiolatam.dto.CursoDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<CursoDTO> cursos = (List<CursoDTO>)request.getAttribute("cursos");
%>
<form action="PostInscripcion" method ="post">
<h1>Formulario </h1><br>
Nombre : <input type="text" name="nombre" id="name"> 
Apellido: <input type="text" name="apellido" id="apellido">
Cursos : <select name="idCurso">
		<%for (CursoDTO curso : cursos){ %>
		<option value="<%=curso.getIdCurso()%>" >
			<%=curso.getDescripcion() %>
		</option>
		<%}%>
		</select><br>
		<input type="submit" value="enviar">
	</form>
</body>
</html>