import java.util.Scanner;

public class App {
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
       

    sc.close();

    }
}
