/**
 * 
 */
package recuperatorio.ejercicio02;

/**
 * @author Yamil Rafart
 *
 */
public class StockINsuficienteException extends Exception {
	
	public StockINsuficienteException() {
		super("ERROR: No hay stock.");
	}

}
