import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class OperacionesTennis {
    private static int contador = 0;
    private static Tennis[] listaDeTennis = new Tennis[10];

    public static boolean insertarTennis() {
        try {
        Scanner scn = new Scanner(System.in);
        Tennis t;
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
        System.out.println("Deporte: ");
        String deporte=scn.next();
        t=new Tennis(nombre, precio, color, marca, talla, material, deporte);
        listaDeTennis[contador]=t;
        contador++;
        } catch (InputMismatchException e) {
            System.out.println("Los datos ingresados no son correctos");

            return false;
        }
        return true;
        
        
    }

    public static boolean buscarTennis() {
        Scanner lector = new Scanner(System.in);
        int numero=0;
        do{
        try{ 
       
        System.out.println("Ingresa el codigo del Teni a buscar");
        int codigoBuscado=lector.nextInt();
        //Tennis te = new Tennis();
        Producto p = new Producto(codigoBuscado);
        //te.setCodigo(codigoBuscado);
        for(int i=0;i<contador;i++){
            if (listaDeTennis[i].equals(p)){
                System.out.println("Se ha encontrado el producto con los siguientes datos:\n"+listaDeTennis[i]);

                return true;
            }
        } 
        
    }catch(InputMismatchException E){
        System.out.println("¡Cuidado! Solo puedes insertar números. ");
       lector.next();
    }
}while(numero!=0);
    return false;
}

    public static void imprimirTennis() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaDeTennis[i]);

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
    System.out.println("Se tienen "+contador+" /"+Tennis.getC()+" Productos");
       

    }

    public static boolean eliminarTennis() {
    /*Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa el codigo del Teni a eliminar:");
    int codigoEliminar=leer.nextInt();
    for(int i=0; i<contador; i++){
        if(listaDeTennis[i].getCodigo()==codigoEliminar){
            for(int j=i; j<contador-1;j++){
                listaDeTennis[j]=listaDeTennis[j+1];
            }
            listaDeTennis[contador-1]=null;
            contador--;
            return true;
    } */
    if(!estaVacio()){
        contador--;
        return true;
    }
    return false;
     
    }
     

    public static boolean estaVacio() {
        if (contador==0){
            return true;
        }
            return false;
        //contador =0
    }

    public static void lecturaTennis() {
        try {
            File tennis = new File("C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Tennis.txt");
            Scanner lector = new Scanner(tennis);
            Tennis teni;

            while (lector.hasNextLine()) {
                int codigo = lector.nextInt();
                String nombre = lector.next();
                double precio = lector.nextDouble();
                String color = lector.next();
                String marca = lector.next();
                double talla = lector.nextDouble();
                String material = lector.next();
                String deporte = lector.next();
                teni = new Tennis(nombre, precio, color, marca, talla, material, deporte);
                teni.setCodigo(codigo);
                listaDeTennis[contador] = teni;
                contador++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se detecto el archivo");
        }
    }

    public static void escrituraTennis(){
        String ruta="C:\\Users\\IDEAPAD 3\\Documents\\UAN\\TERCER SEMESTRE\\POO-JAVA\\Catalogo\\src\\Tennis.txt";
        try{
            FileWriter f = new FileWriter(ruta);
            PrintWriter i = new PrintWriter(f);
          
                for (int j =0; j<contador; j++){
                i.println("\n"+listaDeTennis[j].getCodigo());
                i.println(listaDeTennis[j].getNombre());
                i.println(listaDeTennis[j].getPrecio());
                i.println(listaDeTennis[j].getColor());
                i.println(listaDeTennis[j].getMarca());
                i.println(listaDeTennis[j].getTalla());
                i.println(listaDeTennis[j].getMaterial());
                i.print(listaDeTennis[j].getDeporte());
                
            }
            
            
            i.close();
            f.close();
           
            System.out.println("Se ha escrito correctamente");

        }catch(IOException e){
            System.out.println("Ocurrio un error al escribir en el archivo Tennis");

        }
    }

    

}
