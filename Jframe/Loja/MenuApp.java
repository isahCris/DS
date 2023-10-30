package carros;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuApp extends JFrame {

	private JogoVelha jogo;
	
	public MenuApp() {
		
		Color cor = new Color(115, 93, 65);
		Color cb = new Color(191, 163, 128);
		
		this.setTitle("Or�amento");
		this.setSize(800,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(cor);
		
	
		 this.setResizable(true);
		
		JMenu mn = new JMenu ("Menu");
		JMenu gm = new JMenu ("Gamer");
		JMenu orcm = new JMenu("Orcamento");
		JMenu cal = new JMenu ("Calculadora");
		
		JMenuItem sair = new JMenuItem ("Sair");
		JMenuItem jogo = new JMenuItem ("Jogo");
		JMenuItem or = new JMenuItem("Orcamento");
		JMenuItem cl = new JMenuItem("Calcular");
		
		orcm.add(or);
		cal.add(cl);
		mn.add(sair);
		gm.add(jogo);

		
		JMenuBar bar = new JMenuBar();
		bar.setBackground(cb);
		
		setJMenuBar(bar);
		
		bar.add(mn);
		bar.add(orcm);
		bar.add(cal);
		bar.add(gm);
		
		sair.addActionListener(
				new ActionListener() {

					public void actionPerformed(ActionEvent event) {
						System.exit(0);						
					}

					
				}
		);
		
		or.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Metodo fo = new Metodo();
						
						fo.setVisible(true);
					}

					
				}
		);
		
		cl.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Calculadora cal = new Calculadora();
						
						cal.setVisible(true);
					}

					
				}
		);
	

		jogo.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						JogoVelha gm = new JogoVelha ();
						gm.setVisible(true);
					}
				}
			);
		this.setVisible(true);

	}
}
