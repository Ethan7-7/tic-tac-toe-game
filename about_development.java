package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

import jdk.jfr.SettingControl;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class about_development extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JLabel lbl1, lbl2, lblicon;
	static JButton btn, btnreturn;
	static JPanel panel2;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			about_development dialog = new about_development();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public about_development() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_security_message\\jkl_1.png"));
		setTitle("Acerca de");
		setResizable(false);
		setType(Type.POPUP);
		setBounds(100, 100, 810, 469);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(Color.GRAY);
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnreturn.setBackground(new Color(231, 76, 60));
				btnreturn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		
		btn = new JButton();
		btn.setBounds(0,0,0,0);
		Panel1.add(btn);
		
		panel2 = new JPanel();
		panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnreturn.setBackground(new Color(231, 76, 60));
				btnreturn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		panel2.setBackground(new Color(234, 237, 237));
		panel2.setSize(694, 382);
		panel2.setLocation(49, 20);
		Panel1.add(panel2);
		panel2.setLayout(null);
		
		lblicon = new JLabel();
		lblicon.setBounds(40, 0, 140, 327);
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\message_developer\\desarrollar(2).png"));
		panel2.add(lblicon);
		
		lbl1 = new JLabel();
		lbl1.setBackground(Color.WHITE);
		lbl1.setText("El contenido de esta ventana aún");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		lbl1.setBounds(198, 96, 464, 81);
		panel2.add(lbl1);
		
		lbl2 = new JLabel();
		lbl2.setText("no esta preparada, vuelve mas tarde.");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		lbl2.setBounds(202, 153, 464, 81);
		panel2.add(lbl2);
		
		btnreturn = new JButton();
		btnreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnreturn.setBackground(new Color(236, 112, 99));
				btnreturn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnreturn.setText("Cerrar ventana");
		btnreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnreturn.setFont(new Font("Microsoft JenHei", Font.PLAIN, 22));
		btnreturn.setBackground(new Color(231, 76, 60));
		btnreturn.setForeground(Color.WHITE);
		btnreturn.setBorderPainted(false);
		btnreturn.setBounds(240, 290, 220, 40);
		panel2.add(btnreturn);
	}
}