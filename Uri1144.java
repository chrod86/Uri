import java.util.Scanner;
public class Uri1142{
    public static void main(final String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int     N = teclado.nextInt(); 
   
        for (int val = 1; val <= N ; val++){
            System.out.println(val + " " + val*val + " " + val*val*val);
            System.out.println(val + " " + val*val+1 + " " + val*val*val);
        }
    }
}