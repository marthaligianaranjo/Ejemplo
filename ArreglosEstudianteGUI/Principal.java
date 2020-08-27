/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
import java.util.Scanner;
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombreEst = teclado.nextLine();
		
		System.out.println("Ingrese su carnet: ");
		int carnet = teclado.nextInt();
		teclado.nextLine();
		
		Estudiante estPOO = new Estudiante(nombreEst,carnet);
		
		
		int j = 1;
		while (j<=5) {
			System.out.println("Ingrese el nombre de la asignatura "+j+":");
			String nombreAsig = teclado.nextLine();
			System.out.println("Ingrese la nota de la asignatura "+j+":");
			double notaAsig = teclado.nextDouble();
			teclado.nextLine();
			estPOO.setAsignatura(nombreAsig, notaAsig, j);
			j++;
		}
		
		double prom = estPOO.promGral();
		System.out.println("Su promedio general es: "+prom+" puntos");
		
		System.out.println(estPOO.mejorClase());
	}

}
