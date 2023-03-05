import java.io.IOException;
import java.util.Scanner;

public class ImprimindoMediaPares {
	
  /**
 * @param args
 * @throws IOException
 */
public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;
     double soma = 0;

     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        for (int c = 0; c <= 5; c ++  ) {
        	x = leitor.nextDouble();
            if(x >= 0){
                cont = cont +1;
                soma = soma + x;
            }
        }
        
        
        media = (soma / cont);
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
	
}