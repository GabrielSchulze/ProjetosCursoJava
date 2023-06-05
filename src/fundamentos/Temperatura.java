package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//Fórmula para conversão de Fº em Cº: (Fº - 32) x 5/9 = Cº
		double F = 37;
		double C = (F - 32) * 5.0/9.0;
		System.out.println(C + " Cº");
	}
}
