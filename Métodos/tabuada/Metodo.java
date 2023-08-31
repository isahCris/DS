package tabuada;
import java.util.Scanner;
public class Metodo {

	public int i;
	public int j;
	
	
	public void tab () {
		try (Scanner in = new Scanner (System.in)) {
			i= in.nextInt();
		}
		for ( int  j = 1 ; j <= 10 ; j ++) {
			System.out.println ( i + " X " + j + " = " + ( i * j ));
			
		}
		}
	}


