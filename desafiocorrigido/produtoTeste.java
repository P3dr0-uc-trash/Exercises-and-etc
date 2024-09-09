package br.com.celsius.desafiocorrigido;

public class produtoTeste {
    public static void main(String[] rgs){
        produto p1 = new produto();
        p1.nome = "arroz";
        p1.preco = 26.5;

        System.out.println("produto: " + p1.nome + " Preço: " + p1.preco);

        produto p2 = new produto("feijão", 16.5);
        System.out.println("Produto 2: " + p2.nome + " preço: " + p2.preco);
    }
}
