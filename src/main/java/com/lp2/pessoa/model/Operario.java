package com.lp2.pessoa.model;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario () {};

    public Operario (String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super (nome, endereco, telefone, codSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    };

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setComissao (double comissao) {
        this.comissao = comissao;
    }

    public double getComissao () {
        return comissao;
    }

    @Override
    public double calcularSalario (){
        double imposto1 = 1 - imposto;
        double salario = salarioBase * imposto1 + getComissao() * getValorProducao();
        return salario;
    }
}
