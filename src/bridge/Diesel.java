package bridge;

public class Diesel implements IMotor{

    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Inyectando "+cantidad+" ml. de ACPM");
    }

    @Override
    public void consumirCombustible() {
        quemarCombustible();
    }
    
    public void quemarCombustible(){
        System.out.println("Quemando el ACPM");
    }
}
