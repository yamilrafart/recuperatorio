/**
 * 
 */
package recuperatorio.ejercicio01;

import java.time.LocalDate;

/**
 * @author Yamil Rafart
 *
 */
public class Plus extends Afiliado {
	
	private String cuilEmpleador;

	/**
	 * 
	 */
	public Plus() {
		super();
	}

	/**
	 * @param nombre
	 * @param email
	 * @param dni
	 * @param fechaNacimiento
	 * @param cuilEmpleador
	 */
	public Plus(String nombre, String email, String dni, LocalDate fechaNacimiento, String cuilEmpleador) {
		super(nombre, email, dni, fechaNacimiento, 0.5, 0.5);
		this.cuilEmpleador = cuilEmpleador;
		
	}
	
	

}
