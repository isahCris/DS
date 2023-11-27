package bd;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import com.mysql.jdbc.Statement;

public class Gerenciamento extends JDialog {
	private static final long serialVersionUID = 1L;
	
	JLabel lbTitulo;
	JButton btSalvar;
	JButton btPesquisar;
	JButton btAlter;
	JButton btRemove;
	JLabel lbCategoria;
	JTextField txtCategoria;
	JComboBox cbCategoria;
	
	int idCategoria=0;
	String categoria=null;
	String txtAlter = null;
	
	public Gerenciamento() {
		this.setTitle("Gerenciador");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setModal(true);
		
		btPesquisar = new JButton ();
		btPesquisar.setBounds(180,200,100,30);
		btPesquisar.setText("+");
		btPesquisar.setBackground(Color.WHITE);
		btPesquisar.setForeground(Color.black);
		btPesquisar.setFont(new Font("Arial", Font.BOLD,30));
		add(btPesquisar);
		
		lbTitulo = new JLabel();
		lbTitulo.setBounds(250,10,400,75);
		lbTitulo.setForeground(new Color(8, 8, 8));
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		lbTitulo.setText("Cadastrar Categorias");
		add(lbTitulo);
		
		lbCategoria = new JLabel();
		lbCategoria.setBounds(20,120,200,30);
		lbCategoria.setForeground(new Color(8, 8, 8));
		lbCategoria.setFont(new Font("Arial", Font.BOLD, 16));
		lbCategoria.setText("Categoria: ");
		add(lbCategoria);
		
		
		cbCategoria = new JComboBox<>();
		cbCategoria.setBounds(20,200,150,30);
		cbCategoria.setBackground(Color.WHITE);
		cbCategoria.setForeground(Color.black);
		add(cbCategoria);
		
		btSalvar = new JButton();
		btSalvar.setBounds(20,300,90,40);
		btSalvar.setText("Salvar");
		btSalvar.setFont(new Font("Arial", Font.BOLD, 16));
		btSalvar.setBackground(new Color(54, 95, 115));
		btSalvar.setForeground(new Color(8, 8, 8));
		add(btSalvar);
		
		
		
		Statement state;

		ResultSet resultset;
		
		Conexao con = new Conexao();     

		String sql = "select categoria from tbcategoria order by categoria";	

		con.conectar();      

		cbCategoria.addItem("Categoria");
		
		try {
			
			state = (Statement) Conexao.con.createStatement();
			
			resultset = state.executeQuery(sql);

			while(resultset.next()) {
				
				cbCategoria.addItem(resultset.getString(1));

			}
			
		}catch(SQLException erro){
			
			System.out.println("Nao foi possivel  realizar a consulta");
		}
		
		con.desconectar();

	
		

		txtCategoria = new JTextField();
	
		txtCategoria.setBounds(20,200,150,30);
		txtCategoria.setBackground(Color.WHITE);
		txtCategoria.setForeground(Color.black);
		txtCategoria.setVisible(false);
		add(txtCategoria);


		
		btAlter = new JButton ();
		btAlter.setBounds(20,250,150,25);
		btAlter.setText("Update");

		btAlter.setFont(new Font("Arial", Font.BOLD, 16));
		btAlter.setBackground(new Color(54, 95, 115));
		btAlter.setForeground(new Color(8, 8, 8));
		add(btAlter);
		btAlter.setEnabled(false);

		
		btRemove = new JButton ();
		btRemove.setBounds(200,250,100,25);
		btRemove.setText("Delete");
		btRemove.setFont(new Font("Arial", Font.BOLD, 16));
		btRemove.setBackground(new Color(54, 95, 115));
		btRemove.setForeground(new Color(8, 8, 8));
		add(btRemove);
		btRemove.setEnabled(false);

		
			btSalvar.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {

							Statement state;

							ResultSet resultset;
							
							Conexao con = new Conexao();     

							String sql = "insert into tbcategoria values(null,'"+txtCategoria.getText()+"')";	

							con.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								state.executeUpdate(sql);

								JOptionPane.showMessageDialog(null, "Categoria cadastrada!");

								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							con.desconectar();

						}

						
					}
			);
			
			cbCategoria.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
							btRemove.setEnabled(true);

							btAlter.setEnabled(true);
							
							btSalvar.setEnabled(false);

							txtAlter = (String) cbCategoria.getSelectedItem();
							
							txtCategoria.setText(txtAlter);
							
							txtCategoria.setVisible(true);
							
							cbCategoria.setVisible(false);


							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao();     

							String sql = "select idCategoria from tbcategoria where categoria = '"+txtAlter+"' ";	

							conex.conectar();      

							
							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								resultset = state.executeQuery(sql);

								if(resultset.next()) {
									
									categoria = (resultset.getString("idCategoria"));

									idCategoria = Integer.parseInt(categoria);
									
								}else {
									System.out.println("categoria nao exixte no banco");
								}
								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							con.desconectar();

							
						}
					
					});
			
			btPesquisar.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
						
							txtCategoria.setText(" ");

							txtCategoria.setVisible(true);
							cbCategoria.setVisible(false);
							
							btRemove.setEnabled(false);

							btAlter.setEnabled(false);
							
							btSalvar.setEnabled(true);

						}
					
					});
			
			btAlter.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {

							
							Statement state;

							ResultSet resultset;
							
							Conexao con = new Conexao(); 
							
							String sql = "UPDATE `tbcategoria` SET `categoria`='"+txtCategoria.getText()+"' WHERE idCategoria = '"+idCategoria+"'";	
							//update
							con.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								state.executeUpdate(sql);

								JOptionPane.showMessageDialog(null, "Categoria Alterada com sucesso!");
							//	System.out.println(idCate);

								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							con.desconectar();

						}
					
					});
			
			btRemove.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
							
							Statement state;

							ResultSet resultset;
							
							Conexao con = new Conexao();    
														
							String sql = "select COUNT(Produto) FROM `tbproduto` WHERE idCategoria = '"+idCategoria+"'";
						
							con.conectar();      

							try {
								
								
								state = (Statement) Conexao.con.createStatement();
								
								resultset = state.executeQuery(sql);

								
								if(resultset.next()) {
								
									int results = Integer.parseInt(resultset.getString(1));

									if(results==0) {
										
										String delt = "DELETE FROM `tbcategoria` WHERE idCategoria = '"+idCategoria+"' ";

										state.executeUpdate(delt);

										JOptionPane.showMessageDialog(null, "Categoria Deletada com sucesso!");
										
									}else {
									
								    	int delet = JOptionPane.showConfirmDialog(null,"Nao foi possivel excluir. A categoria atualmente esta sendo ligada ah "+resultset.getString(1)+" "
								    										+ "produtos. Excluir categoria e produtos interligados?","Delete", JOptionPane.YES_NO_CANCEL_OPTION);
	
										if(delet==0) {
											
											String deleteProd = "DELETE FROM `tbproduto` WHERE idCategoria ='"+idCategoria+"'";
											
											String delete = "DELETE FROM `tbcategoria` WHERE idCategoria = '"+idCategoria+"'";
											
											try {
												
												state = (Statement) Conexao.con.createStatement();
												
												state.executeUpdate(deleteProd);
	
												
											}catch(SQLException erro){
												
												System.out.println("Nao foi possivel  realizar a consulta 2");
											}
											
											state.executeUpdate(delete);			
	
											JOptionPane.showMessageDialog(null, "Categoria e Produto Deletado!");
										
											}
									}

									
								}
								setVisible(false);

							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							

							con.desconectar();


						}
					
					});
		this.setLayout(null);
		this.setVisible(true);
	}

}