import java.util.Scanner;

public class MainExercicioPlusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var numPositivo = 0;
        var numNegativo = 0;

        while (true) {
            System.out.print("Digite um numero (ou \'fim\' para encerrar): ");
            String numDigitado = input.nextLine();

            if (numDigitado.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(numDigitado);

            if (numero > 0) {
                numPositivo++;
            } else {
                numNegativo++;
            }
        }

        System.out.println("Números positivos: " + numPositivo);
        System.out.println("Números negativos: " + numNegativo);

        input.close();
    }
}
