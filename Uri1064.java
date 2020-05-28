import java.util.Scanner;
public class Uri1064{
    public static void main(final String args[]){
        final Scanner teclado = new Scanner(System.in);
        
        double  valor, media=0;
        int     n,positivos=0;

        for (n = 0; n < 6 ; n++){
            valor = teclado.nextDouble();
            if (valor > 0){
                media = media + valor;
                positivos++;
            }
        }
        media = media / positivos;
        System.out.println(positivos + " valores positivos");
        System.out.printf("%2d",media);
    }
}