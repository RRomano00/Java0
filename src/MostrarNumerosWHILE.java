import java.util.Scanner;

public class MostrarNumerosWHILE {
    public static void main(String[] args) {
        int numeroInicial, numeroFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Número Inicial:");
        numeroInicial = scanner.nextInt();
        System.out.println("Número Final:");
        numeroFinal = scanner.nextInt();

        System.out.printf("Imprimindo valores entre %d e %d \n", numeroInicial, numeroFinal);

        int i = numeroInicial;
        while(i <= numeroFinal ){

            if(i%2 == 0) {
                System.out.printf("Numero %d é par \n", i);
            } else{
                System.out.printf("Numero %d impar \n ", i);
            }

            i++;
        }
    }
}
