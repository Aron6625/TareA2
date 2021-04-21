
import java.util.Scanner;
class AreaCuadrado {
   public static void main (String args[]){
       
   Scanner lector = new Scanner (System.in);
   
   int lado;
   int area;
   
   System.out.println ("Introduzca lado");
   lado = lector.nextInt ();
   
   area = lado * lado;
   
   System.out.println ("Area es: " + area) ;
   }
}