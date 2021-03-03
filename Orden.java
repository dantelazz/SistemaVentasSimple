package ventas;

public class Orden {
	
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	
	//VALOR UNICO X CADA OBJETO 
	//HAY Q INICIAR EL ARREGLO SINO EL VALOR ES NULL
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	//SI NO SE PASA LA CANTIDAD MAXIMA SE AGREGA Y SE SUMAN EL N DE PRODUCTOS
		public void agregarProducto(Producto producto) {
			if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
				this.productos[this.contadorProductos ++] = producto;
			}
			else {System.out.println("Se supero el maximo de productos: "+ Orden.MAX_PRODUCTOS);}
					}
		// POR CADA OBJETO MAYOR A CERO, LO LLAMA Y SUMAS SUS TOTALES
		public double calcularTotal() {
			double total = 0;
			for (int i = 0; i < this.contadorProductos; i++) {
				Producto producto = this.productos[i];
				total += producto.getPrecio();
			}
			return total;
		}
		
		public void mostrarOrden() {
			System.out.println("Id Orden: " + this.idOrden);
			double totalOrden = this.calcularTotal();
			System.out.println("Total de la orden: $"+ totalOrden);
			System.out.println("Productos de la Orden: ");
			for (int i = 0; i < this.contadorProductos; i++) {
				System.out.println(this.productos[i]);
			}
		}
}

