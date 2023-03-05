import java.util.Scanner;

public class EX5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        System.out.println("Escolha qual a tabuada deseja exibir, tabuada do 1 ao 10");
        tabuada = scan.nextInt();
        
        if(tabuada < 1 || tabuada > 10){
            System.out.println("Por favor escolha um numero de 1 a 10");
        }else{
            
            for ( int c = 1 ;  c <= 10 ; c++  ) {

                System.out.println(tabuada + " X " + c + " = " + tabuada*c);
            }

        
        }
    }
    
}

