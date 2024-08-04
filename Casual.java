public class Casual extends Zapato{
    private String categoria;
    private static int c=0;

    public Casual(){
        c++;
    } 
    public Casual(String nombre, double precio, String color, String marca, double talla, String material,String categoria){
        super(nombre, precio, color, marca, talla, material);
        
        this.categoria=categoria;
        c++;
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
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
        "\n Material: "+super.getMaterial()+
        "\n Deporte: "+this.categoria+"\n";
    }
    
}
