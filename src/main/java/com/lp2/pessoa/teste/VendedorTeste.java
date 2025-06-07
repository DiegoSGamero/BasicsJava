package com.lp2.pessoa.teste;

import com.lp2.pessoa.model.Vendedor;

public  class VendedorTeste {

    public static void TestarVendedor() {
        Vendedor vendTeste = new Vendedor();

        vendTeste.setNome("Ambulante");
        vendTeste.setEndereco("Todas as Ruas");
        vendTeste.setTelefone("(11) 4002-8922");
        vendTeste.setCodSetor(2);
        vendTeste.setSalarioBase(10000.00);
        vendTeste.setImposto(0.02);
        vendTeste.setValorVendas(1000);
        vendTeste.setComissao(0.04);

       System.out.println("--- Vendedor ---");
       System.out.println("Nome: " + vendTeste.getNome());
       System.out.println("Endereço: " + vendTeste.getEndereco());
       System.out.println("Telefone: " + vendTeste.getTelefone());
       System.out.println("Setor: R$ " + vendTeste.getCodSetor());
       System.out.println("SalarioBase: R$ " + vendTeste.getSalarioBase());
       System.out.println("Imposto: R$ " + vendTeste.getImposto());
       System.out.println("Vendas: R$ " + vendTeste.getValorVendas());
       System.out.println("Comissão: R$ " + vendTeste.getComissao());
       System.out.println("Salario corrigido: R$ " + vendTeste.calcularSalario());
       System.out.println();
    };
}
