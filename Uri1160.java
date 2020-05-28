import java.util.Scanner;
public class Uri1160{
    public static void main(final String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int PA, PB; // Populacao
        double G1, G2; // taxa de crescimento
        int anos;
        int T;

        T = teclado.nextInt();

        for ( int val = 0 ; val < T; val++){
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextDouble();
            G2 = teclado.nextDouble();
            anos = 0;
    
            while (PA <= PB){
                PA = (int)(PA +PA * G1 /100);
                PB = (int)(PB +PB * G2 /100);
                anos++;
                if (anos > 100){
                    break;
                }
            }
            if (anos <= 100){
                System.out.println(anos + " anos.");
            }
            else{
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}