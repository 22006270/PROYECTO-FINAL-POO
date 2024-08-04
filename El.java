public class El extends Camisa{
private String tipo;
private static int c=0;
 
public El(){
    c++;
}
public El(String nombre, double precio, String color, String marca, String talla, String tela, String tipo){
    super(nombre, precio, color, marca, talla, tela);
    this.tipo=tipo;
    c++;
}

public String getTipo(){
    return tipo;
}
public void setTipo(String tipo){
    this.tipo=tipo;
}

public static int getC(){
    return c;
}

public String toString(){
    return " Producto: "+super.getNombre()+
    "\n Precio: $"+super.getPrecio()+
    "\n Codigo: "+super.getCodigo()+
    "\n Color: "+super.getColor()+
    "\n Marca: "+super.getMarca()+
    "\n Talla: "+super.getTalla()+
    "\n Material: "+super.getTela()+
    "\n Tipo de producto: "+this.tipo+"\n";
}
    
}
