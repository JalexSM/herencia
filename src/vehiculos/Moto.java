package vehiculos;

public class Moto  extends Vehiculo{
	
	private int cilindrada;

	public Moto(String marca, String velocida, int cilindrada) {
		super(marca, velocida);
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("cilidrada : "+cilindrada);
	}
	
	

}
