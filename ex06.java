import java.util.Scanner;

public class ex06 {
    public static void carroNovo(String[] args) {
        double precoCarro, precoFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o valor de fábrica do veículo: R$ ");
        precoCarro = sc.nextDouble();

        precoFinal = precoCarro + precoCarro * 0.28 + precoCarro*0.45;
        System.out.println("Preço final do veículo: R$ " + precoFinal);

        sc.close();
    }
}
