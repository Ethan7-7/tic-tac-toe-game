package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JSeparator;
import javax.swing.JTextPane;

import java.awt.Toolkit;
import java.awt.SystemColor;

public class update_message extends JDialog {

	private final JPanel PanelContainer = new JPanel();
	
	static JPanel PanelIcon, PanelContMssg1, PanelContMssg2, PanelContBtn;
	static JButton btnclose, btnCloseWindow, btn;
	static JLabelLink lbllink;
	static JLabel lblicon, lbltle, lblcont1, lblcont2, lblcont3, lblmsslink, lblteammssg;

	/**
	 * Create the dialog.
	 */
	public update_message() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_security_message\\jkl_1.png"));
		setResizable(false);
		setType(Type.POPUP);
		setTitle("En actualizaci\u00F3n...");
		setBounds(190, 70, 960, 547);
		getContentPane().setLayout(new BorderLayout());
		/*PanelContainer.setBackground(new Color(88,88,88));*/
		PanelContainer.setBackground(new Color(52, 73, 94));
		PanelContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(PanelContainer, BorderLayout.CENTER);
		PanelContainer.setLayout(null);
		
		PanelIcon = new JPanel();
		PanelIcon.setBackground(new Color(52, 73, 94));
		PanelIcon.setBounds(41, 51, 349, 357);
		PanelIcon.setLayout(null);
		PanelContainer.add(PanelIcon);
		
		lblicon = new JLabel();
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\indications_of_use_window\\tic-tac-toe (7).png"));
		lblicon.setBounds(20, 11, 329, 306);
		PanelIcon.add(lblicon);
		
		PanelContBtn = new JPanel();
		PanelContBtn.setBounds(42, 419, 891, 90);
		PanelContBtn.setBackground(new Color(52, 73, 94));
		PanelContBtn.setLayout(null);
		PanelContainer.add(PanelContBtn);
		
		PanelContMssg1 = new JPanel();
		PanelContMssg1.setBackground(new Color(52, 73, 94));
		PanelContMssg1.setBounds(389, 51, 544, 222);
		PanelContMssg1.setLayout(null);
		PanelContainer.add(PanelContMssg1);
		
		PanelContMssg2 = new JPanel();
		PanelContMssg2.setBackground(new Color(52, 73, 94));
		PanelContMssg2.setBounds(389, 275, 544, 133);
		PanelContMssg2.setLayout(null);
		PanelContainer.add(PanelContMssg2);
		
		lbltle = new JLabel();
		lbltle.setText("Aplicación en mantenimiento...");
		lbltle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		lbltle.setForeground(Color.WHITE);
		lbltle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltle.setBounds(0, 10, 544, 40);
		PanelContMssg1.add(lbltle);
		
		lblcont1 = new JLabel();
		lblcont1.setText("En estos momentos no es posible ingresar al juego ya");
		lblcont1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 19));
		lblcont1.setForeground(Color.WHITE);
		lblcont1.setHorizontalAlignment(SwingConstants.CENTER);
		lblcont1.setBounds(0, 80, 544, 30);
		PanelContMssg1.add(lblcont1);
		
		lblcont2 = new JLabel();
		lblcont2.setText("que se esta realizando mantenimiento (actualizaciones)");
		lblcont2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 19));
		lblcont2.setForeground(Color.WHITE);
		lblcont2.setHorizontalAlignment(SwingConstants.CENTER);
		lblcont2.setBounds(0, 115, 544, 30);
		PanelContMssg1.add(lblcont2);
		
		lblcont3 = new JLabel();
		lblcont3.setText("Le pedimos que vuelva m\u00E1s tarde ;)");
		lblcont3.setFont(new Font("Yu Gothic UI", Font.BOLD, 19));
		lblcont3.setForeground(Color.WHITE);
		lblcont3.setHorizontalAlignment(SwingConstants.CENTER);
		lblcont3.setBounds(0, 180, 544, 30);
		PanelContMssg1.add(lblcont3);
		
		lblmsslink = new JLabel();
		lblmsslink.setText("Consulta el historial de versiones:");
		lblmsslink.setForeground(Color.WHITE);
		lblmsslink.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 19));
		lblmsslink.setBounds(35, 29, 280, 30);
		lblmsslink.setHorizontalAlignment(SwingConstants.CENTER);
		PanelContMssg2.add(lblmsslink);
		
		lbllink = new JLabelLink();
		lbllink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lbllink.setForeground(Color.LIGHT_GRAY);
			}
		});
		lbllink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lbllink.setForeground(Color.WHITE);
			}
		});
		lbllink.setText("www.SaspraGames.com");
		lbllink.setLink("http://localhost/www.SaspraGames.com/TicTacToe/Data/Versiones/");
		lbllink.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lbllink.setHorizontalAlignment(SwingConstants.LEFT);
		lbllink.setBounds(315, 29, 207, 30);
		lbllink.setForeground(Color.WHITE);
		PanelContMssg2.add(lbllink);
		
		lblteammssg = new JLabel();
		lblteammssg.setText("ATTE: equipo de desarrollo de SaspraGames | SaspraSoftware Inc.");
		lblteammssg.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 15));
		lblteammssg.setForeground(Color.WHITE);
		lblteammssg.setHorizontalAlignment(SwingConstants.CENTER);
		lblteammssg.setBounds(0, 90, 544, 30);
		PanelContMssg2.add(lblteammssg);
		
		btn = new JButton();
		btn.setBounds(0,0,0,0);
		PanelContainer.add(btn);
		
		btnclose = new JButton();
		btnclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnclose.setBackground(new Color(127, 179, 213));
				btnclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnclose.setBorderPainted(true);
				btnclose.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
			}
		});
		btnclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnclose.setBackground(new Color(84, 153, 199));
				btnclose.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnclose.setBorderPainted(false);
			}
		});
		btnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnclose.setText("Salir del programa");
		btnclose.setBackground(new Color(84, 153, 199));
		btnclose.setForeground(Color.WHITE);
		btnclose.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnclose.setBounds(652, 32, 204, 35);
		btnclose.setBorderPainted(false);
		PanelContBtn.add(btnclose);
		
		btnCloseWindow = new JButton();
		btnCloseWindow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnCloseWindow.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnCloseWindow.setBackground(new Color(125, 206, 160));
				btnCloseWindow.setBorderPainted(true);
				btnCloseWindow.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
			}
		});
		btnCloseWindow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnCloseWindow.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnCloseWindow.setBackground(new Color(82, 190, 128));
				btnCloseWindow.setBorderPainted(false);
			}
		});
		btnCloseWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnCloseWindow.setText("Cerrar mensaje");
		btnCloseWindow.setBackground(new Color(82, 190, 128));
		btnCloseWindow.setForeground(Color.WHITE);
		btnCloseWindow.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnCloseWindow.setBounds(460, 32, 170, 35);
		btnCloseWindow.setBorderPainted(false);
		PanelContBtn.add(btnCloseWindow);
	}

}