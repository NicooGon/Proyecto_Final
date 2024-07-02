package gestionInventario;

import java.time.LocalDate;

import gestionMenu.Plato.Categoria;

public class Ingrediente {
	
	private String nombre;
	private double cantDisponible;
	private String unidadMedida;
	private LocalDate fechaCaducidad;
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public double getCantDisponible() {
		return cantDisponible;
	}

	public void setCantDisponible(double cantDisponible) {
		this.cantDisponible = cantDisponible;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

		

	
	

}
