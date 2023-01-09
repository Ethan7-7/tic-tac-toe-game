package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class position_confirmation_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JPanel Panelcont1, Panelcont2;
	static JPanel Panelpst1, Panelpst2;
	static JButton btnEdit, btnSave, btn;
	static JLabel lbltl, lblpst1, lblpst2;
	static JLabel lblply1, lblply2;
	static JSeparator JP;
	static String player1="Alejandro", player2="Fernanda", a = "", b = null;

	public static void main(String[] args) {
		try {
			position_confirmation_window dialog = new position_confirmation_window(player1,player2);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public position_confirmation_window(String player1, String player2) {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				if(player1.equals(b) && player2.equals(b) || player1.equals(a) && player2.equals(a)){
					
					lblply1.setText("Sin nombre");
					lblply2.setText("Sin nombre");
					
				}else {
					
					lblply1.setText("( "+player1+" )");
					lblply2.setText("( "+player2+" )");
				}
			}
		});
		
		setType(Type.POPUP);
		setResizable(false);
		setTitle("Confirmar posici\u00F3n");
		setBounds(380, 140, 603, 419);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel1.setBackground(new Color(234, 237, 237));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		JButton btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		Panelcont1 = new JPanel();
		Panelcont1.setBackground(new Color(234, 237, 237));
		Panelcont1.setBounds(5, 5, 568, 70);
		Panelcont1.setLayout(null);
		Panel1.add(Panelcont1);
		
		Panelcont2 = new JPanel();
		Panelcont2.setBackground(new Color(234, 237, 237));
		Panelcont2.setBounds(5, 80, 568, 214);
		Panelcont2.setLayout(null);
		Panel1.add(Panelcont2);
		
		lbltl = new JLabel();
		lbltl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 32));
		/*lbltl.setForeground(new Color(69, 179, 157));*/
		lbltl.setForeground(new Color(211, 84, 0));
		lbltl.setText("Cambios guardados correctamente");
		lbltl.setBounds(0, 9, 568, 50);
		lbltl.setHorizontalAlignment(SwingConstants.CENTER);
		Panelcont1.add(lbltl);
		
		Panelpst1 = new JPanel();
		Panelpst1.setBackground(new Color(73, 158, 150));
		Panelpst1.setBounds(20, 20, 242, 185);
		Panelpst1.setLayout(null);
		Panelcont2.add(Panelpst1);
		
		Panelpst2 = new JPanel();
		Panelpst2.setBackground(new Color(230, 65, 61));
		Panelpst2.setBounds(310, 20, 242, 185);
		Panelpst2.setLayout(null);
		Panelcont2.add(Panelpst2);
		
		lblpst1 = new JLabel();
		lblpst1.setText("Jugador   X");
		lblpst1.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		lblpst1.setForeground(Color.WHITE);
		lblpst1.setHorizontalAlignment(SwingConstants.CENTER);
		lblpst1.setBounds(0, 30, 242, 50);
		Panelpst1.add(lblpst1);
		
		lblpst2 = new JLabel();
		lblpst2.setText("Jugador   O");
		lblpst2.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		lblpst2.setForeground(Color.WHITE);
		lblpst2.setHorizontalAlignment(SwingConstants.CENTER);
		lblpst2.setBounds(0, 30, 242, 50);
		Panelpst2.add(lblpst2);
		
		lblply1 = new JLabel();
		lblply1.setBounds(0, 111, 242, 40);
		lblply1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblply1.setForeground(Color.WHITE);
		lblply1.setHorizontalAlignment(SwingConstants.CENTER);
		Panelpst1.add(lblply1);
		
		lblply2 = new JLabel();
		lblply2.setBounds(0, 111, 242, 40);
		lblply2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblply2.setForeground(Color.WHITE);
		lblply2.setHorizontalAlignment(SwingConstants.CENTER);
		Panelpst2.add(lblply2);
		
		btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		JP = new JSeparator();
		JP.setForeground(new Color(0, 0, 0));
		JP.setBackground(new Color(0, 0, 0));
		JP.setBounds(26, 313, 530, 3);
		Panel1.add(JP);
		
		btnEdit = new JButton();
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnEdit.setBackground(new Color(93, 109, 126));
				btnEdit.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
				btnEdit.setBorderPainted(true);
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnEdit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnEdit.setBackground(new Color(52, 73, 94));
				btnEdit.setBorderPainted(false);
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnEdit.setText("Modificar");
		btnEdit.setFont(new Font("Yu Gothic UI", Font.PLAIN, 22));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBackground(new Color(52, 73, 94));
		btnEdit.setBounds(266, 330, 140, 37);
		btnEdit.setBorderPainted(false);
		Panel1.add(btnEdit);
		
		btnSave = new JButton();
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnSave.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnSave.setBackground(new Color(93, 109, 126));
				btnSave.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
				btnSave.setBorderPainted(true);
			}
		});
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnSave.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnSave.setBackground(new Color(52, 73, 94));
				btnSave.setBorderPainted(false);
			}
		});
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSave.setText("Aceptar");
		btnSave.setFont(new Font("Yu Gothic UI", Font.PLAIN, 22));
		btnSave.setForeground(Color.WHITE);
		btnSave.setBackground(new Color(52, 73, 94));
		btnSave.setBounds(416, 330, 140, 37);
		btnSave.setBorderPainted(false);
		Panel1.add(btnSave);

	}
}