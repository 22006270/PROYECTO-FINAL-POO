public class Zapato extends Producto {
    private double talla;
    private String material;
    private static int c=0;
    public Zapato(){
        c++;
    }
    public Zapato(String nombre, double precio, String color, String marca, double talla, String material){
        super(nombre, precio, color, marca);
        this.talla=talla;
        this.material=material;

        c++;
    }
    
    public double getTalla(){
        return talla;
    }
    public void setTalla(double talla){
        this.talla=talla;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material;
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
        "\n Material: "+this.material+"\n";
    }
}
