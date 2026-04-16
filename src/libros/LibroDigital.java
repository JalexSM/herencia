package libros;

public class LibroDigital extends Libro{
	
	private double tamanoMB;

	public LibroDigital(String autor, String titulo, double tamanoMB) {
		super(autor, titulo);
		this.tamanoMB = tamanoMB;
	}
	
	

	public void mostrarInfo(){
		System.out.println("titulo: "+titulo);
		System.out.println("autor: "+autor);
		System.out.println("tamaño: "+tamanoMB+"MB");
	
	
	}
	
	
	

}
