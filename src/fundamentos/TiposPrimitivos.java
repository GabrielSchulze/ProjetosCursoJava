package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário utilizando os tipos
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 244;
		int id = 53265;
		long pontosAcumulados = 3_234_845_323L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//Tipo caractere: Aceita um único caractere
		char status = 'A';
		
		//Utilizando as variáveis criadas
		//Calcular os dias de empresa do funcinário
		System.out.println(anosDeEmpresa * 365);
		
		//Número de dias de viagem
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha => " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
	
	
	
}
