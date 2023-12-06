package bd;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import com.mysql.jdbc.Statement;

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
	JTextField txtidCategoria;
	JComboBox cbidCategoria;
	JTextField txtDesc;
	JTextField txtQtd;
	int idCategoria ;
	String idCatgria;
	
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
		lbIdCategoria.setText("Categoria: ");
		add(lbIdCategoria);
		
		cbidCategoria = new JComboBox<>();
		cbidCategoria.setBounds(120,260,150,30);
		cbidCategoria.setBackground(Color.WHITE);
		cbidCategoria.setForeground(Color.black);
		add(cbidCategoria);
		
		
		//idCtaegoria
		Statement state;

		ResultSet resultset;

		
		Conexao conex = new Conexao();     

		String sql = "select categoria from tbcategoria order by categoria";	
		

		conex.conectar();      

		cbidCategoria.addItem("Categoria");
		
		try {
			
			state = (Statement) Conexao.con.createStatement();
			
			resultset = state.executeQuery(sql);

			while(resultset.next()) {
				
				cbidCategoria.addItem(resultset.getString(1));


			}
			
			
			
		}catch(SQLException erro){
			
			System.out.println("Nao foi possivel  realizar a consulta");
		}
		
		conex.desconectar();
		
		
		lbDesc = new JLabel();
		lbDesc.setBounds(20,320,200,30);
		lbDesc.setForeground(new Color(8, 8, 8));
		lbDesc.setFont(new Font("Arial", Font.BOLD, 16));
		lbDesc.setText("Descricao: ");
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
		
		// acao do idcategoria
		cbidCategoria.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						idCatgria= (String) cbidCategoria.getSelectedItem();

						
						Statement state;

						ResultSet resultset;
						
						Conexao con = new Conexao();     

						String sql = "select idCategoria from tbcategoria where categoria = '"+idCatgria+"' ";	

						con.conectar();      

						
						try {
							
							state = (Statement) Conexao.con.createStatement();
							
							resultset = state.executeQuery(sql);

							if(resultset.next()) {
								
							String	categoria = (resultset.getString("idCategoria"));

								 idCategoria = Integer.parseInt(categoria);
								System.out.println(idCategoria);
							}else {
								System.out.println("categoria nao exixte no banco");
							}
							
						}catch(SQLException erro){
							
							System.out.println("Nao foi possivel  realizar a consulta");
						}
						
						con.desconectar();

						

					}

					
				}
		);
		
		btSalvar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Statement state;

						ResultSet resultset;
						
						Conexao con = new Conexao();     
					//	
						String sql = "insert into tbproduto values(null,'"+txtProduto.getText()+"','"+idCategoria+"','"+txtValor.getText()+"','"+txtDesc.getText()+"','"+txtQtd.getText()+"')";	

						con.conectar();      

						try {
							
							
							state = (Statement) Conexao.con.createStatement();
							
							state.executeUpdate(sql);

							JOptionPane.showMessageDialog(null, "Produto cadastrado!");

							
							
						}catch(SQLException erro){
							
							System.out.println("Nao foi possivel  realizar a consulta");
						}
						
						con.desconectar();

						reset();
					}

					
				}
		);		
		this.setLayout(null);				

		}
		
		public void reset() {
			
			
			txtProduto.setText("");
			txtValor.setText("");
			txtDesc.setText("");									
			txtQtd.setText("");
			
				
			
			
	
		
		this.setLayout(null);
		this.setVisible(true);
	}
	

}