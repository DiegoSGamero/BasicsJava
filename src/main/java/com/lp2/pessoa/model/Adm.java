package com.lp2.pessoa.model;

public class Adm extends Empregado {
    private double ajudaDeCusto;

    public Adm() {};

    public Adm(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super (nome, endereco, telefone, codSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    };

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    };

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    };

    @Override
    public double calcularSalario (){
        double imposto1 = 1 - getImposto();
        double salario = (getSalarioBase() * imposto1) + ajudaDeCusto;
        return salario;
    }
}
