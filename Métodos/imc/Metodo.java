package imc;
import java.util.Scanner;
public class Metodo {

	public double altura;
	public double peso;
	public double imc;
	public String grau;
	
	public void ler () {
		try (Scanner in = new Scanner (System.in)) {
			peso = in.nextDouble();
			altura = in.nextDouble();
	
		}
	}

	
	public void calcular () {
		imc = peso/(altura*altura);
		if (imc <=18.5) {
			grau = "excesso de magreza";
		} else if (imc<25) {
			grau = "Peso normal";
			} else if (imc <30) {
				grau = "Excesso de peso! cuidado";
				} else if (imc <35) {
					grau = "Obesidade grau I";
					} else if (imc<40) {
						grau = "Obesidade grau II";
							} else if (imc>40) {
								grau = "Obesidade grau III";
							}
		
				}
	}