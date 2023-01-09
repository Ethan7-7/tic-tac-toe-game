package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.event.Event;

import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class indication_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JLabel lbltitle, lbltitle2;
	static JLabel lblicon;
	static JButton btn;
	static JLabel lblDR;
	static JSeparator JP;
	static JPanel Paneltitle, Panelicon;
	
	static JScrollPane panelDeslizable;
	static JTextArea areatexto = new JTextArea(84,2);
	
	public static void main(String args[]) {
		try {
			indication_window dialog = new indication_window();
			dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public indication_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\indications_of_use_window\\tic-tac-toe (1).png"));
		setTitle("Tic Tac Toe | Indicaciones del uso");
		setType(Type.POPUP);
		setResizable(false);
		setBounds(100, 100, 1100, 623);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(Color.GRAY);
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		
		Paneltitle = new JPanel();
		Paneltitle.setBackground(Color.GRAY);
		Paneltitle.setBounds(20, 40, 479, 60);
		Paneltitle.setLayout(null);
		Panel1.add(Paneltitle);
		
		Panelicon = new JPanel();
		Panelicon.setBackground(Color.GRAY);
		Panelicon.setBounds(890, 11, 200, 118);
		Panelicon.setLayout(null);
		Panel1.add(Panelicon);
		
		lbltitle = new JLabel("Indicaciones de uso");
		lbltitle.setForeground(Color.WHITE);
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lbltitle.setBounds(5, 5, 277, 45);
		Paneltitle.add(lbltitle);
		
		lbltitle2 = new JLabel();
		lbltitle2.setText("del programa");
		lbltitle2.setForeground(Color.WHITE);
		lbltitle2.setHorizontalAlignment(SwingConstants.LEFT);
		lbltitle2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lbltitle2.setBounds(279, 5, 191, 45);
		Paneltitle.add(lbltitle2);
		
		lblicon = new JLabel();
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\indications_of_use_window\\tic-tac-toe (1).png"));
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setBounds(5, 5, 190, 108);
		Panelicon.add(lblicon);
		
		JP = new JSeparator();
		JP.setForeground(Color.WHITE);
		JP.setBackground(Color.WHITE);
		JP.setBounds(18, 140, 1040, 4);
		Panel1.add(JP);
		
		JButton newJButton = new JButton();
		newJButton.setBounds(0, 0, 0, 0);
		Panel1.add(newJButton);
		
		btn = new JButton();
		btn.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\indications_of_use_window\\tic-tac-toe (1) - copia.png"));
		btn.setText("          Presiona");
		btn.setBounds(106, 278, 630, 50);
		btn.setFont(new Font("Yu Gothic UI", Font.PLAIN, 30));
		btn.setBackground(Color.RED);
		btn.setForeground(Color.WHITE);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setBorderPainted(false);
		Panel1.add(btn);
		
		areatexto.setText("fneodnweoddmodmwe");
		areatexto.setEditable(false);
		areatexto.setFont(new Font("Nirmala UI", Font.PLAIN, 19));
		areatexto.setBackground(Color.LIGHT_GRAY);
		areatexto.setForeground(Color.white);
		areatexto.setBounds(0, 0, 0, 0);	
		
		panelDeslizable = new JScrollPane();
		panelDeslizable.setBounds(100, 350, 636, 200);
		panelDeslizable.setViewportView(areatexto);
		panelDeslizable.setBorder(BorderFactory.createLineBorder(Color.red));
		panelDeslizable.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(4f)));
		Panel1.add(panelDeslizable);
		
		/*
		btn = new JButton("Entendido");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
				
				btn.setBackground(new Color(86, 101, 115));
				btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btn.setFont(new Font("Yu Gothic UI",Font.PLAIN, 22));
		btn.setBackground(new Color(44, 62, 80));
		btn.setForeground(Color.WHITE);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setBorderPainted(false);
		btn.setBounds(306, 478, 300, 40);
		Panel1.add(btn);
		
		lblDR = new JLabel("Ovilex software | © Todos los derechos reservados - 2022");
		lblDR.setSize(902, 30);
		lblDR.setLocation(0, 550);
		lblDR.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
	    lblDR.setHorizontalAlignment(SwingConstants.CENTER);
	    Panel1.add(lblDR);
	    */
	}
}