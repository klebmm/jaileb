/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7archivos;

import java.util.Scanner;
/**
 *
 * @author Caleb
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salir = 1;
        
        OperComision obj = new OperComision();
        
        System.out.println("///////Menu///////\n////comisiones////\n\n1. Crear archivo\n2. Ingresar datos"
                + "\n3. Mostrar datos\n4. Buscar registro\n5. ver un vendedor\n6. Salir");
        
            while(salir!=6){//finaliza el programa
            try{
                System.out.println("==============================");
                System.out.println("Elija una opcion (ingresando un numero)");
                salir=teclado.nextInt();
                
                if(salir==1){obj.createfile();} //Crea el archivo, y si ya esta creado pide una nueva opcion
                if(salir==2){//Pide los datos a ingresar
                    System.out.println("Ingresa nombre de empleado");
                    String name = teclado.next();
                    System.out.println("Ingrese mes de enero");
                    double enero = teclado.nextDouble();
                    System.out.println("Ingrese mes de febrero");
                    double febrero = teclado.nextDouble();
                    System.out.println("Ingrese mes de marzo");
                    double marzo = teclado.nextDouble();
                    obj.adddata(name,enero,febrero,marzo);
                }
                if(salir==3){obj.showdata();}//muestra los datos guardados en el archivo
                if(salir == 4){ //Busca venta y al encontrarla muestra todos los datos
                    System.out.println("Ingrese venta que necesita buscar");
                    String venta = teclado.next();
                    obj.searchdata(venta);
                }
                if(salir==5){ // busca y muestra datos de un usuario
                    System.out.println("Ingrese ususario para mostrar su informacion");
                    String name1 = teclado.next();
                    obj.searchdata(name1);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                teclado.nextLine();
            }
            
        }
    }
    
}

  