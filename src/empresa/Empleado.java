package empresa;

public class Empleado {
	
	
	private String nombre;
	protected double salario;
	
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public double calcularSalario() {
	        return salario;
	    }
	
	public void mostrarInfo() {
		
		System.out.println("nombre:"+nombre);
		System.out.println("salario:"+calcularSalario());
		
		
		
	}

}
