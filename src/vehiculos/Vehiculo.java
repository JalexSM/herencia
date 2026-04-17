package vehiculos;

public class Vehiculo {


	protected String marca;
	protected String velocida;
	public Vehiculo(String marca, String velocida) {
		super();
		this.marca = marca;
		this.velocida = velocida;
	}
	
	public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocida);
    }

	

}
