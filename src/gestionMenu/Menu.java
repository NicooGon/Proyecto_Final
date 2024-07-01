package gestionMenu;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu 
{
	private String nombre;
	private ArrayList<Plato> listaPlatos = new ArrayList<>();
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void agregarPlato(Plato plato) 
    {
        this.listaPlatos.add(plato);
    }

    public void eliminarPlato(Plato plato) 
    {
        this.listaPlatos.remove(plato);
    }
    
    public void modificarPlato(String nombre, String nuevoNombre, String nuevaDescripcion, double nuevoPrecio, Plato.Categoria nuevaCategoria) 
    {
        for (Plato plato : listaPlatos) 
        {
            if (plato.getNombre().equals(nombre)) 
            {
                plato.setNombre(nuevoNombre);
                plato.setDescripcion(nuevaDescripcion);
                plato.setPrecio(nuevoPrecio);
                plato.setCategoria(nuevaCategoria);
                break;
            }
        }
    }
}
