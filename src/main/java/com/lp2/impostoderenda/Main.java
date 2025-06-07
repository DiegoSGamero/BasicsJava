package com.lp2.impostoderenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean primeiraVez = true;
        while(true){

            if (primeiraVez) {
                System.out.println("Vamos calcular o imposto de renda sobre seu salário?");
                System.out.println("Para começar digite seu salário:");
            } else {
                System.out.println("Digite o salário:");
            }

            String salarioString = scanner.nextLine().trim().toLowerCase();
            double salario = Double.parseDouble(salarioString);

            if (salario <= 900.00){
                System.out.println("Imposto sobre renda: R$ 0,00 - isento");
            } else if (salario <= 1800.00) {
                System.out.println("Imposto sobre renda: R$ " + salario * 0.15);
            } else {
                System.out.println("Imposto sobre renda: R$ " + salario * 0.27);
            }
            System.out.println("Deseja fazer outro cálculo? (S/N)");
            
            
            String resp = scanner.nextLine().trim().toLowerCase();

            switch (resp) {
                case "S":
                case "s":
                    primeiraVez = false;
                    break;
                case "N":
                case "n":
                    scanner.close();
                    return;
                default:
                    System.out.println("Entrada inválida. Encerrando o programa.");
                    scanner.close();
                    return;
            }
        }

    }
}    
