package com.mycompany.proyectobeetho;



import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.URL;

public class Bienvenida extends JFrame implements ActionListener{
	private JTextField textField1;
	private JLabel labelX;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JButton button1;
	public static String user = "";
    

	public Bienvenida(){
	 setLayout(null);
	setTitle("Bienvenido");
	getContentPane().setBackground(new Color(99,29,74)); //tinto//)
        
        ImageIcon imagen1 = new ImageIcon("src/main/resources/beetho01.jpg");
        //ImageIcon imagen1 = new ImageIcon(Bienvenida.class.getResource("/src/main/resources/beetho01.jpg"));
        URL url = Bienvenida.class.getResource("/src/main/resources/beetho01.jpg");
            System.out.println(url);
        //ImageIcon imagen1 = new ImageIcon(url);
        
	ImageIcon imagen2 = new ImageIcon("src/main/resources/icono.png");
	setIconImage(imagen2.getImage());

	label1 = new JLabel(imagen1);
	label1.setBounds(28,10,425,200);
	add(label1);
	
	label2 = new JLabel("Sistema Beethovenico ");
	label2.setBounds(130,235,330,30);
	label2.setFont(new Font("Andale Mono", 3, 22));
	label2.setForeground(new Color(255,255,255));
	add(label2);
	
	label3 = new JLabel("Nombre del afiliado ");
	label3.setBounds(185,285,200,30);
	label3.setFont(new Font("Andale Mono", 1, 12));
	label3.setForeground(new Color(255,255,255));
	add(label3);

	label4 = new JLabel("© \"Si se cruzan a Napoleon. No lo saluden \" ");
	label4.setBounds(120,505,300,30);
	label4.setFont(new Font("Andale Mono", 1, 12));
	label4.setForeground(new Color(255,255,255));
	add(label4);

	textField1 = new JTextField();
	textField1.setBounds(118,320,255,25);
	textField1.setBackground(new Color(224,224,224));
	textField1.setFont(new Font("Andale Mono", 1, 12));
	textField1.setForeground(new Color(99,29,74));
	add(textField1);
	
	button1 = new JButton("Ingresar");
	button1.setBounds(195,370,100,30);
	button1.setBackground(new Color(255,255,255));	
	button1.setFont(new Font("Andale Mono", 1, 14));
	button1.addActionListener(this);
	add(button1);

	}
	
	//el método trim ignora los espacios en la variable de texto
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1){
			user = textField1.getText().trim();
			if(user.equals("")){
				JOptionPane.showMessageDialog(null, "Inserte nombre!!!");
			} else {
				Licencia ventanaLicencia = new Licencia();  
				ventanaLicencia.setBounds(0,0,615,480);
				ventanaLicencia.setVisible(true);
				ventanaLicencia.setResizable(false);
				ventanaLicencia.setLocationRelativeTo(null);
				ventanaLicencia.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				this.setVisible(false);
			}
		}
	}

  public static void main(String[] args){
  	Bienvenida ventanaBienvenida = new Bienvenida();
	ventanaBienvenida.setBounds(0,0,490,600);
	ventanaBienvenida.setVisible(true);
	ventanaBienvenida.setResizable(false);
  	ventanaBienvenida.setLocationRelativeTo(null);
	ventanaBienvenida.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}


