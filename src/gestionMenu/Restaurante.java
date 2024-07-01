package gestionMenu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

import gestionPedidos.Cliente;
import gestionPedidos.Pedido;

public class Restaurante 
{
	private String nombre;
	private HashMap<String, Menu> menus;
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
}
