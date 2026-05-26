import java.util.Scanner;

public class MainExercicioContagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite até qual número será realizada a contagem: ");
        int limite = input.nextInt();

        for (int i = 1; i <= limite; i++) {
            if (i % 10 == 5) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
