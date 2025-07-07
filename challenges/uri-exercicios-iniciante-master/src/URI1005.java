import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        float pesoMediaA = 3.5f;
        float pesoMediaB = 7.5f;
        double resultadomedia = ((a * pesoMediaA) + (b * pesoMediaB)) / (pesoMediaA + pesoMediaB);
        DecimalFormat formatador = new DecimalFormat("0.00000");
        System.out.println("MEDIA = " + formatador.format(resultadomedia));
    }
}