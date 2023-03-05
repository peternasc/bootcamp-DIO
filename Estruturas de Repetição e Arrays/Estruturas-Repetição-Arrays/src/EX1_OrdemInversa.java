public class EX1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] lista = {1,2,3,4,5,6};

        System.out.println(lista.length);

        for ( int c = (lista.length -1 ); c >= 0   ; c --  ){
            System.out.println(lista [c] + " ");

        }

    }
}
