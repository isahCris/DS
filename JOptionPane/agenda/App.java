package agenda;

import javax.swing.JOptionPane;

public class App  {

	public static void main(String[] args) {
		String decisao = "s";
		
		do {
			Object[] options = {"Eventos", "Contato", "Ev. Pessoal", "Ev. Profissional", "Sair",};
			int option = JOptionPane.showInternalOptionDialog(null, "O que deseja marcar?", null, 0, 0, null, options, options[0]);
				if (option == 0) {
					Eventos ev = new Eventos(null, null, null, null, null, null); 
					
					ev.CadastrarA();
					ev.ExibirA();
					
				} else if (option == 1) {
					
					Contato ctt = new Contato(null, null, null, null, null, null);
					ctt.CadastrarA("nome" ,"telefone", "email");
					ctt.ExibirC();
				} else if (option == 2) {
					
					Pessoal pe = new Pessoal(null, null, null, null, null, null);
					pe.CadastrarPE();
					pe.ExibirPE();
				} else if (option == 3) {
					
					Profissional pr = new Profissional(null, null, null, null, null, null);
					pr.CadastrarP();
					pr.ExibirP();
				} else if (option == 4) {
					System.exit(0);
				}
				
				 decisao = JOptionPane.showInputDialog("Deseja continuar? [sim/nao]");
			} while(decisao.equalsIgnoreCase("sim"));
		} 
	}
			

		
	


