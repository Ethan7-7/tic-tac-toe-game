package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
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

public class new_update_message_window extends JDialog {

	private final JPanel PanelContainer = new JPanel();
	static updates_explorer_window UPDATES_EXPLORER_WINDOW;
	static JPanel PanelIcon, PanelContMssg1, PanelContMssg2;
	static JPanel PanelContBtn;
	static JLabel lblicon, lbltitle, lblsubtitle, lblvrs;
	static JLabel lblsubtl2, lblrow1, lblrow_1, lblrow2, lblrow_2;
	static JLabel lblrow3, lblrow_3, lblrow4, lblrow_4;
	static JLabelLink lbllink;
	static JButton btnclose, btnexplore, btn;

	/**
	 * Create the dialog.
	 */
	public new_update_message_window() {
		setBounds(200, 60, 950, 600);
		setTitle("Nueva actualización: 4.1");
		setResizable(false);
		setType(Type.POPUP);
		PanelContainer.setBackground(new Color(52, 73, 94));
		PanelContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		PanelContainer.setLayout(null);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(PanelContainer, BorderLayout.CENTER);
		PanelContainer.setLayout(null);
		
		PanelIcon = new JPanel();
		PanelIcon.setBackground(new Color(52, 73, 94));
		PanelIcon.setBounds(10, 51, 316, 403);
		PanelIcon.setLayout(null);
		PanelContainer.add(PanelIcon);
		
		PanelContMssg1 = new JPanel();
		PanelContMssg1.setBackground(new Color(52, 73, 94));
		PanelContMssg1.setBounds(336, 51, 598, 180);
		PanelContainer.add(PanelContMssg1);
		
		PanelContMssg2 = new JPanel();
		PanelContMssg2.setBackground(new Color(52, 73, 94));
		PanelContMssg2.setBounds(336, 231, 598, 223);
		PanelContainer.add(PanelContMssg2);
		
		PanelContBtn = new JPanel();
		PanelContBtn.setBackground(new Color(52, 73, 94));
		PanelContBtn.setBounds(10, 460, 924, 100);
		PanelContBtn.setLayout(null);
		PanelContainer.add(PanelContBtn);
		
		lblicon = new JLabel();
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\indications_of_use_window\\tic-tac-toe (7).png"));
		lblicon.setBounds(0, 35, 316, 306);
		PanelIcon.add(lblicon);
		PanelContMssg1.setLayout(null);
		
		lbltitle = new JLabel();
		lbltitle.setBounds(0, 10, 598, 30);
		lbltitle.setText("Hemos actualizado la aplicación.");
		lbltitle.setForeground(Color.WHITE);
		lbltitle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		PanelContMssg1.add(lbltitle);
		
		lblsubtitle = new JLabel();
		lblsubtitle.setBounds(0, 70, 598, 30);
		lblsubtitle.setText("TicTacToe Game se ha actualizado correctamente.");
		lblsubtitle.setForeground(Color.WHITE);
		lblsubtitle.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblsubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		PanelContMssg1.add(lblsubtitle);
		
		lblvrs = new JLabel();
		lblvrs.setBounds(0, 125, 598, 35);
		lblvrs.setText("Versi\u00F3n: 4.1");
		lblvrs.setForeground(Color.WHITE);
		lblvrs.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 33));
		lblvrs.setHorizontalAlignment(SwingConstants.CENTER);
		PanelContMssg1.add(lblvrs);
		PanelContMssg2.setLayout(null);
		
		lblsubtl2 = new JLabel();
		lblsubtl2.setBounds(0, 13, 574, 30);
		lblsubtl2.setText("\u00BFCu\u00E1les son las nuevas mejoras?");
		lblsubtl2.setForeground(Color.WHITE);
		lblsubtl2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblsubtl2.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblsubtl2);
		
		lblrow1 = new JLabel();
		lblrow1.setBounds(0, 55, 588, 20);
		lblrow1.setText("- Mejora de funcionalidad en la ventana \u2018identificaci\u00F3n de usuarios\u2019");
		lblrow1.setForeground(Color.WHITE);
		lblrow1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow1.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow1);
		
		lblrow_1 = new JLabel();
		lblrow_1.setBounds(0, 75, 588, 20);
		lblrow_1.setText("   lanzar un mensaje con los cambios guardados y opci\u00F3n de aceptar o modificar datos.");
		lblrow_1.setForeground(Color.WHITE);
		lblrow_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow_1.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow_1);
		
		lblrow2 = new JLabel();
		lblrow2.setText("- Creación de una nueva ventana ‘historial de versiones’ información abierta");
		lblrow2.setBounds(0, 100, 588, 20);
		lblrow2.setForeground(Color.WHITE);
		lblrow2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow2.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow2);
		
		lblrow_2 = new JLabel();
		lblrow_2.setText("   para todo publico.");
		lblrow_2.setBounds(0, 120, 588, 20);
		lblrow_2.setForeground(Color.WHITE);
		lblrow_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow_2.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow_2);
		
		lblrow3 = new JLabel();
		lblrow3.setText("- Actualización de las ventanas emergente informativas: ‘persona contra persona’ y");
		lblrow3.setBounds(0, 145, 588, 20);
		lblrow3.setForeground(Color.WHITE);
		lblrow3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow3.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow3);
		
		lblrow3 = new JLabel();
		lblrow3.setText("   ‘persona contra algoritmo’.");
		lblrow3.setBounds(0, 165, 588, 20);
		lblrow3.setForeground(Color.WHITE);
		lblrow3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow3.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow3);
		
		lblrow4 = new JLabel();
		lblrow4.setText("- Cambios de interfaz de usuario en la ventana: ‘Selección de avatar‘.");
		lblrow4.setBounds(0, 190, 588, 20);
		lblrow4.setForeground(Color.WHITE);
		lblrow4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblrow4.setHorizontalAlignment(SwingConstants.LEFT);
		PanelContMssg2.add(lblrow4);
		
		btn = new JButton();
		btn.setBounds(0,0,0,0);
		PanelContainer.add(btn);
		
		btnexplore = new JButton();
		btnexplore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnexplore.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnexplore.setBackground(new Color(88, 214, 141));
				btnexplore.setBorderPainted(true);
				btnexplore.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
			}
		});
		btnexplore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnexplore.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnexplore.setBackground(new Color(46, 204, 113));
				btnexplore.setBorderPainted(false);
			}
		});
		btnexplore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				UPDATES_EXPLORER_WINDOW = new updates_explorer_window();
				UPDATES_EXPLORER_WINDOW.setVisible(true);
			}
		});
		btnexplore.setText("Explorar actualizaciones");
		btnexplore.setForeground(Color.WHITE);
		btnexplore.setBackground(new Color(82, 190, 128));
		btnexplore.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 21));
		btnexplore.setBounds(370, 32, 270, 40);
		btnexplore.setBorderPainted(false);
		PanelContBtn.add(btnexplore);
		
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
				
				dispose();
			}
		});
		btnclose.setText("Comenzar a jugar");
		btnclose.setForeground(Color.WHITE);
		btnclose.setBackground(new Color(84, 153, 199));
		btnclose.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 21));
		btnclose.setBounds(662, 32, 210, 40);
		btnclose.setBorderPainted(false);
		PanelContBtn.add(btnclose);
	}
}