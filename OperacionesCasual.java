import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class OperacionesCasual {
    private static int contador = 0;
    private static Casual[] listaDeCasual = new Casual[10];


    public static boolean insertarCasual(){
        
        try {
        Scanner scn = new Scanner(System.in);
        Casual c;
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
        double talla=scn.nextDouble();
        System.out.println("Material: ");
        String material=scn.next();
        System.out.println("Categoria: ");
        String categoria=scn.next();
        c=new Casual(nombre, precio, color, marca, talla, material, categoria);
        listaDeCasual[contador]=c;
        contador++;

        } catch (InputMismatchException e) {
            System.out.println("Los datos ingresados no son correctos");
            
            return false;
        }
    
        return true;
    }


    public static boolean buscarCasual(){
        Scanner lector = new Scanner(System.in);
        int numero=0;
        do{
            try{
        System.out.println("Ingresa el codigo del teni casual a buscar");
        int codigoBuscado=lector.nextInt();
        Casual cas = new Casual();
        cas.setCodigo(codigoBuscado);
        for(int i=0;i<contador;i++){
            if (listaDeCasual[i].equals(cas)){
                System.out.println("Se ha encontrado el producto con los siguientes datos:\n"+listaDeCasual[i]);
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

    public static void imprimirCasual(){
        for (int i = 0; i < contador; i++) {
            System.out.println(listaDeCasual[i]);
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
    System.out.println("Se tienen "+contador+" /"+Casual.getC()+" Productos");
    }

    public static boolean eliminarCasual(){
        if(!estaVacio()){
        contador--;
        }
        return false;
    }

    public static boolean estaVacio(){
        if(contador==0){
        
            return true;
        }
        return false;
    }

    public static void lecturaCasual(){
        try {
            File casual = new File(
                "C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Casual.txt");
            Scanner lector =  new Scanner(casual);
            Casual cas;
            while (lector.hasNextLine()) {
            int codigo = lector.nextInt();
            String nombre=lector.next();
            double precio=lector.nextDouble();
            String color=lector.next();
            String marca=lector.next();
            double talla=lector.nextDouble();
            String material=lector.next();
            String categoria=lector.next();
            cas=new Casual(nombre, precio, color, marca,talla, material, categoria);
            cas.setCodigo(codigo);
            listaDeCasual[contador]=cas;
            contador++;
            
        } 
        lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se detecto el archivo");

        } /*catch(InputMismatchException e){
        
        }*/
        
    }

    public static void escrituraCasual(){
        String ruta="C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Casual.txt";
       
        try{
            FileWriter f = new FileWriter(ruta);
            PrintWriter i = new PrintWriter(f);
            for(int j =0; j<contador;j++){
            i.println("\n"+listaDeCasual[j].getCodigo());
            i.println(listaDeCasual[j].getNombre());
            i.println(listaDeCasual[j].getPrecio());
            i.println(listaDeCasual[j].getColor());
            i.println(listaDeCasual[j].getMarca());
            i.println(listaDeCasual[j].getTalla());
            i.println(listaDeCasual[j].getMaterial());
            i.print(listaDeCasual[j].getCategoria());
           
            }
            f.close();
            i.close();
            System.out.println("Se ha escrito correctamente");

        }catch(IOException e){
            System.out.println("Ocurrio un error al escribir en el archivo Casual");

        }

    }


    
    
}

    


