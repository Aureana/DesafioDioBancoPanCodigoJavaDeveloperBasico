import java.util.Scanner;

public class CalculoPrecoCarro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int custoFabrica = sc.nextInt();
        int percentDistribuidor = sc.nextInt();
        int percentImpostos = sc.nextInt();
        
        int custoConsumidor = custoFabrica + (custoFabrica * percentDistribuidor / 100) + (custoFabrica * percentImpostos / 100);
        
        System.out.println(custoConsumidor);
        
        sc.close();
    }

}