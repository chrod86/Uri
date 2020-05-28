import java.util.Scanner;
public class Uri1009{
    public static void main(final String args[]){
        Scanner teclado = new Scanner(System.in);
        
        String  nome    = teclado.nextLine();
        double  salario = teclado.nextDouble();
        double  vendas  = teclado.nextDouble();
        double  total;

        total = salario + vendas * (double)(15/100);
        
        System.out.printf("TOTAL = R$ %.2d",total);
    }
}
 