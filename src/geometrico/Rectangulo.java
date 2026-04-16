package geometrico;

public class Rectangulo extends Figura{



	public Rectangulo(String color, double altura, double base) {
		super(color, altura, base);
	}

	@Override
	public void area() {
		System.out.println("el area es "+this.getAltura()*this.getBase());
		
	
	}
	
	
	
	

}
