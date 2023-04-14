package revisão;
import java. util.Scanner;
public class Inverso {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	int N, R = 0, I=0;
	System.out.println("Digite o numero:");
	N = in.nextInt();
	
	while(N !=0) {
		R = N % 10;
		N = N/10;
		I=I*10+R;
		
	}	
	System.out.println("o inverso do numero eh:"+ I);
	}

}
