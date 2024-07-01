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
	private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	
	private Queue<Pedido> pedidos;
	
	
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
	
	public void agregarPedido(Pedido pedido)
	{
		pedidos.add(pedido);
	}
	
	public ArrayList<String> pedidoCliente(Cliente cliente)
	{
		ArrayList<String> pedidosClientes = new ArrayList<>();
		for (Pedido pedido : pedidos)
		{
			pedidosClientes.add(pedido.getCliente().getNombre());
		}
		return pedidosClientes;
	}
	
	public ArrayList<LocalDate> pedidoHora(LocalDate fecha)
	{
		ArrayList<LocalDate> pedidosHora = new ArrayList<>();
		for (Pedido pedido : pedidos)
		{
			pedidosHora.add(pedido.getHora().toLocalDate());
		}
		return pedidosHora;
	}
	
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
	
	public void agregarIngrediente(Ingrediente ingrediente) 
    {
        this.ingredientes.add(ingrediente);
    }

    public void eliminarIngrediente(Ingrediente ingrediente) 
    {
        this.ingredientes.remove(ingrediente);
    }
    
    public void modificarInventario(String nombre, String nuevoNombre, double cantDisponible, String unidadMedida, LocalDate fechaCaducidad) 
    {
        for (Ingrediente ingrediente : ingredientes) 
        {
            if (ingrediente.getNombre().equals(nombre)) 
            {
            	ingrediente.setNombre(nuevoNombre);
                ingrediente.setCantDisponible(cantDisponible);
                ingrediente.setUnidadMedida(unidadMedida);
                ingrediente.setFechaCaducidad(fechaCaducidad);
                break;
            }
        }
    }
    
    public void mostrarIngredientes()
	{
    	System.out.println("Ingredientes del inventario: "); 
    	
		for(Ingrediente ingrediente : ingredientes)
		{
			System.out.println(ingrediente.getNombre()); 
		}
	}
}
