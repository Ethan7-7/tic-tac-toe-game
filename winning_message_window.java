package tic_tac_toe_game_java;

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
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JProgressBar;

public class winning_message_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JButton btn, btnclose;
	static JLabel lblcongr, lblcongr2, lblicon, lblsubtl, lblsubtl2;
	static JLabel lblply1, lblply2, lblscr1, lblscr2;
	static final String pst1 = "1.- ", pst2 = "2.- ";
	static int SCR1, SCR2;
	static String player1, player2;
	static JSeparator JP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			winning_message_window dialog = new winning_message_window(player1, player2, SCR1, SCR2);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public winning_message_window(String player1, String player2, int SCR1, int SCR2) {
		
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				
				if(player1 == null && player2 == null || player1 == "" && player2 == "") {
					
					lblply1.setText(pst1+" Sin nombre");
					lblply2.setText(pst2+" Sin nombre");	
				}
				
				if(SCR1 == 10) {
					
					lblcongr.setText("Felicidades "+player1+" !!");
					lblcongr2.setText("Has ganado la partida contra "+player2+" ;)");
					
					lblscr1.setText(String.valueOf(SCR1)+" :)");
					lblscr2.setText(String.valueOf(SCR2)+" :(");
					
					lblply1.setText(pst1+" "+player1);
					lblply2.setText(pst2+" "+player2);
					
					setTitle("Bien '"+player1+"' le ganaste a '"+player2+"' :)");
					
				}else if(SCR2 == 10) {
					
					lblcongr.setText("Felicidades "+player2+" !!");
					lblcongr2.setText("Has ganado la partida contra "+player1+" ;)");
					
					lblscr2.setText(String.valueOf(SCR1)+" :(");
					lblscr1.setText(String.valueOf(SCR2)+" :)");
					
					lblply1.setText(pst1+" "+player2);
					lblply2.setText(pst2+" "+player1);
					
					setTitle("Bien '"+player2+"' le ganaste a '"+player1+"' :)");

					
				}else if(SCR1 == 0 || SCR2 == 0) {
					
					/*String.valueOf(SCR1) == "" || String.valueOf(SCR1) == null || String.valueOf(SCR2) == "" || String.valueOf(SCR2) == null*/
					
					lblcongr.setText("Sin registro de nombre");
					lblcongr2.setText("No se puede felicitar al usuario porque no hay nombre :(");
					
					lblscr1.setText("Puntaje nulo");
					lblscr2.setText("Puntaje nulo");
					
					lblscr1.setBounds(520, 298, 202, 40);
					lblscr2.setBounds(520, 348, 202, 40);
					
					lblscr1.setHorizontalAlignment(SwingConstants.LEFT);
					lblscr2.setHorizontalAlignment(SwingConstants.LEFT);
					
					setTitle("żNo hay ganador?  :(");
				}
			}
		});
		
		setType(Type.POPUP);
		setResizable(false);
		setBounds(100, 100, 934, 496);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel1.setBackground(new Color(244, 246, 247));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		lblcongr = new JLabel();
		lblcongr.setText("");
		lblcongr.setForeground(new Color(244, 208, 63));
		lblcongr.setFont(new Font("Segoe Print", Font.BOLD, 44));
		lblcongr.setBounds(185, 20, 718, 60);
		lblcongr.setHorizontalAlignment(SwingConstants.CENTER);
		Panel1.add(lblcongr);
		
		lblcongr2 = new JLabel();
		lblcongr2.setText("");
		lblcongr2.setForeground(new Color(82, 190, 128));
		lblcongr2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		lblcongr2.setBounds(185, 90, 718, 60);
		lblcongr2.setHorizontalAlignment(SwingConstants.CENTER);
		Panel1.add(lblcongr2);
		
		lblicon = new JLabel();
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\winning_message_window\\winning.png"));
		lblicon.setBounds(50, 20, 130, 130);
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		Panel1.add(lblicon);
		
		lblsubtl = new JLabel();
		lblsubtl.setForeground(new Color(211, 84, 0));
		lblsubtl.setText("Jugadores                Puntaje");
		lblsubtl.setFont(new Font("Ink Free", Font.BOLD, 30));
		lblsubtl.setHorizontalAlignment(SwingConstants.CENTER);
		lblsubtl.setBounds(0, 214, 918, 40);
		Panel1.add(lblsubtl);
		
		lblsubtl2 = new JLabel();
		lblsubtl2.setFont(new Font("Century Gothic", Font.PLAIN, 26));
		lblsubtl2.setHorizontalAlignment(SwingConstants.LEFT);
		lblsubtl2.setBounds(509, 386, 202, 40);
		Panel1.add(lblsubtl2);
		
		lblply1 = new JLabel();
		lblply1.setForeground(new Color(26, 188, 156));
		lblply1.setFont(new Font("Kristen ITC", Font.PLAIN, 22));
		lblply1.setHorizontalAlignment(SwingConstants.LEFT);
		lblply1.setBounds(260, 298, 280, 40);
		Panel1.add(lblply1);
		
		lblply2 = new JLabel();
		lblply2.setForeground(new Color(26, 188, 156));
		lblply2.setFont(new Font("Kristen ITC", Font.PLAIN, 22));
		lblply2.setHorizontalAlignment(SwingConstants.LEFT);
		lblply2.setBounds(260, 348, 280, 40);
		Panel1.add(lblply2);
		
		lblscr1 = new JLabel();
		lblscr1.setForeground(new Color(26, 188, 156));
		lblscr1.setFont(new Font("Kristen ITC", Font.PLAIN, 22));
		lblscr1.setHorizontalAlignment(SwingConstants.CENTER);
		lblscr1.setBounds(550, 298, 109, 40);
		Panel1.add(lblscr1);
		
		lblscr2= new JLabel();
		lblscr2.setForeground(new Color(26, 188, 156));
		lblscr2.setFont(new Font("Kristen ITC", Font.PLAIN, 22));
		lblscr2.setHorizontalAlignment(SwingConstants.CENTER);
		lblscr2.setBounds(550, 348, 109, 40);
		Panel1.add(lblscr2);
		
		JP = new JSeparator();
		JP.setForeground(Color.BLACK);
		JP.setBackground(Color.BLACK);
		JP.setBounds(260, 274, 399, 4);
		Panel1.add(JP);
	}
}