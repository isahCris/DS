package agenda;

import javax.swing.JOptionPane;

public class Contato extends Dados {

	Contato(String dia, String email, String nome, String desc, String horario, String telefone) {
		super(dia, email, nome, desc, horario, telefone);
		
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		
	}
	
	public void CadastrarA(String nome, String telefone, String email) {
		this.nome = JOptionPane.showInputDialog("Nome do contato:");
		this.telefone = JOptionPane.showInputDialog("Numero do Telefone:");
		this.email = JOptionPane.showInputDialog("E-mail:");
		
	}
	
	@Override
	public void ExibirC() {
		JOptionPane.showMessageDialog(null , "Numero de Telefone: " + telefone,  "Nome " + nome, 0);
		JOptionPane.showMessageDialog(null, "E-mail: "+ email );
		
		
	}

}
