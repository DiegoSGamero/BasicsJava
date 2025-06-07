package com.lp2.pessoa;

import com.lp2.pessoa.teste.AdmTeste;
import com.lp2.pessoa.teste.FornecedorTeste;
import com.lp2.pessoa.teste.OperarioTeste;
import com.lp2.pessoa.teste.VendedorTeste;

public class Main
{
    public static void main( String[] args ) { 
        System.out.println("Iniciando testes...\n");
        FornecedorTeste.testarFornecedor(args);
        AdmTeste.testarAdm(args);
        OperarioTeste.testarOperario();
        VendedorTeste.TestarVendedor();
        // EmpregadoTeste.testarEmpregado(args);
        System.out.println("\nTestes finalizados.");
    }
}
