package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class username_message extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static String a, b;
	static JLabel lblzxc1, lblzxc2, lbl1, lbl2, lbl3, lbl4,lblDR;
	static JButton btnxf, btn;
	static JSeparator JP;
	private JSeparator JP_1;
	static final String value1 = "", value2 = null;

	
	  public static void main(String[] args) {
		try {
			username_message dialog = new username_message(a, b);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public username_message(String a, String b) {
		
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				
				if(a.equals(value1) && b.equals(value1) || a.equals(value2) && b.equals(value2)) {
					
					user_name_null();
					
				}else {
					
					user_name_activated(a,b);
				}
				
				
			}
			
		});
		
		setTitle("Error en el registro de nombre de usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_error\\fgh_1.png"));
		setType(Type.POPUP);
		setResizable(false);
		setBounds(300, 80, 746, 565);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel1.setBackground(new Color(234, 237, 237));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				
				btnxf.setBackground(new Color(41, 128, 185));
			}
		});
		
		btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		lblzxc1 = new JLabel();
		lblzxc1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 22));
		lblzxc1.setHorizontalAlignment(SwingConstants.CENTER);
		lblzxc1.setBounds(0, 30, 740, 40);
		Panel1.add(lblzxc1);
		
		lblzxc2 = new JLabel();
		lblzxc2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 22));
		lblzxc2.setHorizontalAlignment(SwingConstants.CENTER);
		lblzxc2.setBounds(0, 80, 740, 40);
		Panel1.add(lblzxc2);
		
		JP = new JSeparator();
		JP.setForeground(Color.BLACK);
		JP.setBackground(Color.BLACK);
		JP.setBounds(77, 160, 587, 2);
		Panel1.add(JP);
		
		JP_1 = new JSeparator();
		JP_1.setForeground(Color.BLACK);
		JP_1.setBackground(Color.BLACK);
		JP_1.setBounds(77, 347, 587, 2);
		Panel1.add(JP_1);
		
		lbl1 = new JLabel();
		lbl1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(0, 189, 740, 40);
		Panel1.add(lbl1);
		
		lbl2 = new JLabel();
		lbl2.setToolTipText("");
		lbl2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(0, 233, 740, 40);
		Panel1.add(lbl2);
		
		lbl3 = new JLabel();
		lbl3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(0, 280, 740, 40);
		Panel1.add(lbl3);
		
		lbl4 = new JLabel();
		lbl4.setText("Ingresa un nombre de usuario que contanga alrededor de 13 caracteres");
		lbl4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(0, 374, 740, 40);
		Panel1.add(lbl4);
		
		btnxf = new JButton();
		btnxf.setVerticalAlignment(SwingConstants.TOP);
		btnxf.setText("Entendido");
		btnxf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 23));
		btnxf.setBackground(new Color(41, 128, 185));
		btnxf.setForeground(Color.WHITE);
		btnxf.setBorderPainted(false);
		btnxf.setBounds(235, 463, 270, 40);
		btnxf.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				
				btnxf.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnxf.setBackground(new Color(84, 153, 199));
			}
		});
		btnxf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		Panel1.add(btnxf);
		
		/*
		lblDR = new JLabel();
		lblDR.setText("Ovilex software | © Todos los derechos reservadoss - 2022");
		lblDR.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblDR.setHorizontalAlignment(SwingConstants.CENTER);
		lblDR.setBounds(0, 550, 740, 40);
		Panel1.add(lblDR);
		*/
	}
	
	public static void user_name_activated(String a, String b) {
		
		if(a.length() >= 14 && b.length() >= 14) {
			
			lblzxc1.setText("El nombre de ambos jugadores han superado el");
			lblzxc2.setText("límite de caracteres establecido");
			
			lbl1.setText("Cantidad de caracteres de '"+a+"': "+a.length()+" caracteres");
			lbl2.setText("Cantidad de caracteres de '"+b+"': "+b.length()+" caracteres");
			lbl3.setText("Número de caracteres permitido (límite): 13");
			
		}else if(a.length() >= 14) {
			
			lblzxc1.setText("El nombre del jugador X:  '"+a+"' ha superado ");
			lblzxc2.setText("el límite de caracteres establecido.");
			
			lbl1.setText("Cantidad de caracteres de '"+a+"': "+a.length()+" caracteres");
			lbl2.setText("Número de caracteres permitidos (límite): 13");
			
		}else if(b.length() >= 14) {
			
			lblzxc1.setText("El nombre del jugador O:  '"+b+"' ha superado ");
			lblzxc2.setText("el límite de caracteres establecido.");
			
			lbl1.setText("Cantidad de caracteres de '"+b+"': "+b.length()+" caracteres");
			lbl2.setText("Número de caracteres permitidos (límite): 13");
		} 
	}
	
	public static void user_name_null() {
		
		JOptionPane.showMessageDialog(null, "Nombre de usuario nulos.\n\nVentana en estado de desarrollo.\n\n", "Variables nulas", 
				JOptionPane.INFORMATION_MESSAGE);
	}
}