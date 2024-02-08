import java.util.Locale;
import java.util.Scanner;


class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Mike Costa";
        String tipoConta = "Corrente";
        double saldoInicial = 2500;
        int opcao = 0;



        System.out.println("************************************\n");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: \t\t\t\t" + nome);
        System.out.println("Tipo conta: \t\t" + tipoConta);
        System.out.println("Saldo Inicial: \t\t" + "R$ " + saldoInicial);
        System.out.println("\n************************************");

        String menu = """
                ** Digite sua operação **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Realizer Deposito
                4 - Sair
                
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();
            if(opcao == 1)
                System.out.println("Saldo atualizado: " + saldoInicial);

            if(opcao == 2) {
                System.out.println("informe o valor da transferencia");
                double valorTrasferencia = sc.nextDouble();
                if(valorTrasferencia > saldoInicial)
                    System.out.println("Saldo da conta é insuficiente para realizar a transferencia.");
                else {
                    saldoInicial -= valorTrasferencia;
                    System.out.println("Novo saldo: " + saldoInicial);
                }
            }
            if(opcao == 3) {
                System.out.println("Informe o valor do deposito: ");
                double valorDeposito = sc.nextDouble();
                saldoInicial += valorDeposito;
                System.out.println("Novo saldo: " + saldoInicial);
            }
            if(opcao == 4) {
                System.out.println("Opção invalida!");
            }


        }



        sc.close();
    }
}
