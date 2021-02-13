package entity;

public class Alumno {

	private int legajo;
	private int dni;
	private String nombre_apel;
	private String email;
	private String genero;
	private String acciones;
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre_apel() {
		return nombre_apel;
	}
	public void setNombre_apel(String nombre_apel) {
		this.nombre_apel = nombre_apel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAcciones() {
		return acciones;
	}
	public void setAcciones(String acciones) {
		this.acciones = acciones;
	}
	
	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", dni=" + dni + ", nombre_apel=" + nombre_apel + ", email=" + email
				+ ", genero=" + genero + ", acciones=" + acciones + "]";
	}
	
	
}
