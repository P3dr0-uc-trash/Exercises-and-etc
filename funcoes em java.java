package br.com.aula01pedro;

public class SegundoProjeto {

	public static void main(String[] args) {
		String s = "Bom dia!";
		
		System.out.println("Olá tudo bem?");
		System.out.println(s);
		System.out.println(s + "!!");
		System.out.println(s.concat("!"));
		s = s.toLowerCase();
		System.out.println(s);
		System.out.println(s.startsWith("bom"));
		System.out.println(s.endsWith("dia!"));
		System.out.println(s.length());
		System.out.println(s.equals("Bom dia!"));
		System.out.println(s.equalsIgnoreCase("Bom dia!"));
		
		var nome = "pedro";
		System.out.println(nome.toUpperCase());
	}

}
