package org.example;

public class Main {
    public static void main(String[] args) {

        ClienteEmpresarial cliente = new ClienteEmpresarial("Lucas");
        ClientePessoal cliente2 = new ClientePessoal("Maria");

        Conta contaCorrente = new ContaCorrente(1000.0);
        cliente.abrirConta(contaCorrente);

        Conta contaPoupanca = new ContaPoupanca(500.0, 0.02, 1);
        cliente2.abrirConta(contaPoupanca);

        cliente.fazerDeposito(5000.0);
        cliente2.fazerSaque(200.0);


        cliente.fazerTransferencia(3000.0);

        cliente.fecharConta();
        cliente2.fecharConta();
    }
}