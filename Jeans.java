public class Jeans extends Pantalon{
    private String corte;
    private static int c=0;
 
    public Jeans(){
        c++;
    }
    public Jeans(String nombre, double precio, String color, String marca, int talla, String tela, String corte){
        super(nombre, precio, color, marca, talla, tela);
        this.corte=corte;
        c++;
    }

    public String getCorte(){
        return corte;
    } 
    public void setCorte(String corte){
        this.corte=corte;
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
    "\n Tipo de producto: "+this.corte+"\n";
    }
    
}
