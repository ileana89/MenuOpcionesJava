/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package options;

import java.util.Scanner;

/**
 *
 * @author gataway
 */
public class Options
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
           int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("INSTITUTO TECNOLÓGICO SUPERIOR DE ESCÁRCEGA");
        System.out.println("ILEANA JAVIER JIMÉNEZ");
        
        
        
        System.out.println("OPCION 1 = MANUAL DE AYUDA");
        System.out.println("OPCION 2 = INVERTIR UNA CADENA");
        System.out.println("OPCION 3 = LARGO DE LA CADENA");
        System.out.println("OPCION 4 = LEER 1 CADENA Y 2 NUMEROS E IMPRIMIR LA SUBCADENA DEL RANGO INICIO Y FIN");
        System.out.println("OPCION 5 = LEER 1 CADENA Y 2 NUMEROS E IMPRIMIR EL RANGO QUE HAY ENTRE FIN E INICIO");
        
        opcion=lectura.nextInt();
        
        switch (opcion){
            
            case 1:
               System.out.println( "MANUAL DE USO" );
               System.out.println( "PARA PODER EJECUTAR LA OPCIÓN DE INVERTIR UNA CADENA: DEBERAS OPRIMIR EN TU TECLADO EL NUMERO 2, DESPUES LE DAS ENTER Y ESCRIBES LA PALABRA QUE DESEAS INVERTIR, LE DAS OTRO ENTER, Y LISTO." );
               System.out.println( "PARA PODER EJECUTAR LA OPCIÓN DE LARGO DE CADENA: DEBERAS OPRIMIR EN TU TECLADO EL NUMERO 3, DESPUES LE DAS ENTER Y ESCRIBES LA PALABRA QUE DESEAS LEER, LE DAS OTRO ENTER, Y APARECERA EL LARGO DE LA CADENA Y LISTO." );
               System.out.println( "PARA PODER EJECUTAR LA OPCIÓN LEER 1 CADENA Y 2 NUMEROS E IMPRIMIR EL RANGO QUE HAY ENTRE INICIO Y FIN: DEBERAS OPRIMIR EN TU TECLADO EL NUMERO 4, DESPUES LE DAS ENTER Y ESCRIBES LA PALABRA QUE DESEAS LEER , LE DAS OTRO ENTER,  Y APARECERA EL RANGO QUE HAY ENTRE EL INICIO Y FIN, Y LISTO " );
               System.out.println( "PARA PODER EJECUTAR LA OPCION LEER 1 CADENA Y 2 NUMEROS E IMPRIMIR EL RANGO QUE HAY ENTRE FIN E INICIO: DEBERAS OPRIMIR EN TU TECLADO EL NUMERO 5, DESPUES LE DAS ENTER Y ESCRIBES LA PALABRA QUE DESEAS LEER , LE DAS OTRO ENTER,  Y APARECERA EL RANGO QUE HAY ENTRE EL FIN Y EL INICIO, Y LISTO");
               break;  
                
         
                
            case 2:   
                
               String palabra = lectura.next();
            
               for (int i = palabra.length()-1;i >= 0;i --)
               {
               char c=palabra.charAt(i);
               System.out.print(c);
               }
               break;
                
           case 3:
                
              String palab = lectura.next();
              System.out.print("El largo de su cadena contiene: "   +   palab.length()  +  " letras ");
                
              break;
                
          case 4:
                
              String palabr = lectura.next();
              String sSubpalabr = palabr.substring(1, 5);
              System.out.println(sSubpalabr);  
              
              break; 
                
          case 5:
                
               
                        
        }
        
        
        
    }
}
