/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7archivos;

import java.util.*;
import java.io.*;

/**
 *
 * @author Caleb
 */
    public class OperComision {
        private Scanner entry;
        private String name;
        private double enero;
        private double febrero;
        private double marzo;
        private double total;
        private double promedio;
    
        File archivo = new File("C:\\Users\\Caleb\\Desktop\\FileTest\\comisiones.txt");
    
    public OperComision(){
    }
              
    public void createfile(){
        try{
            if(archivo.exists()){
                System.out.println("Archivo existente, seleccione otra opcion :D ");
            }else{
                archivo.createNewFile();
                System.out.println("Archivo creado exitosamente");
            }
            }catch(Exception ex){
            System.out.println(ex.getMessage());
        }       
    }
    
    public void adddata(String name2, double enero2, double febrero2, double marzo2){
        
        name = name2;
        enero = enero2;
        febrero = febrero2;
        marzo = marzo2;
        total = enero+febrero+marzo;
        promedio = total/3;
        
        try{
            
            BufferedWriter wrdata = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true)));
            wrdata.write( name+" | "+enero+" | "+febrero+" | "+marzo+" | "+total+" | "+promedio);
            wrdata.write("\n");
            System.out.println("\nLos datos Se añadieron correctamente al archivo\n");
            wrdata.close();
            
            }catch(Exception ex){           
            System.out.println(ex.getMessage());
            
        }        
    }
    
    public void showdata(){
        
        try{
            FileReader filerd = new FileReader("C:\\Users\\Caleb\\Desktop\\FileTest\\comisiones.txt");
            BufferedReader show = new BufferedReader(filerd);
            String cadena;
            while((cadena=show.readLine())!=null){
                System.out.println(""+cadena);
            }
            }catch(Exception ex){
            System.out.println();
        }        
    }
    
    public void searchdata(String nVenta){
        
        String usuario=nVenta;
        try{
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Caleb\\Desktop\\FileTest\\comisiones.txt"));
            String line = "";
            while((line=read.readLine())!=null){
                if(line.indexOf(usuario)!=-1){
                    System.out.println("Registro Encontrado \n"+line+"\1");
                }
            }
            }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    } 
}

        
    
    
