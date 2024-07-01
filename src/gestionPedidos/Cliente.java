package gestionPedidos;

import java.util.ArrayList;

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
}
