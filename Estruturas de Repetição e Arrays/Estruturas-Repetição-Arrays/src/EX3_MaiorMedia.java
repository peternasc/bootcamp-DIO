import java.util.Scanner;

public class EX3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero = 0;
        int maior = 0;
        int soma = 0;
        int c = 0;

        do {
            System.out.println("Numero");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;

            c = c + 1;
            
        } while ( c < 5);
            System.out.println("O maior numero digitado foi : " + maior);
            System.out.println("A soma dos numeros é  : " + soma);        
            System.out.println("A média dos numeros é  : " + (soma/5));
    }

    
}
