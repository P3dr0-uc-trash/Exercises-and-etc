package br.com.celsius.membrosDaClasse;

public class areaCirculo10 {
   public static void main(String[]args) {
        areaCirculo ac = new areaCirculo();
        ac.raio = 5;

        double res = Math.PI * (Math.pow(ac.raio,2));
       System.out.printf("%.2f", res);
    }
}
