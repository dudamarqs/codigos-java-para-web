import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        int inicio, fim, primo=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Número inicial: ");
        inicio = sc.nextInt();

        System.out.println("Número final: ");
        fim = sc.nextInt();

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++){
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    primo++;
                }
            }
            if (primo == 2){
                System.out.println("O número " + i + " é primo.");
            }
            primo = 0;
        }

        sc.close();
    }
}
