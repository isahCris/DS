package guia;

import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;

public MenuPrincipal() {
	this.setSize(800, 600);
	this.setDefaultCloseOperation(MenuPrincipal.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setExtendedState(MAXIMIZED_BOTH);
	
	JMenu arq = new JMenu("Arquivo");
	JMenu cads = new JMenu("Cadastrar");
	JMenu ver = new JMenu("Vizualizar");
	JMenu aju = new JMenu("Ajuda");
	
	JMenuItem sair = new JMenuItem("Sair");
	JMenuItem produto = new JMenuItem("Produto");
	JMenuItem cadastro = new JMenuItem("Categoria");
	JMenuItem pd2 = new JMenuItem("Produto");
	JMenuItem vizu = new JMenuItem ("Categorias");
	JMenuItem sobre = new JMenuItem ("Sobre");
	
	arq.add(sair);
	cads.add(cadastro);
	cads.add(produto);
	ver.add(vizu);
	ver.add(pd2);
	aju.add(sobre);
	
	JMenuBar bar = new JMenuBar();
	setJMenuBar(bar);
	bar.add(arq);
	bar.add(cads);
	bar.add(ver);
	bar.add(aju);
	
	sair.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}
	
);
	cadastro.addActionListener(
   	         new ActionListener(){
   	             public void actionPerformed(ActionEvent event){
   	            	Gerenciamento otp = new Gerenciamento();
   	            	 otp.setVisible(true);
   	             }
   	         }
   	       );
	
	produto.addActionListener(
  	         new ActionListener(){
  	             public void actionPerformed(ActionEvent event){
  	            	Produto pto = new Produto();
  	            	 pto.setVisible(true);
  	             }
  	         }
  	       );
	
	sobre.addActionListener(
 	         new ActionListener(){
 	             public void actionPerformed(ActionEvent event){
 	            	Ajuda aju = new Ajuda();
 	            	aju.setVisible(true);
 	             }
 	         }
 	       );
	
	this.setVisible(true);
	
}

}

