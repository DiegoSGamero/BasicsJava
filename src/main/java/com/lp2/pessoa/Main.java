package com.lp2.pessoa;

import com.lp2.pessoa.teste.FornecedorTeste;

public class Main 
{
    public static void main( String[] args ) { 
        System.out.println("Iniciando teste de Fornecedor...\n");
        FornecedorTeste.testarFornecedor(args);
        // EmpregadoTeste.testarEmpregado(args);
        System.out.println("\nTeste finalizado.");
    }
}
