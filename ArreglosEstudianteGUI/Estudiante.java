/**
 * @author POO-20
 * @date 30/07/2019
 */
public class Estudiante {
	private String nombre;
	private int carnet;
	/*private Asignatura asignatura1;
	private Asignatura asignatura2;
	private Asignatura asignatura3;
	private Asignatura asignatura4;
	private Asignatura asignatura5;*/
	private Asignatura[] asignaturas;
	
	
	/**
	 * Constructor sin parámetros
	 */
	public Estudiante() {
		nombre = "";
		carnet = 0;
		asignaturas = new Asignatura[5];
	/*	asignatura1 = new Asignatura();
		asignatura2 = new Asignatura();
		asignatura3 = new Asignatura();
		asignatura4 = new Asignatura();
		asignatura5 = new Asignatura();*/
	}
	
	/**
	 * @param nombre: String el nombre del estudiantes
	 * @param carnet: int el carnet
	 */
	public Estudiante(String nombre, int carnet) {
		this.nombre = nombre;
		this.carnet = carnet;
		asignaturas = new Asignatura[5];
	/*	asignatura1 = new Asignatura();
		asignatura2 = new Asignatura();
		asignatura3 = new Asignatura();
		asignatura4 = new Asignatura();
		asignatura5 = new Asignatura();*/
	}
	
	/**
	 * @param nuevoNombre:String
	 */
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	/**
	 * @return el nombre del estudiante
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param carnet: int
	 */
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	
	/**
	 * @return el carnet del estudiante
	 */
	public int getCarnet() {
		return carnet;
	}
	
	/**
	 * @param nombre: String el nombre de la asignatura
	 * @param nota: double la nota de la asignatura
	 * @param i: int el número de la asignatura que debo cambiar
	 */
	public void setAsignatura(String nombre, double nota, int i) {
	/*	switch (i) {
		case 1:
			this.asignatura1.setNombre(nombre);
			this.asignatura1.setNota(nota);
			break;
		case 2:
			this.asignatura2.setNombre(nombre);
			this.asignatura2.setNota(nota);
			break;
		case 3: 
			this.asignatura3.setNombre(nombre);
			this.asignatura3.setNota(nota);
			break;
		case 4:
			this.asignatura4.setNombre(nombre);
			this.asignatura4.setNota(nota);
			break;
		case 5:
			this.asignatura5.setNombre(nombre);
			this.asignatura5.setNota(nota);
			break;
		}*/
		if (i < 5)
			asignaturas[i] = new Asignatura(nombre,nota);
	}
	

	/**
	 * Devuelve la información de la asignatura
	 * @param i
	 * @return
	 */
	public String getAsignatura(int i) {
		String asignatura = "";
		/*switch (i) {
		case 1:
			asignatura = asignatura1.toString();
			break;
		case 2:
			asignatura = asignatura2.toString();
			break;
		case 3: 
			asignatura = asignatura3.toString();
			break;
		case 4:
			asignatura = asignatura4.toString();
			break;
		case 5:
			asignatura = asignatura.toString();
			break;
		}*/
		return asignaturas[i].toString();
	}
	
	/**
	 * Cambia la nota de la asignatura i
	 * @param nota: double la nueva nota
	 * @param i: el numero de la asignatura a la que se le quiere cambiar la nota
	 */
	public void setAsignatura(double nota, int i) {
		/*switch (i) {
		case 1:
			this.asignatura1.setNota(nota);
			break;
		case 2:
			this.asignatura2.setNota(nota);
			break;
		case 3: 
			this.asignatura3.setNota(nota);
			break;
		case 4:
			this.asignatura4.setNota(nota);
			break;
		case 5:
			this.asignatura5.setNota(nota);
			break;
		}*/
		if (i < 5)
			asignaturas[i].setNota(nota);
	}
	
	/**
	 * Devuelve la nota de una asignatura
	 * @param i: int. La asignatura que queremos consultar nota
	 * @return double: La nota de la asignatura
	 */
	public double getNotaAsignatura(int i) {
		//double nota = -1;
		/*switch (i) {
		case 1:
			nota = asignatura1.getNota();
			break;
		case 2:
			nota =  asignatura2.getNota();
			break;
		case 3: 
			nota =  asignatura3.getNota();
			break;
		case 4:
			nota = asignatura4.getNota();
			break;
		case 5:
			nota = asignatura5.getNota();
			break;
		}*/
		return asignaturas[i].getNota();
	}
	
	/**
	 * Calcula el promedio general
	 * @return double el promedio general del estudiante
	 */
	public double promGral() {
		double suma = 0;
		//double suma = asignatura1.getNota() + asignatura2.getNota()+asignatura3.getNota()+asignatura4.getNota()+asignatura5.getNota();
		int i = 0,j=0;
		while (i<5){
			if (asignaturas[i]!=null) {
				suma = suma + asignaturas[i].getNota();
				j++;
			}
			i++;
		}
		return suma/j; 		
	}
	
	public String mejorClase() {
		Asignatura mejor = new Asignatura();
		/*if (asignatura1.getNota()>asignatura2.getNota() && asignatura1.getNota() > asignatura3.getNota() && asignatura1.getNota()>asignatura4.getNota() && asignatura1.getNota()>asignatura5.getNota()) {
			mejor = asignatura1;
		}*/
		return mejor.getNombre();
		
	}
}
