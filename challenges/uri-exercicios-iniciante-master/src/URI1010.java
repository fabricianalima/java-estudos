//https://www.urionlinejudge.com.br/judge/en/problems/view/1010
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigoProduto1 = input.nextInt();
        int numeroUnidadesProd1 = input.nextInt();
        double precoProduto1 = input.nextDouble();
        int codigoProduto2 = input.nextInt();
        int numeroUnidadesProd2 = input.nextInt();
        double precoProduto2 = input.nextDouble();
        double valorTotal = (numeroUnidadesProd1 * precoProduto1) + (numeroUnidadesProd2 * precoProduto2);
        DecimalFormat formatador  = new DecimalFormat("0.00");
        System.out.println("VALOR A PAGAR: R$ " + formatador.format(valorTotal));
    }
}
