package com.lp2.pessoa.teste;

import com.lp2.pessoa.model.Operario;

public class OperarioTeste {

    public static void testarOperario(){

        Operario operarioTeste = new Operario();

        operarioTeste.setNome("Nemo");
        operarioTeste.setEndereco("Av. P Sherman, 42");
        operarioTeste.setTelefone("(11) 4002-8922");
        operarioTeste.setCodSetor(2);
        operarioTeste.setSalarioBase(10000.00);
        operarioTeste.setImposto(0.02);
        operarioTeste.setValorProducao(100);
        operarioTeste.setComissao(0.08);

       System.out.println("--- Operario ---");
       System.out.println("Nome: " + operarioTeste.getNome());
       System.out.println("Endereço: " + operarioTeste.getEndereco());
       System.out.println("Telefone: " + operarioTeste.getTelefone());
       System.out.println("Setor: R$ " + operarioTeste.getCodSetor());
       System.out.println("SalarioBase: R$ " + operarioTeste.getSalarioBase());
       System.out.println("Imposto: R$ " + operarioTeste.getImposto());
       System.out.println("Produção: R$ " + operarioTeste.getValorProducao());
       System.out.println("Comissão: R$ " + operarioTeste.getComissao());
       System.out.println("Salario corrigido: R$ " + operarioTeste.calcularSalario());
       System.out.println();
    };
}
