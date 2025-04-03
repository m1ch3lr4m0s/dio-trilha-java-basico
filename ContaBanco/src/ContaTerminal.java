import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do titular da conta:");
        String nome = sc.nextLine();
        System.out.println("Informe o numero da conta:");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o numero da agencia:");
        String agencia = sc.nextLine();
        System.out.println("Informe o valor inicial do saldo:");
        double saldo = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Olá %s%n, obrigado por criar uma conta em nosso banco, sua agência é %s,%n conta %d e seu saldo %f já está disponível para saque",
                nome, agencia, conta, saldo );
    }
}
