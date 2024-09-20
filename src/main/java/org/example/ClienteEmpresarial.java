package org.example;

public class ClienteEmpresarial extends Cliente {

    public ClienteEmpresarial(String nome) {
        super(nome);
    }

    @Override
    public void transacao() {
        System.out.println("Transação empresarial realizada!");
    }


}
