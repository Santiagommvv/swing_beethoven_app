package com.mycompany.proyectobeetho;




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miTinto, miRosado, miBlanco, miElCreador, miSalir, miNuevo;
	private JLabel labelLogo, labelBienvenido,labelTitle, labelNombre, labelApellido, labelSegundoIdolo,
			labelFan, labelAuditivo, labelResultado, labelFooter;
	private JTextField txtNombre, txtApellido, txtSegundoIdolo;
	private JComboBox comboAuditivo, comboFan;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	String userName = "";
	

	public Principal(){
	 setLayout(null);
	setTitle("Asignacion de piezas");
	getContentPane().setBackground(new Color(99, 29, 74));
	
        ImageIcon icono = new ImageIcon("src/main/resources/icono.png");
	setIconImage(icono.getImage());
	
	// 		el String con el nombre de usuario
	Bienvenida userBienvenida = new Bienvenida();
	userName = userBienvenida.user;
	
	mb = new JMenuBar();
	mb.setBackground(new Color(90, 20, 70));
	setJMenuBar(mb);
	
	menuOpciones = new JMenu("Opciones");
	menuOpciones.setBackground(new Color(90, 20, 70));
	menuOpciones.setFont(new Font("Andale Mono", 1, 14));
	menuOpciones.setForeground(new Color(255, 255, 255));
	mb.add(menuOpciones);
	
	menuCalcular = new JMenu("Obtener");
	menuCalcular.setBackground(new Color(90, 20, 70));
	menuCalcular.setFont(new Font("Andale Mono", 1, 14));
	menuCalcular.setForeground(new Color(255, 255, 255));
	mb.add(menuCalcular);
	
	menuAcercaDe = new JMenu("Acerca de");
	menuAcercaDe.setBackground(new Color(90, 20, 70));
	menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
	menuAcercaDe.setForeground(new Color(255, 255, 255));
	mb.add(menuAcercaDe);

	menuColorFondo = new JMenu("Color");
	menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
	menuColorFondo.setForeground(new Color(99, 29, 74));
	menuOpciones.add(menuColorFondo);
		
	miCalculo = new JMenuItem("Instrucciones");
	miCalculo.setFont(new Font("Andale Mono", 1, 14));
	miCalculo.setForeground(new Color(99, 29, 74));
	menuCalcular.add(miCalculo);
	miCalculo.addActionListener(this);

	miTinto	= new JMenuItem("Morado");
	miTinto.setFont(new Font("Andale Mono",1, 14));
	miTinto.setForeground(new Color(99, 29, 74));
	menuColorFondo.add(miTinto);
	miTinto.addActionListener(this);
	
	miRosado = new JMenuItem("Magenta");
	miRosado.setFont(new Font("Andale Mono",1, 14));
	miRosado.setForeground(new Color(187, 93, 94));
	menuColorFondo.add(miRosado);
	miRosado.addActionListener(this);

	miBlanco = new JMenuItem("Amarillo");
	miBlanco.setFont(new Font("Andale Mono",1, 14));
	miBlanco.setForeground(new Color(140, 150, 26));  //240 250 126
	menuColorFondo.add(miBlanco);
	miBlanco.addActionListener(this);	
	
	miNuevo = new JMenuItem("Borrar campos");
	miNuevo.setFont(new Font("Andale Mono", 1, 14));
	miNuevo.setForeground(new Color(99, 29, 74));
	menuOpciones.add(miNuevo);
	miNuevo.addActionListener(this);
	
	miElCreador = new JMenuItem("Autor");
	miElCreador.setFont(new Font("Andale Mono", 1, 14));
	miElCreador.setForeground(new Color(99, 29, 74));
	menuAcercaDe.add(miElCreador);
	miElCreador.addActionListener(this);
	
	miSalir = new JMenuItem("Salir de esta pesadilla");
	miSalir.setFont(new Font("Andale Mono", 1, 14));
	miSalir.setForeground(new Color(99, 29, 74));
	menuOpciones.add(miSalir);
	miSalir.addActionListener(this);
	
        ImageIcon logo = new ImageIcon("src/main/resources/beetho03.jpg");
	labelLogo = new JLabel(logo);
	labelLogo.setBounds(45,15,174,116);
	add(labelLogo);

	labelBienvenido = new JLabel("Hola, " + userName);
	labelBienvenido.setBounds(260,30,350,50);
	labelBienvenido.setFont(new Font("Andale Mono", 1, 26));
	labelBienvenido.setForeground(new Color(255, 255, 255));
	add(labelBienvenido);

	labelTitle = new JLabel("Datos para asignarle piezas");
	labelTitle.setBounds(45,140,900,30);
	labelTitle.setFont(new Font("Andale Mono", 0, 24));
	labelTitle.setForeground(new Color(255, 255, 255));
	add(labelTitle);
	
	labelNombre = new JLabel("Nombre:");
	labelNombre.setBounds(25,188,180,25);
	labelNombre.setFont(new Font("Andale Mono", 1, 12));
	labelNombre.setForeground(new Color(255, 255, 255));
	add(labelNombre);
	
	txtNombre = new JTextField();
	txtNombre.setBounds(25, 213, 150, 25);
	txtNombre.setBackground(new java.awt.Color(244,244,244));
	txtNombre.setFont(new java.awt.Font("Andale Mono", 1, 14));
	txtNombre.setForeground(new java.awt.Color(99,29,74));
	add(txtNombre);
	
	labelApellido = new JLabel("Apellido:");
	labelApellido.setBounds(25,248,180,25);
	labelApellido.setFont(new Font("Andale Mono", 1, 12));
	labelApellido.setForeground(new Color(255, 255, 255));
	add(labelApellido);
	
	txtApellido = new JTextField();
	txtApellido.setBounds(25,273,150,25);
	txtApellido.setBackground(new java.awt.Color(244, 244,244));
	txtApellido.setFont(new java.awt.Font("Andale Mono", 1, 14));
	txtApellido.setForeground(new java.awt.Color(99, 29, 74));
	add(txtApellido);
	
	labelSegundoIdolo = new JLabel("Segundo idolo:");
	labelSegundoIdolo.setBounds(25,308,180,25);
	labelSegundoIdolo.setFont(new Font("Andale Mono", 1, 12));
	labelSegundoIdolo.setForeground(new Color(255, 255, 255));
	add(labelSegundoIdolo);
	
	txtSegundoIdolo = new JTextField();
	txtSegundoIdolo.setBounds(25,334,150,25);
	txtSegundoIdolo.setBackground(new java.awt.Color(244, 244,244));
	txtSegundoIdolo.setFont(new java.awt.Font("Andale Mono", 1, 14));
	txtSegundoIdolo.setForeground(new java.awt.Color(99, 29, 74));
	add(txtSegundoIdolo);
	
	labelAuditivo = new JLabel("Status auditivo:");
	labelAuditivo.setBounds(220,188,180,25);
	labelAuditivo.setFont(new Font("Andale Mono", 1, 12));
	labelAuditivo.setForeground(new Color(255, 255, 255));
	add(labelAuditivo);
	
	comboAuditivo = new JComboBox();
	comboAuditivo.setBounds(220,213,220,25);
	comboAuditivo.setBackground(new java.awt.Color(244,244,244));
	comboAuditivo.setFont(new java.awt.Font("Andale Mono", 1, 14));
	comboAuditivo.setForeground(new java.awt.Color(99,29,74));
	add(comboAuditivo);
	comboAuditivo.addItem("");
	comboAuditivo.addItem("normal");
	comboAuditivo.addItem("malo");
	comboAuditivo.addItem("sordo");

	labelFan = new JLabel("Usted considera:");
	labelFan.setBounds(220,248,180,25);
	labelFan.setFont(new Font("Andale Mono", 1, 12));
	labelFan.setForeground(new Color(255, 255, 255));
	add(labelFan);
	
	comboFan = new JComboBox();
	comboFan.setBounds(220,273,220,25);
	comboFan.setBackground(new java.awt.Color(244, 244, 244));
	comboFan.setFont(new java.awt.Font("Andale Mono", 1, 14));
	comboFan.setForeground(new java.awt.Color(99,29,74));
	add(comboFan);
	comboFan.addItem("");
	comboFan.addItem("que Beethoven le aburre");
	comboFan.addItem("que Beethoven le agrada");
	comboFan.addItem("que es Beloved Immortal");
	
	labelResultado = new JLabel("Indicaciones obligatorias:");
	labelResultado.setBounds(220,307,180,25);
	labelResultado.setFont(new Font("Andale Mono", 1, 12));
	labelResultado.setForeground(new Color(255,255,255));
	add(labelResultado);

	textArea1 = new JTextArea();
	textArea1.setEditable(false);
	textArea1.setBackground(new Color(244, 244, 244));
	textArea1.setFont(new Font("Andale Mono", 1, 12));
	textArea1.setForeground(new Color(99, 29, 74));
	textArea1.setText("	(Click en Obtener>Instrucciones)\nNo comente estas instrucciones con sus familiares,\n ni con sus amigos.");
	scrollPane1 = new JScrollPane(textArea1);
	scrollPane1.setBounds(220,333,395,90);
	add(scrollPane1);
	
	labelFooter = new JLabel("Visite mis repositorios en https://github.com/Santiagommvv (no es link)");
	labelFooter.setBounds(105,445,500,30);
	labelFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
	labelFooter.setForeground(new java.awt.Color(255, 255, 255));
	add(labelFooter);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == miCalculo){

			String nombreAfiliado = txtNombre.getText();
			String apellidoAfiliado = txtApellido.getText();
			String segundoIdolo = txtSegundoIdolo.getText();
			String coefAuditivo = comboAuditivo.getSelectedItem().toString();
			String fanatismoB = comboFan.getSelectedItem().toString();
			
	if(nombreAfiliado.equals("") || apellidoAfiliado.equals("") ||
		 segundoIdolo.equals("") || coefAuditivo.equals("") || fanatismoB.equals("")){
			
				JOptionPane.showMessageDialog(null, "Completa todos los campos!!");
			
			} else {

	if (coefAuditivo.equals("normal")){
			
		if(fanatismoB.equals("que Beethoven le aburre"))
			{textArea1.setText(" Carece de todo...\n\n     Empiece por la sonata Claro de Luna.");}
		if(fanatismoB.equals("que Beethoven le agrada"))
			{textArea1.setText("Parece que " + apellidoAfiliado + " esta empezando a entender." 
						+"\n\nPuede escuchar el concierto de piano n°5 \"Emperor\"."
                                                + "\npero preparese para dejar de lado a "+segundoIdolo+" pronto.");}
		if(fanatismoB.equals("que es Beloved Immortal"))		
			{textArea1.setText("Ideal, pero le sobra un sentido..." + 
						"\n " + nombreAfiliado + " " + apellidoAfiliado + ", escuche las 32 sonatas de piano sin excepcion ." +
						"\n Recuerde que el secreto es..." + 
                                                "\n ..." +
                                                "\n ..." +
						"\n\n     Buena suerte :) ");}
	}
	
	if (coefAuditivo.equals("malo")){
			
		if(fanatismoB.equals("que Beethoven le aburre"))
			{textArea1.setText(" " + apellidoAfiliado + ", le creo que tu nivel auditivo es malo," + 
						"\n pienselo nuevamente." +
						"\n\n de los errores se vuelve.");}
		if(fanatismoB.equals("que Beethoven le agrada"))
			{textArea1.setText(" " + nombreAfiliado +" " + apellidoAfiliado + " ... por mucho que simule"+
                                             "\n que es fan de " +segundoIdolo+ ","+
                                             "\n se nota que su corazon esta con el Maestro. "+
                                             "\n me allegro (non molto) por usted " );}
		if(fanatismoB.equals("que es Beloved Immortal"))
			{textArea1.setText(" " + nombreAfiliado + ", usted bien sabe que" + segundoIdolo +
					   "\n no le llega a los talones al maestro..." +
                                                "\n y veo con gusto que esta en el camino correcto" +
						"\n\n ¿Cuantas sonatas hizo "+segundoIdolo+ "? ¿Comprende lo que le quiero decir?");}		
			
	}
	
	if (coefAuditivo.equals("sordo")){
			
		if(fanatismoB.equals("que Beethoven le aburre"))
			{textArea1.setText(" Su condicion es incompatible con su mentalidad. Itentelo nuevamente .");}
		if(fanatismoB.equals("que Beethoven le agrada"))
			{textArea1.setText(" " + apellidoAfiliado + ", usted le negaria el saludo a Napoleon si fuese su contemporaneo... " + 
					"\n   Por eso, puede dar por finalizada su formacion. Quizas pueda \"escuchar\" la sonata Waldstein como recompensa.");}
		if(fanatismoB.equals("que es Beloved Immortal"))
			{textArea1.setText(" " + nombreAfiliado + ", dele un abrazo de despedida a " + segundoIdolo + "." +
					   "\n\n Es hora de hacer historia..." +
						"\n\n     Transcriba las 32 sonatas en clave de DO en tercera inmediatamente .");}		
			
	}
				
			} // cierra else
		

			} //cierra getSource
		if(e.getSource() == miTinto){
			getContentPane().setBackground(new Color(99,29,74));
			//re-pintar todo
			mb.setBackground(new Color(90, 20, 70));
			menuOpciones.setBackground(new Color(90, 20, 70));
			menuCalcular.setBackground(new Color(90, 20, 70));
			menuAcercaDe.setBackground(new Color(90, 20, 70));
			menuOpciones.setForeground(new Color(255, 255, 255));
			menuCalcular.setForeground(new Color(255, 255, 255));
			menuAcercaDe.setForeground(new Color(255, 255, 255));
			labelBienvenido.setForeground(new Color(255, 255, 255));
			labelTitle.setForeground(new Color(255, 255, 255));
			labelNombre.setForeground(new Color(255, 255, 255));
			labelApellido.setForeground(new Color(255, 255, 255));
			labelSegundoIdolo.setForeground(new Color(255, 255, 255));
			labelFan.setForeground(new Color(255, 255, 255));
			labelAuditivo.setForeground(new Color(255, 255, 255));
			labelResultado.setForeground(new Color(255,255,255));
			labelFooter.setForeground(new java.awt.Color(255, 255, 255));
		}
		if(e.getSource() == miRosado){
			getContentPane().setBackground(new Color(187,93,94));
			//re-pintar todo
			mb.setBackground(new Color(180, 86, 87));
			menuOpciones.setBackground(new Color(180, 86, 87));
			menuCalcular.setBackground(new Color(180, 86, 87));
			menuAcercaDe.setBackground(new Color(180, 86, 87));
			menuOpciones.setForeground(new Color(255, 255, 255));
			menuCalcular.setForeground(new Color(255, 255, 255));
			menuAcercaDe.setForeground(new Color(255, 255, 255));
			labelBienvenido.setForeground(new Color(255, 255, 255));
			labelTitle.setForeground(new Color(255, 255, 255));
			labelNombre.setForeground(new Color(255, 255, 255));
			labelApellido.setForeground(new Color(255, 255, 255));
			labelSegundoIdolo.setForeground(new Color(255, 255, 255));
			labelFan.setForeground(new Color(255, 255, 255));
			labelAuditivo.setForeground(new Color(255, 255, 255));
			labelResultado.setForeground(new Color(255,255,255));
			labelFooter.setForeground(new java.awt.Color(255, 255, 255));		
		}
		if(e.getSource() == miBlanco){
			getContentPane().setBackground(new Color(210,230,91));
			//re-pintar todo
			mb.setBackground(new Color(195, 215, 106));
			menuOpciones.setBackground(new Color(195, 215, 106));
			menuCalcular.setBackground(new Color(195, 215, 106));
			menuAcercaDe.setBackground(new Color(195, 215, 106));
			menuOpciones.setForeground(new Color(0,0,0));
			menuCalcular.setForeground(new Color(0,0,0));
			menuAcercaDe.setForeground(new Color(0,0,0));
			labelBienvenido.setForeground(new Color(0,0,0));
			labelTitle.setForeground(new Color(0,0,0));
			labelNombre.setForeground(new Color(0,0,0));
			labelApellido.setForeground(new Color(0,0,0));
			labelSegundoIdolo.setForeground(new Color(0,0,0));
			labelFan.setForeground(new Color(0,0,0));
			labelAuditivo.setForeground(new Color(0,0,0));
			labelResultado.setForeground(new Color(0,0,0));
			labelFooter.setForeground(new java.awt.Color(0,0,0));	
				
		}
		if(e.getSource() == miNuevo){
			txtNombre.setText("");
			txtApellido.setText("");
			txtSegundoIdolo.setText("");
			comboAuditivo.setSelectedIndex(0);
			comboFan.setSelectedIndex(0);
			textArea1.setText("	(Click en Obtener)\nNo comente estas instrucciones con sus familiares,\n ni con sus amigos.");
		}
		if(e.getSource() == miSalir){
			Bienvenida ventanaBienvenida = new Bienvenida();
			ventanaBienvenida.setBounds(0,0,490,600);
			ventanaBienvenida.setVisible(true);
			ventanaBienvenida.setResizable(false);
  			ventanaBienvenida.setLocationRelativeTo(null);
			ventanaBienvenida.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(false);
		}	
		if(e.getSource() == miElCreador){
			JOptionPane.showMessageDialog(null, "Desarrollado por Santiago Morales");
		}
	}

  public static void main(String[] args){
	Principal ventanaPrincipal = new Principal();
	ventanaPrincipal.setBounds(0,0,640,535);
	ventanaPrincipal.setVisible(true);
	ventanaPrincipal.setResizable(false);
	ventanaPrincipal.setLocationRelativeTo(null);
	ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
  }
}


