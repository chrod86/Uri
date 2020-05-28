import java.util.Scanner;
 
public class Uri1006 {
 
    public static void main(String args[]) {
 
        Scanner teclado = new Scanner(System.in);

        double  a = teclado.nextDouble(),
                b = teclado.nextDouble(),
                c = teclado.nextDouble(),
                media = 0;

        media = (a * 0.2) + (b * 0.3) + (c * 0.5);

        System.out.printf("MEDIA = %1d",media);
            
    }
 
}