package guia;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Produto extends JDialog{
	private static final long serialVersionUID = 1L;
	
	JLabel lbTitulo;
	JLabel lbProduto;
	JLabel lbValor;
	JLabel lbIdCategoria;
	JLabel lbDesc;
	JLabel lbQtd;
	JButton btSalvar;
	JTextField txtProduto;
	JTextField txtValor;
	JTextField txtIdCategoria;
	JTextField txtDesc;
	JTextField txtQtd;
	
	public Produto () {
		this.setTitle("Gerenciador");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setModal(true);

		
		lbTitulo = new JLabel();
		lbTitulo.setBounds(250,10,400,75);
		lbTitulo.setForeground(new Color(8, 8, 8));
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		lbTitulo.setText("Cadastrar Produtos  ");
		add(lbTitulo);
		
		
		lbProduto = new JLabel();
		lbProduto.setBounds(20,140,200,30);
		lbProduto.setForeground(new Color(8, 8, 8));
		lbProduto.setFont(new Font("Arial", Font.BOLD, 16));
		lbProduto.setText("Produto: ");
		add(lbProduto);
		
		txtProduto = new JTextField ();
		txtProduto.setBounds(120,140,180,30);
		add(txtProduto);
		
		lbValor = new JLabel();
		lbValor.setBounds(20,200,200,30);
		lbValor.setForeground(new Color(8, 8, 8));
		lbValor.setFont(new Font("Arial", Font.BOLD, 16));
		lbValor.setText("Valor: ");
		add(lbValor);
		
		txtValor = new JTextField ();
		txtValor.setBounds(120,200,180,30);
		add(txtValor);
		
		
		lbIdCategoria = new JLabel();
		lbIdCategoria.setBounds(20,260,200,30);
		lbIdCategoria.setForeground(new Color(8, 8, 8));
		lbIdCategoria.setFont(new Font("Arial", Font.BOLD, 16));
		lbIdCategoria.setText("Id Categoria: ");
		add(lbIdCategoria);
		
		txtIdCategoria = new JTextField ();
		txtIdCategoria.setBounds(120,260,180,30);
		add(txtIdCategoria);
		
		
		lbDesc = new JLabel();
		lbDesc.setBounds(20,320,200,30);
		lbDesc.setForeground(new Color(8, 8, 8));
		lbDesc.setFont(new Font("Arial", Font.BOLD, 16));
		lbDesc.setText("Descrição: ");
		add(lbDesc);
		
		txtDesc = new JTextField ();
		txtDesc.setBounds(120,320,180,30);
		add(txtDesc);
		
		lbQtd = new JLabel();
		lbQtd.setBounds(20,380,200,30);
		lbQtd.setForeground(new Color(8, 8, 8));
		lbQtd.setFont(new Font("Arial", Font.BOLD, 16));
		lbQtd.setText("Quantidade: ");
		add(lbQtd);
		
		txtQtd = new JTextField ();
		txtQtd.setBounds(120,380,180,30);
		add(txtQtd);
		
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
				String nome, valor, id,desc,quantidade;
				nome = txtProduto.getText();
				valor = txtValor.getText();
				id = txtIdCategoria.getText();
				desc = txtDesc.getText();
				quantidade = txtQtd.getText();
				
				JOptionPane.showMessageDialog(null, "Nome do produto: "+nome + "\n Valor:  "
						+valor+"\n Id:  "+ id +"\n Descrição:  "+ desc 
						+"\n Quantidade:  "+ quantidade);
				
				
			}
			
		});
		
		this.setLayout(null);
		this.setVisible(true);
	}
	

}
