import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inicial da conta: ");
        double depositoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$" + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Cheque especial disponível: R$" + conta.consultarChequeEspecial());
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado.");
                    break;
                case 4:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    double boleto = scanner.nextDouble();
                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                    break;
                case 6:
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("Você está usando o cheque especial.");
                    } else {
                        System.out.println("Você não está usando o cheque especial.");
                    }
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}