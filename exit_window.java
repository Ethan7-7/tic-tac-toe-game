package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class exit_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JPanel Panel2, Panel3;
	static JButton btnExit, btnCancel, btn;
	static JLabel lbl1, lbl2, lbl3;
	static String a, b, player1, player2;
	static int value;
    static JLabel lbl_icon;
    static final String str1 = "Desconocid@1", str2 = "Desconocid@2";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			exit_window dialog = new exit_window(a, b, player1, player2, value);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public exit_window(String a, String b, String player1, String player2, int value) {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				switch(value) {
				case 1:
					btnCancel.setText("Cancelar");
					btnExit.setText("Salir");
					lbl2.setVisible(true);
					lbl2.setText("mmmmm todavia ni juegas y ya te quieres ir");
					Panel2.setBounds(0, 3, 635, 98);
					Panel3.setBounds(0, 120, 635, 177);
					break;
				case 2:
					btnCancel.setText("Continuar jugando");
					btnExit.setText("Salir de todos modos");
					lbl2.setVisible(true);
					lbl2.setText("Estas en medio de una partida. . .");
					Panel2.setBounds(0, 3, 635, 98);
					Panel3.setBounds(0, 120, 635, 177);
					break;
				case 3:
					btnCancel.setText("Intentar de nuevo");
					btnExit.setText("Salir de todos modos");
					Panel2.setBounds(0, 3, 635, 98); 	
					Panel3.setBounds(0, 120, 635, 177);
					lbl2.setVisible(true);
					
					if(player1 == null && player2 == null) {
						
						/* a -> player1 | b -> player2 */
						
						if(a == "10") {
							
							lbl2.setText(str2+" esta vez puedes ganarle a "+str1);
							
						}else if(b == "10") {
							
							lbl2.setText(str1+" esta vez puedes ganarle a "+str2);
						}
						
					}else if(player1 != null && player2 != null || player1 != "" && player2 != "") {
						
						/* a -> player1 | b -> player2 */
						
						if(a == "10") {
							
							lbl2.setText(player2+" esta vez puedes ganarle a "+player1);
							
						}else if(b == "10") {
							
							lbl2.setText(player1+" esta vez puedes ganarle a "+player2);
						}
					}
					break;
				case 4:
					btnCancel.setText("Continuar jugando");
					btnExit.setText("Salir de todos modos");
					lbl2.setVisible(true);
					lbl2.setText("Al paracer no estas de acuerdo con nuestras normas,");
					lbl3.setText("no te preocupes ;)");
					Panel2.setBounds(0, 1, 635, 98);
					Panel3.setBounds(0, 140, 635, 177);
					break;
				default:
					JOptionPane.showInternalOptionDialog(null, "\nOcurrio un error interno :( \n\n- El contenido de la ventana de salida se ve afectada. \n- La"
							+ " funcionalidad de la aplicación en general no se ve afectada.\n\n", "Aviso del sistema", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,
							null, new Object[] {"Entendido, cerrar mensaje"}, "Entendido, cerrar mensaje");
					
				}
			}		
		});
		
		setTitle("Salir del juego");
		setType(Type.POPUP);
		setResizable(false);
		setBounds(350, 120, 641, 354);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setBackground(new Color(234, 237, 237));
		Panel1.setLayout(null);
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				/*
				btnExit.setBackground(new Color(255, 28, 28));
				btnCancel.setBackground(new Color(60, 98, 151));
				*/
				
				btnExit.setBackground(new Color(231, 76, 60));
				btnCancel.setBackground(new Color(39, 174, 96));
			}
		});
		
		Panel2 = new JPanel();
		Panel2.setBounds(0, 11, 635, 65);
		Panel2.setBackground(new Color(234, 237, 237));
		Panel2.setLayout(null);
		Panel1.add(Panel2);
		
		lbl1 = new JLabel("\u00BF Ya te vas ?  :(");
		lbl1.setBounds(0, 13, 625, 35);
		lbl1.setForeground(new Color(119, 136, 153));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		Panel2.add(lbl1);
		
		btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		lbl2 = new JLabel("");
		lbl2.setBounds(0, 67, 625, 35);
		lbl2.setForeground(new Color(119, 136, 153));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		Panel2.add(lbl2);
		
		lbl3 = new JLabel("");
		lbl3.setBounds(0, 100, 625, 35);
		lbl3.setForeground(new Color(119, 136, 153));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		Panel1.add(lbl3);
		
		Panel3 = new JPanel();
		Panel3.setBounds(0, 87, 635, 177);
		Panel3.setBackground(new Color(234, 237, 237));
		Panel3.setLayout(null);
		Panel1.add(Panel3);
		
		lbl_icon = new JLabel("");
		lbl_icon.setBounds(50, 11, 150, 150);
		lbl_icon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\exit_window\\log-out.png"));
		lbl_icon.setHorizontalAlignment(SwingConstants.CENTER);
		Panel3.add(lbl_icon);
		
		btnExit = new JButton();
		btnExit.setBounds(282, 106, 250, 50);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnExit.setBackground(new Color(236, 112, 99));
				btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(231, 76, 60));
		btnExit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		btnExit.setBorderPainted(false);
		Panel3.add(btnExit);
		
		btnCancel = new JButton();
		btnCancel.setBounds(282, 20, 250, 50);
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnCancel.setBackground(new Color(82, 190, 128));
				btnCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnCancel.setBackground(new Color(39, 174, 96));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
		btnCancel.setBorderPainted(false);
		Panel3.add(btnCancel);

	}
}