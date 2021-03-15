import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, trian, circ, trap, quad, ret;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        trian = A * C / 2.0;
        circ = 3.14159 * C * C;
        trap = (A + B) / 2.0 * C;
        quad = B * B;
        ret = A * B;

        System.out.printf("TRIANGULO: %.3f%n", trian);
        System.out.printf("CIRCULO: %.3f%n", circ);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETANGULO: %.3f%n", ret);

        sc.close();
    }
}
