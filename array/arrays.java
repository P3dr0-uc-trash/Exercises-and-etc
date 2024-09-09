package br.com.celsius.array;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.5;
        notas[2] = 8.5;
        notas[3] = 9.5;
//todo array em java é um objeto
        System.out.println("Imprimindo um a um");
        System.out.println(notas[0] = 7.5);
        System.out.println(notas[1] = 8.5);
        System.out.println(notas[2] = 8.5);
        System.out.println(notas[3] = 9.5);

        System.out.println("FOR");
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        System.out.println("FOR EACH");
        for (double n : notas){
            System.out.println(n);
        }
        System.out.println("usando a class arrays");
        String nts = java.util.Arrays.toString(notas);
        System.out.println(nts);
    }
}
