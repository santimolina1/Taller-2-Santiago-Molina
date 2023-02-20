package Consola;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import Procesamiento.Restaurante;

public class Aplicacion {

	Restaurante restaurante;

	public static void main(String[] args) throws IOException  {
		Aplicacion aplicacion=new Aplicacion();
		
	    
		System.out.println("Bienvenido");
		aplicacion.cargarInformacion();
		aplicacion.mostrarMenu();
		

	
	}
	public String inputt(String input)
    {
        try
        {
            System.out.print(input + ": ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        }
        catch (IOException e)
        {
            System.out.println("Error ingresando los datos");
            e.printStackTrace();
        }
        return null;
    }
	public void mostrarMenu() 
	{
		
		System.out.println("1.) Iniciar nuevo pedido ");
		System.out.println("2.) Agregar elemento a pedido ");
		System.out.println("3.) Cerrar pedido y guardar factura ");
		System.out.println("4.) Consultar informacion segun id ");
		System.out.println("5.) Salir ");
		int numero=Integer.parseInt(inputt(" Seleccione una opcion: "));
		
	
	
		if(numero<=5)
		{
		ejecutarOpcion(numero);
		}
		else
		{
		System.out.println("Seleccione una opcion valida, por favor");
		mostrarMenu();
		}
		
	}
	
	public void ejecutarOpcion(int OpcionSeleccionada) {
	
	}
	
	
	public void cargarInformacion() throws IOException 
	{	
		System.out.println("Cargando datos :");
		restaurante=new Restaurante();
		File archivoIngredientes= new File("./Data/ingredientes.txt");
		File archivoMenu=new File("./Data/menu.txt");
		File archivoCombos=new File("./Data/combos.txt");
		
		
		restaurante.cargarinofrmacionRestaurante(archivoIngredientes, archivoMenu, archivoCombos);
		
		
		System.out.println("Carga de datos completada");
	}

	}


