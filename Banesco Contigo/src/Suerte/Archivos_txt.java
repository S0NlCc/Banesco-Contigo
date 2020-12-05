package Suerte;

import java.io.*;

public class Archivos_txt { // incio del public class Archivos_txt
    
    public void Clientes_Atendidos_txt(String nombre){ // inicio del public void Clientes_Atendidos_txt(String nombre)
        
        //bienvenido a la clase de Archivos_txt Ten Pancito :D
        
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try { // inicio del try
            
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            //wr = variable para escribir en el txt
            
            wr.write("Clientes Atendidos: ");
            wr.append("Ivan Vega, ");
            wr.append("Alejandro Pan y ");
            wr.append("Pan Pan ");
            
            wr.close();
            bw.close();
            
        } catch (Exception e) { //fin del try y inicio del catch
            
            System.out.println("Error: "+e);
            
        } // fin del catch
        
    } // fin del public void Clientes_Atendidos_txt(String nombre)
    
    public void Clientes_in_txt(String nombre){// inicio del public void Clientes_in_txt(String nombre)
        
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try {// inicio del try
            
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            //wr = variable para escribir en el txt
            
            wr.write("Tramites: ");
            wr.append("Ivan Vega, ");
            wr.append("Alejandro Pan y ");
            wr.append("Pan Pan ");
            
            wr.close();
            bw.close();
            
        } catch (Exception e) {//fin del try y inicio del catch
            
            System.out.println("Error: "+e);
            
        } // fin del catch
    
    } // fin del public void Clientes_in_txt(String nombre)
    
    public void Taquilla_log(String nombre){// inicio del public void Taquilla_log(String nombre)
        
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try {// inicio del try
            
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            //wr = variable para escribir en el txt
            
            wr.write("Transacciones: ");
            wr.append("1250$, ");
            wr.append("1850$ y ");
            wr.append("800$ ");
            
            wr.close();
            bw.close();
            
        } catch (Exception e) {//fin del try y inicio del catch
            
            System.out.println("Error: "+e);
            
        } // fin del catch
    
    } // fin del public void Taquilla_log(String nombre)
    
    public void taquilla_DD_MM_AAAA_log(String nombre){// inicio del public void taquilla_DD_MM_AAAA_log(String nombre)
        
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try {// inicio del try
            
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            //wr = variable para escribir en el txt
            
            wr.write("Transacciones: ");
            wr.append("1250$, ");
            wr.append("1850$ y ");
            wr.append("800$ ");
            
            wr.close();
            bw.close();
            
        } catch (Exception e) {//fin del try y inicio del catch
            
            System.out.println("Error: "+e);
            
        } // fin del catch
    
    } // fin del public void taquilla_MM_DD_AAAA_log(String nombre)
    
    public void Clientes_pendientes_in_txt(String nombre){// inicio del public void Clientes_pendientes_in_txt(String nombre)
        
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try {// inicio del try
            
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            //wr = variable para escribir en el txt
            
            wr.write("Clientes Pendientes: ");
            wr.append("Ivan Vega, ");
            wr.append("Alejandro Pan y ");
            wr.append("Pan Pan ");
            
            wr.close();
            bw.close();
            
        } catch (Exception e) {//fin del try y inicio del catch
            
            System.out.println("Error: "+e);
            
        } // fin del catch
    
    } // fin del public void Clientes_pendientes_in_txt(String nombre)
    
} // fin del public class Archivos_txt

// Adios fue un gusto conocerte :D

//Realizado Por:        Iván Alejandro Vega Gonzalez            C.I: 28.492.543
//                      Alejandro Augusto Aleman Malandra       C.I: 27.547.084
//                      Pan Pan                                 C.I: 28.888.444

//Gracias Por Ver Mi Codigo, Ten Pancito :D