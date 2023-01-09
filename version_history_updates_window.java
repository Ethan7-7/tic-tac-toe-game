package tic_tac_toe_game_java;

import java.awt.EventQueue;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URI;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JScrollBar;


public class version_history_updates_window extends JDialog{

	static final JPanel PanelC = new JPanel();
	
	static JLabel lbltitle, lblicon, lbl1;
	static JLabelLink lbllink;
	static JButton btn, btnclose;
	static JSeparator JP;
	static JPanel Paneltitle, Panelicon, Panelcontent1, Panelcontent2, Panelcontent3;
	static JPanel Panel1, Panel2, Panel3, Panel4, Panel5, Panel6;
	static JLabel lblvrs1, lblvrs2, lblvrs3, lblvrs4, lblvrs5, lblvrs6;
	static JTextPane txt1, txt2, txt3, txt4, txt5, txt6;
	
	
	/*public static void main(String[] args) {
		try {
			version_history_updates_window dialog = new version_history_updates_window();
			dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public version_history_updates_window() {
		
		setTitle("Versiones y actualizaciones del juego");
		setType(Type.POPUP);
		setResizable(false);
		setBounds(125, 60, 1094, 646);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_security_message\\jkl_1.png"));
		getContentPane().setLayout(new BorderLayout());
		PanelC.setBorder(new LineBorder(new Color(192, 192, 192), 0));
		getContentPane().add(PanelC, BorderLayout.CENTER);
		PanelC.setBackground(new Color(97, 106, 107));
		PanelC.setLayout(null);
		
		/*
		lbllink = new JLabelLink();
		lbllink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lbllink.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lbllink.setForeground(Color.LIGHT_GRAY);
			}
		});
		lbllink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lbllink.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lbllink.setForeground(Color.WHITE);
			}
		});
		lbllink.setText("Más información");
		lbllink.setForeground(Color.WHITE);
		lbllink.setLink("http://localhost/Tic%20Tac%20Toe%20-%20Java/Centro%20de%20ayuda/modo%20de%20juego%20uno%20a%20uno.html");
		lbllink.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		lbllink.setHorizontalAlignment(SwingConstants.CENTER);
		lbllink.setSize( 300,120);
		Window.getContentPane().add(lbllink);
		*/
		
		Paneltitle = new JPanel();
		Paneltitle.setBackground(new Color(97, 106, 107));
		Paneltitle.setBounds(10, 26, 750, 97);
		Paneltitle.setLayout(null);
		PanelC.add(Paneltitle);
		
		lbltitle = new JLabel();
		lbltitle.setText("Historial de versiones y actualizaciones");
		lbltitle.setForeground(Color.WHITE);
		lbltitle.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 23));
		lbltitle.setHorizontalAlignment(SwingConstants.LEFT);
		lbltitle.setBounds(10, 0, 542, 50);
		Paneltitle.add(lbltitle);
		
		lbl1 = new JLabel("Estas son solo algunas de las versiones, para ver el historial completo visita el sitio web:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setForeground(Color.WHITE);
		lbl1.setBounds(10, 60, 570, 30);
		Paneltitle.add(lbl1);
		
		lbllink = new JLabelLink();
		lbllink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lbllink.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lbllink.setForeground(Color.lightGray);
			}
		});
		lbllink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lbllink.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lbllink.setForeground(Color.WHITE);
			}
		});
		lbllink.setText("www.SaspraGames.com");
		lbllink.setLink("http://localhost/www.SaspraGames.com/TicTacToe/Data/Versiones/");
		lbllink.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lbllink.setForeground(Color.WHITE);
		lbllink.setBounds(585, 59, 160, 30);
		Paneltitle.add(lbllink);
		
		Panelicon = new JPanel();
		Panelicon.setBackground(new Color(97, 106, 107));
		Panelicon.setBounds(931, 12, 120, 120);
		Panelicon.setLayout(null);
		PanelC.add(Panelicon);
		
		lblicon = new JLabel();
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setBounds(2, 2, 115, 115);
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\version_history_updates_window\\version(5).png"));
		Panelicon.add(lblicon);
		
		JP = new JSeparator();
		JP.setForeground(Color.WHITE);
		JP.setBackground(Color.WHITE);
		JP.setBounds(20, 143, 1031, 2);
		PanelC.add(JP);
		
		Panelcontent1 = new JPanel();
		Panelcontent1.setBackground(new Color(97, 106, 107));
		Panelcontent1.setBounds(10, 160, 1041, 195);
		Panelcontent1.setLayout(null);
		PanelC.add(Panelcontent1);
		
		Panel1 = new JPanel();
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel1.setBackground(new Color(98, 101, 103));
				txt1.setBackground(new Color(98, 101, 103));
			}
		});
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel1.setBackground(new Color(121, 125, 127));
	    		txt1.setBackground(new Color(121, 125, 127));
			}
		});
		Panel1.setBackground(new Color(121, 125, 127));
		Panel1.setBounds(10, 5, 332, 179);
		Panel1.setLayout(null);
		Panelcontent1.add(Panel1);
		
		lblvrs1 = new JLabel();
		lblvrs1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		lblvrs1.setText("Versión 1.2");
		lblvrs1.setForeground(Color.WHITE);
		lblvrs1.setHorizontalAlignment(SwingConstants.LEFT);
		lblvrs1.setBounds(10, 3, 312, 30);
		Panel1.add(lblvrs1);
		
		txt1 = new JTextPane();
		txt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				txt1.setBackground(new Color(98, 101, 103));
				Panel1.setBackground(new Color(98, 101, 103));
			}
		});
		txt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel1.setBackground(new Color(121, 125, 127));
	    		txt1.setBackground(new Color(121, 125, 127));
			}
		});
		txt1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txt1.setText("- Modo de juego uno a uno (cl\u00E1sico)\n- Menú en la ventana del juego con acceso rápido\n- Pestaña de diseño\n- Diferentes tipogragias.");
		txt1.setBackground(new Color(121, 125, 127));
		txt1.setForeground(Color.WHITE);
		txt1.setBounds(10, 40, 312, 128);
		txt1.setEditable(false);
		Panel1.add(txt1);
		
		Panel2 = new JPanel();
		Panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel2.setBackground(new Color(98, 101, 103));
				txt2.setBackground(new Color(98, 101, 103));
			}
		});
		Panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel2.setBackground(new Color(121, 125, 127));
	    		txt2.setBackground(new Color(121, 125, 127));
			}
		});
		Panel2.setLayout(null);
		Panel2.setBackground(new Color(121, 125, 127));
		Panel2.setBounds(357, 5, 332, 179);
		Panelcontent1.add(Panel2);
		
	    lblvrs2 = new JLabel();
		lblvrs2.setText("Versi\u00F3n 1.2.3");
		lblvrs2.setHorizontalAlignment(SwingConstants.LEFT);
		lblvrs2.setForeground(Color.WHITE);
		lblvrs2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		lblvrs2.setBounds(10, 3, 312, 30);
		Panel2.add(lblvrs2);
		
		txt2 = new JTextPane();
		txt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel2.setBackground(new Color(98, 101, 103));
				txt2.setBackground(new Color(98, 101, 103));
			}
		});
		txt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel2.setBackground(new Color(121, 125, 127));
	    		txt2.setBackground(new Color(121, 125, 127));
			}
		});
		txt2.setText("- Mejoras en la interacción del juego\n- Ventana de elección de avatar ‘X’ y/o ‘O’\n- Pedir nombre de jugadores para mejor experiencia de juego"
				+ "\n- Cambios y mejoras en la funcionalidad de los botones principales\n- Creación de más ventanas emergentes.");
		txt2.setForeground(Color.WHITE);
		txt2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txt2.setBackground(new Color(121, 125, 127));
		txt2.setBounds(10, 40, 312, 128);
		txt2.setEditable(false);
		Panel2.add(txt2);
		
	    Panel3 = new JPanel();
	    Panel3.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		
	    		Panel3.setBackground(new Color(98, 101, 103));
	    		txt3.setBackground(new Color(98, 101, 103));
	    	}
	    });
	    Panel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel3.setBackground(new Color(121, 125, 127));
	    		txt3.setBackground(new Color(121, 125, 127));
			}
		});
		Panel3.setBounds(704, 5, 332, 179);
		Panel3.setLayout(null);
		Panel3.setBackground(new Color(121, 125, 127));
		Panelcontent1.add(Panel3);
		
		lblvrs3 = new JLabel();
		lblvrs3.setText("Versi\u00F3n 2.1");
		lblvrs3.setHorizontalAlignment(SwingConstants.LEFT);
		lblvrs3.setForeground(Color.WHITE);
		lblvrs3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		lblvrs3.setBounds(10, 3, 312, 30);
		Panel3.add(lblvrs3);
		
		txt3 = new JTextPane();
		txt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel3.setBackground(new Color(98, 101, 103));
	    		txt3.setBackground(new Color(98, 101, 103));
			}
		});
		txt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel3.setBackground(new Color(121, 125, 127));
	    		txt3.setBackground(new Color(121, 125, 127));
			}
		});
		txt3.setText("- Cambios y mejoras en la interfaz de usuario\n- Mejoras en la ventana de salida"
				+ "\n- Creación de ventana emergente para notificar sobre el error en el nombre de usuario ingresado\n- Restricción de 13 caracteres para el nombre de usuario");
		txt3.setForeground(Color.WHITE);
		txt3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txt3.setBackground(new Color(121, 125, 127));
		txt3.setBounds(10, 40, 312, 128);
		txt3.setEditable(false);
		Panel3.add(txt3);
		
		/* Panel content 2 */
		
		Panelcontent2 = new JPanel();
		Panelcontent2.setBackground(new Color(97, 106, 107));
		Panelcontent2.setBounds(10, 365, 1041, 206);
		Panelcontent2.setLayout(null);
		PanelC.add(Panelcontent2);
		
		Panel4 = new JPanel();
		Panel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel4.setBackground(new Color(98, 101, 103));
				txt4.setBackground(new Color(98, 101, 103));
			}
		});
		Panel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel4.setBackground(new Color(121, 125, 127));
				txt4.setBackground(new Color(121, 125, 127));
			}
		});
		Panel4.setBackground(new Color(121, 125, 127));
		Panel4.setBounds(10, 5, 332, 195);
		Panel4.setLayout(null);
		Panelcontent2.add(Panel4);
		
		lblvrs4 = new JLabel();
		lblvrs4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		lblvrs4.setText("Versión 2.1.3");
		lblvrs4.setForeground(Color.WHITE);
		lblvrs4.setHorizontalAlignment(SwingConstants.LEFT);
		lblvrs4.setBounds(10, 3, 312, 30);
		Panel4.add(lblvrs4);
		
		txt4 = new JTextPane();
		txt4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel4.setBackground(new Color(98, 101, 103));
				txt4.setBackground(new Color(98, 101, 103));
			}
		});
		txt4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel4.setBackground(new Color(121, 125, 127));
				txt4.setBackground(new Color(121, 125, 127));
			}
		});
		txt4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txt4.setText("- Se envía el nombre de usuario a la ventana de juego para mejor experiencia de juego\n- Mejoras en la ventana de salida cuando algún jugador ha ganado la partida\n"
				+ "- Mejoras de calidad en los iconos\n- Mejoras en la funcionalidad de la ventana de juego, cuando el nombre de usuarios no se ha registrado correctamente");
		txt4.setBackground(new Color(121, 125, 127));
		txt4.setForeground(Color.WHITE);
		txt4.setBounds(10, 40, 312, 150);
		txt4.setEditable(false);
		Panel4.add(txt4);
		
		Panel5 = new JPanel();
		Panel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel5.setBackground(new Color(98, 101, 103));
				txt5.setBackground(new Color(98, 101, 103));
			}
		});
		Panel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel5.setBackground(new Color(121, 125, 127));
				txt5.setBackground(new Color(121, 125, 127));
			}
		});
		Panel5.setBackground(new Color(121, 125, 127));
		Panel5.setBounds(357, 5, 332, 195);
		Panel5.setLayout(null);
		Panelcontent2.add(Panel5);
		
		lblvrs5 = new JLabel();
		lblvrs5.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		lblvrs5.setText("Versi\u00F3n 3.1");
		lblvrs5.setForeground(Color.WHITE);
		lblvrs5.setHorizontalAlignment(SwingConstants.LEFT);
		lblvrs5.setBounds(10, 3, 312, 30);
		Panel5.add(lblvrs5);
		
		txt5 = new JTextPane();
		txt5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel5.setBackground(new Color(98, 101, 103));
				txt5.setBackground(new Color(98, 101, 103));
			}
		});
		txt5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel5.setBackground(new Color(121, 125, 127));
				txt5.setBackground(new Color(121, 125, 127));
			}
		});
		txt5.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txt5.setText("- Creación de ventana de inicio\n- Creación de ventana de elección de modo de juego\n- Inclusión de un nuevo modo de juego persona contra algoritmo (estado beta)\n"
				+ "- Creación de más ventanas emergentes para ventana de inicio y elección de modo de juego\n- Posibilidad de abrir la ventana de juego sin haber ingresado el nombre de usuario");
		txt5.setBackground(new Color(121, 125, 127));
		txt5.setForeground(Color.WHITE);
		txt5.setBounds(10, 40, 312, 150);
		txt5.setEditable(false);
		Panel5.add(txt5);
		
		Panel6 = new JPanel();
		Panel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel6.setBackground(new Color(98, 101, 103));
				txt6.setBackground(new Color(98, 101, 103));
			}
		});
		Panel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel6.setBackground(new Color(121, 125, 127));
				txt6.setBackground(new Color(121, 125, 127));
			}
		});
		Panel6.setBackground(new Color(121, 125, 127));
		Panel6.setBounds(704, 5, 332, 195);
		Panel6.setLayout(null);
		Panelcontent2.add(Panel6);
		
		lblvrs6 = new JLabel();
		lblvrs6.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		lblvrs6.setText("Versi\u00F3n 3.1.2");
		lblvrs6.setForeground(Color.WHITE);
		lblvrs6.setHorizontalAlignment(SwingConstants.LEFT);
		lblvrs6.setBounds(10, 3, 312, 30);
		Panel6.add(lblvrs6);
		
		txt6 = new JTextPane();
		txt6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel6.setBackground(new Color(98, 101, 103));
				txt6.setBackground(new Color(98, 101, 103));
			}
		});
		txt6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Panel6.setBackground(new Color(121, 125, 127));
				txt6.setBackground(new Color(121, 125, 127));
			}
		});
		txt6.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txt6.setText("- Conexión entre las ventanas de principales (inicio, elección de modo de juego, identificación de los jugadores y ventana de juego)\n- Se creó una etiqueta para volver a las ventanas anteriores\n"
				+ "- Etiqueta en la ventana de juego para volver a la ventana anterior, siempre y cuando el puntaje de ambos jugadores este en cero");
		txt6.setBackground(new Color(121, 125, 127));
		txt6.setForeground(Color.WHITE);
		txt6.setBounds(10, 40, 312, 150);
		txt6.setEditable(false);
		Panel6.add(txt6);
	}
}