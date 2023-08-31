package pacote;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculadora extends JFrame{
	JLabel lbNum;
	JTextField txNum; 
	JLabel lbNum2;
	JTextField txNum2; 
	JButton btSomar;
	JButton btSubtrair;
	JButton btMult;
	JButton btDiv;
	public Calculadora () {
		
		Color cor = new Color(140, 201, 243);
		Color corB = new Color(8, 101, 194);
	    getContentPane().setBackground(cor);
	    
		this.setTitle("Calculadora");
		this.setSize(600,250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		lbNum = new JLabel();
		lbNum.setBounds(20,20,100,25);
		lbNum.setText("Numero 1: ");
		add (lbNum);
		
		txNum = new JTextField();
		txNum.setBounds(80,20,100,25);
		add(txNum);
		
		lbNum2 = new JLabel();
		lbNum2.setBounds(20,80,100,25);
		lbNum2.setText("Numero 2: ");
		add (lbNum2);
		
		txNum2 = new JTextField();
		txNum2.setBounds(80,80,100,25);
		add(txNum2);
		
		btSomar = new JButton();
		btSomar.setBounds(40,150,100,25);
		btSomar.setText("Somar");
		btSomar.setBackground(corB);
		btSomar.setForeground(Color.white);
		add(btSomar);
		
		btSubtrair = new JButton();
		btSubtrair.setBounds(176,150,100,25);
		btSubtrair.setText("Subtrair");
		btSubtrair.setBackground(corB);
		btSubtrair.setForeground(Color.white);
		add(btSubtrair);
		
		btMult = new JButton();
		btMult.setBounds(313,150,100,25);
		btMult.setText("Multiplicar");
		btMult.setBackground(corB);
		btMult.setForeground(Color.white);
		add(btMult);
		
		btDiv = new JButton();
		btDiv.setBounds(448,150,100,25);
		btDiv.setText("Dividir");
		btDiv.setBackground(corB);
		btDiv.setForeground(Color.white);
		add(btDiv);
		
		btSomar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(txNum.getText());
				
				double num2 = Double.parseDouble(txNum2.getText());
				
				JOptionPane.showMessageDialog(null, "O resultado da soma é:  " + (num1 + num2));
			}
		});
		
		btSubtrair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(txNum.getText());
				
				double num2 = Double.parseDouble(txNum2.getText());
				
				JOptionPane.showMessageDialog(null, "O resultado da subtração é:  " + (num1 - num2));
			}
		});
		
		btMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(txNum.getText());
				
				double num2 = Double.parseDouble(txNum2.getText());
				
				JOptionPane.showMessageDialog(null, "O resultado da multiplicação é:  " + (num1 * num2));
			}
		});
		
		btDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(txNum.getText());
				
				double num2 = Double.parseDouble(txNum2.getText());
				
				if (num2 == 0) {
					
					JOptionPane.showMessageDialog(null, "Não é possivel fazer o calculo!  (um numero n pode ser dividido por 0)");
					
				} else {
					
					JOptionPane.showMessageDialog(null, "O resultado da divisão é:  " + (num1 / num2));
				}
				
			}
		});
		
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
}
