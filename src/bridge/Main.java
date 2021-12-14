package bridge;

public class Main {
	 public static void main(String[] args) {
	        IMotor motorDiesel = new Diesel();
	        Vehiculo sedan = new Sedan(4, motorDiesel);
	        sedan.mostrarCaracteristicas();
	        
	        sedan.acelerar(2.4d);
	        
	        IMotor motorGasolina = new Gasolina();
	        Vehiculo van = new Van(true, motorGasolina);
	        van.mostrarCaracteristicas();
	        
	        van.acelerar(3.4d);
	    }
}
