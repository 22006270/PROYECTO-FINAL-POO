public class Producto {
    private String nombre;
    private double precio;
    private int codigo;
    private static int serie=100;//CONTADOR
    private String color;
    private String marca;
    private static int c=0;
    //CONSTRUCTORES
    public Producto(){
        serie++;
        codigo=serie;
        c++;
    }//CONSTRUCTOR OMISION
    
    public Producto(int codigo){
        this.codigo=codigo;
    }
    public Producto (String nombre, double precio, String color, String marca){//CONSTRUCTOR PARAMETROS
        this.nombre=nombre;
        this.precio=precio;
        this.color=color;
        this.marca=marca;
        serie++;
        codigo=serie;
        c++;
    }

    //GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public static int getC(){
        return c;
    }

    public String toString(){
        return " Producto: "+this.nombre+
        "\n Precio: $"+this.precio+
        "\n Codigo: "+this.codigo+
        "\n Color: "+this.color+
        "\n Marca: "+this.marca+"\n";
    }

    public boolean equals(Object obj){
       
        if (obj instanceof Producto){
            
            Producto prod=(Producto)obj;
            if (codigo==prod.getCodigo()){
                return true;
            }
        }
        return false;
    }




}
