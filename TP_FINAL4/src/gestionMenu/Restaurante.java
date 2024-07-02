package gestionMenu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import gestionInventario.Ingrediente;
import gestionPedidos.Cliente;
import gestionPedidos.Pedido;

public class Restaurante 
{
	private String nombre;
	private HashMap<String, Menu> menus = new HashMap<String, Menu>();
	private HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

	
	
//	private Queue<Pedido> pedidos;
	
	private ArrayList<Plato> pedidos = new ArrayList<>();
	
	public void mostrarpedidos()
	{
		System.out.println("Pedidos: "); 
		
		for(Plato pedido : pedidos)
		{
			System.out.println(pedido.getNombre()); 
		}
		
		
	}
	
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void agregarMenu(Menu menu) 
	{
		this.menus.put(menu.getNombre(), menu);
	}

	public void eliminarMenu(String nombre) 
	{
	    this.menus.remove(nombre);
	}
	
	 public void agregarPedido(Plato plato)
	{
		 for(Map.Entry<String, Integer> ingrediente : ingredientes.entrySet())
		{
			 if(ingrediente.getKey().equals(plato.getNombre()))
			 {
				 if(ingrediente.getValue()>=1)
				 {
					 pedidos.add(plato);
					 ingredientes.put(ingrediente.getKey(), ingrediente.getValue() - 1);
				 }
				 else
				 {
					 System.out.println("No se puede agregar el pedido");
				 }
			 }
		}

	}
	
	
	
//	public ArrayList<String> pedidoCliente(Cliente cliente)
//	{
//		ArrayList<String> pedidosClientes = new ArrayList<>();
//		for (Pedido pedido : pedidos)
//		{
//			pedidosClientes.add(pedido.getCliente().getNombre());
//		}
//		return pedidosClientes;
//	}
	
//	public ArrayList<LocalDate> pedidoHora(LocalDate fecha)
//	{
//		ArrayList<LocalDate> pedidosHora = new ArrayList<>();
//		for (Pedido pedido : pedidos)
//		{
//			pedidosHora.add(pedido.getHora().toLocalDate());
//		}
//		return pedidosHora;
//	}
	
	public HashMap<String, Menu> getMenus()
	{
		return menus;
	}
	
	public void mostrarMenus()
	{
		for(Map.Entry<String, Menu> menu : menus.entrySet())
		{
			System.out.println(menu.getKey()); 
		}
	}
	
	public void agregarIngrediente(String nombreIngrediente, Integer cantidad) 
	{
		this.ingredientes.put(nombreIngrediente, cantidad);
	}

	public void eliminarIngrediente(String nombreIngrediente) 
	{
	    this.ingredientes.remove(nombreIngrediente);
	}
    

    public void mostrarIngredientes()
	{
    	System.out.println("Ingredientes del inventario: "); 
    	
		for(Map.Entry<String, Integer> ingrediente : ingredientes.entrySet())
		{
			System.out.println("Ingrediente: " + ingrediente.getKey() + " cantidad: " + ingrediente.getValue()); 
		}
	}

    
    
}
