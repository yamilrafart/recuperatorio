package recuperatorio.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private final Integer MAX = 5;

	private Integer id;
	private List<Pedido> pedidos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void crearPedido(Integer nroPedido) {
		if(this.pedidos==null)this.pedidos = new ArrayList<Pedido>();
		this.pedidos.add(new Pedido(nroPedido));
	}
	
	public void agregarProducto(Integer nroPedido, Integer idProducto,Integer cantidad) throws BusquedaProductoException, StockINsuficienteException, CantidadProductosInsuficienteException {

		Producto p;
		try {
			p = Database.buscarProducto(idProducto);
			// verificar si el stock existente alcanza para agregarlo al pedido	
			if (p.getStock()>cantidad) {
				if (this.cantProductosDisponible()>0 && this.cantProductosDisponible()<this.MAX) {
					// verificar si el cliente cumple la condicion pedida para agregar el producto
					Pedido pedido = this.buscarPorNro(nroPedido);
					pedido.addDetalle(p, cantidad);
				} else if (this.cantProductosDisponible() == this.MAX) {
					throw new CantidadProductosInsuficienteException();
				}
			}else {
				throw new StockINsuficienteException();
			}
		} catch (DatabaseException e) {
			throw new BusquedaProductoException();
//			e.printStackTrace();
		}
		

		
	}
	
	public Pedido buscarPorNro(Integer nroPedido) {
		for(Pedido p : this.pedidos) {
			if(p.getNroPedido().equals(nroPedido)) return p;
		}
		return null;
	}
	
	public Integer cantProductosDisponible() {
		Integer aux= 0;
		for (Pedido unPedido : this.pedidos) {
			aux += unPedido.getDetalles().size();
		}
		return (this.MAX)-aux;
	}
	
//	public List<Producto> productosMontoMayor(Double monto);
//	
//	public Double compraPromedio();

	
}
