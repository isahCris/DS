package nomes;
import java.util.*;
public class Metodo {
	public static void Nome(){
		try (Scanner in = new Scanner (System.in)) {
			final int TAM= 5; 
			String nome[];
			int idade[];
			idade = new int [TAM];
			nome = new String [TAM];
			
		for (int i = 0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "°. nome:");
			nome[i]= in.nextLine();
		}
			for(int i = 0; i<TAM; i++) {
			System.out.println("Digite a idade de " +nome[i]+ ":");
			idade[i] = in.nextInt();
			}
			for(int i = 0; i<TAM; i++) {
			System.out.println("O "+(i+1)+ "°. nome digitado: " +nome[i]);
			System.out.println("A idade de "+nome[i]+ ": " +idade[i]+ "\n");
			}
		}
	}
}