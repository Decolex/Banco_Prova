package org.example;

public class ContaPoupanca implements Conta {
    private double saldo;
    private double juros;
    private int mes;

    public ContaPoupanca(double saldo, double jurosAnual, int mesInicial) {
        this.saldo = saldo;
        this.juros = jurosAnual/12;
        this.mes = mesInicial;
    }


    @Override
    public double deposito(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$" + valor + " feito com sucesso!");
        return saldo;
    }

    @Override
    public double saque(double valor) {
        if (valor < saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " feito com sucesso!");
            return saldo;
        } else {
            System.out.println("Valor insuficiente para saque!");
            return saldo;
        }
    }


    @Override
    public double transferencia(double valor) {
        if (valor < saldo) {
            saldo -= valor;
            System.out.println("Tranferência de R$" + valor + " feito com sucesso!");
            return saldo;
        } else {
            System.out.println("Valor insuficiente para realizar a transferência!");
            return saldo;
        }
    }

    public double calculaSaldo(int meses) {
        if (meses > 0) {
            saldo += saldo * juros * meses;
        }
            System.out.println("Saldo após " + meses + " meses com juros: R$" + saldo);
            return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
