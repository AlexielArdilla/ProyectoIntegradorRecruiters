<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de alumnos</title>
 <style>
#alumnos {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#alumnos td, #alumnos th {
  border: 1px solid #ddd;
  padding: 8px;
}

#alumnos tr:nth-child(even){background-color: #f2f2f2;}

#alumnos tr:hover {background-color: #ddd;}

#alumnos th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
	<h1>Los alumnos son:</h1>
	<h2>${borrado}</h2>
	<table id="alumnos">
		
			<tr>
				<th>Legajo</th>
				<th>DNI</th>
				<th>Nombre Apellido</th>
				<th>Email</th>
				<th>Genero</th>
				<th>Acciones</th>
				<th>Borrar</th>
			</tr>
			
			<c:forEach items="${alumnos}" var="alumno">
				<tr>

					<td>${alumno.legajo}</td>
					<td>${alumno.dni}</td>
					<td>${alumno.nombre_apel}</td>
					<td>${alumno.email}</td>
					<td>${alumno.genero}</td>
					<td>${alumno.acciones}</td>
					<td><a href="MostrarAlumnos?alumno_dni=${alumno.dni}"
						 name="borrar">Borrar Alumno</a></td>
				</tr>
			</c:forEach>
		
	</table>
<hr>
<h4 style="text-align: center;">Tutoriales Java Para Recruiters</h4>
</body>
</html>