import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);

    int numeroConta;
    String numeroAgencia;
    String nomeCliente;
    Double saldoConta;

    System.out.println("Digite o numero da conta: ");
    numeroConta = sc.nextInt();
    sc.nextLine();

    System.out.println("Digite o numero da agência: ");
    numeroAgencia = sc.nextLine();

    System.out.println("Digite o seu nome: ");
    nomeCliente = sc.nextLine();
   
    System.out.println("Digite a quantidade inicial de Saldo : ");
    saldoConta = sc.nextDouble();

    sc.close();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco ,%n sua agência é %s,conta %d e seu saldo %.2f já está disponível para saque",
    nomeCliente, numeroAgencia, numeroConta, saldoConta);

    }
}
