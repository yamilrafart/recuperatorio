/**
 * 
 */
package recuperatorio.ejercicio01;

/**
 * @author Yamil Rafart
 *
 */
public class Practica {
	
	private String descripcion;
	private String codigo;
	private Double costo;
	
	/**
	 * 
	 */
	public Practica() {
		super();
	}
	/**
	 * @param descripcion
	 * @param codigo
	 * @param costo
	 */
	public Practica(String descripcion, String codigo, Double costo) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.costo = costo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @return the costo
	 */
	public Double getCosto() {
		return costo;
	}
	
	

}
