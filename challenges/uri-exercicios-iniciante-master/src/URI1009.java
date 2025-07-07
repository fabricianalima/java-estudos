import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DecimalFormat;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1009

public class URI1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeVendedor = teclado.next();
        double salarioVendedor = teclado.nextDouble();
        float totalVendasNoMes = teclado.nextFloat();
        float porcentagemVendas = 15;
        double comissaoVendas = totalVendasNoMes * (porcentagemVendas / 100);
        double salarioMensal = salarioVendedor + comissaoVendas;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("TOTAL = R$ " + formatador.format(salarioMensal));
    }
}
