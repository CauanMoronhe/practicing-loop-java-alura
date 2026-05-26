import java.util.Scanner;

public class MainExercicioNome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeDigitado;

        do {
            System.out.print("Digite seu nome para ser cadastrado: ");
            nomeDigitado = input.nextLine();
            if (nomeDigitado.length() < 3) {
                System.out.println("Nome inválido. Digite novamente");
            }
        } while(nomeDigitado.length() < 3);

        System.out.println("Nome \"" + nomeDigitado + "\" cadastrado" );
        input.close();
    }
}
