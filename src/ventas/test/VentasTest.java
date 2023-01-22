package ventas.test;

import ventas.*;

public class VentasTest {

	public static void main(String[] args) {
		
		//se crean(instancian) dos productos
		Producto producto1 = new Producto("Camisa", 50.5);
		Producto producto2 = new Producto("Pantalon", 60);

		//se instancia una orden(sin productos aún)
		Orden orden1 = new Orden();
		
		//Agregar la orden
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		
		//Mostrar la orden
		orden1.mostrarOrden();
		
	}

}
