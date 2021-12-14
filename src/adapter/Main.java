package adapter;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
        PersonaVieja vieja = new PersonaVieja();
        vieja.setNombre("Carlos");
        vieja.setApellido("Perez");
        GregorianCalendar c = new GregorianCalendar();
        c.set(2000, 12, 24);
        Date d = c.getTime();
        vieja.setFechaNacimiento(d);
        
        ViejaANuevaAdapter nueva = new ViejaANuevaAdapter(vieja);
        System.out.println("Nombre: "+nueva.getNombre());
        System.out.println("Edad: "+nueva.getEdad());
        nueva.setEdad(20);
        nueva.setNombre("Juan Ramirez");
        System.out.println("Nombre: "+nueva.getNombre());
        System.out.println("Edad: "+nueva.getEdad());
        
    }
}
