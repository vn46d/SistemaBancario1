package Banco;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {

        System.out.println(" ======= Banco Do Vinicius ======== ");

        Scanner option = new Scanner(System.in);

        String simounao;
        String nomedoTitular;
        String sel;
        Double saldo;
        Double deposito;
        Double sacar;
        Double transferir;
        boolean executando = true;

        deposito = 0.0;
        saldo = 0.0;
        sacar = 0.0;
        transferir = 0.0;

        System.out.println("Digite seu nome: ");
        nomedoTitular = option.nextLine();

        System.out.println("Bem-Vindo ," + nomedoTitular + "!");

        while (executando) {
        System.out.println("Digite uma dos numeros :" +

                 "1 - Ver Saldo" +
                 "2 - Depositar" +
                 "3 - Sacar" +
                 "4 - Transferir" +
                 "5 - Sair ");


        sel = option.nextLine();

            switch (sel) {

                case "1":
                    System.out.println("O valor e de R$:" + saldo);
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;

                case "2":
                    System.out.println("Digite o valor do depósito:");
                    deposito = option.nextDouble();
                    option.nextLine();
                    saldo = saldo + deposito;
                    System.out.println("O saldo adicionado a sua conta foi de" + deposito);
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case "3":
                    System.out.println("Digite o Valor do saque:"  );
                    sacar = option.nextDouble();
                    option.nextLine();
                    System.out.println("Saldo atual: R$ " + saldo);

                    if (saldo >= sacar) {
                        saldo = saldo - sacar;
                        System.out.println("Restante" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                        break;
                    }

                case "4":
                    System.out.println("Digite o valor da transferencia ");
                    transferir = option.nextDouble();
                    option.nextLine();

                    System.out.println("Mandar para contato frequente?"+
                            "S/N");
                    simounao = option.nextLine();
                    if(simounao.equalsIgnoreCase("S"));{
                    System.out.println("tal coisa");
                }
                    System.out.println("Saindo,obrigado por ultilizar nossos serviços.");

                    System.out.println("Saldo atual: R$ " + saldo);

                    if (saldo >= transferir) {
                        saldo = saldo - transferir;
                        System.out.println("Saldo Restante" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                default:
                        System.out.println("Operação inválida");
                        break;

                case "5":
                    executando = false;
                    System.out.println("Saindo,obrigado por ultilizar nossos serviços.");
                    break;
            }
        }
    }
}
