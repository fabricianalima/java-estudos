import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

//https://www.urionlinejudge.com.br/judge/en/problems/view/1002

public class URI1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double r = teclado.nextDouble();
        double pi = 3.14159;
        double a = pi * Math.pow(r, 2);
        DecimalFormat formatador = new DecimalFormat("0.0000");
        System.out.println("A=" + formatador.format(a));
    }
}
