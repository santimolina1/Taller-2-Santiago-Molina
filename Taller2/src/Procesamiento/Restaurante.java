package Procesamiento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Restaurante {
	private Map<String, Ingrediente> ingrediente = new HashMap<>();
	private Map<String, ProductoMenu> producto = new HashMap<>();
	private Map<String, Combo> combo = new HashMap<>();
	
	
	public Restaurante()
	{
		
	}

	public ArrayList<Combo>getCombos()
	{
		
	}
	
	
	public void iniciarPedido(String NombreCliente, String direccionCliente) {
		
	}
	
	public void cerrarYGuardarPedido() {
		
	}
	
	public Pedidos getpedidoEnCurso() {
		return pedido
	}
	
	public ArrayList<ProductoMenu> getMenuBase() {
		return producto
		
	}
	
	public  ArrayList<Ingrediente>  getIngredientes() {
		return ingrediente
				
		
		
	}
	public void cargarinofrmacionRestaurante(File archivoIngredientes, File archivoMenu , File archivoCombos) throws IOException {
		cargarIngredientes(archivoIngredientes);
		cargarMenu(archivoMenu);
		cargarCombos(archivoCombos);
		List<Ingrediente> listaIngrediente=ingrediente.values().stream().collect(Collectors.toList());
		List<ProductoMenu> listaProducto=producto.values().stream().collect(Collectors.toList());
		List<Combo> listaCombo=combo.values().stream().collect(Collectors.toList());
		
		int ingredienteCont=1;
		int productoCont=1;
		int comboCont=1;
		
		
				
		
	}
	
	private void cargarIngredientes(File archivoIngredientes) throws IOException {
		
		FileReader archivo =new FileReader(archivoIngredientes);
		BufferedReader br=new BufferedReader(archivo);
		String linea =br.readLine();
		
		while (linea!=null)
		{
			String []partes=linea.split(";");
			String nombreIngrediente= partes[0];
			int precioIngrediente=Integer.parseInt(nombreIngrediente);
			Ingrediente elIngrediente=ingrediente.get(nombreIngrediente);
			
			if (elIngrediente==null)
			{
				elIngrediente=new Ingrediente(nombreIngrediente,precioIngrediente);
				ingrediente.put(nombreIngrediente,elIngrediente);
				
			}
			
			
			
		}
		br.close();
	}
	
	private void cargarMenu(File archivoMenu) throws IOException
	{
		FileReader archivo= new FileReader(archivoMenu);
		BufferedReader br=new BufferedReader(archivo);
		String linea =br.readLine();
		
		while (linea!=null)
		{
			String []productos=linea.split(";");
			String nombreProducto=productos[0];
			int precioProducto= Integer.parseInt(nombreProducto);
			ProductoMenu comida=producto.get(nombreProducto);
			if (comida==null)
			{
				producto.put(nombreProducto,comida);
			
				comida=new ProductoMenu(nombreProducto,precioProducto);
			}
		}
		br.close();
	}
	
	private void cargarCombos(File archivoCombos) throws IOException
	{
		FileReader archivo=new FileReader(archivoCombos);
		BufferedReader br=new BufferedReader(archivo);
		String linea=br.readLine();
		
		while (linea!=null)
		{
			String []productos=linea.split(";");
			String nombreCombo=productos[0];
			String porcentaje=productos[1].replaceAll("&","");
			double desc=Double.parseDouble(porcentaje);
			int longi=productos.length;
			
			String [] list_elementos=new String [longi];
			for (int i=1;i<longi; i++)
			{
				list_elementos[i]=productos[i];
			}
			
			Combo combito=combo.get(nombreCombo);
			
			if (combito==null)
			{
				combo.put(nombreCombo, combito);
				combito= new Combo(desc,nombreCombo);
			}
		}
		br.close();
	}
	
	
	}
	

