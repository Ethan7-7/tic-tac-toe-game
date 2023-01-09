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
import javax.swing.JOptionPane;
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

public class info_personvscomputer extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	static indication_window INDICATION_WINDOW;
	static JPanel Panel2, Panel3, PanelCont1, PanelCont2, PanelCont3;
	static JLabel lbltl1, lbltl2, lblicon, lblsubtl1, lblsubtl2;
	static JButton btn, btnclose, btnconslt;
	static JTextPane txt_mssg1, txt_mssg2;
	static JSeparator sp;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		try {
			info_personvscomputer dialog = new info_personvscomputer();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public info_personvscomputer() {
		setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_security_message\\jkl_1.png"));
		setTitle("Acerca de | Modo de juego: persona vs algoritmo");
		setType(Type.POPUP);
		setResizable(false);
		setBounds(100, 30, 1185, 667);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(new Color(97, 106, 107));
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);

		btn = new JButton();
		btn.setBounds(0, 0, 0, 0);
		Panel1.add(btn);
		
		Panel2 = new JPanel();
		Panel2.setForeground(Color.WHITE);
		Panel2.setBounds(33, 25, 752, 80);
		Panel2.setBackground(new Color(97, 106, 107));
		Panel2.setLayout(null);
		Panel1.add(Panel2);
		
		Panel3 = new JPanel();
		Panel3.setBounds(940, 5, 200, 129);
		Panel3.setBackground(new Color(97, 106, 107));
		Panel3.setLayout(null);
		Panel1.add(Panel3);
		
		PanelCont1 = new JPanel();
		PanelCont1.setForeground(Color.WHITE);
		PanelCont1.setBackground(new Color(97, 106, 107));
		PanelCont1.setBounds(22, 160, 553, 472);
		PanelCont1.setLayout(null);
		Panel1.add(PanelCont1);
		
		PanelCont2 = new JPanel();
		PanelCont2.setForeground(Color.WHITE);
		PanelCont2.setBackground(new Color(97, 106, 107));
		PanelCont2.setBounds(594, 160, 553, 313);
		PanelCont2.setLayout(null);
		Panel1.add(PanelCont2);
		
		PanelCont3 = new JPanel();
		PanelCont3.setBackground(new Color(97, 106, 107));
		PanelCont3.setBounds(594, 480, 553, 118);
		PanelCont3.setLayout(null);
		Panel1.add(PanelCont3);
		
		lblsubtl1 = new JLabel();
		lblsubtl1.setForeground(Color.WHITE);
		lblsubtl1.setText("¿Cómo se juega en este modo?");
		lblsubtl1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 21));
		lblsubtl1.setHorizontalAlignment(SwingConstants.LEFT);
		lblsubtl1.setBounds(5, 21, 538, 30);
		PanelCont1.add(lblsubtl1);
		
		lblsubtl2 = new JLabel();
		lblsubtl2.setForeground(Color.WHITE);
		lblsubtl2.setText("Funcionalidad");
		lblsubtl2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 21));
		lblsubtl2.setHorizontalAlignment(SwingConstants.LEFT);
		lblsubtl2.setBounds(5, 21, 550, 30);
		PanelCont2.add(lblsubtl2);
		
		lbltl1 = new JLabel();
		lbltl1.setForeground(Color.WHITE);
		lbltl1.setText("Modo de juego");
		lbltl1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		lbltl1.setHorizontalAlignment(SwingConstants.LEFT);
		lbltl1.setBounds(10, 15, 200, 50);
		Panel2.add(lbltl1);
		
		lbltl2 = new JLabel();
		lbltl2.setForeground(Color.WHITE);
		lbltl2.setText("persona vs algoritmo (nuevo) - BETA");
		lbltl2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		lbltl2.setHorizontalAlignment(SwingConstants.LEFT);
		lbltl2.setBounds(220, 15, 516, 50);
		Panel2.add(lbltl2);
		
		lblicon = new JLabel();
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\info_game_mode_personvscomputer\\personvscomputer1.png"));
		lblicon.setBounds(4, 4, 190, 120);
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setVerticalAlignment(SwingConstants.CENTER);
		lblicon.setFocusCycleRoot(isFocusCycleRoot());
		Panel3.add(lblicon);
		
		txt_mssg1 = new JTextPane();
		txt_mssg1.setForeground(Color.WHITE);
		txt_mssg1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		txt_mssg1.setText("El modo de juego persona contra algoritmo es fácil de jugar, pues solo se necesita de un persona, mientras que la computadora tomara el papel del segundo contrincante."
				+ "\n\nAl igual que en el modo uno a uno (clásico) ingresas tu nombre o un nombre de usuario, también."
				+ "\n\nPodrás consultar en el papel del estado de juego el turno de cada uno, mientras que en el panel aparecerá el nombre que hayas ingresado, el avatar del algoritmo será representado como ‘ordenador’,  ‘computadora’ o ‘algoritmo’."
				+ "\n\nLas reglas tampoco cambian, aquel que llegue a los 10 puntos primero gana, si ambos contrincantes los acumulan al mismo tiempo (poco probable) es empate, puedes consultar el puntaje en el panel del estado del juego.");
		txt_mssg1.setBounds(5, 60, 538, 401);
		txt_mssg1.setBackground(new Color(97, 106, 107));
		txt_mssg1.setEditable(false);
		PanelCont1.add(txt_mssg1);
		
		txt_mssg2 = new JTextPane();
		txt_mssg2.setForeground(Color.WHITE);
		txt_mssg2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		txt_mssg2.setText("Después de ingresar tu nombre o nombre de usuario tundras que seleccionar el avatar a jugar ‘X’ o ‘O’, se lanzara un mensaje se confirmación al dar clic en aceptar  se te dirigirá al juego."
				+ "\n\nUna vez ya en el juego tú serás el primero en comenzar, pues el algoritmo necesita un primer dato para comenzar a funcionar."
				+ "\n\nCada que hagas un movimiento el algoritmo trata de predecir cuál podría ser tu siguiente movimiento y de esta forma realizara un movimiento para cerrarte  ");
		txt_mssg2.setBounds(5, 60, 550, 242);
		txt_mssg2.setBackground(new Color(97, 106, 107));
		txt_mssg2.setEditable(false);
		PanelCont2.add(txt_mssg2);
		
		sp = new JSeparator();
		sp.setBackground(Color.WHITE);
		sp.setForeground(Color.WHITE);
		sp.setBounds(22, 140, 1117, 4);
		Panel1.add(sp);
		
		btnclose = new JButton();
		btnclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnclose.setBackground(new Color(127, 179, 213));
				btnclose.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
				btnclose.setBorderPainted(true);
			}
		});
		btnclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnclose.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnclose.setBackground(new Color(84, 153, 199));
				btnclose.setBorderPainted(false);
			}
		});
		btnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnclose.setText("Entendido, cerrar");
		btnclose.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		btnclose.setForeground(Color.WHITE);
		btnclose.setBackground(new Color(84, 153, 199));
		btnclose.setBounds(15, 37, 220, 42);
		btnclose.setBorderPainted(false);
		PanelCont3.add(btnclose);
		
		btnconslt = new JButton();
		btnconslt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnconslt.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnconslt.setBackground(new Color(125, 206, 160));
				btnconslt.setBorder(BorderFactory.createLineBorder(Color.red));
				btnconslt.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
				btnconslt.setBorderPainted(true);
			}
		});
		btnconslt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnconslt.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnconslt.setBackground(new Color(82, 190, 128));
				btnconslt.setBorderPainted(false);
			}
		});
		btnconslt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				/*INDICATION_WINDOW = new indication_window();
				INDICATION_WINDOW.setVisible(true);*/
				
				JOptionPane.showInternalOptionDialog(null, "Este espacio no se puede visualizar ya que esta en desarrollo.\n\nPor favor, vuelva más tarde.\n\n"
						+ "Gracias por su comprensión.\n\nATTE: equipo de desarrollo de SaspraGames, Inc.\n\n", "No disponible", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,
						null, new Object[] {"Entendido, cerrar mensaje"}, "Entendido, cerrar mensaje");
			}
		});
		btnconslt.setText("Funcionalidad del programa");
		btnconslt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		btnconslt.setForeground(Color.WHITE);
		btnconslt.setBackground(new Color(82, 190, 128));
		btnconslt.setBounds(251, 37, 287, 42);
		btnconslt.setBorderPainted(false);
		PanelCont3.add(btnconslt);
	}

}