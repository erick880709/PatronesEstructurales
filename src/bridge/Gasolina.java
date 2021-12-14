package bridge;

public class Gasolina implements IMotor{
	
    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Inyectando "+cantidad+" ml. de GASOLINA");
    }

    @Override
    public void consumirCombustible() {
        quemarCombustible();
    }
    
    public void quemarCombustible(){
        System.out.println("Quemando la GASOLINA");
    }
}