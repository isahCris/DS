package carros;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JogoVelha extends JDialog {

    private JLabel lbNome;
    private JTextField txNome;
    private JLabel lbNome2;
    private JTextField txNome2;
    private JButton btCadastra;
    private JButton btCancelar;
    private JLabel lbLetra;
    private JLabel lbLetra2;
    private JLabel lbJg1;
    private JLabel lbJg2;
    private JLabel lbpy1;
    private JLabel lbpy2;
    private JRadioButton rdX;
    private	JRadioButton rdO;
    private JRadioButton rdX2;
    private	JRadioButton rdO2;
    private ButtonGroup bgXO;
    private ButtonGroup bgXO2;
    private String letra;
    private String player1;
    private String player2;

    
    private static final long serialVersionUID = 1L;
	private static final Font Titulo = null;
	JButton[] bt = new JButton[9];
	JButton novo = new JButton("Novo Jogo:");
	JButton zerar = new JButton("Zerar");
	JLabel placar = new JLabel ("Placar");
	JLabel pontosX = new JLabel ("X   0");
	JLabel pontosO = new JLabel ("O   0");
	int PX = 0;
	int PO = 0;
	boolean xo = false;
	boolean[] click = new boolean[9];

    public JogoVelha() {

        this.setTitle("Jogo da Velha");
        this.setSize(600, 500);
        this.setModal(true);
        this.setResizable(false);

        // Abas
        Container janelacalc = this.getContentPane();
        janelacalc.setBackground(new Color(191, 163, 128));
        setLocationRelativeTo(janelacalc);
        janelacalc.setLayout(null);

        JTabbedPane tabbedpane = new JTabbedPane();
        tabbedpane.setBounds(0, 0, 600, 500);
        tabbedpane.setBackground(new Color(191, 163, 128));
        
        //jogador 1 
        
        JPanel painel1 = new JPanel();
        painel1.setBackground(new Color(242, 136, 136));
        painel1.setLayout(null);
        
        lbJg1 = new JLabel("Player 1");
        lbJg1.setBounds(200, 8, 188, 32);
        lbJg1.setFont(new Font("Arial",Font.BOLD, 30));
        painel1.add(lbJg1);


        lbNome = new JLabel("Apelido: ");
        lbNome.setBounds(15, 55, 100, 20);
        lbNome.setFont(new Font("Arial",Font.BOLD, 20));
        painel1.add(lbNome);

        txNome = new JTextField();
        txNome.setBounds(107, 55, 140, 20); 
        painel1.add(txNome);
        
        lbLetra = new JLabel("Escolha: ");
        lbLetra.setBounds(15, 90, 200, 20);
        lbLetra.setFont(new Font("Arial",Font.BOLD, 20));
        painel1.add(lbLetra);
        
        rdX = new JRadioButton();
        rdX.setBounds(120,90,80,20);
        rdX.setFont(new Font("Arial",Font.BOLD, 20));
        rdX.setBackground(new Color(242, 136, 136));
        rdX.setText("X");
        rdX.setForeground(Color.BLACK);
        painel1.add(rdX);
	
		rdO = new JRadioButton();
		rdO.setBounds(200,90,80,20);
		rdO.setFont(new Font("Arial",Font.BOLD, 20));
		rdO.setBackground(new Color(242, 136, 136));
		rdO.setForeground(Color.BLACK);
		rdO.setText("O");
		painel1.add(rdO);
		 
		bgXO = new ButtonGroup();
		bgXO.add(rdO);
		bgXO.add(rdX);

        btCadastra = new JButton("Cadastrar");
        btCadastra.setBounds(15, 150, 100, 20);
        painel1.add(btCadastra);
        
        btCancelar = new JButton("Cancelar");
        btCancelar.setBounds(130, 150, 100, 20);
        painel1.add(btCancelar);

        btCadastra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               String nome=" ";
               
               nome = txNome.getText();
                txNome.setEditable(false);
                rdX.setEnabled(false);
                rdO.setEnabled(false);
                
                if (rdX.isSelected()) {
					 
                    letra = rdX.getText();
                    
              } else if (rdO.isSelected()) {
                	
                	letra = rdO.getText();
                	
              }
                player1=letra;
                JOptionPane.showMessageDialog(null, "Nome: " +nome +"\nJogador 1: "+letra);

            }
        });
        
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               
               setVisible(false);
            }
        });
 
        tabbedpane.addTab("Jogador 1", null, painel1, "primeiro painel");

        //aba 2 jogador 2
        
        JPanel painel2 = new JPanel();
        painel2.setBackground(new Color(242, 136, 136));
        painel2.setLayout(null);

        
        lbJg2 = new JLabel("Player 2");
        lbJg2.setBounds(200, 10, 180, 35);
        lbJg2.setFont(new Font("Arial",Font.BOLD, 30));
        painel2.add(lbJg2);


        lbNome2 = new JLabel("Apelido: ");
        lbNome2.setBounds(15, 55, 100, 20);
        lbNome2.setFont(new Font("Arial",Font.BOLD, 20));
        painel2.add(lbNome2);

        txNome2= new JTextField();
        txNome2.setBounds(107, 55, 140, 20); 
        painel2.add(txNome2);
        
        lbLetra2 = new JLabel("Escolha: ");
        lbLetra2.setBounds(15, 90, 200, 20);
        lbLetra2.setFont(new Font("Arial",Font.BOLD, 20));
        painel2.add(lbLetra2);
        
        rdX2 = new JRadioButton();
        rdX2.setBounds(120,90,80,20);
        rdX2.setFont(new Font("Arial",Font.BOLD, 20));
        rdX2.setBackground(new Color(242, 136, 136));
        rdX2.setText("X");
        rdX2.setForeground(Color.BLACK);
        //rdX.setBackground(c);
        painel2.add(rdX2);
	
		rdO2 = new JRadioButton();
		rdO2.setBounds(200,90,80,20);
		rdO2.setFont(new Font("Arial",Font.BOLD, 20));
		rdO2.setBackground(new Color(242, 136, 136));
		rdO2.setForeground(Color.BLACK);
		rdO2.setText("O");
		//rdO.setBackground(c);
		painel2.add(rdO2);

		 bgXO2 = new ButtonGroup();
		 bgXO2.add(rdO2);
		 bgXO2.add(rdX2);

        btCadastra = new JButton("Cadastrar");
        btCadastra.setBounds(15, 150, 100, 20);
        painel2.add(btCadastra);
        
        btCancelar = new JButton("Cancelar");
        btCancelar.setBounds(130, 150, 100, 20);
        painel2.add(btCancelar);
        
       btCadastra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               String letra2 = " ",nome2=" ";
               
               nome2 = txNome2.getText();
                txNome2.setEditable(false);
                rdX2.setEnabled(false);
                rdO2.setEnabled(false);

                if(letra == rdX.getText()  ) {
                	letra2 = "O";
                }else if(letra == rdO.getText()) {
                	letra2 = "X";
                }
                
                player2=letra2;

                JOptionPane.showMessageDialog(null, "Nome: " +nome2 +"\nJogador 2: "+letra2);

            }
        });
        
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               
               setVisible(false);
            }
        });
        
        tabbedpane.addTab("Jogador 2", null, painel2, "Segundo painel");

        
        
        //aba 3 jogo
        JPanel painel3 = new JPanel();
        painel3.setBackground(new Color(242, 136, 136));
        painel3.setLayout(null);

       //jogo da velha
        painel3.add(novo);
        painel3.add(zerar);
        painel3.add(placar);
        painel3.add(pontosX);
        painel3.add(pontosO);
		placar.setFont(new Font("Arial",Font.BOLD, 30));
		pontosX.setFont(new Font("Arial",Font.BOLD, 20));
		pontosO.setFont(new Font("Arial",Font.BOLD, 20));
		zerar.setBackground(new Color(186, 142, 122));
		novo.setBackground(new Color(186, 142, 122));
		novo.setBounds(385, 305, 120, 30);
		zerar.setBounds(385, 270, 120, 30);
		placar.setBounds(400, 55, 100, 30);
		pontosX.setBounds(385, 100, 100, 30);
		pontosO.setBounds(460, 100, 100, 30);
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("./ultimo2.png"));
		JLabel moldura = new JLabel("", imagem, JLabel.CENTER);
		moldura.setBounds(0,55,350,300);
		painel3.add(moldura);
		
		novo.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				novo.setBackground(new Color(186, 142, 122));
				limpar();
			}
		});
		
		zerar.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				zerar.setBackground(new Color(186, 142, 122));
				PO = 0;
				PX = 0;
				atualizar ();
			}
		});
        
		int cont = 0;
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				bt[cont] = new JButton();
				 painel3.add (bt[cont]);
				bt [cont].setBounds((100 * i)+ 50, (100 * j) + 60, 80,80);
				bt[cont].setFont(new Font("Arial", Font.BOLD,60));
				bt[cont].setBackground(new Color(89,50,46));
				bt[cont].setOpaque(false);
				bt[cont].setContentAreaFilled(false);
				bt[cont].setBorderPainted(false);
				cont++;
			}
		}
		
		for (int i = 0; i < 9; i++) {
			click[i] = false;
		}
		
		bt[0].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[0] == false) {
					click[0] = true;
					bt[0].setBackground(new Color(242, 178, 121));
					mudar (bt[0]);
				}
			}
		});
		
		bt[1].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[1] == false) {
					click[1] = true;
					bt[1].setBackground(new Color(242, 178, 121));
					mudar (bt[1]);
				}
			}
		});
		
		bt[2].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[2] == false) {
					click[2] = true;
					bt[2].setBackground(new Color(242, 178, 121));
					mudar (bt[2]);
				}
			}
		});
		
		bt[3].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[3] == false) {
					click[3] = true;
					bt[3].setBackground(new Color(242, 178, 121));
					mudar (bt[3]);
				}
			}
		});
		
		bt[4].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[4] == false) {
					click[4] = true;
					bt[4].setBackground(new Color(242, 178, 121));
					mudar (bt[4]);
				}
			}
		});
		
		bt[5].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[5] == false) {
					click[5] = true;
					bt[5].setBackground(new Color(242, 178, 121));
					mudar (bt[5]);
				}
			}
		});
		
		bt[6].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[6] == false) {
					click[6] = true;
					bt[6].setBackground(new Color(242, 178, 121));
					mudar (bt[6]);
				}
			}
		});
		
		bt[7].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[7] == false) {
					click[7] = true;
					bt[7].setBackground(new Color(242, 178, 121));
					mudar (bt[7]);
				}
			}
		});
		
		bt[8].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[8] == false) {
					click[8] = true;
					bt[8].setBackground(new Color(242, 178, 121));
					mudar (bt[8]);
				}
			}
		});
		
        //
        
        tabbedpane.addTab("Game", null, painel3, "terceiro painel");

        janelacalc.add(tabbedpane);

        // Fim das abas

    } // fim do construtor

    public void mudar(JButton btn) {
		if(xo) {
			btn.setText("O");
			xo = false;
		}else {
			btn.setText("X");
			xo = true;
		}
		ganhou();
		
	}
    
    public void atualizar() {
		pontosX.setText("X " + PX);
		pontosO.setText("O " + PO);
	}
    
    public void ganhou() {
		int cont = 0;
		for (int i=0; i<9; i++) {
			if (click[i] == true) {
				cont ++;
			}
		}
		if((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
			||	(bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X") 
			||	(bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X") 
			||	(bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X") 
			||	(bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X") 
			||	(bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X") 
			||	(bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X") 
			||	(bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")){
			
			if(player1.equalsIgnoreCase("X")) {
				JOptionPane.showMessageDialog(null, txNome.getText()+" ganhou!!");	
			}else {
				JOptionPane.showMessageDialog(null, txNome2.getText()+" ganhou!!");	

			}
			
				PX++;
				atualizar();
				limpar();
				
		}else if((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
			||	(bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O") 
			||	(bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O") 
			||	(bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O") 
			||	(bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O") 
			||	(bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "X") 
			||	(bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O") 
			||	(bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")){
					
			if(player1.equalsIgnoreCase("O")) {
				JOptionPane.showMessageDialog(null, txNome.getText()+" ganhou!!");	
			}else {
				JOptionPane.showMessageDialog(null, txNome2.getText()+" ganhou!!");	

			}
				
				PO++;
				atualizar();
				limpar();
				
		}else if (cont == 9) {
			JOptionPane.showMessageDialog(null, "Empate!!");	
			limpar();
		}
	}
    
    public void limpar () {
		for (int i = 0; i <9; i ++) {
			bt[i].setText("");
			click[i] = false;
			xo = false;
		}
	}
}
