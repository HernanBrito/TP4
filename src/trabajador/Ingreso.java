package trabajador;

class Ingreso {
    private String mes;
    private String concepto;
    private double montoPercibido;

    public Ingreso(String mes, String concepto, double montoPercibido) {
        this.mes = mes;
        this.concepto = concepto;
        this.montoPercibido = montoPercibido;
    }

    public String getMes() {
        return mes;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getMontoPercibido() {
        return montoPercibido;
    }

    public double getMontoImponible() {
        return montoPercibido;
    }
}
