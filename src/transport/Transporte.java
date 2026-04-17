package transport;

public class Transporte {
	
	
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public String descripcion() {
        return "Transporte con capacidad de " + capacidad + " personas.";
    }
	
	
	
	

}
