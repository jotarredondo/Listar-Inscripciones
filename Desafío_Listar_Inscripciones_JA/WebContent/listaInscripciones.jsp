<%@page import="java.util.List"%>
<%@page import="com.desafiolatam.dto.InscripcionDTO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Inscripciones</title>
<!-- Link Css -->
<link href="css/style.css" rel="stylesheet">
<!-- Link Bootstrap -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css2?family=Galada&display=swap" rel="stylesheet">
	
</head>
<body>
<%
	List<InscripcionDTO> lista = (List<InscripcionDTO>)request.getAttribute("inscripcion");
%>

	<div class = "container my-3 shadow rounded" id ="back">
		<table class="table table-striped">
		<h2 class="text-center" id = "titulo">Listado de Inscripciones</h2>
  <thead>
    <tr>
      <th scope="col">Id Inscripción</th>
      <th scope="col">Nombre</th>
      <th scope="col">Celular</th>
      <th scope="col">Id Curso</th>
      <th scope="col">Id Forma de pago</th>
    </tr>
  </thead>
  <tbody>

    <tr>  
    <%for (InscripcionDTO datos : lista){ %>  
	  <td><%=datos.getIdInsc()%></td>
      <td><%= datos.getNombre()%></td>
	  <td><%= datos.getCelular()%></td>
      <td><%= datos.getIdCurso()%></td>
      <td><%= datos.getIdFormaDePago()%></td>
    </tr>
     <%}%> 
  </tbody>
</table>
	
	</div>



</body>
</html>