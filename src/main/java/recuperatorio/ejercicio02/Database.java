package recuperatorio.ejercicio02;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import isi.died2020.parcial01.ejercicio02.dominio.Examen;

public class Database {
	
	private static List<Producto> _PRODUCTOS;
	public static void loadProductos() {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			_PRODUCTOS.add(new Producto(i+1, "PRODUCTO "+i, 3, r.nextDouble()*100));
		}
	}
	
	public static Producto buscarProducto(Integer id) throws DatabaseException{
		for(Producto p : _PRODUCTOS) {
			if(p.getId().equals(id)) return p;
		}
		return null;
	}
	
	//NO SE COMOSOLUCIONAR ESE ERROR, PARA MI DEBERIA DEFUNCIONAR
	public List<Producto> productosMontoMayor(Double montoMinimo,Double montoMaximo){
		return (this._PRODUCTOS).stream().filter((Producto p)->p.getPrecio()>montoMinimo)
			.filter((Producto p)->p.getPrecio()<montoMaximo)
			.sorted((Producto p1, Producto p2)->p2.getPrecio().compareTo(p1.getPrecio()))
			.collect(Collectors.toList());
	}
	
	//TAMPOCO SE CUAL ES EL ERROR
	public Double precioMedio() {
		Double promedio = 0D;
		Long cantProductos = (this._PRODUCTOS).stream()
									.map((Producto p)-> promedio + p.getPrecio())
									.count();
		return promedio / cantProductos;
	}
	
}
