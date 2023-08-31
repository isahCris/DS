package agenda;

import javax.swing.JOptionPane;

public class Profissional extends Dados{

	Profissional(String dia, String email, String nome, String desc, String horario, String telefone) {
		super(dia, email, nome, desc, horario, telefone);
		
		this.setDia(dia);
		this.setNome(nome);
		this.setDesc(desc);
		this.setHorario(horario);
		
	}
	
	public void CadastrarP() {
		dia =  JOptionPane.showInputDialog("informe a data");
		nome = JOptionPane.showInputDialog("Titulo:");
		desc = JOptionPane.showInputDialog("Descricao:");
		horario = JOptionPane.showInputDialog("Digite o horario:");
		
	}
	
	@Override
	public void ExibirP() {
		JOptionPane.showMessageDialog(null , "Descricao: " + desc, "Titulo: " + nome, 0);
		JOptionPane.showMessageDialog(null,  "Horario: " + horario, "Data: " + dia,  0);
		
	}

}
