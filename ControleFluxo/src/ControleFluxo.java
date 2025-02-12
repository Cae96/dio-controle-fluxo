import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleFluxo{

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero inteiro");
            int primeiroInteiro = terminal.nextInt();

            System.out.println("Digite o segundo numero inteiro");
            int segundoInteiro = terminal.nextInt();

            if (segundoInteiro > primeiroInteiro) {
                for (int i = 0; i < (segundoInteiro+1 - primeiroInteiro); i++) {
                    System.out.println("Imprimindo o numero " + (i+1) +":" + (primeiroInteiro + i));
                }
            } else {
                System.out.println("O segundo número deve ser maior que o primeiro");
            }

        } catch (InputMismatchException e) {
            System.out.println("Os dois parâmetros devem ser números inteiros");
        } finally {
            terminal.close();
        }
    }
}
