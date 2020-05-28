import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, mI, hF, mF, H, M;
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        int duracao = (hF * 60 + mF) - (hI * 60 + mI);

        //System.out.println("Hora inicial  em minutos = "+ (hI*60 + mI));
        //System.out.println("Hora final    em minutos = "+ (hF*60 + mF));
        //System.out.println("Duracao total em minutos = "+ duracao);
        
        if (duracao < 0){
            duracao = 24*60 + duracao;  // duracao ja eh negativa
        }

        //System.out.println("Nova duracao "+duracao);
        H = duracao / 60;
        M = duracao % 60;

        //System.out.println("H = "+H);
        //System.out.println("M = "+M);

        if (H == 0 && M == 0){
            H = 24;
        }

        System.out.println("O JOGO DUROU " + H + " HORA(S) E " + M + " MINUTO(S)");

    }
}