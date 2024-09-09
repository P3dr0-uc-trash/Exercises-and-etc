package br.com.aula01pedro;

public class SegundoProjeto {

	public static void main(String[] args) {
		String s = "Bom dia!";  //define a variável s como script e da a ela o valor Bom dia!
		
		System.out.println("Olá tudo bem?");  //pronta a frase
		System.out.println(s); //printa a variável s
		System.out.println(s + "!!"); //printa o s é concatena com !!
		System.out.println(s.concat("!")); //printa e concatenar com !
		s = s.toLowerCase(); //define s como caixa baixa
		System.out.println(s); //printa s
		System.out.println(s.startsWith("bom")); //retorna true se começar com bom exatamente 
		System.out.println(s.endsWith("dia!")); //retorna true se terminar com dia! exatamente 
		System.out.println(s.length()); //retorna o comprimento 
		System.out.println(s.equals("Bom dia!")); //retorna true se for exatamente igual
		System.out.println(s.equalsIgnoreCase("Bom dia!")); //retorna true se for a mesma frase, independente da caixa
		
		var nome = "pedro";//define a variável nome e atribui a ela o valor pedro
		System.out.println(nome.toUpperCase()); //printa a variável nome em caixa alta
	}

}
