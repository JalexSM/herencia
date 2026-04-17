package transport;

public class Bus extends Transporte {
    
    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad);
        this.ruta = ruta;
    }

    @Override
    public String descripcion() {
        return "Bus de ruta " + ruta + " con capacidad de " + capacidad + " pasajeros.";
    }
}
