import java.beans.beancontext.BeanContextChildComponentProxy;
import java.util.Scanner;
public class Uri1142{
    public static void main(final String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int     N = teclado.nextInt();
        int     A=1; 
   
        for (int val = 1; val <= N ; val++){
            System.out.println(A + " " + (A=A+1) + " " + (A=A+1) + " PUM");
            A=A+2;
        }
    }
}
