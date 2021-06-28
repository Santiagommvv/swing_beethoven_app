package com.mycompany.proyectobeetho;



import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	private JLabel label1;
	private JLabel label2;
	private JCheckBox checkBox1;
	private JButton button1;
	private JButton button2;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;		//siempre contenido en un scrollpane
	String userName = "";
	
	//------Constructor
	
	public Licencia(){
	
	 setLayout(null);
	setTitle("Licencia de uso ");

	//------Icono
        ImageIcon icono = new ImageIcon("src/main/resources/icono.png");
	setIconImage(icono.getImage());
	
	//------usando el nombre de usuario
	Bienvenida userBienvenida = new Bienvenida();
	userName = userBienvenida.user; 
 
	//------Label
	label1 = new JLabel(" Terminos y Condiciones ");
	label1.setBounds(200,3,200,30);
	label1.setFont(new Font("Andale Mono", 1, 14));
	label1.setForeground(new Color(0, 0, 0));
	add(label1);
	
	//------TextArea         	
	textArea1 = new JTextArea();
	textArea1.setEditable(false);
	textArea1.setFont(new Font("Andale Mono", 0, 9));
	textArea1.setText("\n			 ¿TERMINOS O CONDICIONES?" + 
			  "\n\n BUENAS TARDES, LA SIGUIENTE APLICACION HA SIDO PRIMERAMENTE CONCEBIDA COMO LA REALIZACION DE UN CHISTE DE CONTENIDO POLITICO" + 
			"\n(Y CON EL OBVIO OBJETIVO DE CREAR UNA PRIMERA APLICACION GRAFICA UTILZANDO SWING)" + 
			"\nSIN EMBARGO, YA QUE EL PUBLICO DE LA MISMA ES INDETERMINADO, HEMOS CONSIDERADO INNECESARIO GENERAR EL POTENCIAL MAL ENTENDIDO" + 
			"\nY EN CAMBIO, SIEMPRE Y CUANDO USTED ACEPTE (Y SE ACONDICIONE)" +
                        "\na por favor ubicar las imagenes de esta aplicacion a nivel raiz del disco C" +
			"\n     LE PREGUNTAMOS" +
                        "\n		¿QUE TENIA QUE VER BEETHOVEN Y LA VELOCIDAD?" +
			"\n\n		Mediante la presente, usted reafirma su compromiso con el enigma descrito de por vida." +
                        "\n\n		y si no acepta, no puede continuar, es asi de sencillo.");
	scrollPane1 = new JScrollPane(textArea1);
	scrollPane1.setBounds(10,45,575,200);
	add(scrollPane1);

	//	CheckBox
	
	checkBox1 = new JCheckBox("Yo " + userName + ", acepto");
	checkBox1.setBounds(10,250,200,30);
	checkBox1.addChangeListener(this);
	add(checkBox1);
	
	
	//	Buttons
	button1 = new JButton("Continuar");
	button1.setBounds(10,400,100,30);
	button1.addActionListener(this);
	button1.setEnabled(false);
	add(button1);
 
	button2 = new JButton("Cancelar");
	button2.setBounds(120,400,100,30);
	button2.addActionListener(this);
	button2.setEnabled(true);
	add(button2);

        //imagen
        ImageIcon imagen1 = new ImageIcon("src/main/resources/beetho02.jpeg");
	label2 = new JLabel(imagen1);
	label2.setBounds(260,260,305,170);
	add(label2);
	}

	public void stateChanged(ChangeEvent e){
		if(checkBox1.isSelected() == true){
			button1.setEnabled(true);
			button2.setEnabled(false);
		} else {
			button1.setEnabled(false);
			button2.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1){
			Principal ventanaPrincipal = new Principal();
			ventanaPrincipal.setBounds(0,0,640,535);
			ventanaPrincipal.setVisible(true);
			ventanaPrincipal.setResizable(false);
			ventanaPrincipal.setLocationRelativeTo(null);
			ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(false);
		} else  if(e.getSource() == button2) {
				Bienvenida ventanaBienvenida = new Bienvenida();
				ventanaBienvenida.setBounds(0,0,490,600);
				ventanaBienvenida.setVisible(true);
				ventanaBienvenida.setResizable(false);
  				ventanaBienvenida.setLocationRelativeTo(null);
				ventanaBienvenida.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.setVisible(false);
			} 
	
	
	}

  public static void main(String[] args){
  	Licencia ventanaLicencia = new Licencia();  
	ventanaLicencia.setBounds(0,0,615,480);
	ventanaLicencia.setVisible(true);
	ventanaLicencia.setResizable(false);
	ventanaLicencia.setLocationRelativeTo(null);
	ventanaLicencia.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

  }
}


