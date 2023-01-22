package ventas;

public class Producto {

	//ATRIBUTOS
		private final int idProducto;
		private String nombre;
		private double precio;
		private static int contadorProductos;
		
		//CONSTRUCTOR
		private Producto() {
			this.idProducto = ++Producto.contadorProductos;//por c/objeto creado se incrementa el contador
		}
		
		public Producto(String nombre, double precio) {
			this();// llamada al constructor privado anterior para q se inicialice el contador
			this.nombre = nombre;
			this.precio = precio;
		}

		//GETTER & SETTER
		public int getIdProducto() {
			return idProducto;
		}
		public String getNombre() {
			return nombre;
		}
		public double getPrecio() {
			return precio;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("\nProducto id: ");
			builder.append(idProducto);
			builder.append("\nDescripción: ");
			builder.append(nombre);
			builder.append("\nPrecio: ");
			builder.append(precio);
			return builder.toString();
		}
			

}
