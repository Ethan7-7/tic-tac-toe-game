package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class game_instructions_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JLabel lbltitle, lbltitle2;
	static JLabel lblicon;
	static JSeparator JP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			game_instructions_window dialog = new game_instructions_window();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public game_instructions_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\project_tic_tac_toe_java\\Index\\Icon\\indications_of_use_window\\tic-tac-toe (3).png"));
		setTitle("Tic Tac Toe | Instrucciones");
		setResizable(false);
		setType(Type.POPUP);
		setBounds(100, 100, 1100, 623);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(Color.GRAY);
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		lbltitle = new JLabel("Instrucciones del juego");
		lbltitle.setForeground(Color.WHITE);
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lbltitle.setBounds(25, 46, 297, 50);
		Panel1.add(lbltitle);
		
		lbltitle2 = new JLabel();
		lbltitle2.setText("Tic Tac Toe");
		lbltitle2.setForeground(Color.WHITE);
		lbltitle2.setHorizontalAlignment(SwingConstants.LEFT);
		lbltitle2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lbltitle2.setBounds(332, 46, 191, 50);
		Panel1.add(lbltitle2);
		
		lblicon = new JLabel();
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\indications_of_use_window\\tic-tac-toe (3).png"));
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setBounds(868, 18, 190, 108);
		Panel1.add(lblicon);
		
		JP = new JSeparator();
		JP.setForeground(Color.WHITE);
		JP.setBackground(Color.WHITE);
		JP.setBounds(18, 140, 1040, 4);
		Panel1.add(JP);
	}

}