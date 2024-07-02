package gestionMenu;

import java.util.HashMap;

public class Plato 
{
	private String nombre;
	private String descripcion;
	private double precio;
	private Categoria categoria;
	private HashMap<String, Double> ingredientes ;

	
	public enum Categoria
	{
		entrante,
		principal,
		postre
	}
//	public HashMap<String, Double> getIngredientes() {
//		
//        return ingredientes;
//    }
//
//    public void agregarIngrediente(String nombre, double cantidad) {
//    	
//        ingredientes.put(nombre, cantidad);
//    }
//		
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}
		
	public double getPrecio() 
	{
		return precio;
	}
		
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	public Categoria getCategoria()
	{
		return categoria;
	}
	
	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}
}

