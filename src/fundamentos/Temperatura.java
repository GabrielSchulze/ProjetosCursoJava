package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//Fórmula para conversão de Fº em Cº: (Fº - 32) x 5/9 = Cº
		double F = 100;
		final double ajuste = 32;
		final double param = 5.0/9.0;
		double C = (F - ajuste) * param;
		System.out.println(C + "ºC");
	}
}