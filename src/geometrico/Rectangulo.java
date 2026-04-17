package geometrico;

public class Rectangulo extends Figura{

	private double altura;
	private double base;
	

	public Rectangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public void area() {
		System.out.println("el area es "+altura*base);
		
	
	}




	
	

}
