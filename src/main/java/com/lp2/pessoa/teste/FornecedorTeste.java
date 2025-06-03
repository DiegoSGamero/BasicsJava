package com.lp2.pessoa.teste;

import com.lp2.pessoa.model.Fornecedor;

public class FornecedorTeste {

    public static void testarFornecedor(String[] args) {
        // Fornecedor com construtor padrão
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Fornecedor Alpha");
        fornecedor1.setEndereco("Av. Paulista, 1000");
        fornecedor1.setTelefone("(11) 4002-8922");
        fornecedor1.setValorCredito(3500.00);
        fornecedor1.setValorDivida(3500.00);

        System.out.println("--- Fornecedor 1 ---");
        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Endereço: " + fornecedor1.getEndereco());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("Crédito: R$ " + fornecedor1.getValorCredito());
        System.out.println("Dívida: R$ " + fornecedor1.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor1.obterSaldo(fornecedor1));
        System.out.println();

        // Fornecedor com construtor alternativo 2 herdado
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor Beta", "(21) 98888-1234", 5000.00, 5000);

        System.out.println("--- Fornecedor 2 ---");
        System.out.println("Nome: " + fornecedor2.getNome());
        System.out.println("Endereço: " + fornecedor2.getEndereco());
        System.out.println("Telefone: " + fornecedor2.getTelefone());
        System.out.println("Crédito: R$ " + fornecedor2.getValorCredito());
        System.out.println("Dívida: R$ " + fornecedor2.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor2.obterSaldo(fornecedor2));
        System.out.println();
    }
}
