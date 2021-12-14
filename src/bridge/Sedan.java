package bridge;

public class Sedan extends Vehiculo{
	
    private int capacidadMaletero;

    public Sedan(int capacidadMaletero, IMotor motor) {
        super(motor);
        this.capacidadMaletero = capacidadMaletero;
    }

    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Vehiculo SEDAN con un maletero de capacidad "+capacidadMaletero);
    }
    
}
