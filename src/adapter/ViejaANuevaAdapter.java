package adapter;

import java.util.GregorianCalendar;

public class ViejaANuevaAdapter implements IPersonaNueva{
    private IPersonaVieja vieja;

    public ViejaANuevaAdapter(IPersonaVieja vieja) {
        this.vieja = vieja;
    }
    
    @Override
    public int getEdad(){
        GregorianCalendar c = new GregorianCalendar();
        GregorianCalendar c2 = new GregorianCalendar();
        c2.setTime(vieja.getFechaNacimiento());
        return c.get(1) - c2.get(1);
    }

    @Override
    public String getNombre() {
        return vieja.getNombre()+" "+vieja.getApellido();
    }

    @Override
    public void setNombre(String nombre) {
        String nombreCompleto[]=nombre.split(" ");
        String nom = nombreCompleto[0];
        String ape = nombreCompleto[1];
        vieja.setNombre(nom);
        vieja.setApellido(ape);
    }

    @Override
    public void setEdad(int edad) {
        GregorianCalendar c = new GregorianCalendar();
        int añoActual = c.get(1);
        c.set(1, añoActual - edad);
        vieja.setFechaNacimiento(c.getTime());
    }
}
