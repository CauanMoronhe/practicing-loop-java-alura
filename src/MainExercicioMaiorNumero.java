import java.util.Scanner;

public class MainExercicioMaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String[] numeroStr = input.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numeroStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        input.close();
    }
}
