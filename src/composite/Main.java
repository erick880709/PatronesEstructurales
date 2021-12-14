package composite;

public class Main {
	public static void main(String[] args) {
        ElementoComposite raiz = new ElementoComposite("Dibujo");
        raiz.agregar(new ElementoPrimitivo("Linea Roja"));
        raiz.agregar(new ElementoPrimitivo("C�rculo Azul"));
        raiz.agregar(new ElementoPrimitivo("Cuadrado Verde"));
        
        ElementoComposite rama = new ElementoComposite("2 C�rculos");
        rama.agregar(new ElementoPrimitivo("C�rculo Negro"));
        rama.agregar(new ElementoPrimitivo("C�rculo Amarillo"));
        raiz.agregar(rama);
        
        ElementoPrimitivo eprim=new ElementoPrimitivo("Linea amarilla");
        raiz.agregar(eprim);
       // raiz.quitar(eprim);
        
        raiz.mostrar(1);
    }
   
}
