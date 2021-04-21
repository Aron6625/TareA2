
import java.util.Scanner;
class Distancia {
   public static void main (String args[]){
       
   Scanner scanner = new Scanner (System.in);
   
   int punto1;
   int punto2;
   int distancia;
   
   System.out.print ("Introduzca la cordenada del primer punto: ");
   punto1 = scanner.nextInt();
   System.out.print ("Introduzca la cordenada del segundo punto: ");
   punto2 = scanner.nextInt();
   
   distancia = punto2 - punto1;
   System.out.println ("La distancia es: " + distancia);
 
  }
}
