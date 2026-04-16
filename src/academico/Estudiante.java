package academico;

public class Estudiante extends Persona{
	
	private int carnet;

	public Estudiante(String nombre, int edad, int carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}
	
	@Override
	
	public void mostrar() {
		super.mostrar();
		System.out.println("carnet:" + carnet);
		
	}
	
	


}
