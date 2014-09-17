/*
                 CC BY 4.0
Se permite cualquier explotación de la obra, 
incluyendo una finalidad comercial, así como 
la creación de obras derivadas, la distribución 
de las cuales también está permitida sin ninguna 
restricción.
 
*/

package palindromo; //Nombre del paquete

import javax.swing.JOptionPane;     //Librerias necesarias

/**
 *
 * @author AGodinez
 */

public class Palindromo {   //Clase publica

    public static void main(String[] args) {    //Main
       //Declaracion de variables
       char []arreglo;       
       int menu = 1;
       String captura, ordenado, aux;
       
        while(menu == 1){
            //Inicializamos las variables
            ordenado = "";
            aux = "";
            
            captura = JOptionPane.showInputDialog("Palíndromos y Cunicúas\nIntroduzca un texto o un número\n"); //Captura el texto escrito en el mensaje
       
            for (int i =0; i < captura.length(); i++) { //Separa el texto capturado y guarda cada caracter en el arreglo sin los espacios
                if (captura.charAt(i) != ' ') {
                    aux += captura.toLowerCase().charAt(i);                                        
                }                
            }
            
            arreglo = new char[aux.length()];  //Crea un array del tamaño del texto capturado  
            for (int i =0; i < aux.length(); i++) { //Separa el texto capturado y guarda cada caracter en el arreglo
                    arreglo[i] = aux.charAt(i);
            }
            
        
            for (int i = aux.length()-1; i >=0; i--) { //Ordena de forma descendente el texto
               ordenado = ordenado + arreglo[i];
            }
        
            try {            
                if (Integer.parseInt(ordenado) == Integer.parseInt(aux)){  //Compara los numeros y verifica si son iguales
                    JOptionPane.showMessageDialog(null, "El número "+ captura + " es capicúa");
                }
        
                else{
                    JOptionPane.showMessageDialog(null, "El número " + captura + " no es capicúa");
                }
           
            } catch (NumberFormatException e) { //Verifica si ordenado y captura no son numeros
                if (ordenado.compareTo(aux) == 0){ //Compara las cadenas de texto y verifica si son iguales
                    JOptionPane.showMessageDialog(null, "El texto " + captura +" es palindromo");
                }        
                else{
                    JOptionPane.showMessageDialog(null, "El texto " + captura +" no es palindromo");
                }
            }
             //Captura la opcion elegida por el usuario
            menu = Integer.parseInt(JOptionPane.showInputDialog("¿Desea continua?\n1. SI\n2. NO"));
        }                       
    }
}
