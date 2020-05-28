import java.util.Scanner;
public class Uri1114{
    public static void main(final String args[]){
        final Scanner teclado = new Scanner(System.in);
        
        int     senha = 2002,
                entrada;

        do{
            entrada = teclado.nextInt();
            if (entrada != senha) {
                System.out.println("Senha Invalida");
            }
        }while (entrada != senha);

        System.out.println("Acesso Permitido");

    }
}