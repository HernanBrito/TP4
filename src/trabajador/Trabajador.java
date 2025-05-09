package trabajador;

import java.util.List;
import java.util.ArrayList;

class Trabajador {
	private String nombre;
	
    private List<Ingreso> ingresos = new ArrayList<Ingreso>();
    
    public Trabajador(String nombre) {
    	this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    }
    
    public void agregarIngreso(Ingreso ingreso) {
    	ingresos.add(ingreso);
    }

    public double getTotalPercibido() {
        double total = 0.0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMontoPercibido();
        }
        return total;
    }

    public double getMontoImponible() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMontoImponible();
        }
        return total;
    }

    public double getImpuestoAPagar() {
        return getMontoImponible() * 0.02;
    }
}
