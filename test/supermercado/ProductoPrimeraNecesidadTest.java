package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad carne;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8.0 , false , 12);
		arroz = new ProductoPrimeraNecesidad("Arroz", 10.0 ,false , 8);
		carne = new ProductoPrimeraNecesidad("Arroz", 20.0 ,false , 10);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.04, leche.getPrecio());
		assertEquals(9.20  , arroz.getPrecio());
		assertEquals(18.00000  , carne.getPrecio());
	}
}
