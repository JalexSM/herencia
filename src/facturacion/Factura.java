package facturacion;

public class Factura {

	protected int numero;
	protected Cliente cliente;
	protected double total;

	public Factura(int numero, Cliente cliente, double total) {
		this.numero = numero;
		this.cliente = cliente; 	
	}

	public double calcularTotal() {
		return total;
	}

	public void mostrarFactura() {
		System.out.println("Factura No: " + numero);
		System.out.println("Cliente: " + cliente.getNombre());
		System.out.println("NIT: " + cliente.getNit());
		System.out.println("Total: " + calcularTotal());
	}

}
