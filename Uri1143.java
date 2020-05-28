import java.util.Scanner;
public class Uri1143{
    public static void main(final String args[]){
        final Scanner teclado = new Scanner(System.in);
        
        int     n, 
                a = 1, 
                b = 1,
                c = 1,
                d = 0;

        n = teclado.nextInt();

        do{
            System.out.print((a)+" "+(a*a)+" "+(a*a*a)+"\n");
            a++;
        }while (a < n+1);
        
    }
}