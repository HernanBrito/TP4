package trabajador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {
	
	private Trabajador carlos;
	private Ingreso enero;
	private IngresoPorHorasExtras eneroHsExtra;
	private Ingreso febrero;
	
    
    @BeforeEach
    public void setup() {
        carlos = new Trabajador("carlos");
        enero = new Ingreso("Enero", "Sueldo", 1000);
        eneroHsExtra = new IngresoPorHorasExtras("Enero", "Horas Extras", 500, 10);
        febrero = new Ingreso("Febrero", "Sueldo", 1000);
    }
    @Test
    public void testGetTotalPercibido() {
    	carlos.agregarIngreso(enero);
    	carlos.agregarIngreso(febrero);
    	carlos.agregarIngreso(eneroHsExtra);
        assertEquals(2500.0, carlos.getTotalPercibido());
    }
    
    @Test
    public void testGetMontoImponible() {
    	carlos.agregarIngreso(enero);
    	carlos.agregarIngreso(febrero);
    	carlos.agregarIngreso(eneroHsExtra);
        assertEquals(2000.0, carlos.getMontoImponible());
    }
    
    @Test
    public void testGetImpuestoAPagar() {
    	carlos.agregarIngreso(enero);
    	carlos.agregarIngreso(febrero);
    	carlos.agregarIngreso(eneroHsExtra);
    	assertEquals(40, carlos.getImpuestoAPagar()); // 2% de 2000
    }
    
    @Test
    public void testIngresoNormalMontoImponible() {
        Ingreso ingreso = new Ingreso("Marzo", "Bono", 300);
        assertEquals(300, ingreso.getMontoImponible());
    }
    
    @Test
    public void testIngresoHorasExtrasMontoImponible() {
        IngresoPorHorasExtras ingreso = new IngresoPorHorasExtras("Abril", "Horas Extras", 200, 5);
        assertEquals(0, ingreso.getMontoImponible());
    }
}