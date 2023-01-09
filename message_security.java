package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;

import java.awt.event.*;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class message_security extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JLabel lbl1, lbl2, lbl3, lblDR;
	static JButton btnaccept, btnexit;
	static JTextPane txt_message;
	static exit_window btnexit_action;
	static String a, b, player1, player2;
	
	/*
	public static void main(String[] args) {
		
		try {
			message_security dialog = new message_security();
			dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}catch(Exception e){
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public message_security() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_security_message\\jkl2.png"));
		setTitle("Tic Tac Toe | Acerca de");
		setType(Type.POPUP);
		setResizable(false);
		setBounds(249, 60, 841, 540);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(new Color(234, 237, 237));
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnaccept.setBackground(new Color(26, 82, 118));
				btnexit.setBackground(new Color(211, 84, 0));
			}
		});
		
		lbl1 = new JLabel();
		lbl1.setBackground(SystemColor.windowBorder);
		lbl1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_security_message\\security.png"));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(200, 23, 55, 57);
		Panel1.add(lbl1);
		
		lbl2 = new JLabel("Aviso de seguridad");
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 32));
		lbl2.setBounds(0, 25, 835, 50);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		Panel1.add(lbl2);
		
		txt_message = new JTextPane();
		txt_message.setForeground(Color.BLACK);
		txt_message.setBackground(new Color(234, 237, 237));
		txt_message.setEditable(false);
		txt_message.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 19));
		txt_message.setText("Su nombre y el de su compa\u00F1er@ se utiliza para tener una mejor experiencia de juego.\r\n\r\nDichos datos no los usamos para otros fines, como los siguientes:\r\n\r\n  \u2022 No se almacenan en ninguna base de datos\r\n  \u2022 No se almacanan en el historial o cookies\r\n  \u2022 No se divulgan\r\n  Etc.\r\n\r\nUna vez que cierre la aplicaci\u00F3n los datos se borran por completo\r\n");
		txt_message.setBounds(57, 122, 719, 268);
		Panel1.add(txt_message);
		
		btnaccept = new JButton();
		btnaccept.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnaccept.setBackground(new Color(36, 113, 163));
				btnaccept.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnaccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnaccept.setText("Entiendo, continuar al juego");
		btnaccept.setBackground(new Color(26, 82, 118));
		btnaccept.setForeground(Color.WHITE);
		btnaccept.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnaccept.setBorderPainted(false);
		btnaccept.setBounds(91, 439, 300, 42);
		Panel1.add(btnaccept);
		
		btnexit = new JButton();
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnexit.setBackground(new Color(220, 118, 51));
				btnexit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value = 4;
				dispose();
				btnexit_action = new exit_window(a, b, player1, player2, value);
				btnexit_action.setVisible(true);
			}
		});
		btnexit.setText("No estoy de acuerdo");
		btnexit.setBackground(new Color(211, 84, 0));
		btnexit.setForeground(Color.WHITE);
		btnexit.setBorderPainted(false);
		btnexit.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		btnexit.setBounds(436, 439, 300, 42);
		Panel1.add(btnexit);
		
		/*
		lblDR = new JLabel();
		lblDR.setText("Ovilex Software | Š all rights reserved - 2022");
		lblDR.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblDR.setHorizontalAlignment(SwingConstants.CENTER);
		lblDR.setBounds(0, 520, 838, 30);
		Panel1.add(lblDR);
		*/
	}
}