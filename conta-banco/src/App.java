import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n=============================");
        System.out.println("       Conta Simulator       ");
        System.out.println("=============================");
        System.out.println("Qual o seu nome?: ");
        String nomeCliente = teclado.nextLine();
        System.out.println("Qual o número da sua conta?: ");
        int numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Qual a agencia da sua conta?: ");
        String agencia = teclado.nextLine();
        System.out.println("Qual o saldo da sua conta?: ");
        double saldo = Double.parseDouble(teclado.nextLine());
        System.out.println("=============================");

        teclado.close();

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.printf(
            "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!",
            conta.getNomeCliente(),
            conta.getAgencia(),
            conta.getNumero(),
            conta.getSaldo()
        );
    }
}
