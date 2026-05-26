import java.util.Scanner;

public class MainExercicioSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var senhaCorreta = 1234;
        var tentativas = 2;

        for (int i = 3; i > 0; i--) {
            System.out.println("Digite sua senha para acessar: ");
            var senhaDigitada = input.nextInt();

            if (tentativas == 0) {
                System.out.println("Conta bloqueada temporariamente");
                break;
            } else if (senhaDigitada == senhaCorreta) {
                System.out.println("Senha correta! Acesso liberado");
                break;
            } else {
                System.out.println("Senha incorreta! Você possuí mais " + tentativas + " tentativas");
                tentativas--;
            }
        }
        input.close();
    }
}
