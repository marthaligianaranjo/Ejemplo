/**
 * 
 * @author POO-20
 * @date 30/07/2019
 * Modelar las asignaturas de estudiantes de la UVG
 */
public class Asignatura {
	private String nombre;
	private double nota;
	
	/**
	 * Constructor sin parámetros
	 */
	public Asignatura() {
		nombre = "";
		nota = 0;
	}
	
	
	/**
	 * @param nombre: String guarda es el nombre de la asignatura
	 * @param nota: double guarda el porcentaje acumulado de la asignatura
	 */
	public Asignatura(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	/**
	 * @param nuevoNombre: String El nuevo nombre
	 */
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	/**
	 * @return String el nombre de la asignatura
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nuevaNota: double La nota a cambiar
	 */
	public void setNota(double nuevaNota) {
		this.nota = nuevaNota;
	}
	
	/**
	 * @return double: La nota de la asignatura
	 */
	public double getNota() {
		return nota;
	}
	
	public String toString() {
		String cadena = "";
		cadena = "Asignatura:"+nombre+" \nNota: "+nota;
		return cadena;
	}
	
	public boolean equals(Asignatura otraAsignatura) {
		if (this.nombre.equals(otraAsignatura.getNombre()) && this.nota == otraAsignatura.getNota())
			return true;
		else
			return false;
	}
	
	
}
