package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class main extends JFrame {

	private JPanel Panel1;
	
	static game_mode_selection_window GAME_MODE_SELECTION;
	static exit_window EXITWINDOW;
	static indication_window INDICATION_INSTRUCTIONS;
	static version_history_updates_window VERSION_HISTORY_WINDOW;
	static update_message UPDATE_MESSAGE;
	static new_update_message_window NEW_UPDATE_MESSAGE;
	static updates_explorer_window UPDATES_EXPLORER_WINDOW;
	//static about ABOUT;
	static JLabel lblIcon, lblDR;
	static JLabel lblIcon2, lblversion;
	static JButton btnstart, btnexit, btnversionwindow;
	static JButton btn;
	static JPanel Panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		
		/*
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				NEW_UPDATE_MESSAGE = new new_update_message_window();
				NEW_UPDATE_MESSAGE.setVisible(true);
			}
		});*/
	
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\main\\tic_tac_toe_icon_auto_x2_colored_toned.jpg"));
		setBackground(Color.WHITE);
		setTitle("TicTacToe Game | Inicio");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(170, 40, 1005, 656);
		Panel1 = new JPanel();
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel1.setBackground(new Color(93, 173, 226));
		setContentPane(Panel1);
		Panel1.setLayout(null);
		
		lblIcon = new JLabel();
		lblIcon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\main\\tic_tac_toe_icon_auto_x2_colored_toned.jpg"));
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setBounds(55, 72, 450, 450);
		Panel1.add(lblIcon);
		
		lblIcon2 = new JLabel();
		lblIcon2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\main\\tic_tac_toe_icon3.png"));
		lblIcon2.setBounds(557, 72, 407, 111);
		Panel1.add(lblIcon2);
		
		btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		lblversion = new JLabel();
		lblversion.setText("Versión: 4.1");
		lblversion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblversion.setForeground(new Color(229, 231, 233));
				lblversion.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		lblversion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblversion.setForeground(Color.WHITE);
				lblversion.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		lblversion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
								
				UPDATES_EXPLORER_WINDOW = new updates_explorer_window();
				UPDATES_EXPLORER_WINDOW.setVisible(true);
			}
		});
		lblversion.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblversion.setBounds(822, 11, 131, 23);
		lblversion.setForeground(Color.WHITE);
		Panel1.add(lblversion);
		
		Panel2 = new JPanel();
		Panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel2.setBackground(new Color(76, 147, 195));
			}
		});
		Panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				
				Panel2.setBackground(new Color(84, 153, 199));
			}
		});
		Panel2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(84, 153, 199)));
		Panel2.setBackground(new Color(84, 153, 199));
		Panel2.setBounds(557, 225, 407, 291);
		Panel1.add(Panel2);
		Panel2.setLayout(null);
		
		btnstart = new JButton();
		btnstart.setBounds(25, 36, 356, 50);
		btnstart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnstart.setBackground(new Color(40, 185, 101));
				btnstart.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
				btnstart.setBorderPainted(true);
				btnstart.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnstart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnstart.setBackground(new Color(34, 153, 84));
				btnstart.setBorderPainted(false);
				btnstart.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				GAME_MODE_SELECTION = new game_mode_selection_window();
				GAME_MODE_SELECTION.setVisible(true);
				
				/*UPDATE_MESSAGE = new update_message();
				UPDATE_MESSAGE.setVisible(true);*/
			}
		});
		btnstart.setText("Continuar al juego");
		btnstart.setForeground(Color.WHITE);
		btnstart.setBackground(new Color(34, 153, 84));
		btnstart.setFont(new Font("Berlin Sans FB", Font.PLAIN, 21));
		btnstart.setBorderPainted(false);
		btnstart.setHorizontalAlignment(SwingConstants.CENTER);
		btnstart.setBorder(BorderFactory.createLineBorder(Color.RED));
		Panel2.add(btnstart);
		
		btnversionwindow = new JButton();
		btnversionwindow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnversionwindow.setBackground(new Color(220, 118, 51));
				btnversionwindow.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
				btnversionwindow.setBorderPainted(true);
				btnversionwindow.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnversionwindow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnversionwindow.setBackground(new Color(211, 84, 0));
				btnversionwindow.setBorderPainted(false);
				btnversionwindow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		btnversionwindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VERSION_HISTORY_WINDOW = new version_history_updates_window();
				VERSION_HISTORY_WINDOW.setVisible(true);
			}
		});
		btnversionwindow.setText("Versiones y actualizaciones del juego");
		btnversionwindow.setFont(new Font("Berlin Sans FB", Font.PLAIN, 21));
		btnversionwindow.setForeground(Color.WHITE);
		btnversionwindow.setBackground(new Color(211, 84, 0));
		btnversionwindow.setBorderPainted(false);
		btnversionwindow.setHorizontalAlignment(SwingConstants.CENTER);
		btnversionwindow.setBounds(25, 120, 356, 50);
		Panel2.add(btnversionwindow);
		
		btnexit = new JButton();
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnexit.setBackground(new Color(205, 97, 85));
				btnexit.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
				btnexit.setBorderPainted(true);
				btnexit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnexit.setBackground(new Color(192, 57, 43));
				btnexit.setBorderPainted(false);
				btnexit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value = 1;
				String a = "", b = "", player1 = "", player2 = "";
				
				EXITWINDOW = new exit_window(a, b, player1, player2, value);
				EXITWINDOW.setVisible(true);
				
				/**
				ABOUT = new about();
				ABOUT.setVisible(true);
				*/
			}
		});
		btnexit.setText("Cerrar programa");
		btnexit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 21));
		btnexit.setForeground(Color.WHITE);
		btnexit.setBackground(new Color(192, 57, 43));
		btnexit.setBorderPainted(false);
		btnexit.setHorizontalAlignment(SwingConstants.CENTER);
		btnexit.setBounds(25, 204, 356, 48);
		Panel2.add(btnexit);
		
		lblDR = new JLabel();
		lblDR.setText("SaspraGames | © Todos los derechos reservados - 2022");
		lblDR.setForeground(Color.WHITE);
		lblDR.setHorizontalAlignment(SwingConstants.CENTER);
		lblDR.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblDR.setBounds(0, 564, 999, 30);
		Panel1.add(lblDR);
	}

}