package supermercado;

public class Producto {
	protected String nombre;
	protected Double precio;
	protected Boolean preciosCuidados = false;
	
	public Producto(String nom, Double price, Boolean preCuidados) {
		nombre = nom;
		precio = price;
		preciosCuidados = preCuidados;
	}
	
	public Producto(String nom, Double price) {
		nombre = nom;
		precio = price;
		preciosCuidados = false;
	}
	
	public boolean esPrecioCuidado() {
		return preciosCuidados;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void aumentarPrecio(Double monto) {
		precio = precio + monto;
	}
	
}
