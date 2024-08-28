import java.util.Scanner;

public class atividade05 {

    public static final int TAM_MAX = 5; // definindo constante
    public static void main(String[] args) {
        int ARR[] = new int [50];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < TAM_MAX; i++){
            System.out.printf("Digite o valor " + i + " da lista: ");
            ARR[i] = sc.nextInt();

            for (int j = 0; j < TAM_MAX; j++){
                if(ARR[i] == ARR[j] && i!=j) {
                    System.out.println("O número " + ARR[i] + " foi adicionado mais de uma vez no vetor.");
                    break;
                }
            }
        }

        sc.close();
    }
}
