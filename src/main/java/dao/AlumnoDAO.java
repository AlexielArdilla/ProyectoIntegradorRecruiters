package dao;

import java.util.List;

import entity.Alumno;

public interface AlumnoDAO {
	
	public List<Alumno> getAlumnos();
	
	public int borrarAlumno(int dni);
	
	
}
