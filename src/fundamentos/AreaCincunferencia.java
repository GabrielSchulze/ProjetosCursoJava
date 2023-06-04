package fundamentos;

/**
 * Calcula e imprime o valor final da área de circunferência.
 */
public class AreaCincunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14159;
        double area = pi * raio * raio;

        System.out.println("Área  = " + area + " m2.");

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Área  = " + area +  " m2.");
    }
}