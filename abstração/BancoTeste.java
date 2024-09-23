package br.com.celsius.abstração;

import java.util.Scanner;

public class BancoTeste {
    public static void main(String[] args) {
        ContaBancaria eu = new ContaBancaria();
        eu.setTitular("Pedro Henrique");
        eu.setNumConta(2156924);

        System.out.println("Bem vindo a seu banco, selecione a opção desejada: ( 1 para saque, 2 para depósito)");
        Scanner a = new Scanner(System.in);
        int opcao = a.nextInt();
        if (opcao == 1) {
            System.out.println("Ótimo, agora digite o valor desejado a sacar: ");
            double valor = a.nextDouble();
            eu.sacar(valor);
        } else {
            System.out.println("Ótimo, agora digite o valor que vai depositar: ");
            double valor = a.nextDouble();
            eu.deposito(valor);


            System.out.println(eu.getSaldo());
        }
    }
}
