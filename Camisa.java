public class Camisa extends Producto {
    private String talla;
    private String tela;
    private static int c=0;

    public Camisa(){
        c++;
    }
    public Camisa(String nombre, double precio, String color, String marca, String talla, String tela){
        super(nombre, precio, color, marca);
        this.talla=talla;
        this.tela=tela;
        c++;
    }

    public String getTalla(){
        return talla;
    }
    public void setTalla(String talla){
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

    public String toString(){
        return " Producto: "+super.getNombre()+
        "\n Precio: $"+super.getPrecio()+
        "\n Codigo: "+super.getCodigo()+
        "\n Color: "+super.getColor()+
        "\n Marca: "+super.getMarca()+
        "\n Talla: "+this.talla+
        "\n Material: "+this.tela+"\n";
    }
    
}
