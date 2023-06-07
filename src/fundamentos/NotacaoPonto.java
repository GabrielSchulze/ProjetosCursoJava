package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X";
		
		//Seta todas as letras em maiúsculo
		s = s.toUpperCase();		
		System.out.println(s);
		
		//Substitui todo 'X' por 'Senhora'
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		//Concatena
		s = s.concat("!!");
		System.out.println(s);
	}
}
