package recuperatorio.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Afiliado { 
	
	protected String nombre;
	protected String email;
	protected String dni;
	protected LocalDate fechaNacimiento;
	protected Double porcentajeMedica;
	protected Double porcentajeOdontologica;
	protected List<Prestacion> prestaciones;
	
	
	
	/**
	 * 
	 */
	public Afiliado() {
		super();
	}

	

	/**
	 * @param nombre
	 * @param email
	 * @param dni
	 * @param fechaNacimiento
	 * @param porcentajeMedica
	 * @param porcentajeOdontologica
	 */
	public Afiliado(String nombre, String email, String dni, LocalDate fechaNacimiento, Double porcentajeMedica,
			Double porcentajeOdontologica) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.porcentajeMedica = porcentajeMedica;
		this.porcentajeOdontologica = porcentajeOdontologica;
		this.prestaciones = new ArrayList<Prestacion>();
	}



	public Double facturar() {
		Double montoTotal = 0D;
		for (Prestacion unaPrestacion : prestaciones) {
			if (unaPrestacion.getAprobada()) {
				if (unaPrestacion.getTipo() == Prestacion.Tipo.MEDICA) {
					montoTotal += (unaPrestacion.getPractica().getCosto())*this.porcentajeMedica;
				}else {
					montoTotal += (unaPrestacion.getPractica().getCosto())*this.porcentajeOdontologica;
				}
			}
		}
		return montoTotal;
	}
}
