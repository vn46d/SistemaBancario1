package Banco;

import java.security.DrbgParameters;
import java.util.Scanner;

    public class Dados {
        public static void main(String[] args) {
            System.out.println(" ======= Banco Do Vinicius ======== ");

            Scanner nome = new Scanner(System.in);
            String nomedoTitular;

            System.out.println("Digite seu nome: ");
            nomedoTitular = nome.nextLine();
            System.out.println("Bem-Vindo , " + nomedoTitular + "!");
    }
}