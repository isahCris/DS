package imc;

public class App {

	public static void main(String[] args) {
		
		Metodo imc = new Metodo ();
		
		System.out.println("Digite seu peso e altura:");
		
		imc.ler();
		
		imc.calcular();
		
	}

}
