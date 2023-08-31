package agenda;

import javax.swing.JOptionPane;

public class Pessoal extends Dados{

	Pessoal(String dia, String email, String nome, String desc, String horario, String telefone) {
		super(dia,email, nome, desc, horario, telefone);
		
		
		this.setDia(dia);
		this.setNome(nome);
		this.setDesc(desc);
		this.setHorario(horario);
		
	}
	
	public void CadastrarPE() {
		dia =  JOptionPane.showInputDialog("informe a data");
		nome = JOptionPane.showInputDialog("Titulo:");
		desc = JOptionPane.showInputDialog("Descricao:");
		horario = JOptionPane.showInputDialog("Digite o horario:");
		
	}
	
	@Override
	public void ExibirPE() {
		JOptionPane.showMessageDialog(null , "Descricao: " + desc, "Titulo: " + nome, 0);
		JOptionPane.showMessageDialog(null , "Horario: " + horario, "data: " + dia, 0);
		
	}


}
