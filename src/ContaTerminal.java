import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // Importar e instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:\n");
        int numConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o número da agência:\n");
        String numAgencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome:\n");
        String nomeCliente = sc.nextLine();


        System.out.println("Por favor, digite o saldo da conta:\n");
        Double saldo = sc.nextDouble();


        Conta conta = new Conta(numConta, numAgencia, nomeCliente, saldo);

        System.out.println(conta.exibirMensagem());


        sc.close();

    }
}
