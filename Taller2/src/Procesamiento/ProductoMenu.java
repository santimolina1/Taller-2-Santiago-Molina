package Procesamiento;

public class ProductoMenu implements Producto 
{
	
	private String nombre;
	private int precioBase;
	public ProductoMenu(String nombre, int precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public int getPrecioIva()
	{
		return (int)(getPrecio()*0.19);
	}
	
	public int getPrecioTotal()
	{
		return getPrecio()+getPrecioIva();
	}
	
	public String generarTextoFactura()
	{
		return   "Nombre: " + nombre + " Precio neto : " + getPrecio() + " IVA : " + getPrecioIva() + " Precio total : " + getPrecioTotal() +"\n";
	}

}
