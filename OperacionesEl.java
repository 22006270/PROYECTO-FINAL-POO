import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class OperacionesEl {
    private static int contador=0;
    private static El [] listaDeEl = new El[10];
    
    public static boolean insertarEl(){
    try {
    Scanner scn = new Scanner(System.in);
    El e;
    System.out.println("Insertar");
    System.out.println("Nombre: ");
    String  nombre=scn.next();
    System.out.println("Precio:");
    double precio=scn.nextDouble();
    System.out.println("Color: ");
    String color=scn.next();
    System.out.println("Marca: ");
    String marca = scn.next();
    System.out.println("Talla S M X: ");
    String talla = scn.next();
    System.out.println("Tela: ");
    String tela = scn.next();
    System.out.println("Tipo: ");
    String tippo = scn.next();
    e=new El(nombre, precio, color, marca, talla, tela, tippo);
    listaDeEl[contador]=e;
    contador++;
    } catch (InputMismatchException e) {
        System.out.println("Los datos ingresados no son correctos");

        return false;
    }
        return true;
    }
  
    public static boolean buscarEl(){
    Scanner lector = new Scanner(System.in);
    int numero=0;
    do{
        try{
    System.out.println("Ingresa el codigo de la camisa para El a buscar");
    int codigoBusqueda = lector.nextInt();
    El el = new El();
    el.setCodigo(codigoBusqueda);
    for (int i =0; i<contador;i++){
        if (listaDeEl[i].equals(el)) {
            System.out.println("Se ha encontrado el producto con los siguientes datos:\n"+listaDeEl[i]);

            return true;
        }
    }
}catch(InputMismatchException e){
    System.out.println("¡Cuidado! Solo puedes insertar números. ");
    lector.next();
}
}while(numero!=0);
        return false;
    }

    public static void imprimirEl(){
    for(int i=0; i<contador; i++){
        System.out.println(listaDeEl[i]);

        System.out.println("Ingersa tecla 'e' para mostar el siguiente producto");
        while (true) {
         Scanner l=new Scanner(System.in); 
         String entrada=l.nextLine();
             
          if(entrada.equals("E")||entrada.equals("e")){
             break;
         }
 
         }
         
    }
    System.out.println("Se han mostrado todos los productos");
    System.out.println("Se tienen "+contador+" /"+El.getC()+" Productos");
    }

    public static boolean eliminarEl(){
        if (!estaVacio()){
            contador--;
            return true;
        }
        return false;
    }

    public static boolean estaVacio(){
        if(contador==0){
            return true;
        }
        return false;
    }

    public static void lecturaEl(){
    try {
    File el = new File("C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\El.txt");
    Scanner lector = new Scanner(el);
    El E;
    while (lector.hasNextLine()){
        int codigo=lector.nextInt();
        String nombre=lector.next();
        double precio = lector.nextDouble();
        String color = lector.next();
        String marca = lector.next();
        String talla = lector.next();
        String  tela =lector.next();
        String tipo = lector.next();
        E=new El (nombre, precio, color, marca, talla, tela, tipo);
        E.setCodigo(codigo);
        listaDeEl[contador]=E;
        contador++;
        }
        lector.close();
    } catch (FileNotFoundException e) {
        System.out.println("No se detecto el archivo");

    } 
    }
    
    public static void escrituraEl(){
        String ruta="C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\El.txt";
        try{
            FileWriter f = new FileWriter(ruta);
            PrintWriter i = new PrintWriter(f);
            for(int j=0; j<contador;j++){
                i.println("\n"+listaDeEl[j].getCodigo());
                i.println(listaDeEl[j].getNombre());
                i.println(listaDeEl[j].getPrecio());
                i.println(listaDeEl[j].getColor());
                i.println(listaDeEl[j].getMarca());
                i.println(listaDeEl[j].getTalla());
                i.println(listaDeEl[j].getTela());
                i.print(listaDeEl[j].getTipo());

            } 
            f.close();
            i.close();  
            System.out.println("Se ha escrito correctamente");

        }catch(IOException e){
            System.out.println("Ocurrio un error al escribir en el archivo El");

        }
    }
}
