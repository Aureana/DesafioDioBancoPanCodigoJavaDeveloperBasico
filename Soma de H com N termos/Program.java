import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // lê o valor de N
        
        double h = 0.0; // inicializa a variável H com 0
        
        for (int i = 1; i <= n; i++) {
            h += 1.0 / i; // adiciona o termo 1/i à variável H
        }
        
        int resultado = (int) Math.round(h); // arredonda o valor de H e converte para inteiro
        
        System.out.println(resultado); // imprime o resultado
    }
}

