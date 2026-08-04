import java.util.Scanner;

public class numeroprimo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite um número inteiro positivo --> ");
        int valor = sc.nextInt();
        int total = 0;

        if (valor < 2 ){
            System.out.println(" O numero deve ser maior ou igual a 2 ");
        }
        else {
            for(int cont = 1; cont<= valor; cont++) {
                if (valor % cont == 0) {
                    total++;
                }
            }
            if (total == 2){
                System.out.println(" É primo xD ");
            }
            else {
                System.out.println(" Não é primo primo xD ");
            }
        }

    }
}
