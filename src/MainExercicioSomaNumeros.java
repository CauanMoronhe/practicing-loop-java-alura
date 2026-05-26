public class MainExercicioSomaNumeros {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int valorSomado = 0;

        for (int valor : valores) {
            valorSomado += valor;
        }
        System.out.println("A soma total das receitas é: " + valorSomado);
    }
}
