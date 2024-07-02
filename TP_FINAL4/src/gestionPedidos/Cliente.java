package gestionPedidos;

import java.util.ArrayList;

import gestionMenu.Plato;

public class Cliente 
{
	private String nombre;
	private ArrayList<Pedido> pedidos = new ArrayList<>(); 
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public ArrayList<Pedido> getPedido()
	{
		return pedidos;
	}
	
	public void agregarPedido(Pedido pedido)
	{
		this.pedidos.add(pedido);
	}
	
	 public void mostrarPedidos()
	{
    	System.out.println("Pedidos: "); 
    	
		for(Pedido pedido : pedidos)
		{
			System.out.println("ID del pedido: "+ pedido.getID());
			pedido.mostrarItem();
		}
	}
}
