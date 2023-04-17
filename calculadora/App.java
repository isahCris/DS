package calculadora;
public class App {

	public static void main(String[] args) {

		Metodo ccl = new Metodo();
		
		do {

			System.out.println("Ola!! Essa calculadora funciona por calculos de dois numeros. Qual calculo voce ira querer?");
			System.out.println(" ");
			System.out.println("1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir.");
			
			ccl.operacao();
			ccl.ler();

			if (ccl.op == 1) {
				System.out.println("O resultado eh = " + ccl.soma());
			}
			
			else if (ccl.op == 2) {
				System.out.println("O resultado eh = " + ccl.sub());
			}
			
			else if (ccl.op == 3) {
				System.out.println("O resultado eh = " + ccl.mult());
			}
			
			else if (ccl.op == 4) {
				if (ccl.N2 == 0) {
					System.out.println("Esse calculo n eh possivel!! Tente novamente (zero n pode ser divido!)");
				} else {
					System.out.println("O resultado eh = " + ccl.div());
				}
			} 
				
			
			System.out.println("Deseja continuar? S ou N?");
			ccl.escolha();
			
		}while(ccl.E.equalsIgnoreCase("S"));
		
		
	} 

}





