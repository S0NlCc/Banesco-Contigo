package Suerte;

import static Suerte.Colas.ClaseColas.cola;
import java.io.*;
import java.util.Scanner;

// Funcion principal
public class Banesco implements Serializable{ // inicio del public class Banesco implements Serializable
    
    public static void main(String args[]) throws IOException { // inicio del public static void main(String args[]) throws IOException
        
        // Parece que estas viendo mi codigo si necesitas ayuda para entenderlo contacte a Pan :D
        
        System.out.println("Bienvenido A Banesco Ten Pancito :D");
        System.out.println("-----------------------------------"); 
        System.out.println(""); 
        System.out.println("Tramites leido de un txt. Estado: pensando que hacer con el :v XD");
        System.out.println("-----------------------------------------------------------------");  
        
        // inicio de la creacion de archivos txt
        
        Archivos_txt T = new Archivos_txt(); // tomamos los datos del public class Archivos_txt y los almacenamos en T
        
        T.Clientes_Atendidos_txt("Clientes Atendidos.txt");//Nombre del archivo txt
            
        T.Clientes_in_txt("Clientes.in.txt");//Nombre del archivo txt
        
        T.Taquilla_log("Taquilla.log");//Nombre del archivo txt
        
        T.taquilla_DD_MM_AAAA_log("taquilla DD-MM-AAAA.log");//Nombre del archivo txt
        
        T.Clientes_pendientes_in_txt("Clientes_pendientes.in.txt");//Nombre del archivo txt
        
        // fin de la creacion de archivos txt
        
        // ejemplo de como leer un archivo txt
        
        try{ // inicio del try
            
            FileReader L = new FileReader("C:\\Users\\Sofia Terrero\\Documents\\ivan unimar\\SepDic2020\\EstrDatos\\java program\\Banesco Contigo\\Clientes.in.txt");//direccion del archivo txt para leer
            BufferedReader E = new BufferedReader(L);
            String Cadena;
            
            while((Cadena = E.readLine())!=null){ // inicio del while
                
                System.out.println(Cadena);
                
            } // fin del while
            
        }catch(Exception e){ // fin del try y inicio del catch
            
        } // fin del catch
       
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("Tramites leido de un txt. Estado: pensando que hacer con el :v XD"); 
        System.out.println(""); 
        
        //fin del ejemplo leer txt
        
        //inicio del Menu del cliente
        
        int op=0;   // variable para almacenar la opcion del menu de colas
        
        do {    // inicio del do while
            
            System.out.println("----------------------------");
            System.out.println("<<<<< COLA DE CLIENTES >>>>>");
            System.out.println("----------------------------");
            System.out.println("1.- Ingresar Cliente");
            System.out.println("2.- Pasar Cliente");
            System.out.println("3.- Mostrar Lista Clientes");
            System.out.println("4.- Mostrar Lista Atendidos");
            System.out.println("6.- Salir");
            System.out.println("");
            System.out.print("Opcion: ");
            op=getInt(); // leer la opcion seleccionada
            
            System.out.println("");
            
            if (op==6){ // inicio del if
                
                //despedida del programa :D
        
                System.out.println("--------------------------------------------------------------------------------------------------"); 
                System.out.println("Gracias Por Usar Nuestro Banco, No Olvides Llevarte Un Pan De Despedida. Espero Volver ha Verte :D");
                System.out.println("--------------------------------------------------------------------------------------------------"); 
                
            } // fin del if
         
            switch(op) { // inicio del primer switch
                
                case 1 : 
                    
                    Ingresar();      
                
                    break;

                case 2 : 
                    
                    //inicio del Menu del cliente
                    
                    Cola.Eliminar();
                    
                    //fondos de todas las personas
                    
                    int Fondos; 
                    Fondos = 10000; //fondos de todas las personas que ingresen al menu
                    
                    int Data[][][];
                    Data = new int [1000][3][3];
                    
                    int jR,jD,jS;
                    
                    jR=0;   // variable para cambiar el espacio de almacenamiento del arreglo data
                    jD=0;   // variable para cambiar el espacio de almacenamiento del arreglo data
                    jS=0;   // variable para cambiar el espacio de almacenamiento del arreglo data
                    
                    int Movistar, Movilnet, Cantv;
                    
                    Movistar=1000;
                    Movilnet=500;
                    Cantv=250;
                                       
                    //Saldo Actual
                    
                    // no olvidar donde estan los fondos
                    
                    int fin;
                    fin=0;  // variable de control del while
                    
                    while (fin==0){ //inicio del while

                        int Seleccion;
                        Seleccion = 0;
                        
                        Scanner Menu = new Scanner (System.in);
                        
                        System.out.println("");
                        System.out.println("---------------------------------------------");
                        System.out.println("            <<<<< TAQUILLA >>>>>             ");
                        System.out.println("---------------------------------------------");
                        System.out.println("1: Para Realizar Un Retiro");
                        System.out.println("2: Para Realizar Un Deposito");
                        System.out.println("3: Para Una Consulta De Movimientos");
                        System.out.println("4: Para Actualizacion De Libretas");
                        System.out.println("5: Para Realizar Pagos De Servicios");
                        System.out.println("6: Para Salir Del Banco");
                        System.out.println("");
                        System.out.print("Elija Una De Nuestras Opciones Disponibles: ");
                        Seleccion = Menu.nextInt(); // se almacena el numero de la seleccion escogida
                        System.out.println("---------------------------------------------");
                        System.out.println("");
                        
                        // fin del menu del cliente

                        switch(Seleccion){ //inicio del segundo switch

                            case 1:

                                System.out.println("<<<<< Su Seleccion fue: Realizar Un Retiro >>>>>");
                                System.out.println("------------------------------------------------");
                                
                                System.out.print("Saldo Actual: "+Fondos+" "+"Cuanto Desea Retirar?: ");
                                Seleccion = Menu.nextInt(); // Seleccion almacena temporalmente el monto a retirar
                                System.out.println("");
                           
                                if(Seleccion>Fondos){ // inicio del if
                               
                                    System.out.println("Error: Fondos Insufcientes :(");  
                                    System.out.println("Por Favor Intente De Nuevo Con Un Monto Menor"); 
                               
                                    }else{ // fin del if y inicio del else
                               
                                        if(Seleccion<0){ // inicio del if
                                       
                                            System.out.println("Error: No Hay Dindero Que Retirar :v");
                                            System.out.println("Por Favor Intente De Nuevo"); 
                                   
                                            }else{ //fin del if y inicio del else
                                                
                                                Fondos = Fondos - Seleccion; // A fondos le quitamos el monto establecido por el usuario
                                                Data[jR][0][0]=Data[jR][0][0]+Seleccion;
                                                jR=jR+1; // incrementamos la j para almacenar el valor del deposito
                                               
                                            }//fin del else
                               
                                    }//fin del else
                                
                                
                                System.out.println("------------------------------------------------");
                                System.out.println("");
                                
                                break;

                            case 2:

                                System.out.println("<<<<< Su Seleccion fue: Realizar Un Deposito >>>>>");
                                System.out.println("--------------------------------------------------");
                                
                                System.out.print("Saldo Actual: "+Fondos+" "+"Cuanto Desea Depositar?: ");
                                Seleccion = Menu.nextInt(); // Seleccion almacena temporalmente el monto a Depositar
                                System.out.println("");
                           
                                if(Seleccion>Fondos){ // inicio del if
                               
                                    System.out.println("Error: Fondos Insufcientes :(");  
                                    System.out.println("Por Favor Intente De Nuevo Con Un Monto Menor"); 
                               
                                    }else{ // fin del if y inicio del else
                               
                                        if(Seleccion<0){ // inicio del if
                                       
                                            System.out.println("Error: No Hay Dindero Que Depositar :v");
                                            System.out.println("Por Favor Intente De Nuevo"); 
                                   
                                            }else{ //fin del if y inicio del else
                                                
                                                Fondos = Fondos - Seleccion; // A fondos le quitamos el monto establecido por el usuario
                                                Data[jD][1][0]=Data[jD][1][0]+Seleccion;
                                                jD=jD+1; // incrementamos la j para almacenar el valor del deposito
                                               
                                            }//fin del else
                               
                                    }//fin del else
                                
                                System.out.println("--------------------------------------------------");
                                System.out.println("");
                                
                                break;


                            case 3:

                                System.out.println("<<<<< Su Seleccion fue: Consulta De Movimientos >>>>>");
                                System.out.println("-----------------------------------------------------");
                                System.out.println("");
                                
                                for (int i=0;i<=999;i++){ //inicio del for
                                    
                                    if(Data[i][0][0] > 0){ //inicio del if
                                            
                                            System.out.println("Se Realizo Un Retiro Por Un Monto De: "+Data[i][0][0]); // imprimios solamente los valores que no son 0
                                            
                                    }// fin del if
                                        
                                    if(Data[i][1][0] > 0){ //inicoo del if
                                            
                                        System.out.println("Se Realizo Un Depocito Por Un Monto De: "+Data[i][1][0]); // imprimios solamente los valores que no son 0
                                            
                                    }// fin del if
                                        
                                    if(Data[i][2][0] > 0){ //inicoo del if
                                            
                                        System.out.println("Se Realizo Un Depocito Para Pagar Los Servicios De (Movistar) Por Un Monto De: "+Data[i][2][0]); // imprimios solamente los valores que no son 0
                                            
                                    }// fin del if
                                    
                                    if(Data[i][2][1] > 0){ //inicoo del if
                                            
                                        System.out.println("Se Realizo Un Depocito Para Pagar Los Servicios De (Movilnet) Por Un Monto De: "+Data[i][2][1]); // imprimios solamente los valores que no son 0
                                            
                                    }// fin del if
                                    
                                    if(Data[i][2][2] > 0){ //inicoo del if
                                            
                                        System.out.println("Se Realizo Un Depocito Para Pagar Los Servicios De (Cantv) Por Un Monto De: "+Data[i][2][2]); // imprimios solamente los valores que no son 0
                                            
                                    }// fin del if
                                        
                                } // fin del for
                                
                                System.out.println("");
                                System.out.println("-----------------------------------------------------");
                                System.out.println("");
                                
                                break;

                            case 4:

                                System.out.println("<<<<< Su Seleccion fue: Actualizacion De Libretas >>>>>");
                                System.out.println("-------------------------------------------------------");
                                System.out.println("");
                                
                                System.out.println("Saldo Actual: "+Fondos);
                                
                                System.out.println("");
                                System.out.println("-------------------------------------------------------");
                                System.out.println("");

                                break;

                            case 5:

                                System.out.println("<<<<< Su Seleccion fue: Realizar Pagos De Servicios >>>>>");
                                System.out.println("---------------------------------------------------------");
                                
                                System.out.println("1: Movistar");
                                System.out.println("2: Cantv");
                                System.out.println("3: Movilnet");
                                
                                System.out.println("");
                                
                                System.out.print("Saldo Actual: "+Fondos+" "+"Cual De Los Siguientes Servicios Desea Pagar?: ");
                                Seleccion = Menu.nextInt(); // Seleccion almacena temporalmente el monto a Depositar Para el pago de los Servicios
                                System.out.println("");
                                
                                switch(Seleccion){ //inicio del segundo switch

                                    case 1:
                                        
                                        System.out.println("         <<<<< Su Seleccion fue: Movistar >>>>>          ");
                                        System.out.println("---------------------------------------------------------");
                                        
                                        System.out.println("El Servicio De Movistar Tiene Un Costo De: "+Movistar);
                                        System.out.println("");
                                        
                                        System.out.println("Desea Realizar El Pago?");
                                        System.out.println("");
                                        System.out.print("1 Para Realizar El Pago / 2 Para No Realizar El Pago: ");
                                        
                                        Seleccion = Menu.nextInt(); // Seleccion almacena temporalmente el monto a Depositar Para el pago de los Servicios
                                        
                                        if(Seleccion == 1){ // inicio del if
                                            
                                            System.out.println("");
                                            Fondos = Fondos - Movistar;
                                            Data[jS][2][0] = Data[jS][2][0] + Movistar;
                                            jS = jS + 1; // incrementamos la j para almacenar el valor del deposito
                                            System.out.println("Sea Realizado El Pago Con Exito :D");
                                            System.out.println("");
                                            
                                        }else{ // fin del if y inicio del else
                                            
                                            if(Seleccion == 2){ // inicio del if
                                            
                                                System.out.println("");
                                                System.out.println("No se ha realizado Ningun Pago :)");
                                                System.out.println("");
                                            
                                            }else{ // fin del if y inicio del else
                                                
                                                System.out.println("");
                                                System.out.println("   Error en el numero ingresado :P   ");
                                                System.out.println("-------------------------------------");
                                                System.out.println("Por Favor Ingrese Un Numero Valido :v");
                                                System.out.println("-------------------------------------");
                                                System.out.println("");
                                                
                                            }// fin del else
                                            
                                        }// fin del else
                                        
                                        
                                        break;
                                        
                                    case 2:
                                        
                                        System.out.println("         <<<<< Su Seleccion fue: Movilnet >>>>>          ");
                                        System.out.println("---------------------------------------------------------");
                                        
                                        System.out.println("El Servicio De Movilnet Tiene Un Costo De: "+Movilnet);
                                        System.out.println("");
                                        
                                        System.out.println("Desea Realizar El Pago?");
                                        System.out.println("");
                                        System.out.print("1 Para Realizar El Pago / 2 Para No Realizar El Pago: ");
                                        
                                        Seleccion = Menu.nextInt(); // Seleccion almacena temporalmente el monto a Depositar Para el pago de los Servicios
                                        
                                        if(Seleccion == 1){ // inicio del if
                                            
                                            System.out.println("");
                                            Fondos = Fondos - Movilnet;
                                            Data[jS][2][1] = Data[jS][2][1] + Movilnet;
                                            jS = jS + 1; // incrementamos la j para almacenar el valor del deposito
                                            System.out.println("Sea Realizado El Pago Con Exito :D");
                                            System.out.println("");
                                            
                                        }else{ // fin del if y inicio del else
                                            
                                            if(Seleccion == 2){ // inicio del if
                                            
                                                System.out.println("");
                                                System.out.println("No se ha realizado Ningun Pago :)");
                                                System.out.println("");
                                            
                                            }else{ // fin del if y inicio del else
                                                
                                                System.out.println("");
                                                System.out.println("   Error en el numero ingresado :P   ");
                                                System.out.println("-------------------------------------");
                                                System.out.println("Por Favor Ingrese Un Numero Valido :v");
                                                System.out.println("-------------------------------------");
                                                System.out.println("");
                                                
                                            }// fin del else
                                            
                                        }// fin del else
                                        
                                        
                                        break;
                                        
                                    case 3:
                                        
                                        System.out.println("           <<<<< Su Seleccion fue: Cantv >>>>>           ");
                                        System.out.println("---------------------------------------------------------");
                                        
                                        System.out.println("El Servicio De Cantv Tiene Un Costo De: "+Cantv);
                                        System.out.println("");
                                        
                                        System.out.println("Desea Realizar El Pago?");
                                        System.out.println("");
                                        System.out.print("1 Para Realizar El Pago / 2 Para No Realizar El Pago: ");
                                        
                                        Seleccion = Menu.nextInt(); // Seleccion almacena temporalmente el monto a Depositar Para el pago de los Servicios
                                        
                                        if(Seleccion == 1){ // inicio del if
                                            
                                            System.out.println("");
                                            Fondos = Fondos - Cantv;
                                            Data[jS][2][2] = Data[jS][2][2] + Cantv;
                                            jS = jS + 1; // incrementamos la j para almacenar el valor del deposito
                                            System.out.println("Sea Realizado El Pago Con Exito :D");
                                            System.out.println("");
                                            
                                        }else{ // fin del if y inicio del else
                                            
                                            if(Seleccion == 2){ // inicio del if
                                            
                                                System.out.println("");
                                                System.out.println("No se ha realizado Ningun Pago :)");
                                                System.out.println("");
                                            
                                            }else{ // fin del if y inicio del else
                                                
                                                System.out.println("");
                                                System.out.println("   Error en el numero ingresado :P   ");
                                                System.out.println("-------------------------------------");
                                                System.out.println("Por Favor Ingrese Un Numero Valido :v");
                                                System.out.println("-------------------------------------");
                                                System.out.println("");
                                                
                                            }// fin del else
                                            
                                        }// fin del else
                                        
                                        
                                        break;
                                        
                                    default:

                                    System.out.println("   Error en el numero ingresado :P   ");
                                    System.out.println("-------------------------------------");
                                    System.out.println("Por Favor Ingrese Un Numero Valido :v");
                                    System.out.println("-------------------------------------");
                                    System.out.println("");

                                    break;
                                        
                                }// fin del switch(Seleccion)
                                
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                                
                            break;

                            case 6:

                                System.out.println("Esperamos Volver Haberte Pronto En Nuestras Instalaciones :D");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("");
                                fin=fin+1;  // detiene el ciclo while

                                break;

                            default:

                                System.out.println("   Error en el numero ingresado :P   ");
                                System.out.println("-------------------------------------");
                                System.out.println("Por Favor Ingrese Un Numero Valido :v");
                                System.out.println("-------------------------------------");
                                System.out.println("");

                                break;

                        } // fin del segundo switch
                            
                    } // fin del While
                    
                    break;

                case 3 : 
                    
                    Cola.Mostrar();  
                    
                    break;

                case 4: 
                    
                    Cola.Mostrar1();
                    
            } // fin del primero switch

        }while(op!=6); // fin del do while si el usuario elige la opcion 6 que es salir

    } // fin del public static void main(String args[]) throws IOException
    
    static Colas.ClaseColas Cola=new Colas.ClaseColas();  // Declaracion del objeto Cola

    public static void Ingresar() throws IOException { // inicio del public static void Ingresar() throws IOException
        
        String elemento;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                         <<<<< Cliente >>>>>");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Ingrese el nombre del cliente ---> ");
        elemento=getString();
        System.out.println("----------------------------------------------------------------------");
     
        Cola.Insertar(elemento); // Invocar el metodo Insertar del objeto Cola
        
    } // fin del public static void Ingresar() throws IOException
  
    // Funcion para capturar una cadena desde el teclado
    public static String getString() throws IOException { // inicio del public static String getString() throws IOException
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
        
    } // fin del public static String getString() throws IOException
      
    // Funcion para capturar un entero desde el teclado
    public static int getInt() throws IOException {
        
        String s = getString();
        return Integer.parseInt(s);
            
    }//fin del public static int getInt() throws IOException
    
}//fin del public class Banesco implements Serializable

//Realizado Por:        Iván Alejandro Vega Gonzalez            C.I: 28.492.543
//                      Alejandro Augusto Aleman Malandra       C.I: 27.547.084
//                      Jhonny Daniel Jaimes Inojosa            C.I: 26.897.192

//Gracias Por Ver Mi Codigo, Ten Pancito :D