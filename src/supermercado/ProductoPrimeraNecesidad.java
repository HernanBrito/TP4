package supermercado;


public class ProductoPrimeraNecesidad extends Producto {
	private int porcenDescuento;
	

	public ProductoPrimeraNecesidad(String nom, Double price, int porcentajeDescuento) {
		super(nom, price);
		porcenDescuento = porcentajeDescuento;
	}
	
	public ProductoPrimeraNecesidad(String nom, Double price, Boolean preCuidado ,int porcentajeDescuento) {
		super(nom, price, preCuidado);
		porcenDescuento = porcentajeDescuento;
	}
	
	@Override
	public Double getPrecio() {
		 return Math.round(super.getPrecio() * (1 - porcenDescuento / 100.0) * 100 ) / 100.0 ;
	}
	
	
}
