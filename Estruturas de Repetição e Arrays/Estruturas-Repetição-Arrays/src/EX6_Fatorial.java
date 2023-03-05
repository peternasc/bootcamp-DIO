import java.util.Scanner;

public class EX6_Fatorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero que ira apesentar o fatorial ");
        int numero = scan.nextInt();
        int fatorial = 1;
        int mult = 1;
        System.out.println("Fatorial de " + numero + " é:");
        for (int c = numero; c >= 1  ; c-- ){
            mult = mult * c;
            System.out.println(numero + " X " + c + " = " + mult);
                    
        }
        System.out.println("fatorial de " + numero + " é: " + mult);
    }
}
