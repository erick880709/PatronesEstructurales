package bridge;

public class Van extends Vehiculo{

    private boolean puertaCorrediza;

    public Van(boolean puertaCorrediza, IMotor motor) {
        super(motor);
        this.puertaCorrediza = puertaCorrediza;
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Vehiculo VAN "+(puertaCorrediza ? " con " : " sin")+" puerta corrediza");
    }
}
