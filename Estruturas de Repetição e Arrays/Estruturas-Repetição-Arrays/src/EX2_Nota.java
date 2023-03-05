import java.util.Scanner;

public class EX2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true) {
            System.out.println("Digite uma nota de zero a dez ");
            nota = scan.nextInt();
            if (nota >= 0 && nota <= 10) break;
            System.out.println("Digite uma nota valida para encerrar o programa");
            
        }

        System.out.println("Programa encerrado nota digitada foi : " + nota);

    }
}