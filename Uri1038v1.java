import java.util.Scanner;
public class Uri1038v1{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, qtde;
        float total=0.0f;

        codigo = teclado.nextInt();
        qtde   = teclado.nextInt();

        if (codigo == 1){
            total = qtde * 4.0f;
        }
        else{
            if (codigo == 2){
                total = qtde * 4.50f;
            }
            else{
                if (codigo == 3){
                    total = qtde * 5.0f;
                }
                else{
                    if (codigo == 4){
                        total = qtde * 2.0f;
                    }
                    else{
                        if (codigo == 5){
                            total = qtde * 1.50f;
                        }
                    }
                }
            }
        }
        System.out.printf("Total: R$ %.2f\n",total);
    }

}