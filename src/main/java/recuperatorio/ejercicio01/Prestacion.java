/**
 * 
 */
package recuperatorio.ejercicio01;

import java.time.LocalDate;

/**
 * @author Yamil Rafart
 *
 */
public class Prestacion {
	
	public enum Tipo {MEDICA,ODONTOLOGICA}; 
	private LocalDate fecha;
	private Boolean aprobada;
	private Afiliado afiliado;
	private Practica practica;
	private Tipo tipo;
	
	/**
	 * 
	 */
	public Prestacion() {
		super();
	}
	/**
	 * @param fecha
	 * @param aprobada
	 * @param afiliado
	 * @param practica
	 * @param tipo
	 */
	public Prestacion(LocalDate fecha, Boolean aprobada, Afiliado afiliado, Practica practica, Tipo tipo) {
		super();
		this.fecha = fecha;
		this.aprobada = aprobada;
		this.afiliado = afiliado;
		this.practica = practica;
		this.tipo = tipo;
	}
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @return the aprobada
	 */
	public Boolean getAprobada() {
		return aprobada;
	}
	/**
	 * @return the afiliado
	 */
	public Afiliado getAfiliado() {
		return afiliado;
	}
	/**
	 * @return the practica
	 */
	public Practica getPractica() {
		return practica;
	}
	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	
	

}
