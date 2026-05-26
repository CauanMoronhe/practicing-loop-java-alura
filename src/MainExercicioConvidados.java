import java.util.ArrayList;
import java.util.Scanner;

public class MainExercicioConvidados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do convidado (ou \'ver\' para visualizar a lista, \'sair\' para encerrar): ");
            String opcao = input.nextLine().trim().toLowerCase();

            if (opcao.equals("sair")) {
                System.out.println("Programa encerrado!");
                break;
            } else if (opcao.equals("ver")) {
                System.out.println("Lista de convidados:");
                if (convidados.isEmpty()) {
                    System.out.println("Nenhum convidado cadastrado!");
                } else {
                    for (String convidado : convidados) {
                        System.out.println("- " + convidado);
                    }
                }
            } else {
                if (convidados.contains(opcao)){
                    System.out.println("Este convidado já está na lista");
                } else {
                    convidados.add(opcao);
                    System.out.println("Convidado adicionado à lista!");
                }
            }
        }
        input.close();
    }
}
