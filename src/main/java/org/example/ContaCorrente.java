package org.example;

public class ContaCorrente implements Conta {
    private double saldo;
    private double chequeEspecial;
    private double limiteDiario;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
        this.limiteDiario = 5000.0 + chequeEspecial;
    }

//------------------------------------------------------------------------------------------------//

    @Override
    public double deposito(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$"+ valor + " feito com sucesso!" );
        return saldo;
    }

//------------------------------------------------------------------------------------------------//

    @Override
    public double saque(double valor) {
        if (valor > saldo + chequeEspecial) {
            System.out.println("Valor solicitado, é maior que o saldo disponivel!");
            return saldo;
        }else if (valor > limiteDiario){
            System.out.println("Valor maior que o limite diario de saque");
            return saldo;
        }else{
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " feito com sucesso!");
            } else {
                double diferenca = valor - saldo;
                saldo = 0;
                chequeEspecial -= diferenca;
                System.out.println("Saque usando cheque especial incluído!");
            }
        }
        limiteDiario -= valor;
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Limite diário restante: " + limiteDiario);
        return saldo;
    }
//------------------------------------------------------------------------------------------------//
    @Override
    public double transferencia(double valor) {
        if (valor > saldo + chequeEspecial){
            System.out.println("Valor maior que o saldo de crédito disponivel!");
            return saldo;
        }else if (valor > limiteDiario){
            System.out.println("Valor maior que o limite diario de saque");
            return saldo;
        }else {
            if (valor <=saldo){
                System.out.println("Saque de R$"+ valor + " feito com sucesso!" );
                saldo -= valor;
            } else {
                double diferenca = valor - saldo;
                saldo = 0;
                chequeEspecial -= diferenca;
                System.out.println("Saldo insuficente, cheque especial incluído!");

            }
        }
        limiteDiario -= valor;
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Limite de Saque atual: " + limiteDiario);
        return saldo;
    }

//------------------------------------------------------------------------------------------------//

    public double getSaldo() {
        return saldo;
    }
}
