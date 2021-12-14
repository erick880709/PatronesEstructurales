package composite;

public class ElementoPrimitivo extends ElementoDibujado{

    public ElementoPrimitivo(String nombre) {
        super(nombre);
    }

    @Override
    public void agregar(ElementoDibujado elemento) {
        System.out.println("No puedo agregar nada a un elemento primitivo");
    }

    @Override
    public void quitar(ElementoDibujado elemento) {
        System.out.println("No puedo quitar nada a un elemento primitivo");
    }

    @Override
    public void mostrar(int indentacion) {
        System.out.println(indentarElemento(indentacion)+" "+nombre);
    }
     

}

