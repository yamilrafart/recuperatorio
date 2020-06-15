/**
 * 
 */
package recuperatorio.ejercicio01;

import java.time.LocalDate;

/**
 * @author Yamil Rafart
 *
 */
public class Joven extends Afiliado {
	
	private String universidad;
	private String carrera;
	/**
	 * 
	 */
	public Joven() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param email
	 * @param dni
	 * @param fechaNacimiento
	 * @param porcentajeMedica
	 * @param porcentajeOdontologica
	 * @param universidad
	 * @param carrera
	 */
	public Joven(String nombre, String email, String dni, LocalDate fechaNacimiento, String universidad, String carrera) {
		super(nombre, email, dni, fechaNacimiento, 0.2, 0.8);
		this.universidad = universidad;
		this.carrera = carrera;
	}
	
	

}
