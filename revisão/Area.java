package revisão;
import java. util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A, B, H, P;
		
		System.out.println("Digite o valor da base:");
		B = in.nextDouble();
		System.out.println("Digite o valor da Altura:");
		H = in.nextDouble();
		A = B*H;
		P = 2*(B+H);
		System.out.println("o valor da area eh:" + A);
		System.out.println("o valor do perimetro eh" + P);
	}

}
