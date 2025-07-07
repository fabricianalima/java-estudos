import java.text.DecimalFormat;
import java.util.Scanner;

//https://www.urionlinejudge.com.br/judge/en/problems/view/1006

public class URI1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        int pesoMediaA = 2;
        int pesoMediaB = 3;
        int pesoMediaC = 5;
        double resultadomedia = ((a * pesoMediaA) + (b * pesoMediaB) + (c * pesoMediaC)) / (pesoMediaA + pesoMediaB + pesoMediaC);
        DecimalFormat formatador = new DecimalFormat("0.0");
        System.out.println("MEDIA = " + formatador.format(resultadomedia));
    }
}

