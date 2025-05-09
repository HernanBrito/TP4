package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	private ProductoPrimeraNecesidad carne;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9, true);
		detergente = new Producto("Detergente", 75.0);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		carne = new ProductoPrimeraNecesidad("Carne", 20.0, 10);
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(carne);
		assertEquals(3, supermercado.getCantidadDeProductos());
		
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(0, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9, supermercado.getPrecioTotal());
		supermercado.agregarProducto(carne);
		assertEquals(111.9 , supermercado.getPrecioTotal());
		
	}
}
