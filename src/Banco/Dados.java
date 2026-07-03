package Banco;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {

        System.out.println(" ======= Banco Do Vinicius ======== ");

        Scanner option = new Scanner(System.in);


        String nomedoTitular;
        String sel;
        Double saldo;
        Double deposito;
        Double sacar;

        deposito = 0;
        saldo = 0;
        sacar = 0;

        System.out.println("Digite seu nome: ");
        nomedoTitular = option.nextLine();

        System.out.println("Bem-Vindo , " + nomedoTitular + "!");

        System.out.println("Digite uma dos numeros : 1 ,2 ,3 ");


        sel = option.nextLine();

        switch (sel) {

            case "1":
                System.out.println("1 - " + saldo);


                System.out.println("Saldo atualizado: R$ " + saldo);
                    break;

            case "2":
                System.out.println("Digite o valor do depósito:" + deposito);
                deposito = option.nextDouble();
                saldo = saldo + deposito;
                System.out.println("O saldo adicionado a sua conta foi de" + deposito);

                    break;

            case "3":
                System.out.println("3 - " + sacar);
                sacar = option.nextDouble();

                if (saldo >= sacar) {
                    saldo = saldo - sacar;
                    System.out.println("Restante" + saldo);
                } else {
                    System.out.println("Saldo insuficiente");
                    break;
                }

            default:
                     System.out.println("Operação inválida");
                    break;
        }
    }
}
