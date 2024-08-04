public class Pantalon extends Producto {
    private int talla;
    private String tela;
    private static int c=0;

    public Pantalon(){
        c++;
    }
    public Pantalon(String nombre, double precio, String color, String marca, int talla, String tela){
        super(nombre, precio, color, marca);
        this.talla=talla;
        this.tela=tela;
        c++;
    }

    public int getTalla(){
        return talla;
    }
    public void setTalla(int talla){
        this.talla=talla;
    }

    public String getTela(){
        return tela;
    }
    public void setTela(String tela){
        this.tela=tela;
    }

    public static int getC(){
        return c;
    }

    public String toString (){
         return " Producto: "+super.getNombre()+
        "\n Precio: $"+super.getPrecio()+
        "\n Codigo: "+super.getCodigo()+
        "\n Color: "+super.getColor()+
        "\n Marca: "+super.getMarca()+
        "\n Talla: "+this.talla+
        "\n Material: "+this.tela+"\n";
    }
    
}
