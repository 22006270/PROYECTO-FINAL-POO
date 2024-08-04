public class Tennis extends Zapato {
    private String deporte; 
    private static int c=0;

    public Tennis(){
        c++;
    }
    public Tennis(String nombre, double precio, String color, String marca, double talla, String material, String deporte ){
        super(nombre, precio, color, marca, talla, material);
        this.deporte=deporte;
        c++;
    }

    public String getDeporte(){
        return deporte;
    }
    public void setDeporte(String deporte){
        this.deporte=deporte;
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
        "\n Deporte: "+this.deporte+"\n";
    }
}
