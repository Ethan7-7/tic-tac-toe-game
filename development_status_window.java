package tic_tac_toe_game_java;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class development_status_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JLabel lbl1, lbl2, lbl3, lblicon;
	static JButton btn1, btn;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		try {
			development_status_window dialog = new development_status_window();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public development_status_window() {
		setTitle("Mensaje del desarrollador | Estado actual");
		setResizable(false);
		setType(Type.POPUP);
		setBounds(330, 200, 669, 314);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(Color.WHITE);
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn1.setBackground(new Color(84, 153, 199));
				btn1.setBorderPainted(false);
			}
		});
		
		lbl3 = new JLabel();
		lbl3.setText("Lo sentimos pero por el momento el modo");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Verdana", Font.PLAIN, 19));
		lbl3.setBounds(140, 30, 509, 40);
		Panel1.add(lbl3);
		
		lbl1 = new JLabel();
		lbl1.setText(" de juego 'persona VS algoritmo' a\u00FAn se encuentra");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Verdana", Font.PLAIN, 19));
		lbl1.setBounds(140, 74, 509, 40);
		Panel1.add(lbl1);
		
		lbl2 = new JLabel();
		lbl2.setText("en estado de desarrollo y prueba - BETA");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Verdana", Font.PLAIN, 19));
		lbl2.setBounds(140, 117, 509, 40);
		Panel1.add(lbl2);
		
		lblicon = new JLabel("New label");
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\message_developer\\desarrollar.png"));
		lblicon.setBounds(30, 32, 105, 127);
		Panel1.add(lblicon);
		
		btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		btn1 = new JButton();
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btn1.setBackground(new Color(127, 179, 213));
				btn1.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
				btn1.setBorder(BorderFactory.createDashedBorder(Color.WHITE));
				btn1.setBorderPainted(true);
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				dispose();
			}
		});
		btn1.setText("Aceptar");
		btn1.setBackground(new Color(84, 153, 199));
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Dialog", Font.PLAIN, 22));
		btn1.setBorderPainted(false);
		btn1.setBounds(190, 200, 280, 42);
		Panel1.add(btn1);
		
	}
}