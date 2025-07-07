//https://www.urionlinejudge.com.br/judge/en/problems/view/1011


import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class URI1011<volume> {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double pi = 3.14159;
        double volume = (4 / 3.0) * pi * Math.pow(r, 3);
        DecimalFormat formatador  = new DecimalFormat("0.000");
        System.out.println("VOLUME = " + formatador.format (volume));
    }
}