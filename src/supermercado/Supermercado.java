
package supermercado;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String name, String dir) {
		nombre=name;
		direccion=dir;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDirrecion() {
		return direccion;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
	
}
