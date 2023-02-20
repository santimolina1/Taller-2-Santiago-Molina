package Procesamiento;

public interface Producto 
{

	public int getPrecio();
	public int getPrecioIva();
	public int getPrecioTotal();
	public String getNombre();
	public String generarTextoFactura();
	
}
