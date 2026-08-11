import java.util.Scanner;

public class exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            System.out.println(" Escreva num número -->");
            x[i] = sc.nextInt();



        }
        int maior = x[0];
        int menor = x[0];

        for (int i = 0; i < x.length; i++) {
            if (maior < x[i]){
                maior = x[i];
            }
            if (menor > x[i]){
                menor = x[i];
            }
        }
        System.out.println("O maior número é --> "+ maior);
        System.out.println("O menor número é --> "+ menor);
    }
}
