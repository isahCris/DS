package calculadora;
import java.util.Scanner;
public class Metodo {

	Scanner in = new Scanner (System.in);
	double N1, N2, Resultado;
	String E;
	int op;
	
	public void ler() {
		System.out.println("Digite o primeiro numero");
		N1 = in.nextDouble();
		System.out.println("Digite o segundo numero:");
		N2 = in.nextDouble();
	}
	
	public void operacao() {
		op = in.nextInt();
	}
	
	public double soma() {
		Resultado = N1+N2;
		
		return Resultado;
	}
	public double sub() {
		Resultado = N1-N2;
		
		return Resultado;
	}
	public double mult() {
		Resultado = N1*N2;
		
		return Resultado;
	}
	public double div() {
		Resultado = N1/N2;
		
		return Resultado;
	}
	public void escolha() {
		E = in.next();
		
	}
	
}
