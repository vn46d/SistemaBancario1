package Banco;

public class Conta {

    private String titular;
    private double saldo;


        public void setTitular(String titular) {
        this.titular = titular;
    }

        public String getTitular() {
        return titular;
    }

        public double getSaldo() {
        return saldo;
    }



    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public void transferir(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transferência realizada!");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

}