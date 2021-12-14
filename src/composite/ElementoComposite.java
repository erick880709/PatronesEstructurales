package composite;

import java.util.ArrayList;

public class ElementoComposite extends ElementoDibujado{

    private ArrayList<ElementoDibujado> elementos = new ArrayList<>();

    public ElementoComposite(String nombre) {
        super(nombre);
    }
    
    @Override
    public void agregar(ElementoDibujado elemento) {
        elementos.add(elemento);
    }

    @Override
    public void quitar(ElementoDibujado elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void mostrar(int indentacion) {
        System.out.println(indentarElemento(indentacion)+" + "+nombre);
        for (ElementoDibujado elemento : elementos) {
            elemento.mostrar(indentacion+2);
        }
    }
    
}
