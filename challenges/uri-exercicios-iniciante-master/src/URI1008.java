// https://www.urionlinejudge.com.br/judge/en/problems/view/1008

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroFuncionario = teclado.nextInt();
        double valorHora = teclado.nextDouble();
        float horasTrabalhadas = teclado.nextFloat();
        double salarioFuncionario = valorHora * horasTrabalhadas;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + formatador.format(salarioFuncionario));
    }
}
