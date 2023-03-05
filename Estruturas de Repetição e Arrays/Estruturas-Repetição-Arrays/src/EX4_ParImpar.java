import java.util.Scanner;

public class EX4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        int quant;
        int c = 0;
        int numero;
        int impar = 0;
        int par = 0;
        int contador = 1;
        System.out.println("informe a quantidade de numeros que será solicitao pelo sistema :");
        quant = scan.nextInt();

        do {
            System.out.println("Digite o numero " + contador);
            numero = scan.nextInt();
            if ((numero % 2) == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
            c ++;
            contador ++;

        } while (c < quant);
        
        if (par <= 1) {
            System.out.println("Temos " + par + " numero par");
        } else {
            System.out.println("Temos " + par + " numeros pares");
        }

        if (impar <= 1) {
            System.out.println("Temos " + impar + " numero impar");
        } else {
            System.out.println("Temos " + impar + " numeros impares");
        }

    }
}
