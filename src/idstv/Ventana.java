package idstv;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Login");//para el titulo de la ventana
		this.setVisible(true);
		this.setSize(300,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar todas las ventanas/dejar de correr el programa
		
		this.setResizable(true);//para cambiar el tamaño de la ventana
		//this.setMaximumSize(new Dimension(800,800));
		//this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());//add permite añadir todo en la ventana del frame
		this.repaint();
	}
	
	public JPanel login()
	{
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray); //PARA PONER OTRO COLOR 
		//Color.decode("numero del color que quieres"));
		panel.setOpaque(true);//para habilitar el fondo de pantalla
		panel.setSize(300,400);
		panel.setLocation(0,0);
		panel.setLayout(null);//quita el molde
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(90,40); //tamaño
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground((Color.cyan));
		etiqueta1.setLocation(100,30);//DONNDE VAMOS A LOCALIZAR LA ETIQUETA
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);//CENTRAR LA ETIQUETA
		etiqueta1.setFont(new Font("American TYpewrite", Font.BOLD, 30));
		panel.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingrese su email:");
		etiqueta2.setSize(150,30);//tamaño de email
		etiqueta2.setLocation(30,80);
		etiqueta1.setFont(new Font("American TYpewrite", Font.BOLD, 12));
		panel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(225,30); //tamaño del recuadro
		email.setLocation(30,120);
		email.setFont(new Font("American TYpewrite", Font.BOLD, 12));
		panel.add(email);	
		
		JLabel etiqueta3 = new JLabel("Ingrese su contraseña:");
		etiqueta3.setSize(200,30);
		etiqueta3.setLocation(30,160);
		etiqueta3.setFont(new Font("American TYpewrite", Font.BOLD, 12));
		panel.add(etiqueta3);
		
		JTextField contra = new JTextField();
		contra.setSize(225,30); //tamaño del recuadro
		contra.setLocation(30,200);
		contra.setFont(new Font("American TYpewrite", Font.BOLD, 12));
		panel.add(contra);
		
		Checkbox check1 = new Checkbox("Recordarme");
		check1.setSize(100,30);
		check1.setLocation(30,225);
		check1.setFont(new Font("American TYpewrite", Font.BOLD, 10));
		panel.add(check1);
		
		
		JLabel etiqueta4 = new JLabel("¿Olvido su contraseña?");
		etiqueta4.setSize(200,30);
		etiqueta4.setLocation(130,225);
		etiqueta4.setFont(new Font("American TYpewrite", Font.BOLD, 10));
		panel.add(etiqueta4);
		
		Button btn1 = new Button("ACCEDER");
		btn1.setSize(150,40); //tamaño
		btn1.setLocation(70,260);
		//btn1.setHorizontalAlignment(JLabel.CENTER);
		btn1.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(btn1);
		
		
		
		return panel;
	}

}
