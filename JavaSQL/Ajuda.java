package bd;
import javax.swing.*;
import java.awt.*;

public class Ajuda extends JDialog{
		private static final long serialVersionUID = 1L;

	public Ajuda() {
		
		this.setTitle("Suporte");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setModal(true);

		
		ImageIcon imagem = new ImageIcon(getClass().getResource("./adm1.png"));
		JLabel moldura = new JLabel("", imagem, JLabel.CENTER);
		moldura.setBounds(0,55,250,300);
		add(moldura);
	}
}