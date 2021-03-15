import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, Dife;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        Dife = A * B - C * D;

        System.out.println("DIFERENCA = " + Dife);

        sc.close();
    }
}
