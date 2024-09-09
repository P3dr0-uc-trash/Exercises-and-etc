package br.com.celsius.array;
import java.util.Scanner;
public class notas {

    public static void main(String[] args) {
        System.out.println("Quantas notas ce vai querer??");
        Scanner leia = new Scanner(System.in);
        int quant = leia.nextInt();
        double notas[] = new double[quant];

        for (int i = 0; i < quant; i++ ){
            System.out.println("Me de o " + quant + "º valor");
            double notas[i] = leia.nextDouble();
        }

    }
}
