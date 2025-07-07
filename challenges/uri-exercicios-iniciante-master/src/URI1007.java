import java.text.DecimalFormat;
import java.util.Scanner;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1007
public class URI1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int produto1 = a * b;
        int produto2 = c * d;
        int diferencaProduto = produto1 - produto2;
        System.out.println("DIFERENCA = " + diferencaProduto);
    }
}
