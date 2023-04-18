import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0; // contador de valores positivos
        double sum = 0.0; // soma dos valores positivos

        for (int i = 0; i < 6; i++) {
            double value = sc.nextDouble();
            if (value > 0.0) { // verifica se o valor é positivo
                count++;
                sum += value;
            }
        }

        System.out.println(count + " valores positivos");
        if (count > 0) {
            System.out.printf("%.1f\n", sum / count); // imprime a média com 1 casa decimal
        } else {
            System.out.println("0.0"); // imprime 0 se não houver valores positivos
        }

        sc.close();
    }
}
