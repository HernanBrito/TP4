package trabajador;

class IngresoPorHorasExtras extends Ingreso {
    private int horasExtras;

    public IngresoPorHorasExtras(String mes, String concepto, double montoPercibido, int horasExtras) {
        super(mes, concepto, montoPercibido);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    @Override
    public double getMontoImponible() {
        return 0; 
    }
}
