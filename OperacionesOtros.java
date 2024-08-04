import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintWriter; 
public class OperacionesOtros {
    private static int contador=0;
    private static Otros [] listaDeOtros = new Otros[10];
    public static boolean insertarOtros(){
        try {
            Scanner scn = new Scanner(System.in);
            Otros o;
            System.out.println("Insertar");
            System.out.println("Nombre: ");
            String nombre=scn.next();
            System.out.println("Precio:");
            double precio=scn.nextDouble();
            System.out.println("Color: ");
            String color=scn.next();
            System.out.println("Marca: ");
            String marca = scn.next();
            System.out.println("Talla: ");
            int talla = scn.nextInt();
            System.out.println("Tela: ");
            String tela = scn.next();
            System.out.println("Estilo: ");
            String estilo = scn.next();
            o=new Otros(nombre, precio, color, marca, talla, tela, estilo);
            listaDeOtros[contador]=o;
            contador++;
        } catch (InputMismatchException e) {
            System.out.println();
            return false;
        }
        return true;
    } 

    public static boolean buscarOtros(){
        Scanner lector = new Scanner(System.in);
        int numero=0;
        do{
            try{
        System.out.println("Ingresa el codigo del pantalon a buscar:");
        int codigoBuscado=lector.nextInt();
        Otros otro = new Otros();
        otro.setCodigo(codigoBuscado);
        for(int i=0; i<contador;i++){
            if(listaDeOtros[i].equals(otro)){
                System.out.println("Se ha encontrado el producto con los siguientes datos:\n"+listaDeOtros[i]);
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

    public static void imprimirOtros(){
        for(int i=0; i<contador;i++){
            System.out.println(listaDeOtros[i]);

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
        System.out.println("Se tienen "+contador+" /"+Otros.getC()+" Productos");
    }

    public static boolean eliminarOtros(){
        if(!estaVacio()){
            contador--;
            return true;
        }
        return false;
    }

    public static boolean estaVacio(){
    if (contador==0){
        return true;
    }
        return false;
    }

    public static void lecturaOtros(){
        try {
            
        File otr = new File("C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Otros.txt");
        Scanner lector = new Scanner(otr);
        Otros otro;
        while (lector.hasNextLine()) {
            int codigo = lector.nextInt();
            String nombre=lector.next();
            double precio = lector.nextDouble();
            String color = lector.next();
            String marca = lector.next();
            int talla = lector.nextInt();
            String  tela =lector.next(); 
            String estilo = lector.next();
            otro=new Otros (nombre, precio, color, marca, talla, tela, estilo);
            otro.setCodigo(codigo);
            listaDeOtros[contador]=otro;
            contador++;
        }
    lector.close();
    } catch (FileNotFoundException e) {
    System.out.println("No se detecto el archivo");
    }

}

public static void escrituraOtros(){
    String ruta="C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Otros.txt";
    try {
        FileWriter f = new FileWriter(ruta);
        PrintWriter i = new PrintWriter(f);
        for(int j =0; j<contador;j++){
            i.println("\n"+listaDeOtros[j].getCodigo());
            i.println(listaDeOtros[j].getNombre());
            i.println(listaDeOtros[j].getPrecio());
            i.println(listaDeOtros[j].getColor());
            i.println(listaDeOtros[j].getMarca());
            i.println(listaDeOtros[j].getTalla());
            i.println(listaDeOtros[j].getTela());
            i.print(listaDeOtros[j].getEstilo());

        }
        i.close();
        f.close();
        System.out.println("Se ha escrito correctamente");
    } catch (IOException e) {
        System.out.println("Ocurrio un error al escribir en el archivo Otros");
    }
    

 
}
}
