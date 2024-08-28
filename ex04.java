import java.util.Scanner;

public class ex04 {
    public static void main (String[] args) {
        double raio, perimetro, area;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor do raio da circunferência: ");
        raio = sc.nextDouble();

        perimetro = 2 * 3.14159 * raio;
        area = 3.14159 * raio * raio;

        System.out.println("\nPerímetro do círculo: " + perimetro);
        System.out.println("Área do círculo: " + area);

        sc.close();
    }
}