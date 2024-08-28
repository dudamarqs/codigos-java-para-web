import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int codigo, senha;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        codigo = sc.nextInt();

        if (codigo == 1234){
            System.out.print("Código correto.\n");
            System.out.print("Insira a senha de acesso: ");
            senha = sc.nextInt();

            if (senha == 9999){
                System.out.println("\nAcesso permitido.");
            } else {
                System.out.println("\nAcesso negado.");
            }
        } else {
            System.out.print("Código incorreto.");
        }

        sc.close();
    }
}