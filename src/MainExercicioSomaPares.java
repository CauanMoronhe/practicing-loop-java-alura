public class MainExercicioSomaPares {
    public static void main(String[] args) {

        int somaPares = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                somaPares += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é de: " + somaPares);
    }
}
