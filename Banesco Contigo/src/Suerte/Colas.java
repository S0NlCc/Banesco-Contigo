package Suerte;

import static Suerte.Banesco.Cola;
import java.io.*;

public class Colas { // inicio del public class Colas
    
    public static class ClaseColas implements Serializable {  // Declaracion de la clase de Colas y inicio del public static class ClaseColas implements Serializable
        
        static int max=1000;  // Tamano maximo de la Cola
        static String cola[]= new String[max]; // Declaracion del arreglo
        static int frente, fin; // Indicadores de inicio y fin de la Cola
        
        ClaseColas() { // Constructor que inicializa el frente y el final de la Cola y inicio del ClaseColas
             
            frente=0;   fin=0;
            System.out.println("");
          
        } //fin del ClaseColas
        
        public static void Insertar(String dato) { // inicio del public static void Insertar(String dato)
             
            if(fin==max) { // Esta llena la Cola? y inicio del if
                
                System.out.println("Cola llena !!!");
                return;
                
            } // fin del if
            
          cola[fin++]=dato;
          System.out.println("");
          
        } // fin del public static void Insertar(String dato)
        
        public static void Eliminar()  {  //Elimina el primer cliente de la cola y inicio del public static void Eliminar()  
            
            System.out.println("---------------------------------------------");
            System.out.println("             <<<<< ATENDER >>>>>             ");
            System.out.println("---------------------------------------------");
            
            if(frente==fin) {  // Esta vacia la Cola? y inicio del if
                
                System.out.println("Cola vacia !!!");
                System.out.println("");
                return;
                
            } // fin del if
            
            System.out.println("Cliente a Atender: "+cola[frente++]);
            System.out.println("");
            
        } // fin del public static void Eliminar()
             
        public static void Mostrar() { //inicio del public static void Mostrar()
            
            int i=0;
          
            System.out.println("-----------------------------");
            System.out.println("<<<<< LISTA DE CLIENTES >>>>>");
            System.out.println("-----------------------------");
          
            if(frente==fin)  System.out.println("\nCola vacia !!!");
            
                for(i=frente; i<fin; i++) { // inicio del for
                    
                    System.out.println("N°cola["+i+"]="+" "+cola[i]);
                    
                } // fin del for

                System.out.println("\nFrente= "+frente);
                System.out.println("Final = "+fin);
                System.out.println("Max  = "+max);
                System.out.println("");
          
        } // fin del public static void Mostrar()
        
        public static void Mostrar1() throws FileNotFoundException, IOException { // incio del public static void Mostrar1() throws FileNotFoundException, IOException 
             
            int i=0;
            System.out.println("-----------------------------");
            System.out.println("<<<<< LISTA DE CLIENTES >>>>>");
            System.out.println("-----------------------------");
            
            if(frente==fin)  System.out.println("Cola vacia !!!");
            
                for(i=frente; i<fin; i++) { // inicio del for
                    
                    System.out.println("N°cola["+i+"]="+" "+cola[i]);
                
                } // fin del for
          
            FileOutputStream out= new FileOutputStream("C:\\Users\\Sofia Terrero\\Documents\\ivan unimar\\SepDic2020\\EstrDatos\\java program\\Banesco Contigo\\Cola.txt");
            ObjectOutputStream salida= new ObjectOutputStream(out);
            
            for(i=frente; i<fin; i++) { // incio del for
                
                salida.writeObject(cola[i]);
                salida.flush();
                
            } // fin del for
         
        } // fin del public static void Mostrar1() throws FileNotFoundException, IOException 
        
    } // fin del public static class ClaseColas implements Serializable

} // fin del public class Colas

// Adios fue un gusto conocerte :D