package carros;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Metodo extends JDialog{

	
	JLabel  lbEmpresa;
	JLabel lbNome;
	JTextField txNome;
	JLabel lbOrcamento;
	JLabel lbNumero;
	JLabel lbEmail;
	JLabel lbMarca;
	JLabel lbModelo;
	JLabel lbCor;
	JLabel lbAdicionais;
	JTextField txNumero;
	JTextField txEmail;
	JButton btSalvar;
	JButton btCancelar;
	JRadioButton rdFiat;
	JRadioButton rdBmw;
	JRadioButton rdVolk;
	JRadioButton rdCitroen;
	ButtonGroup bgMarca;
	JComboBox cbModelo;
	JComboBox cbCor;
	
	JCheckBox ckAdicionais1;
	JCheckBox ckAdicionais2;
	JCheckBox ckAdicionais3;
	JCheckBox ckAdicionais4;
	
	public Metodo() {
		
		 
		Color CORFundo = new Color(128, 171, 191);
		Color CORFonte = new Color(8, 8, 8);
		Color CORBotao = new Color(54, 95, 115);
		Font FonteLogo = new Font("Arial", Font.BOLD, 30);
		Font FonteOrc = new Font("Arial", Font.BOLD, 20);
		Font FonteText = new Font("Arial", Font.BOLD, 16);
		Font FonteAdm = new Font ("Arial", Font.BOLD, 13);
		
		this.setTitle("Orcamento");
		this.setSize(800,600);
		this.setLocationRelativeTo(this);
		this.getContentPane().setBackground(CORFundo);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cbModelo = new JComboBox();
		cbModelo.setBounds(100,230,150,30);
		add(cbModelo);
		
		cbCor = new JComboBox();
		cbCor.setBounds(100,270,150,30);
		cbCor.addItem("Preto");
		cbCor.addItem("Branco");
		cbCor.addItem("Prata");
		add(cbCor);
		
		
		lbEmpresa = new JLabel();
		lbEmpresa.setBounds(350,10,400,75);
		lbEmpresa.setForeground(CORFonte);
		lbEmpresa.setFont(FonteLogo);
		lbEmpresa.setText("Apollo Carr");
		add(lbEmpresa);
		
		lbOrcamento = new JLabel();
		lbOrcamento.setBounds(370,60,200,45);
		lbOrcamento.setForeground(CORFonte);
		lbOrcamento.setFont(FonteOrc);
		lbOrcamento.setText("ORCAMENTO");
		add(lbOrcamento);
		
		JLabel imagemCarro = new JLabel("", null, JLabel.CENTER);
		imagemCarro.setBounds(20,45,250,150);
		add(imagemCarro);
		
		lbNome = new JLabel();
		lbNome.setBounds(20,140,200,30);
		lbNome.setForeground(CORFonte);
		lbNome.setFont(FonteText);
		lbNome.setText("Nome: ");
		add(lbNome);
		
		txNome = new JTextField ();
		txNome.setBounds(80,140,100,30);
		add(txNome);
		
		lbNumero = new JLabel();
		lbNumero.setBounds(200,140,200,30);
		lbNumero.setForeground(CORFonte);
		lbNumero.setFont(FonteText);
		lbNumero.setText("N�mero: ");
		add(lbNumero);
		
		txNumero = new JTextField ();
		txNumero.setBounds(280,140,100,30);
		add(txNumero);
		
		lbEmail = new JLabel();
		lbEmail.setBounds(400,140,200,30);
		lbEmail.setForeground(CORFonte);
		lbEmail.setFont(FonteText);
		lbEmail.setText("Email: ");
		add(lbEmail);
		
		txEmail = new JTextField ();
		txEmail.setBounds(460,140,150,30);
		add(txEmail);
		
		btSalvar = new JButton();
		btSalvar.setBounds(20,500,90,40);
		btSalvar.setText("Salvar");
		btSalvar.setFont(FonteText);
		btSalvar.setBackground(CORBotao);
		btSalvar.setForeground(CORFonte);
		add(btSalvar);
		
		btCancelar = new JButton();
		btCancelar.setBounds(140,500,120,40);
		btCancelar.setText("Cancelar");
		btCancelar.setFont(FonteText);
		btCancelar.setBackground(CORBotao);
		btCancelar.setForeground(CORFonte);
		add(btCancelar);
		
		btSalvar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome, celular, email, marca="", modelo="", cor="", adi="";
				nome = txNome.getText();
				celular = txNumero.getText();
				email = txEmail.getText();
				
				
				if(rdFiat.isSelected()) {
					marca = rdFiat.getText();
				}else if(rdBmw.isSelected()) {
					marca = rdBmw.getText();
				}else if(rdVolk.isSelected()){
					marca = rdVolk.getText();
				}else {
					marca = rdCitroen.getText();
				}
				
				modelo = cbModelo.getSelectedItem().toString();
				
				cor	= cbCor.getSelectedItem().toString();
				
				if(ckAdicionais1.isSelected()) {
					adi = adi + "" + ckAdicionais1.getText();
				}
				if(ckAdicionais2.isSelected()) {
					adi = adi + "" + ckAdicionais2.getText();
				}
				if(ckAdicionais3.isSelected()) {
					adi = adi + "" + ckAdicionais3.getText();
				}
				
				JOptionPane.showMessageDialog(null, "Nome do cliente: "+nome + "\n Celular: "
							+celular+"\n Email: "+ email +"\n Marca do carro: "+ marca 
							+"\nModelo do carro: "+ modelo + "\n Cor do carro: " + cor + "\n Adicionais: " + adi );
			}
			
		});
		
		btCancelar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				txNome.setText("");
			}
			
		});
		
		lbMarca = new JLabel();
		lbMarca.setBounds(20,180,200,30);
		lbMarca.setForeground(CORFonte);
		lbMarca.setFont(FonteText);
		lbMarca.setText("Marca: ");
		add(lbMarca);
		
		rdFiat = new JRadioButton();
		rdFiat.setBounds(90,185,120,30);
		rdFiat.setBackground(CORFundo);
		rdFiat.setForeground(CORFonte);
		rdFiat.setFont(FonteText);
		rdFiat.setText("Fiat");
		add(rdFiat);
		
		rdFiat.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdFiat.isSelected()) {
					cbModelo.removeAllItems();
					cbModelo.addItem("Toro");
					cbModelo.addItem("Cronos");
					cbModelo.addItem("Uno");
					cbModelo.addItem("Palio");
				}
			}
		});
					
		cbModelo.addActionListener(new ActionListener() {
						

			@Override
			public void actionPerformed(ActionEvent e) {
				String itemSelecionado = (String) cbModelo.getSelectedItem();	
				if("Toro".equals(itemSelecionado)) {
					
					
					
				if(cbCor.getSelectedIndex()==0) {
					ImageIcon imagem = new ImageIcon("src/carros/img/ftoro-preto.png");
					imagemCarro.setIcon(imagem);
					add(imagemCarro);
				} 		
				
				if("Toro".equals(itemSelecionado)) {	
					
						if(cbCor.getSelectedIndex()==1) {
							ImageIcon imagem = new ImageIcon("src/carros/img/fiatToro-branco.png");
							imagemCarro.setIcon(imagem);
							add(imagemCarro);
							
						}
						
						if(cbCor.getSelectedIndex()==2) {
							ImageIcon imagem = new ImageIcon("src/carros/img/ftoro-preto.png");
							imagemCarro.setIcon(imagem);
							add(imagemCarro);
						
						}
					}
				} else if("Cronos".equals(itemSelecionado)) {
					if(cbCor.getSelectedIndex()==0) {
						ImageIcon imagem = new ImageIcon("src/carros/img/Cronos-pretos.png");
						imagemCarro.setIcon(imagem);
						add(imagemCarro);
					} 		
					
					if("Toro".equals(itemSelecionado)) {	
						
							if(cbCor.getSelectedIndex()==1) {
								ImageIcon imagem = new ImageIcon("src/carros/img/cronos-prata.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
								
							}
							
							if(cbCor.getSelectedIndex()==2) {
								ImageIcon imagem = new ImageIcon("src/carros/img/ftoro-preto.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							
							}
					}
					
				}
			}
		});
				
				/*else {
							if ("Cronos".equals(itemSelecionado)) {
								ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							} 		if("Cronos".equals(itemSelecionado)) {
								
								
								// Vermelho = 0
								// Azul = 1
								// Prata = 2
								
							if(cbCor.getSelectedIndex()==1) {
								ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
								
							}
							
							if(cbCor.getSelectedIndex()==2) {
								ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							
							} else {
								if ("T-Cross".equals(itemSelecionado)) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
								} 		if("T-cross".equals(itemSelecionado)) {
									
									
									// Vermelho = 0
									// Azul = 1
									// Prata = 2
									
								if(cbCor.getSelectedIndex()==1) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
									
								}
								
								if(cbCor.getSelectedIndex()==2) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
								
						} else {
							if ("Uno".equals(itemSelecionado)) {
								ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							} 		if("Uno".equals(itemSelecionado)) {
								
								
								// Vermelho = 0
								// Azul = 1
								// Prata = 2
								
							if(cbCor.getSelectedIndex()==1) {
								ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
								
							}
							
							if(cbCor.getSelectedIndex()==2) {
								ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							}
					
						}

					}
								}
							}
							}
						}
		}
		
	}
		
	});*/
						
		
		rdBmw = new JRadioButton();
		rdBmw.setBounds(215,185,120,30);
		rdBmw.setBackground(CORFundo);
		rdBmw.setForeground(CORFonte);
		rdBmw.setFont(FonteText);
		rdBmw.setText("Bmw");
		add(rdBmw);
		
		rdBmw.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdBmw.isSelected()) {
					cbModelo.removeAllItems();
					cbModelo.addItem("BMW iX");
					cbModelo.addItem("BMW iX M60");
					cbModelo.addItem("BMW i7");
					cbModelo.addItem("BMW i7");
				
					
				}
			}
		});
					
					cbModelo.addActionListener(new ActionListener() {
						

						@Override
						public void actionPerformed(ActionEvent e) {
							String itemSelecionado = (String) cbModelo.getSelectedItem();	
							if("BMW iX".equals(itemSelecionado)) {
																
							 if(cbCor.getSelectedIndex()==0) {
								ImageIcon imagem = new ImageIcon("src/carros/img/X1-prata.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							} 
								if(cbCor.getSelectedIndex()==1) {
								ImageIcon imagem = new ImageIcon("src/carros/img/X1-prata.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
								
							}
							
							if(cbCor.getSelectedIndex()==2) {
								ImageIcon imagem = new ImageIcon("src/carros/img/X1-prata.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							}
							
							}
						
					}
				});
								
							/*}else {
								if ("BMW iX M60".equals(itemSelecionado)) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
								} 		if("BMW iX M60".equals(itemSelecionado)) {
									
									
										// Vermelho = 0
										// Azul = 1
										// Prata = 2
										
									if(cbCor.getSelectedIndex()==1) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
										
									}
									
									if(cbCor.getSelectedIndex()==2) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
									} else {
										if ("T-Cross".equals(itemSelecionado)) {
											ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
											imagemCarro.setIcon(imagem);
											add(imagemCarro);
										} 		if("T-cross".equals(itemSelecionado)) {
											
											
											// Vermelho = 0
											// Azul = 1
											// Prata = 2
											
										if(cbCor.getSelectedIndex()==1) {
											ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
											imagemCarro.setIcon(imagem);
											add(imagemCarro);
											
										}
										
										if(cbCor.getSelectedIndex()==2) {
											ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
											imagemCarro.setIcon(imagem);
											add(imagemCarro);
								} else {
									if ("T-Cross".equals(itemSelecionado)) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
									} 		if("T-cross".equals(itemSelecionado)) {
										
										
										// Vermelho = 0
										// Azul = 1
										// Prata = 2
										
									if(cbCor.getSelectedIndex()==1) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
										
									}
									
									if(cbCor.getSelectedIndex()==2) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
							}
							
					}

				}
					
				
										}
			}
			
		}
		
	});*/
							
		rdVolk = new JRadioButton();
		rdVolk.setBounds(340,185,120,30);
		rdVolk.setBackground(CORFundo);
		rdVolk.setForeground(CORFonte);
		rdVolk.setFont(FonteText);
		rdVolk.setText("Volk");
		add(rdVolk);
		
		
		imagemCarro.setBounds(260,400,400,200);
		add(imagemCarro);
		
		
		setLayout(null);
		setVisible(true);
		rdVolk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdVolk.isSelected()) {
					cbModelo.removeAllItems();
					cbModelo.addItem("Polo Track");
					cbModelo.addItem("T-Cross");
					cbModelo.addItem("Saveiro");
					cbModelo.addItem("Jetta");
					
				}
			}
		});
					
				
				cbModelo.addActionListener(new ActionListener() {
					

					@Override
					public void actionPerformed(ActionEvent e) {
						String itemSelecionado = (String) cbModelo.getSelectedItem();	
						if("Polo Track".equals(itemSelecionado)) {
															
						 if(cbCor.getSelectedIndex()==0) {
							ImageIcon imagem = new ImageIcon("src/carros/img/Saveiro-branco.png");
							imagemCarro.setIcon(imagem);
							add(imagemCarro);
						} 
							if(cbCor.getSelectedIndex()==1) {
							ImageIcon imagem = new ImageIcon("src/carros/img/Saveiro-branco.png");
							imagemCarro.setIcon(imagem);
							add(imagemCarro);
							
						}
						
						if(cbCor.getSelectedIndex()==2) {
							ImageIcon imagem = new ImageIcon("src/carros/img/Saveiro-branco.png");
							imagemCarro.setIcon(imagem);
							add(imagemCarro);
						}
						
						}
					
				}
			});
								
									
								/*}else {
									if ("T-Cross".equals(itemSelecionado)) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
									} 		if("T-cross".equals(itemSelecionado)) {
										
										
										// Vermelho = 0
										// Azul = 1
										// Prata = 2
										
									if(cbCor.getSelectedIndex()==1) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
										
									}
									
									if(cbCor.getSelectedIndex()==2) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
									} else {
										if ("T-Cross".equals(itemSelecionado)) {
											ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
											imagemCarro.setIcon(imagem);
											add(imagemCarro);
										} 		if("T-cross".equals(itemSelecionado)) {
											
											
											// Vermelho = 0
											// Azul = 1
											// Prata = 2
											
										if(cbCor.getSelectedIndex()==1) {
											ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
											imagemCarro.setIcon(imagem);
											add(imagemCarro);
											
										}
										
										if(cbCor.getSelectedIndex()==2) {
											ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
											imagemCarro.setIcon(imagem);
											add(imagemCarro);
								} else {
									if ("T-Cross".equals(itemSelecionado)) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
									} 		if("T-cross".equals(itemSelecionado)) {
										
										
										// Vermelho = 0
										// Azul = 1
										// Prata = 2
										
									if(cbCor.getSelectedIndex()==1) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
										
									}
									
									if(cbCor.getSelectedIndex()==2) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
							}
							
					}

					}
										
						
				});
						
					
					
				}
				
			}
			
		});*/
		
		rdCitroen = new JRadioButton();
		rdCitroen.setBounds(465,185,120,30);
		rdCitroen.setBackground(CORFundo);
		rdCitroen.setForeground(CORFonte);
		rdCitroen.setFont(FonteText);
		rdCitroen.setText("Citroen");
		add(rdCitroen);
		
		rdCitroen.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdCitroen.isSelected()) {
					cbModelo.removeAllItems();
					cbModelo.addItem("Citroen C3");
					cbModelo.addItem("C4 Cactus");
					cbModelo.addItem("Jumpy");
					cbModelo.addItem("Jumper");
					
				}
			}
		});
					
					cbCor.addActionListener(new ActionListener() {
						

						@Override
						public void actionPerformed(ActionEvent e) {
							String itemSelecionado = (String) cbModelo.getSelectedItem();	
							if("Citroen C3".equals(itemSelecionado)) {
								
															
							if(cbCor.getSelectedIndex()==0) {
								ImageIcon imagem = new ImageIcon("src/carros/img/c3-preto.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
							} 
								
																
							if(cbCor.getSelectedIndex()==1) {
								ImageIcon imagem = new ImageIcon("src/carros/img/c3-branco.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
								
							}
							
							if(cbCor.getSelectedIndex()==2) {
								ImageIcon imagem = new ImageIcon("src/carros/img/c3-branco.png");
								imagemCarro.setIcon(imagem);
								add(imagemCarro);
								
							}
						    
							
							}
								}
							});
								
							/*}else {
								if ("T-Cross".equals(itemSelecionado)) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
								} 		if("T-cross".equals(itemSelecionado)) {
									
									
									// Vermelho = 0
									// Azul = 1
									// Prata = 2
									
								if(cbCor.getSelectedIndex()==1) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
									
								}
								
								if(cbCor.getSelectedIndex()==2) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
								} else {
									if ("T-Cross".equals(itemSelecionado)) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
									} 		if("T-cross".equals(itemSelecionado)) {
										
										
										// Vermelho = 0
										// Azul = 1
										// Prata = 2
										
									if(cbCor.getSelectedIndex()==1) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
										
									}
									
									if(cbCor.getSelectedIndex()==2) {
										ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
										imagemCarro.setIcon(imagem);
										add(imagemCarro);
							} else {
								if ("T-Cross".equals(itemSelecionado)) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
								} 		if("T-cross".equals(itemSelecionado)) {
									
									
									// Vermelho = 0
									// Azul = 1
									// Prata = 2
									
								if(cbCor.getSelectedIndex()==1) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
									
								}
								
								if(cbCor.getSelectedIndex()==2) {
									ImageIcon imagem = new ImageIcon(getClass().getResource("./fiat-Toro.jpg"));
									imagemCarro.setIcon(imagem);
									add(imagemCarro);
						}
						
				}

				}
					
			});
					
				
				
			}
			
		}
		
	});*/
		
		bgMarca = new ButtonGroup();
		bgMarca.add(rdFiat);
		bgMarca.add(rdBmw);
		bgMarca.add(rdVolk);
		bgMarca.add(rdCitroen);
		
		lbModelo = new JLabel();
		lbModelo.setBounds(20,230,200,30);
		lbModelo.setForeground(CORFonte);
		lbModelo.setFont(FonteText);
		lbModelo.setText("Modelo: ");
		add(lbModelo);
		
		
		//ComboBox Cor
		
		lbCor = new JLabel();
		lbCor.setBounds(20,270,200,30);
		lbCor.setForeground(CORFonte);
		lbCor.setFont(FonteText);
		lbCor.setText("Cor: ");
		add(lbCor);
		
		
		
		//CheckBox Itens Adicionais
		
		lbAdicionais = new JLabel();
		lbAdicionais.setBounds(20,320,200,30);
		lbAdicionais.setForeground(CORFonte);
		lbAdicionais.setFont(FonteText);
		lbAdicionais.setText("Itens Opcionais: ");
		add(lbAdicionais);
		
		ckAdicionais1 = new JCheckBox();
		ckAdicionais1.setBackground(CORFundo);
		ckAdicionais1.setForeground(CORFonte);
		ckAdicionais1.setFont(FonteAdm);
		ckAdicionais1.setBounds(20, 360, 180, 60);
		ckAdicionais1.setText("sensor de estacionamento");
		add(ckAdicionais1);
		
		ckAdicionais2 = new JCheckBox();
		ckAdicionais2.setBackground(CORFundo);
		ckAdicionais2.setForeground(CORFonte);
		ckAdicionais2.setFont(FonteAdm);
		ckAdicionais2.setBounds(195, 360, 180, 60);
		ckAdicionais2.setText("Direcao Hidraulica");
		add(ckAdicionais2);
		
		ckAdicionais3 = new JCheckBox();
		ckAdicionais3.setBackground(CORFundo);
		ckAdicionais3.setForeground(CORFonte);
		ckAdicionais3.setFont(FonteAdm);
		ckAdicionais3.setBounds(20, 400, 180, 60);
		ckAdicionais3.setText("Ar Condicionado");
		add(ckAdicionais3);
		
		ckAdicionais4 = new JCheckBox();
		ckAdicionais4.setBackground(CORFundo);
		ckAdicionais4.setForeground(CORFonte);
		ckAdicionais4.setFont(FonteAdm);
		ckAdicionais4.setBounds(195, 390, 180, 80);
		ckAdicionais4.setText("Protetor de cárter");
		add(ckAdicionais4);
		
		this.setLayout(null);
		this.setVisible(true);
		
	}
							
	
	}
	
						


