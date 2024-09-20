package org.example;

public class ClientePessoal extends Cliente {

    public ClientePessoal(String nome) {
        super(nome);
    }

    @Override
    public void transacao() {
        System.out.println("Transação pessoal realizada!");
    }
}
