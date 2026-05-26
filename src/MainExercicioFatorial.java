import java.util.Scanner;

public class MainExercicioFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numDigitado = input.nextInt();
        int fatNumber = 1;

        for (int i = 1; i <= numDigitado; i++) {
            fatNumber *= i;
        }

        System.out.println("O fatorial de " + numDigitado + " é: " + fatNumber);
        input.close();
    }
}
