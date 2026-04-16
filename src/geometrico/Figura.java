package geometrico;

public class Figura {
	
	private String color;
	private double altura;
	private double base;
	
	
	public Figura(String color, double altura, double base) {
		super();
		this.color = color;
		this.altura = altura;
		this.base = base;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}
	
	
	public void area() {

		
	}
	

	@Override
	public String toString() {
		return "Figura [color=" + color + ", altura=" + altura + ", base=" + base + "]";
	}
	
	
	
	
	

}
