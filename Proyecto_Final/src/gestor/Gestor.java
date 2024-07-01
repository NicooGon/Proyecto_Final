package gestor;

import gestionMenu.Menu;
import gestionMenu.Plato;
import gestionMenu.Plato.Categoria;
import gestionMenu.Restaurante;
import gestionPedidos.Cliente;
import gestionPedidos.Pedido;
import gestionPedidos.Pedido.Estado;

public class Gestor {

	public static void main(String[] args) {
	
		Restaurante restaurante = new Restaurante();
	
		Menu menu1 = new Menu();
		
		Plato plato1 = new Plato();
		plato1.setNombre("sopa");
		plato1.setCategoria(Categoria.entrante);
		plato1.setDescripcion("sopa de verduras");
		plato1.setPrecio(12.01);
		
		Plato plato2 = new Plato();
		plato2.setNombre("pizza");
		plato2.setCategoria(Categoria.principal);
		plato2.setDescripcion("pizza");
		plato2.setPrecio(20.00);
		
		
		menu1.agregarPlato(plato1);
		menu1.agregarPlato(plato2);
		
		menu1.setNombre("Menu almuerzo");
		
		
		restaurante.agregarMenu(menu1);
		
		
		Menu menu2 = new Menu();
		
		Plato plato3 = new Plato();
		plato3.setNombre("panqueques");
		plato3.setCategoria(Categoria.principal);
		plato3.setDescripcion("panqueques");
		plato3.setPrecio(12.01);
		
		Plato plato4 = new Plato();
		plato4.setNombre("tostada");
		plato4.setCategoria(Categoria.entrante);
		plato4.setDescripcion("tostada");
		plato4.setPrecio(20.00);
		
		
		menu2.agregarPlato(plato3);
		menu2.agregarPlato(plato4);
		
		menu2.setNombre("Menu desayuno");
		
		
		restaurante.agregarMenu(menu2);
		
		restaurante.mostrarMenus(); //Para probar que cada restaurante tenga varios menus.
		
//		------------------------------------------
		
		//Para probar que cada menu tenga una lista de platos
		
		menu1.mostrarPlatos();
		menu2.mostrarPlatos();
		System.out.println("----");
		
		
//		-------------------------------------------
		
		//Probar metodos de eliminar, agregar y modificar plato
		
		menu1.mostrarPlatos();
		menu1.eliminarPlato(plato1);
		menu1.mostrarPlatos();
		
		menu1.agregarPlato(plato4);
		menu1.mostrarPlatos();
		
		menu1.modificarPlato("pizza", "pasta", "pasta casera", 22.00, Categoria.entrante);
		menu1.mostrarPlatos();
		
		System.out.println("-----------------");
		
		
		System.out.println(plato2.getNombre());
		System.out.println(plato2.getPrecio());
		System.out.println(plato2.getCategoria());
		System.out.println(plato2.getDescripcion());
		
//		-------------------------------------------
		
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Juliana");
		
		Pedido pedido = new Pedido();
	
		pedido.setID(1234);
		pedido.setEstado(Estado.EN_PREPARACION);
		pedido.setEntrega(true);
		pedido.setCliente(cliente);
		
		pedido.agregarItem(restaurante, menu2, plato4);
		pedido.agregarItem(restaurante, menu1, plato2);
		
		cliente.agregarPedido(pedido);
		
		cliente.mostrarPedidos();
		
		
		
	}

}
