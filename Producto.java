package ventas;

public class Producto {

	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	// CREA UN IDENTIFICADOR PARA CADA PRODUCTO
	private Producto() {
		this.idProducto = ++Producto.contadorProductos;
	}
	
	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	

	public int getIdProducto() {
		return idProducto;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [idProducto=");
		builder.append(idProducto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}
	
	 
	
}
