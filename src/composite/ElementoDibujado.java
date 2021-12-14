package composite;

public abstract class ElementoDibujado {

    protected String nombre;

    public ElementoDibujado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void agregar(ElementoDibujado elemento);

    public abstract void quitar(ElementoDibujado elemento);

    public abstract void mostrar(int indentacion);

    public String indentarElemento(int indentacion) {
        String cad = "";
        for (int i = 0; i < indentacion; i++) {
            cad += "-";
        }
        return cad;
    }
}

