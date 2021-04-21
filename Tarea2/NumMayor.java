
import java.util.Scanner;
public class NumMayor {
    public static void main (String arg []){
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.print ("Ingrese un valor para a = ");
    int a = scanner.nextInt();
    System.out.print ("Ingrese un valor para b = ");
    int b = scanner.nextInt();
    System.out.print ("Ingrese un valor para c = ");
    int c = scanner.nextInt();
    
    if (a > b && a > c && b > c) {
        System.out.println (a + " es el mayor");
        System.out.println (b + " es del medio");
        System.out.println (c + " es el menor");
    }else if (b > a && b > c && a > c) {
        System.out.println (b + " es el mayor");
        System.out.println (a + " es del medio");
        System.out.println (c + " es el menor");
    
    }else if (c > a && c > b && a > b ) {
        System.out.println (b + " es el menor");
        System.out.println (a + " es del medio");
        System.out.println (c + " es el mayor");
    
    }else if (c > a && c > b && b > a ) {
        System.out.println (b + " es del medio");
        System.out.println (a + " es el menor");
        System.out.println (c + " es el mayor");
        
    }else if (b > a && b > c && c > a ) {
        System.out.println (b + " es del medio");
        System.out.println (a + " es el menor");
        System.out.println (c + " es el mayor");
    }   
}
}
