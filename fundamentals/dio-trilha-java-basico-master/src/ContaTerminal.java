import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite o numero do Agencia: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        String nome = sc.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Ola, " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + " sua conta é " + numeroDaConta + " e seu saldo " + saldo + " ja esta disponivel para saque");

        sc.close();
    }
}

