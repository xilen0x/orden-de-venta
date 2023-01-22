package ventas;

import java.util.Iterator;

public class Orden {

	// ATRIBUTOS
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;

	// CONSTRUCTOR
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;// inicialización del contadorOrdenes
		this.productos = new Producto[Orden.MAX_PRODUCTOS];// inicialización del arreglo de productos
	}

	// METODOS
	public void agregarProducto(Producto producto) {

		if (this.contadorProductos < Orden.MAX_PRODUCTOS) {// validicacion para no sobrepasar la cant max establecida de
															// productos

			this.productos[this.contadorProductos++] = producto;// asignación del producto al arreglo
		} else {
			System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
		}
	}

	public double calcularTotal() {

		double total = 0; // variable q almacenará el total de la suma

		for (int i = 0; i < this.contadorProductos; i++) {// se itera sobre this.contadorProductos para recorrer solo
															// los productos existentes y no sobre todo el arreglo

			Producto producto = this.productos[i];
			total += producto.getPrecio();
			// total += this.productos[i].getPrecio();//Las dos lineas anteriores se pueden
			// sintetizar en esta linea.
		}
		return total;
	}

	public void mostrarOrden() {

		System.out.println("\n             Num. Orden: " + this.idOrden);


		System.out.println("\nXXXXXXXXX DETALLE ORDEN XXXXXXXXX\n");
		
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}

		double totalOrden = this.calcularTotal();
		System.out.println("\nTotal:...................... $" + totalOrden);
		System.out.println("\n----------------------------------");
	}

}
