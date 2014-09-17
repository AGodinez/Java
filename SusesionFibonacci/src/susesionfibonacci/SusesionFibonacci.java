/*
                 CC BY 4.0
Se permite cualquier explotación de la obra, 
incluyendo una finalidad comercial, así como 
la creación de obras derivadas, la distribución 
de las cuales también está permitida sin ninguna 
restricción.
 
*/

package susesionfibonacci;     //Nombre del paquete

import java.util.Scanner;     //Librerias que necesitaremos

/**
 *
 * @author AGodinez
 */

public class SusesionFibonacci {    //Clase publica
    
    public static void main(String[] args) {    //Main
        
        int fibonacci = 0;  //Declaramos la variable que mostrara el numero de la serie fibonacci
        int ant =0, suc=1, numero, menu;   //Variable que guardará el numero de la serie o posicion de la serie y Variable para las opciones del menu
        Scanner entrada = new Scanner(System.in);   //Variable para entrada de texto
        String opcion;
        
        do {
            
            do{
                System.out.println("¿Que desea hacer?\n1. Mostrar un rango de la serie fibonacci\n2. Mostrar valor de X posicion de la serie\n3. Salir");
                menu = entrada.nextInt();    //Captura el texto como Integer
            }while( menu < 1 || menu > 3 );  //Menu Principal
                
            if (menu == 1) { //Opcion 1 elegida
                do{
                    System.out.print("\nIngrese un número:");
                    numero = entrada.nextInt();    
                }while( numero < 0 );  //Validacion numero ingresado
                
                //Imprimira X numeros de la serie fibonacci
                for (int i = 0; i <= numero; i++) {
                    if(i == 0) {
                        fibonacci = 1;
                        System.out.println(fibonacci);  //Imprime el valor nuemrico de la serie
                    }else{
                        fibonacci = ant + suc; //fibonacci es igual al antesesor más el sucesor
                        ant = suc;      //antesesor se vuelve sucesor
                        suc = fibonacci;    //sucesor se vuelve el valor actual de la serie fibonacci
                      System.out.println(fibonacci);  //Imprime el valor nuemrico de la serie
                    }                    
                }
            
            }else if (menu == 2) { //Opcion 2 elegida                
                do{
                    System.out.print("\nIngrese un número:");
                    numero = entrada.nextInt();    
                }while( numero < 0 );  //Validacion numero ingresado
                
                //Imprimira valor de la posicion X en la serie fibonacci
                for (int i = 0; i <= numero; i++) { 
                    if (i == 0) {
                        fibonacci = 1;
                    }else{
                        fibonacci = ant + suc; //fibonacci es igual al antesesor más el sucesor
                        ant = suc;      //antesesor se vuelve sucesor
                        suc = fibonacci;    //sucesor se vuelve el valor actual de la serie fibonacci                      
                    }
                }
                //Imprime el valor numerico de la posicion de la serie
                System.out.println("En la posicion "+ numero + " de la serie fibonacci se encuentra el valor: "+fibonacci);
            
            }else{ //Opcion 3 elegida
                break; //Cierra el programa
            }
            
            System.out.println("¿Comenzar de nuevo? (S/n)");
            opcion = entrada.next(); //Captura el texto como String
        } while (opcion.equals("s") || opcion.equals("S") || opcion.equals("Y") || opcion.equals("y")); //Menu desea continuar?                        
    }            
}