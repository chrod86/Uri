import java.util.Scanner;

public class Uri1070 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicio;
        inicio = teclado.nextInt();

        int contador = 1;

        if (inicio %2 == 0){
            inicio=inicio+1;
        }

        while (contador <= 6){
            System.out.println(inicio);
            inicio = inicio + 2;
            contador++;
        }
    }
}