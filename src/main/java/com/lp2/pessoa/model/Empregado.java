package com.lp2.pessoa.model;

public abstract class Empregado extends Pessoa {
    private int codSetor;
    private double salarioBase;
    private double imposto;

    // construtor vazio para coneguir instanciar subclasses sem parametros
    public Empregado() {};

    public Empregado(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codSetor = codSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public void setCodSetor (int codSetor) {
        this.codSetor = codSetor;
    };

    public int getCodSetor () {
        return codSetor;
    };

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    };

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    };

    public double getImposto() {
        return imposto;
    }

    public double calcularSalario (){
        double imposto1 = 1 - imposto;
        double salario = salarioBase * imposto1; 
        return salario;
    }
}
