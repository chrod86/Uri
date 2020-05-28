import java.util.Scanner;
public class Uri1051{
   public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       float salario, imposto;
       salario = teclado.nextFloat();

       if (salario <= 2000.0f){
           System.out.println("Isento");
       }
       else{
           if (salario <= 3000.0f){
               imposto = (salario - 2000.0f)*0.08f;
               System.out.printf("R$ %.2f\n",imposto);
           }
           else{
               if (salario <= 4500.0f){
                   imposto = (salario - 3000.0f)*0.18f + 80.0f;
                   System.out.printf("R$ %.2f\n",imposto);
               }
               else{
                   imposto = (salario - 4500.0f)*0.28f + 80.0f + 270.0f;
                   System.out.printf("R$ %.2f\n",imposto);
               }
           }
       }
   }   
}