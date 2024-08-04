import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class OperacionesElla {
    private static int contador=0;
    private static Ella [] listaDeElla = new Ella[10];
    public static boolean insertarElla(){
        try {
            Scanner scn = new Scanner(System.in);
            Ella e;
            System.out.println("Insertar");
            System.out.println("Nombre: ");
            String nombre=scn.next();
            System.out.println("Precio:");
            double precio=scn.nextDouble();
            System.out.println("Color: ");
            String color=scn.next();
            System.out.println("Marca: ");
            String marca = scn.next();
            System.out.println("Talla: S M X ");
            String talla = scn.next();
            System.out.println("Tela: ");
            String tela = scn.next();
            System.out.println("Estilo: ");
            String estilo = scn.next();
            e=new Ella(nombre, precio, color, marca, talla, tela, estilo);
            listaDeElla[contador]=e;
            contador++;
        } catch (InputMismatchException e) {
            System.out.println("Los datos ingresados no son correctos");

        return false;
        }
        return true;
    }

    public static boolean buscarElla(){
    Scanner lectura = new Scanner(System.in);
    int numero=0;
    do{ 
        try{
    System.out.println("Ingresa el codigo de la camisa para ella a buscar:");
    int codigoBuscado=lectura.nextInt();
    Ella ella = new Ella();
    ella.setCodigo(codigoBuscado);
    for (int i = 0; i < contador; i++) {
        if (listaDeElla[i].equals(ella)) {
            System.out.println("Se ha encontrado el producto con los siguientes datos:\n"+listaDeElla[i]);

            return true;
        }
    }
}catch(InputMismatchException e){
    System.out.println("¡Cuidado! Solo puedes insertar números. ");
    lectura.next();
}
}while(numero!=0);
    return false;
    }

    public static void imprimirElla(){
        for(int i=0; i<contador;i++){
            System.out.println(listaDeElla[i]);

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
        System.out.println("Se tienen "+contador+" /"+Ella.getC()+" Productos");
    } 

    public static boolean eliminarElla(){
        if(!estaVacio()){
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

    public static void lecturaElla(){
        
        try {
    File ella = new File("C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\ella.txt");
    Scanner lector = new Scanner(ella);
    Ella ell;
    /*if (!ella.exists()) {//si no existe el archivo
        ella.createNewFile();//crea el archivo
    }*/

    while (lector.hasNextLine()){
        int codigo=lector.nextInt();//validar el siguiente renglon p
        String nombre=lector.next();
        double precio = lector.nextDouble();
        String color = lector.next();
        String marca = lector.next();
        String talla = lector.next();
        String  tela =lector.next();
        String estilo = lector.next();
        ell=new Ella (nombre, precio, color, marca, talla, tela, estilo);
        ell.setCodigo(codigo);
        listaDeElla[contador]=ell;
        contador++;
        } 
        lector.close();
    } catch (FileNotFoundException e) {
        System.out.println("No se detecto el archivo");

    }

}

public static void escrituraElla(){
    String ruta="C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Ella.txt";
try {
    FileWriter f = new FileWriter(ruta);
    PrintWriter i = new PrintWriter(f);
    for(int j=0; j<contador;j++){
        i.println("\n"+listaDeElla[j].getCodigo());
        i.println(listaDeElla[j].getNombre());
        i.println(listaDeElla[j].getPrecio());
        i.println(listaDeElla[j].getColor());
        i.println(listaDeElla[j].getMarca());
        i.println(listaDeElla[j].getTalla());
        i.println(listaDeElla[j].getTela());
        i.print(listaDeElla[j].getEstilo());

    }
    i.close();
    f.close();
    System.out.println("Se ha escrito correctamente");

} catch (Exception e) {
    System.out.println("Ocurrio un error al escribir en el archivo Ella");
}
}
}
