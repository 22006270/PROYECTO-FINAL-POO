import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class OperacionesJeans {
    private static int contador=0;
    private static Jeans [] listaDeJeans = new Jeans[10];
 
    public static boolean insertarJeans(){
    try {
    Scanner scn = new Scanner(System.in);
    Jeans j;
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
    int talla=scn.nextInt();
    System.out.println("Tela: ");
    String tela = scn.next();
    System.out.println("Corte: ");
    String corte=scn.next();
    j= new Jeans(nombre, precio, color, marca, talla, tela, corte);
    listaDeJeans[contador]=j;
    contador++;
    } catch (InputMismatchException e) {
        System.out.println("Los datos ingresados no son correctos");

        return false;
    }

        return true;
    }

 
    public static boolean buscarJeans(){
    Scanner lector = new Scanner(System.in);
    int numero=0;
    do{
        try{
    System.out.println("Ingrese el codigo del Jean a buscar:");
    int codigoBuscado=lector.nextInt();
    Jeans jean = new Jeans();
    jean.setCodigo(codigoBuscado);
    for (int i =0; i<contador;i++){
        if( listaDeJeans[i].equals(jean)){
            System.out.println("Se ha encontrado el producto con los siguientes datos:\n"+listaDeJeans[i]);
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

    public static void imprimirJeans(){
        for (int i = 0; i < contador; i++) {
            System.out.println(listaDeJeans[i]);
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
        System.out.println("Se tienen "+contador+" /"+Jeans.getC()+" Productos");
    }

    public static boolean eliminarJeans(){
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

    public static void lecturaJeans(){
        try {
            File jeans = new File("C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Jeans.txt");
            Scanner lector = new Scanner(jeans);
            Jeans jean;
            while (lector.hasNextLine()){
                int codigo = lector.nextInt();
                String nombre=lector.next();
                double precio = lector.nextDouble();
                String color = lector.next();
                String marca = lector.next();
                int talla = lector.nextInt();
                String  tela =lector.next();
                String corte = lector.next();
                jean=new Jeans (nombre, precio, color, marca, talla, tela, corte);
                jean.setCodigo(codigo);
                listaDeJeans[contador]=jean;
                contador++;
                
                }
                lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se detecto el archivo");
        }/*catch(InputMismatchException e){
        
        }*/
    }
    

    public static void escrituraJeans(){
        String ruta="C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Jeans.txt";
        try{
            FileWriter f = new FileWriter(ruta);
            PrintWriter i = new PrintWriter(f);
           for(int j =0; j<contador;j++){
            i.println("\n"+listaDeJeans[j].getCodigo());
            i.println(listaDeJeans[j].getNombre());
            i.println(listaDeJeans[j].getPrecio());
            i.println(listaDeJeans[j].getColor());
            i.println(listaDeJeans[j].getMarca());
            i.println(listaDeJeans[j].getTalla());
            i.println(listaDeJeans[j].getTela());
            i.print(listaDeJeans[j].getCorte());

           }
           f.close();
           i.close();
           
            System.out.println("Se ha escrito correctamente");

        }catch(IOException e){
            System.out.println("Ocurrio un error al escribir en el archivo Jeans");

        }
    }
    
}
