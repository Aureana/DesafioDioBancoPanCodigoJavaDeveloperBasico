import java.util.Scanner;
public class Dragon{ 
    
  public static void main(String[] args){
    int c, poderDeLuta;
    
    Scanner leitura = new Scanner(System.in);
    
    c = leitura.nextInt();
    
    for(int i = 0; i < c; i++){
      poderDeLuta = leitura.nextInt();
      System.out.println(
        (poderDeLuta > 8000) ? "Mais de 8000!" : "Inseto!"
      );
    }
    
    leitura.close();
  }
}

