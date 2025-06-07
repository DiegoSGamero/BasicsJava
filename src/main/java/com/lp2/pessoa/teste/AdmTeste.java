package com.lp2.pessoa.teste;

import com.lp2.pessoa.model.Adm;

public class AdmTeste {

    public static void testarAdm(String[] args) {
        Adm adm = new Adm();
        adm.setNome("Albert");
        adm.setEndereco("Av. Paulista, 1000");
        adm.setTelefone("(11) 4002-8922");
        adm.setCodSetor(2);
        adm.setSalarioBase(5000.00);
        adm.setImposto(0.02);
        adm.setAjudaDeCusto(250);

       System.out.println("--- ADM ---");
       System.out.println("Nome: " + adm.getNome());
       System.out.println("Endereço: " + adm.getEndereco());
       System.out.println("Telefone: " + adm.getTelefone());
       System.out.println("Setor: R$ " + adm.getCodSetor());
       System.out.println("SalarioBase: R$ " + adm.getSalarioBase());
       System.out.println("Imposto: R$ " + adm.getImposto());
       System.out.println("Ajuda: R$ " + adm.getAjudaDeCusto());
       System.out.println("Salario corrigido: R$ " + adm.calcularSalario());
       System.out.println();
    }
}
