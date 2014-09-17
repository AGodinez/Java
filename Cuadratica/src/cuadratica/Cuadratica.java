/*
                 CC BY 4.0
Se permite cualquier explotación de la obra, 
incluyendo una finalidad comercial, así como 
la creación de obras derivadas, la distribución 
de las cuales también está permitida sin ninguna 
restricción.
 
*/

package cuadratica;	//Nombre del paquete
//Librerias necesarias
import java.util.Scanner;
import java.text.DecimalFormat;

public class Cuadratica { //Clase pública
    
    public static void main(String[] args) {
	//Declaracion de Variables
        DecimalFormat formato = new DecimalFormat("#.##");  //Definira el formato de los decimales
        Scanner entrada = new Scanner(System.in);	//Para capturar texto
        double a, b, c, x1, x2, dentroRaiz, raiz;
        String opcion;

        System.out.print("Cálculo de una Raiz Cuadrada");
        do {
            System.out.print("\n\nIngrese el valor de a: ");
            a = entrada.nextInt();		//Captura el texto como integer
        
            if (a==0){	//Evalua si el primer termino de la ecuacion es igual a cero
                System.out.println("ERROR: El valor de \"a\" tiene que ser distinto a 0");
        
            }else{
            
                System.out.print("\nIngrese el valor de b: ");
                b = entrada.nextInt();	//Captura el texto como integer
            
                System.out.print("\nIngrese el valor de c: ");
                c = entrada.nextInt();	//Captura el texto como integer
            
                dentroRaiz = ((Math.pow(b, 2)) - (4*a*c));  //Realiza la operacion (b² -4ac)
            
                if (dentroRaiz<0) {  //Evualua si el resultado anterior es negativo
                    System.out.println("ERROR: Intento de calcular una raiz con base negativa");
            
                }else{
                    raiz = Math.sqrt(dentroRaiz); //Raiz cuadrada y obtenie un resultado +/-
                    x1 = ((-b) + raiz)/ (2*a);	//Evalua el resultado positivo
                    x2 = ((-b) - raiz)/(2*a);	//Evalua el resultado negativo
                
                    System.out.println("\n Valores: \na: "+a+" \nb: "+b+" \nc: "+c); //Imprime los valores de la ecuacion
                    System.out.println("\n Respuesta: \nX1: "+formato.format(x1)+" \nX2: "+formato.format(x2));	//Imprime los dos posibles resultados
                }
            
            }
            
            System.out.println("\n¿Desea continuar? (S/n)");
            opcion = entrada.next();    //Captura el texto como String
        } while (opcion.equals("s") || opcion.equals("S") || opcion.equals("Y") || opcion.equals("y"));;
        /* Método .equal("") sirve para comparar cadenas de texto */
    }
}
