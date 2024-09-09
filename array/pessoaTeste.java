package br.com.celsius.array;
import java.util.ArrayList;
public class pessoaTeste {
    public static void main(String[] args) {
         ArrayList<pessoa> pessoas = new ArrayList<>();

         pessoa p1 = new pessoa();
         p1.nome = "Pedro";
         p1.idade = 18;

        pessoa p2 = new pessoa();
        p1.nome = "Rute";
        p1.idade = 19;

        pessoas.add(p1);
        pessoas.add(p2);
        System.out.println(pessoas.stream().count());

        for (pessoa p : pessoas){
            System.out.println(p);
        }
    }
}
