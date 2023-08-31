package salario;
import java.util.Scanner;
public class Metodo {

	public double salario;
	public double porcentagem;
	
	public void ler () {
		try (Scanner in = new Scanner (System.in)) {
			salario = in.nextDouble();
		}	
	}
	
		public void Calcular () {
			if (salario<3000) {
			porcentagem = (salario/100)*10;
			salario = porcentagem + salario;
			System.out.println("seu salario eh:"+ salario);
			
			} else {
				porcentagem = (salario/100)*20;
				salario = porcentagem + salario;
				System.out.println("seu salario eh:"+ salario);
			}
		}
		
	
}
