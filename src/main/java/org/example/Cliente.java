package org.example;

public abstract class Cliente {
    protected String nome;
    protected Conta tipoConta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void abrirConta(Conta tipoConta){
        this.tipoConta = tipoConta;
        System.out.println("Olá "+ nome + " sua conta "+ tipoConta.getClass().getSimpleName() + "aberta com sucesso!");
    }

    public void fecharConta(){
        System.out.println("Olá "+ nome + " sua conta " + tipoConta.getClass().getSimpleName() +" foi fechada com sucesso!");
    }

    public void fazerDeposito(double valor) {
        if (tipoConta != null) {
            tipoConta.deposito(valor);
        } else {
            System.out.println("Nenhuma conta aberta para realizar o depósito.");
        }
    }

    public void fazerSaque(double valor) {
        if (tipoConta != null) {
            tipoConta.saque(valor);
        } else {
            System.out.println("Nenhuma conta aberta para realizar o saque.");
        }
    }

    public void fazerTransferencia(double valor) {
        if (tipoConta != null) {
            tipoConta.transferencia(valor);
        } else {
            System.out.println("Nenhuma conta aberta para realizar a transferência.");
        }
    }

    public abstract void transacao();
}
