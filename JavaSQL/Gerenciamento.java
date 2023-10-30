package guia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gerenciamento extends JDialog {
	private static final long serialVersionUID = 1L;
	
	JLabel lbTitulo;
	JButton btSalvar;
	JLabel lbCategoria;
	JTextField txtCategoria;
	
	public Gerenciamento() {
		this.setTitle("Gerenciador");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setModal(true);
		
		lbTitulo = new JLabel();
		lbTitulo.setBounds(250,10,400,75);
		lbTitulo.setForeground(new Color(8, 8, 8));
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		lbTitulo.setText("Cadastrar Categorias");
		add(lbTitulo);
		
		lbCategoria = new JLabel();
		lbCategoria.setBounds(20,140,200,30);
		lbCategoria.setForeground(new Color(8, 8, 8));
		lbCategoria.setFont(new Font("Arial", Font.BOLD, 16));
		lbCategoria.setText("Categoria: ");
		add(lbCategoria);
		
		
		txtCategoria = new JTextField ();
		txtCategoria.setBounds(120,140,180,30);
		add(txtCategoria);
		
		btSalvar = new JButton();
		btSalvar.setBounds(20,500,90,40);
		btSalvar.setText("Salvar");
		btSalvar.setFont(new Font("Arial", Font.BOLD, 16));
		btSalvar.setBackground(new Color(54, 95, 115));
		btSalvar.setForeground(new Color(8, 8, 8));
		add(btSalvar);
		
		
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome;
				nome = txtCategoria.getText();
				
				JOptionPane.showMessageDialog(null, "Categoria "+nome+ " cadastrada!!" );
			}
			
			
		});
		this.setLayout(null);
		this.setVisible(true);
	}

}
