package com.lp2.pessoa.model;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {};

    public Vendedor(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super (nome, endereco, telefone, codSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    };

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    };

    @Override
    public double calcularSalario (){
        double imposto1 = 1 - imposto;
        double salario = salarioBase * imposto1 + getComissao() * getValorVendas();
        return salario;
    }
}
