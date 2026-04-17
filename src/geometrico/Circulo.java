package geometrico;

public class Circulo extends Figura{
	
	private double radio;
	public Circulo(double radio) {
        this.radio = radio;
    }
	
	@Override
	public void area() {
		System.out.println("el area es "+(Math.PI * radio * radio));
		
	
	}

	
	
	
	
	
	

}
