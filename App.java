import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class App {
    public static void main(String[] args) throws Exception {

      Scanner scan = new Scanner(System.in);
      
     OperacionesTennis.lecturaTennis();
     OperacionesCasual.lecturaCasual();
     OperacionesJeans.lecturaJeans();
     OperacionesOtros.lecturaOtros();
     OperacionesEl.lecturaEl();
     OperacionesElla.lecturaElla();
      
     
            
int op=0, op2=0, op3=0, op4=0;


try{
do{
    

        System.out.println("-----------------Menú-----------------"+
        "\n 1) Zapatos"+
        "\n 2) Pantalones"+
        "\n 3) Camisas"+
        "\n 4) Salir"+
        "\nIngresa el producto a comprar");
        op=scan.nextInt();
                    
            switch (op) {
                case 1:
                    
                    do {
                          
                        System.out.println("-----------------Zapatos-----------------");
                        System.out.println("1) Tenis "+"2) Casual "+"3) Regresar");
                        op2=scan.nextInt();

                        switch (op2) {
                            case 1:
                          
                            do {

                                 
                                 System.out.println("-----------------Tenis-----------------");
                                 System.out.println("1) Insertar "+ "2) Buscar "+"3) Eliminar"+ " 4) Imprimir"+ " 5) Regresar");
                                 op3 = scan.nextInt();

                                 switch (op3) {
                                    case 1:
                                   
                                        System.out.println("-----------------Insertar (Teni)-----------------");
                                        //creamos un objeto y lo metemos a un arreglo
                                        if(OperacionesTennis.insertarTennis()){
                                            System.out.println("El teni se ha insertado correctamente!");
                                        }else{
                                            System.out.println("Error, no se pudo insertar el teni :(");
                                        }
                                         
                                        break;
                                    case 2:
                                    System.out.println("-----------------Buscar (Teni)-----------------");
                                    if (OperacionesTennis.buscarTennis()) {
                                        System.out.println("El producto se ha encontrado");
                                    
                                    } else {
                                        System.out.println("El teni no se encuentra en el catalogo");
                                       System.out.println("Desea ingresar un nuevo teni? 1)Si  2)No");
                                       Scanner l = new Scanner(System.in);
                                       int q=l.nextInt();
                                       if (q==1) {
                                        System.out.println("\nInsertar nuevo teni");
                                        OperacionesTennis.insertarTennis();
                                       } else {
                                        try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                        System.out.println("Regresando");
                                       
                                       }
                                    }
                                    break;
                                    case 3:
                                    System.out.println("-----------------Eliminar (Teni)-----------------");
                                  if(OperacionesTennis.eliminarTennis()){
                                    System.out.println("El producto Teni se ha eliminado correctamente");
                                  }else{
                                    System.out.println("No existe un producto en el inventario");
                                  }
                                  
                                  /*else{
                                    System.out.println("No se encontro el teni :(");
                                    System.out.println("Desea agregar un nuevo Teni? 1)Si   2)No");
                                    Scanner l = new Scanner(System.in);
                                    int a=l.nextInt();
                                    if(a==1){
                                    OperacionesTennis.insertarTennis();
                                    }else{
                                        System.out.println("Regresando...");
                                    }
                                }*/
                                
                                    

                                    break;
                                    case 4:
                                    System.out.println("-----------------Imprimir-----------------");
                                    OperacionesTennis.imprimirTennis();
                                    
                                    break;
                                    case 5:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Regresando...");
                                    break;
                                    
                                    default:
                                      try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                        
                                    System.out.println("Error No ingresaste una opcion valida");
                                        
                                 }
                            } while (op3!=5);
                                break;
                            
                            case 2:
                             
                            do {
                                  
                            System.out.println("-----------------Casual-----------------");
                            System.out.println("1) Insertar "+ "2) Buscar "+"3) Eliminar"+ " 4) Imprimir"+ " 5) Regresar");
                                 op4 = scan.nextInt();
                                 switch (op4) {
                                    
                                    case 1:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("-----------------Insertar (Teni Casual)-----------------");
                                    if(OperacionesCasual.insertarCasual()) {
                                        System.out.println("Se ha insertado correctamente el teni casual");
                                    }else{
                                        System.out.println("No se ha podido insertar el teni casual ");
                                    }
                                    break;
                                    case 2:
                                    System.out.println("-----------------Buscar (Teni Casual)-----------------");
                                    if (OperacionesCasual.buscarCasual()) {
                                        System.out.println("El producto se ha encontrado");
                                    
                                    } else {
                                        System.out.println("El producto no se encuentra en el catalogo");
                                       System.out.println("Desea ingresar un nuevo teni casual? 1)Si  2)No");
                                       Scanner l = new Scanner(System.in);
                                       int q=l.nextInt();
                                       if (q==1) {
                                        System.out.println("\nInsertar nuevo teni casual");
                                        OperacionesCasual.insertarCasual();
                                       } else {
                                        try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                        System.out.println("Regresando");
                                        
                                    }
                                }
                                    
                                    break;
                                    case 3:
                                    System.out.println("-----------------Eliminar (Teni Casual)-----------------");
                                  
                                
                                    if(OperacionesCasual.eliminarCasual()){
                                         System.out.println("El producto casual se ha eliminado correctamente");
                                         }else{
                                    System.out.println("No existe un producto en el inventario");
                                  }
                  
                                    break;
                                    case 4:
                                    System.out.println("-----------------Imprimir-----------------");
                                    OperacionesCasual.imprimirCasual();
                                    break;
                                    case 5:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Regresando...");
                                    break;
                                    default: 
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Error No ingresaste una opcion valida");
                                        break;
                                 }
                            } while (op4!=5);
                        
                            break;
                            case 3:
                            try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                            System.out.println("Regresando...");
                            break;
                            
                            default: 
                              try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                            System.out.println( "Error opcion no valida");

                        }
                    } while (op2!=3);
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        
                    }
                    break;



//--------------------------------------------------------------------------------------------------------------------------------------

                case 2:
                 do {
                        
                        System.out.println("-----------------Pantalones-----------------");
                        System.out.println("1) Jeans "+"2) Otro "+"3) Regresar");
                        op2=scan.nextInt();

                        switch (op2) {
                            case 1:
                          
                            do {
                            
                                 System.out.println("-----------------Jeans-----------------");
                                 System.out.println("1) Insertar "+ "2) Buscar "+"3) Eliminar"+ " 4) Imprimir"+ " 5) Regresar");
                                 op3 = scan.nextInt();

                                 switch (op3) {
                                    case 1:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("-----------------Insertar (Pantalon Jeans)-----------------");
                                    if  (OperacionesJeans.insertarJeans()){
                                        System.out.println("Se ha insertado correctamente el pantalon Jeans");
                                    }else{
                                        System.out.println("No se ha podido insertar el pantalon Jeans");
                                    }
                                    break;
                                    case 2:
                                    System.out.println("-----------------Buscar (Pantalon Jeans)-----------------");
                                    if (OperacionesJeans.buscarJeans()) {
                                        System.out.println("El producto se ha encontrado");
                                    
                                    } else {
                                        System.out.println("El producto no se encuentra en el catalogo");
                                       System.out.println("Desea ingresar una nuevo Jeans? 1)Si  2)No");
                                       Scanner l = new Scanner(System.in);
                                       int q=l.nextInt();
                                       if (q==1) {
                                        System.out.println("\nInsertar nuevo pantalon para Jeans");
                                        OperacionesJeans.insertarJeans();
                                       } else {
                                        try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                        System.out.println("Regresando");
                                        
                                       }
                                    }
                                    break;
                                    case 3:
                                    System.out.println("-----------------Eliminar (Pantalon Jeans)-----------------");
                                    if (OperacionesJeans.eliminarJeans()){
                                        System.out.println("El producto Pantalon Jeans se ha eliminado correctamente");

                                    }else{
                                    System.out.println("No existe un producto en el inventario");
                                  }
                                    break;
                                    case 4:
                                    System.out.println("-----------------Imprimir-----------------");
                                    OperacionesJeans.imprimirJeans();
                                
                                    break;
                                    case 5:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Regresando...");
                                    break;
                                    
                                    default:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Error No ingresaste una opcion valida");
                                        
                                 }
                            } while (op3!=5);
                                break;
                            
                            case 2:
                             
                            do {
                                  
                            System.out.println("-----------------Otros-----------------");
                            System.out.println("1) Insertar "+ "2) Buscar "+"3) Eliminar"+ " 4) Imprimir"+ " 5) Regresar");
                                 op4 = scan.nextInt();
                                 switch (op4) {
                                    case 1:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("-----------------Insertar (Otro Pantalon)-----------------");
                                    if(OperacionesOtros.insertarOtros()){
                                       System.out.println("Se ha insertado correctamente el pantalon Otros");
                                    }else{
                                        System.out.println("No se ha podido insertar el pantalon Otros");
                                    }
                                    break;
                                    case 2:
                                    System.out.println("-----------------Buscar (Otro Pantalon)-----------------");
                                    if (OperacionesOtros.buscarOtros()) {
                                        System.out.println("El producto se ha encontrado");
                                        
                                    
                                    } else {
                                        System.out.println("El producto no se encuentra en el catalogo");
                                       System.out.println("Desea ingresar una nuevo pantalon para otros? 1)Si  2)No");
                                       Scanner l = new Scanner(System.in);
                                       int q=l.nextInt();
                                       if (q==1) {
                                        System.out.println("\nInsertar nuevo pantalon  para Otro");
                                        OperacionesOtros.insertarOtros();
                                       } else {
                                        System.out.println("Regresando");
                                        try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        }
                                       }
                                    }
                                    break;
                                    case 3:
                                    System.out.println("-----------------Eliminar (Otro Pantalon)-----------------");
                                    if(OperacionesOtros.eliminarOtros()){
                                        System.out.println("El producto Pantalon Otro se ha eliminado correctamente");

                                    }else{
                                    System.out.println("No existe un producto en el inventario");
                                  }
                
                                    break;
                                    case 4:
                                    System.out.println("-----------------Imprimir-----------------");
                                    OperacionesOtros.imprimirOtros();
                                    
                                    break;  
                                    case 5:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Regresando...");
                                    break;
                                    default: 
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Error No ingresaste una opcion valida");
                                        break;
                                 }
                            } while (op4!=5);
                        
                            break;
                            case 3:
                            try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                            System.out.println("Regresando...");
                            break;
                            default: 
                              try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                            System.out.println( "Error opcion no valida");

                        }
                    } while (op2!=3);
                    break;







//--------------------------------------------------------------------------------------------------------------------------------------

                case 3: 
                do {
                        System.out.println("-----------------Camisas-----------------");
                        System.out.println("1) El "+ "2) Ella "+" 3) Regresar");
                        op2=scan.nextInt();

                        switch (op2) {
                            case 1:
                          
                            do {
                                 
                                 System.out.println("-----------------El-----------------");
                                 System.out.println("1) Insertar "+ "2) Buscar "+"3) Eliminar"+ " 4) Imprimir"+ " 5) Regresar");
                                 op3 = scan.nextInt();

                                 switch (op3) {
                                    case 1:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("-----------------Insertar (Camisa Para El)-----------------");
                                    if (OperacionesEl.insertarEl()) {
                                     System.out.println("Se ha insertado correctamente la camisa para El");
                                    }else{
                                        System.out.println("No se ha podido insertar la camisa El");
                                    }
                                    break;
                                    case 2:
                                    System.out.println("-----------------Buscar (Camisa Para El)-----------------");
                                    if (OperacionesEl.buscarEl()) {
                                        System.out.println("El producto se ha encontrado");
                                    
                                    } else {
                                        System.out.println("El producto no se encuentra en el catalogo");
                                       System.out.println("Desea ingresar una nueva camisa para El? 1)Si  2)No");
                                       Scanner l = new Scanner(System.in);
                                       int q=l.nextInt();
                                       if (q==1) {
                                        System.out.println("\nInsertar nueva camisa para EL");
                                        OperacionesEl.insertarEl();
                                       } else {
                                        try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                        System.out.println("Regresando");
                                        
                                       }
                                    }
                                    break;
                                    case 3:
                                    System.out.println("-----------------Eliminar (Camisa Para El)-----------------");
                                    if (OperacionesEl.eliminarEl()){
                                    System.out.println("El producto camisas El se ha eliminado correctamente");
                                    }else{
                                    System.out.println("No existe un producto en el inventario");
                                  }
                                    break;
                                    case 4:
                                    System.out.println("-----------------Imprimir-----------------");
                                   OperacionesEl.imprimirEl();
                                    break;
                                    case 5:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Regresando...");
                                    break;
                                    default:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Error No ingresaste una opcion valida");
                                        
                                 }
                            } while (op3!=5);
                                break;
                            
                            case 2:
                             
                            do {
                                  
                            System.out.println("-----------------Ella-----------------");
                            System.out.println("1) Insertar "+ "2) Buscar "+"3) Eliminar"+ " 4) Imprimir"+ " 5) Regresar");
                                 op4 = scan.nextInt();
                                 switch (op4) {
                                    case 1:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("-----------------Insertar (Camisa Para Ella)-----------------");
                                     if (OperacionesElla.insertarElla()) {
                                     System.out.println("Se ha insertado correctamente la camisa para Ella");
                                    }else{
                                        System.out.println("No se ha podido insertar la camisa para Ella");
                                    }
                                    break;
                                    case 2:
                                    System.out.println("-----------------Buscar (Camisa Para Ella)-----------------");
                                    if (OperacionesElla.buscarElla()) {
                                        System.out.println("El producto se ha encontrado");
                                    
                                    } else {
                                        System.out.println("El producto no se encuentra en el catalogo");
                                       System.out.println("Desea ingresar una nueva camisa para ella? 1)Si  2)No");
                                       Scanner l = new Scanner(System.in);
                                       int q=l.nextInt();
                                       if (q==1) {
                                        System.out.println("\nInsertar nueva camisa para Ella");
                                        OperacionesElla.insertarElla();
                                       } else {
                                        try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                        System.out.println("Regresando");
                                       
                                       }
                                    }
                                    break;
                                    case 3:
                                    System.out.println("-----------------Eliminar (Camisa Para Ella)-----------------");
                                    if(OperacionesElla.eliminarElla()){
                                    System.out.println("El producto camisa para ella se ha eliminado correctamente");

                                    }else{
                                    System.out.println("No existe un producto en el inventario");
                                  }
                                    break;
                                    case 4:
                                    System.out.println("-----------------Imprimir-----------------");
                                    OperacionesElla.imprimirElla();
                                    break;
                                    case 5:
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Regresando...");
                                    break;
                                    default: 
                                    try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                                    System.out.println("Error No ingresaste una opcion valida");
                                        break;
                                 }
                            } while (op4!=5);
                        
                            break;
                            case 3:
                            try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                            System.out.println("Regresando...");
                            break;
                            default: 
                            try {
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        } catch (Exception e) {
                                           
                                        } 
                            System.out.println( "Error opcion no valida");

                        }
                    } while (op2!=3);
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        
                    }
                    break;
                    

//--------------------------------------------------------------------------------------------------------------------------------------

                case 4:
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    
                } 
                System.out.println("Saliendo");
                break;
                default:
                
                System.out.println("Esa opcion no existe");
                    break;
            }
       
            
            } while(op!=4);
           
            OperacionesOtros.escrituraOtros();
            OperacionesTennis.escrituraTennis();
            OperacionesCasual.escrituraCasual();
            OperacionesElla.escrituraElla();
            OperacionesEl.escrituraEl();
            OperacionesJeans.escrituraJeans();

           
             }catch(InputMismatchException e){
            System.out.println("Solo puedes ingresar numeros enteros");
         
           
            }
        

    }
    

}
