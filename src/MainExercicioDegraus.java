import java.util.Scanner;

public class MainExercicioDegraus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int quantDegraus = input.nextInt();

        for (int i = 1; i <= quantDegraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!");
        input.close();
    }
}
