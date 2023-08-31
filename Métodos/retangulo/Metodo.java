package retangulo;

import java.util.Scanner;

public class Metodo {

	
	static double A;
	static double B;
	static double H;
	static double P;
		
	
		public static void ler() {
			try (Scanner in = new Scanner(System.in)) {
				System.out.println("Digite o valor da base:");
				B = in.nextDouble();
				System.out.println("Digite o valor da Altura:");
				H = in.nextDouble();
			}
		
		}
		public static void calcular() {
		
			A = B*H;
			P = 2*(B+H);
			System.out.println("o valor da area eh: " +  A);
			System.out.println("o valor do perimetro eh " +  P);
		}


}