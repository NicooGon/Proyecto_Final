package gestionPedidos;
import java.time.LocalDateTime;
import java.util.ArrayList;
import gestionMenu.Plato;

public class Pedido 
{
	private Integer id;
	private ArrayList<Plato> items = new ArrayList<>();
	private LocalDateTime hora;
	private Cliente cliente;
	private Estado estado;
	public enum Estado 
	{
        EN_PREPARACION,
        LISTO,
        ENTREGADO
    }
	
	private Boolean entrega;
	public Integer getID() 
	{
		return id;
	}
	
	public void setID(Integer id) 
	{
		this.id = id;
	}
	
	public LocalDateTime getHora() 
	{
        return hora;
    }
	
	public Estado getEstado() 
	{
        return estado;
    }

    public void setEstado(Estado estado) 
    {
        this.estado = estado;
    }
    
    public Boolean getEntrega()
    {
    	return entrega;
    }
    
    public void setEntrega(Boolean entrega)
    {
    	this.entrega = entrega;
    }
    
    public Cliente getCliente() 
    {
        return cliente;
    }

    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }
}
