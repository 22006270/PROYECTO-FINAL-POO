public class Ella extends Camisa{
    private String estilo;
    private static int c=0;
 
    public Ella(){
        c++;
    }
    public Ella(String nombre, double precio, String color, String marca, String talla, String tela, String estilo){
        super(nombre, precio, color, marca, talla, tela);
        this.estilo=estilo;
        c++;
    }

    public String getEstilo(){
        return estilo;
    }
    public void setEstilo(String estilo){
        this.estilo=estilo;
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
    "\n Tipo de producto: "+this.estilo+"\n";
    }
    
}
