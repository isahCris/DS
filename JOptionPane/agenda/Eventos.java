package agenda;
import javax.swing.JOptionPane;
public class Eventos extends Dados {

	Eventos(String dia, String email, String nome, String desc, String horario, String telefone) {
		super(dia, email, nome, desc, horario, telefone);
		
		this.setDia(dia);
		this.setNome(nome);
		this.setDesc(desc);
		this.setHorario(horario);
		
	}
		
		public void CadastrarA() {
			dia =  JOptionPane.showInputDialog("informe a data");
			nome = JOptionPane.showInputDialog("Titulo do evento:");
			desc = JOptionPane.showInputDialog("Descricao do evento:");
			horario = JOptionPane.showInputDialog("Digite o horario do evento:");
		}
		
		
		@Override
		public void ExibirA() {
			JOptionPane.showMessageDialog(null , "Descricao: " + desc, "Titulo: " + nome, 0);
			JOptionPane.showMessageDialog(null , "Horario: " + horario, "Data: " + dia,  0);
			
		}
		
		

	
	
	
}


