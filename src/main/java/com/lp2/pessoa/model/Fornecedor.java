package com.lp2.pessoa.model;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {};

    // construtor herdando endereco da classe mae
    public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
        super(nome, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    };

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    };

    public double getValorCredito() {
        return valorCredito;
    };

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    };

    public double getValorDivida() {
        return valorDivida;
    };

    public double obterSaldo(Fornecedor fornecedor) {
        double x, y, saldo;
        x = fornecedor.getValorCredito();
        y = fornecedor.getValorDivida();
        saldo = x - y;
        return saldo;
        // ou, ja que o metodo pertence a ropria instancia, simplesmente:
        // return valorCredito - valorDivida;
    };
}
