package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import entity.Alumno;


public class AlumnoDaoImp implements AlumnoDAO {

	
	public List<Alumno> getAlumnos() {
		List<Alumno> alumnos = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = Conexion.getConnection();
			ps = con.prepareStatement(
					"SELECT `id`, `legajo`, `dni`, `nombre_apel`, `email`, `genero`, `acciones` FROM `alumno` WHERE 1");
			rs = ps.executeQuery();

			while (rs.next()) {

				Alumno alumno = new Alumno();
			
				alumno.setLegajo(rs.getInt(2));
				alumno.setDni(rs.getInt(3));
				alumno.setNombre_apel(rs.getString(4));
				alumno.setEmail(rs.getString(5));
				alumno.setGenero(rs.getString(6));
				alumno.setAcciones(rs.getString(7));
				
				alumnos.add(alumno);
			}
			
		} catch (SQLException e) {		
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}										
		}
						
		return alumnos;
	}

	@Override
	public int borrarAlumno(int dni) {
		Connection con = null;
		PreparedStatement ps = null;
		int r = 0;
		
		try {
			con = Conexion.getConnection();
			ps = con.prepareStatement("DELETE FROM `alumno` WHERE `dni`= ?");
			
			ps.setInt(1, dni);
			
			 r = ps.executeUpdate();

		} catch (SQLException e) {		
			e.printStackTrace();
		} finally {
			try {
				
				ps.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}										
		}
						
		return r;
	}

	
}
