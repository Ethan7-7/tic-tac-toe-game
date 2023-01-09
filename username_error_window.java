package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class username_error_window extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static JLabel lbl_info, lbl2, lbl3, lblIcon;
	static JButton btn, btn_1;
	static message_security message_sry;

	/**
	 * Create the dialog.
	 */
	public username_error_window() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\Index_gato_game\\Index\\Icon\\page_error\\fgh_1.png"));
		setType(Type.POPUP);
		setResizable(false);
		setTitle("Datos incompletos");
		setBounds(440, 200, 472, 264);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(Color.WHITE);
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn.setBackground(new Color(52, 73, 94));
				lbl_info.setForeground(Color.BLACK);
			}
		});
		
		btn_1 = new JButton();
		btn_1.setBounds(0, 0, 0, 0);
		Panel1.add(btn_1);
	   
		lbl2 = new JLabel("Para continuar deben ingresar el nombre de ");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(Color.BLACK);
		lbl2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lbl2.setBounds(0, 88, 458, 30);
		Panel1.add(lbl2);
		
		lbl3 = new JLabel("ambos jugadores");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(Color.BLACK);
		lbl3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lbl3.setBounds(0, 121, 458, 30);
		Panel1.add(lbl3);
		
		lbl_info = new JLabel();
		lbl_info.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lbl_info.setForeground(Color.BLUE);
				lbl_info.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		lbl_info.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				mht();
			}
		});
		lbl_info.setText("Más información");
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setForeground(Color.BLACK);
		lbl_info.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 18));
		lbl_info.setBounds(271, 29, 177, 30);
		Panel1.add(lbl_info);
		
		btn = new JButton("Aceptar");
		btn.setVerticalAlignment(SwingConstants.BOTTOM);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn.setBackground(new Color(93, 109, 126));
				btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btn.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		btn.setBackground(new Color(52, 73, 94));
		btn.setBounds(150, 180, 158, 32);
		btn.setForeground(Color.WHITE);
		btn.setBorderPainted(false);
		Panel1.add(btn);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_error\\fgh.png"));
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setBounds(20, 20, 60, 60);
		Panel1.add(lblIcon);
		
	}
	
	private void mht() {
		
		dispose();
		
		message_sry = new message_security();
		message_sry.setVisible(true);
	}
	
	/**
	 * 
	 * public static void mht() {
	
		if(JOptionPane.showInternalOptionDialog(null, "\n Su nombre y el de su compañer@ se utiliza para tener una mejor experiencia de juego. \n"
				+ " Dichos datos no los usaremos para otros fines. \n\n - No se almacena en ningúna base de datos"
				+ "\n - No lo divulgamos \n Etc. \n\n Una vez que se cierra este programa los datos se pierden \n", "Aviso de seguridad",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Entiendo, continuar al juego", 
						"No estoy de acuerdo"}, 
				"Entiendo, continuar al juego") == JOptionPane.NO_OPTION) {
			
			thm();
		}
	}
	
	public static void thm() {
		
		if(JOptionPane.showInternalOptionDialog(null, "¿Deseas salir de la aplicación?", "Confirma", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] {"Salir", "Cancelar"}, "Cancelar") == JOptionPane.YES_OPTION) {
			
			System.exit(0);
		}
	}
	 */
}