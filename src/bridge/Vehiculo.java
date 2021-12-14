package bridge;

public abstract class Vehiculo {
	
	private IMotor motor;

    public Vehiculo(IMotor motor) {
        this.motor = motor;
    }
    
    public void acelerar(double combustible){
        motor.inyectarCombustible(combustible);
        motor.consumirCombustible();
    }
    
    public void frenar(){
        System.out.println("El veh�culo est� detenido.");
    }
    
    public abstract void mostrarCaracteristicas();
}
