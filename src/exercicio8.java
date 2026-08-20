import java.util.Random;
import java.util.Scanner;

public class exercicio8 {
    static void main() {
        Random random = new Random();
        int[] x = new int[10];
        Scanner sc = new Scanner(System.in);
        int aux;

        System.out.println("Antes da ordenação - ");
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(5,123);
            System.out.print(x[i] + "\t");

        }

        // ordenação
        for (int j = 0; j < x.length; j++) {


            for (int i = 0; i < x.length - 1; i++)
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;


                }
        }

        System.out.println("\n Depois da ordenação");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");

        }
    }
}
