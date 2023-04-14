package revisão;
import java. util.Scanner;
public class Inss {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int HA;
		double AD, S;
		
		AD = in.nextDouble();
		HA = in.nextInt();
		S = in.nextDouble();
		if(S<1212.00) {
			S = S-((S/100)*7.5);
		} else if(S<2427.35) {
			S = S-((S/100)*9);
		}else if(S<3641.03);
			

	}

}
