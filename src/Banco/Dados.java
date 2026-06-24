package Banco;

import java.util.Scanner;

    public class Dados {
        public static void main(String[] args) {

            Scanner option = new Scanner(System.in);


            String nomedoTitular;
            String sel;
            Double saldo;
            Double deposito;
            Double sacar;

            System.out.println(" ======= Banco Do Vinicius ======== ");

            System.out.println("Digite seu nome: ");
            nomedoTitular = option.nextLine();
            System.out.println("Bem-Vindo , " + nomedoTitular + "!");

            System.out.println("Digite uma dos numeros : 1 ,2 ,3 ");
            sel = option.nextLine();

            switch (sel) {
                case "Adiconar" :
                    System.out.println("Adicione o valor Desejado");
                    saldo = option.nextDouble();

                    saldo = saldo + deposito;

                    System.out.println("Saldo atualizado: R$ " + saldo);

                case "1":
                    System.out.println("1 - " + saldo);
                    break;
                case "2":
                    System.out.println("2 - " + deposito);
                    deposito = option.nextDouble();
                    break;
                case "3":
                    System.out.println("3 - " + sacar);
                    sacar = option.nextDouble();
                    break;
            if saldo <= sacar : {
                    System.out.println("Saldo insuficiente");
                }
                default:
                    System.out.println("Operação inválida");
                    break;
            }

        }
    }