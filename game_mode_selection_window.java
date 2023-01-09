package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.event.*;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class game_mode_selection_window extends JDialog {

	private final JPanel Panel1 = new JPanel();

    static main principal_page;
	static name_players_window MODE1;
	static info_personvsperson INFO1;
	static info_personvscomputer INFO2;
	static development_status_window ABOUT;
	static JLabel lblicon, lbl_pp, lbl_pc, lbl_img1, lbl_img2;
	static JLabel lbl1, lbl2, lblDV, lblDR;
	static JLabel lbl_ind_page, lbl_return;
	static JPanel PanelMode1, PanelMode2;
	static JLabel lblinfo1, lblinfo2;
	static JSeparator JP1, JP2;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		try {
			game_mode_selection_window dialog = new game_mode_selection_window();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public game_mode_selection_window() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				JP1.setVisible(false);
				JP2.setVisible(false);
			}
		});
		
		setTitle("TicTacToe Game | Selección de modo de juego");
		setResizable(false);
		setType(Type.POPUP);
		setBounds(130, 40, 1131, 646);
		getContentPane().setLayout(new BorderLayout());
		//Panel1.setBackground(new Color(46, 204, 113));
		Panel1.setBackground(new Color(240, 243, 244));
		/*Panel1.setBorder(new LineBorder(new Color(100, 149, 237)));*/
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				PanelMode1.setBackground(new Color(73, 158, 150));
				lbl_pp.setIcon(new ImageIcon("c:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvsperson_1.png"));
				
				PanelMode2.setBackground(new Color(230, 65, 61));
				lbl_pc.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvscomputer_1.png"));
			}
		});
		
		/*
		lblicon = new JLabel("");
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Index_gato_game\\Index\\Icon\\selectionMode_page\\selection_mode1_auto_x2_colored_toned.jpg"));
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setBounds(0, 0, 1125, 152);
		Panel1.add(lblicon);
		*/
		
		lbl_return = new JLabel();
		lbl_return.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				MOUSE_ENTERED_EVENT_lbl_return();
			}
		});
		lbl_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				MOUSE_EXITED_EVENT_lbl_return();
			}
		});
		lbl_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				principal_page = new main();
				principal_page.setVisible(true);
			}
		});
		lbl_return.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_return.setText("Regresar");
		lbl_return.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lbl_return.setForeground(new Color(108, 108, 108));
		lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\flecha-hacia-atras(2).png"));
		lbl_return.setBounds(6, 10, 133, 30);
		Panel1.add(lbl_return);
		
		lbl_ind_page = new JLabel();
		lbl_ind_page.setText("Seleccionen un modo de juego");
		lbl_ind_page.setFont(new Font("Rockwell", Font.PLAIN, 52));
		lbl_ind_page.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ind_page.setBounds(0, 59, 1125, 62);
		lbl_ind_page.setForeground(new Color(211, 84, 0));
		Panel1.add(lbl_ind_page);
		
		PanelMode1 = new JPanel();
		PanelMode1.setBorder(new LineBorder(new Color(0, 128, 128), 5, true));
		PanelMode1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				PanelMode1.setBackground(new Color(62, 173, 162));
				PanelMode1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				JP1.setVisible(false);
				lbl_pp.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvsperson.png"));
			}
		});
		PanelMode1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				MODE1 = new name_players_window();
				MODE1.setVisible(true);
			}
		});
		PanelMode1.setBounds(94, 162, 421, 410);
		PanelMode1.setLayout(null);
		PanelMode1.setBackground(new Color(73, 158, 150));
		Panel1.add(PanelMode1);
		
		PanelMode2 = new JPanel();
		PanelMode2.setBorder(new LineBorder(new Color(204, 42, 39), 5, true));
		PanelMode2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				PanelMode2.setBackground(new Color(243, 78, 74));
				PanelMode2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				JP2.setVisible(false);
				lbl_pc.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvscomputer1.png"));
			}
		});
		PanelMode2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ABOUT = new development_status_window();
				ABOUT.setVisible(true);
			}
		});
		PanelMode2.setBounds(608, 162, 421, 410);
		PanelMode2.setLayout(null);
		PanelMode2.setBackground(new Color(230, 65, 61));
		Panel1.add(PanelMode2);
		
		lbl2 = new JLabel();
		lbl2.setText("persona VS algoritmo");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Swis721 BT", Font.PLAIN, 34));
		lbl2.setBounds(0, 235, 421, 50);
		PanelMode2.add(lbl2);
		
		lbl_pc = new JLabel();
		lbl_pc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ABOUT = new development_status_window();
				ABOUT.setVisible(true);
			}
		});
		lbl_pc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lbl_pc.setCursor(new Cursor(Cursor.HAND_CURSOR));
			    PanelMode2.setBackground(new Color(243, 78, 74));
				lbl_pc.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvscomputer1.png"));

			}
		});
		lbl_pc.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvscomputer_1.png"));
		lbl_pc.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pc.setBounds(0, 38, 421, 167);
		PanelMode2.add(lbl_pc);
		
		lbl_pp = new JLabel();
		lbl_pp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				MODE1 = new name_players_window();
				MODE1.setVisible(true);
			}
		});
		lbl_pp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lbl_pp.setCursor(new Cursor(Cursor.HAND_CURSOR));
				PanelMode1.setBackground(new Color(62, 173, 162));
				lbl_pp.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvsperson.png"));

			}
		});
		lbl_pp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pp.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\personvsperson_1.png"));
		lbl_pp.setBounds(53, 39, 327, 167);
		PanelMode1.add(lbl_pp);
		
		lbl1 = new JLabel();
		lbl1.setText("persona VS persona");
		lbl1.setFont(new Font("Swis721 BT", Font.PLAIN, 34));
		lbl1.setForeground(Color.WHITE);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(0, 237, 421, 50);
		PanelMode1.add(lbl1);
		
		lblinfo1 = new JLabel();
		lblinfo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblinfo1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				JP1.setVisible(true);
			}
		});
		lblinfo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				INFO1 = new info_personvsperson();
				INFO1.setVisible(true);
			}
		});
		lblinfo1.setText("M\u00E1s informaci\u00F3n");
		lblinfo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo1.setForeground(Color.WHITE);
		lblinfo1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 21));
		lblinfo1.setBounds(132, 327, 157, 50);
		PanelMode1.add(lblinfo1);
		
		lblinfo2 = new JLabel();
		lblinfo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblinfo2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				JP2.setVisible(true);
			}
		});
		lblinfo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				INFO2 = new info_personvscomputer();
				INFO2.setVisible(true);
			}
		});
		lblinfo2.setText("M\u00E1s informaci\u00F3n");
		lblinfo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo2.setForeground(Color.WHITE);
		lblinfo2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 21));
		lblinfo2.setBounds(132, 331, 157, 50);
		PanelMode2.add(lblinfo2);
		
		JP1 = new JSeparator();
		JP1.setBackground(Color.WHITE);
		JP1.setForeground(Color.WHITE);
		JP1.setBounds(132, 375, 157, 2);
		PanelMode1.add(JP1);
		
		JP2 = new JSeparator();
		JP2.setForeground(Color.WHITE);
		JP2.setBackground(Color.WHITE);
		JP2.setBounds(132, 375, 157, 2);
		PanelMode2.add(JP2);
		
		lblDV = new JLabel();
		lblDV.setBounds(0, 0, 400, 50);
		PanelMode2.add(lblDV);
		lblDV.setText("(BETA)");
		lblDV.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDV.setForeground(Color.WHITE);
		lblDV.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 31));
		
		/*
		lblDR = new JLabel();
		lblDR.setText("Ovilex Software | © Todos los derechos reservados - 2022");
		lblDR.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblDR.setBounds(0, 630, 1125, 30);
		lblDR.setForeground(Color.black);
		lblDR.setHorizontalAlignment(SwingConstants.CENTER);
		Panel1.add(lblDR);
		*/
	}
	
	public static void MOUSE_ENTERED_EVENT_lbl_return() {
		
		lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\flecha-hacia-atras.png"));
		lbl_return.setForeground(new Color(27, 27, 27));
		lbl_return.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	public static void MOUSE_EXITED_EVENT_lbl_return() {
		
		lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\selectionMode_page\\flecha-hacia-atras(2).png"));
		lbl_return.setForeground(new Color(108, 108, 108));
	}
}