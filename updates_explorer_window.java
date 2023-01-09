package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

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
import java.awt.print.Printable;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class updates_explorer_window extends JFrame {

	private JPanel PanelContainer;
	static new_update_message_window NEW_UPDATE_MESSAGE_WINDOW;
	static JPanel PanelContUp, PanelContDown;
	static JPanel PanelArrowLeft, PanelArrowRight;
	static int plantilla;
	
	/*constant*/
	static final int value1=1,value2=2,value3=3,value4=4,value5=5;
	static final String space="  ";
	
	/*Elements - PanelContUp*/
	
	static JLabel lblrow1, lblrow2, lblrow3, lblrow4;
	static JLabel lblicon;
	
	/*Elements - PanelContDown*/
	
	static JLabel lbldesc1, lbldesc2, lbldesc3, lbldesc4;
	static JLabel lblco;
	static JLabel lbliconinterface1;
	static JButton btnexplorer, btn;
	static JPanel PanelContDesc;
	static JLabel lblreturn, lblreturnicon;
	
	/*Elements - PenelArrow*/
	
	static JLabel lblchangeleft, lblchangeright;
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updates_explorer_window frame = new updates_explorer_window();
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public updates_explorer_window() {
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowOpened(WindowEvent e) {
				
				window_opened_event();
								
				plantilla = 1;
			}
		});
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\version_history_updates_window\\"
				+ "version(3).png"));
		setTitle("TicTacToe Game | Explorador de actualizaciones");
		setType(Type.POPUP);
		setResizable(true);
		setBounds(122, 60, 1100, 612);
		PanelContainer = new JPanel();
		PanelContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		PanelContainer.setBackground(new Color(52, 73, 94));
		PanelContainer.setLayout(null);
		setContentPane(PanelContainer);
		
		PanelContUp = new JPanel();
		PanelContUp.setBackground(new Color(52, 73, 94));
		PanelContUp.setLayout(null);
		PanelContUp.setBounds(66, 11, 947, 271);
		PanelContainer.add(PanelContUp);
		
		PanelContDown = new JPanel();
		PanelContDown.setBackground(new Color(52, 73, 94));
		PanelContDown.setLayout(null);
		PanelContDown.setBounds(66, 279, 947, 290);
		PanelContainer.add(PanelContDown);
		
		PanelContDesc = new JPanel();
		PanelContDesc.setBackground(new Color(52, 73, 94));
		PanelContDesc.setBounds(500, 27, 440, 190);
		PanelContDesc.setLayout(null);
		PanelContDown.add(PanelContDesc);
		
		PanelArrowLeft = new JPanel();
		PanelArrowLeft.setBackground(new Color(52, 73, 94));
		PanelArrowLeft.setLayout(null);
		PanelArrowLeft.setBounds(15, 11, 50, 545);
		PanelContainer.add(PanelArrowLeft);
		
		PanelArrowRight = new JPanel();
		PanelArrowRight.setBackground(new Color(52, 73, 94));
		PanelArrowRight.setLayout(null);
		PanelArrowRight.setBounds(1015, 11, 50, 545);
		PanelContainer.add(PanelArrowRight);
		
		/*Elements - PanelArrow*/
		
		lblchangeleft = new JLabel();
		lblchangeleft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblchangeleft.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblchangeleft.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha_left_entered.png"));
			}
		});
		lblchangeleft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblchangeleft.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblchangeleft.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha_left.png"));
			}
		});
		lblchangeleft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(String.valueOf(plantilla).equals(String.valueOf(value5))) {
					
					plantilla4_event();
					
				}else if(String.valueOf(plantilla).equals(String.valueOf(value4))) {
					
					plantilla3_event();
					
				}else if(String.valueOf(plantilla).equals(String.valueOf(value3))) {
					
					plantilla2_event();
					
				}else if(String.valueOf(plantilla).equals(String.valueOf(value2))){
					
					plantilla1_event();
				}
			}
		});
		lblchangeleft.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha_left.png"));
		lblchangeleft.setHorizontalAlignment(SwingConstants.RIGHT);
		lblchangeleft.setBounds(0, 242, 50, 55);
		PanelArrowLeft.add(lblchangeleft);
		
		lblchangeright = new JLabel();
		lblchangeright.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblchangeright.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblchangeright.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha_right_entered.png"));
			}
		});
		lblchangeright.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblchangeright.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblchangeright.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha_right.png"));
			}
		});
		lblchangeright.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
								
				if(String.valueOf(plantilla).equals(String.valueOf(value2))) {
					
					plantilla3_event();
					
				}else if(String.valueOf(plantilla).equals(String.valueOf(value3))){
					
					plantilla4_event();
					
				}else if(String.valueOf(plantilla).equals(String.valueOf(value4))) {
					
					plantilla5_event();

				}
			}
		});
		lblchangeright.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha_right.png"));
		lblchangeright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblchangeright.setBounds(0, 242, 50, 55);
		PanelArrowRight.add(lblchangeright);
		
		/*Elements - PanelContUp*/
		
		lblrow1 = new JLabel();
		lblrow1.setText("Bienvenid@ a la nueva versión");
		lblrow1.setForeground(new Color(175, 238, 238));
		lblrow1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 46));
		lblrow1.setHorizontalAlignment(SwingConstants.CENTER);
		lblrow1.setBounds(223, 50, 724, 50);
		PanelContUp.add(lblrow1);
		
		lblrow2 = new JLabel();
		lblrow2.setText("Versión: 4.1");
		lblrow2.setForeground(new Color(238, 232, 170));
		lblrow2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 37));
		lblrow2.setHorizontalAlignment(SwingConstants.CENTER);
		lblrow2.setBounds(223, 140, 724, 40);
		PanelContUp.add(lblrow2);
		
		lblrow3 = new JLabel();
		lblrow3.setText("TicTacToe Game se ha actualizado recientemente.");
		lblrow3.setForeground(new Color(238, 232, 170));
		lblrow3.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblrow3.setHorizontalAlignment(SwingConstants.CENTER);
		lblrow3.setBounds(223, 210, 724, 40);
		PanelContUp.add(lblrow3);
		
		lblrow4 = new JLabel();
		lblrow4.setText("");
		lblrow4.setForeground(new Color(238, 232, 170));
		lblrow4.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblrow4.setHorizontalAlignment(SwingConstants.CENTER);
		lblrow4.setBounds(223, 240, 724, 40);
		PanelContUp.add(lblrow4);
		
		lblicon = new JLabel("");
		lblicon.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\main\\tic_tac_toe_icon(2).jpg"));
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setBounds(53, 50, 200, 200);
		PanelContUp.add(lblicon);
		
		/*Elements - PanelDown*/
		
		/*JButtons*/
		btn = new JButton();
		btn.setBounds(0,0,0,0);
		PanelContDown.add(btn);
		
		btnexplorer = new JButton();
		btnexplorer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnexplorer.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnexplorer.setBackground(new Color(41, 128, 185));
				btnexplorer.setBorderPainted(true);
				btnexplorer.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
			}
		});
		btnexplorer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnexplorer.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnexplorer.setBackground(new Color(84, 153, 199));
				btnexplorer.setBorderPainted(false);
			}
		});
		btnexplorer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				plantilla2_event();
			}
		});
		btnexplorer.setText("Comenzar a explorar");
		btnexplorer.setForeground(Color.WHITE);
		btnexplorer.setBackground(new Color(84, 153, 199));
		btnexplorer.setFont(new Font("Century Gothic", Font.BOLD, 30));
		btnexplorer.setBounds(276, 90, 400, 50);
		btnexplorer.setBorderPainted(false);
		PanelContDown.add(btnexplorer);
		
		/*JLabels*/
		
		lbldesc1 = new JLabel();
		lbldesc1.setText("");
		lbldesc1.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		lbldesc1.setHorizontalAlignment(SwingConstants.LEFT);
		lbldesc1.setForeground(Color.WHITE);
		lbldesc1.setBounds(0, 27, 440, 30);
		PanelContDesc.add(lbldesc1);
		
		lbldesc2 = new JLabel();
		lbldesc2.setText("");
		lbldesc2.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		lbldesc2.setHorizontalAlignment(SwingConstants.LEFT);
		lbldesc2.setForeground(Color.WHITE);
		lbldesc2.setBounds(0, 67, 440, 30);
		PanelContDesc.add(lbldesc2);
		
		lbldesc3 = new JLabel();
		lbldesc3.setText("");
		lbldesc3.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		lbldesc3.setHorizontalAlignment(SwingConstants.LEFT);
		lbldesc3.setForeground(Color.WHITE);
		lbldesc3.setBounds(0, 108, 440, 30);
		PanelContDesc.add(lbldesc3);
		
		lbldesc4 = new JLabel();
		lbldesc4.setText("");
		lbldesc4.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		lbldesc4.setHorizontalAlignment(SwingConstants.LEFT);
		lbldesc4.setForeground(Color.WHITE);
		lbldesc4.setBounds(0, 149, 440, 30);
		PanelContDesc.add(lbldesc4);
			
		lbliconinterface1 = new JLabel();
		lbliconinterface1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbliconinterface1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbliconinterface1.setBounds(24, 39, 357, 190);
		PanelContDown.add(lbliconinterface1);
		
		lblco = new JLabel();
		lblco.setText("© 2022 - SaspraGames");
		lblco.setHorizontalAlignment(SwingConstants.CENTER);
		lblco.setForeground(Color.WHITE);
		lblco.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblco.setBounds(0, 255, 947, 30);
		PanelContDown.add(lblco);
		
		lblreturn = new JLabel();
		lblreturn.setVerticalAlignment(SwingConstants.TOP);
		lblreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblreturn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblreturn.setForeground(new Color(225, 225, 225));
				lblreturn.setText(space+"Regresar");
				lblreturn.setBounds(384, 170, 170, 40);
				lblreturn.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\flecha-derecha(2).png"));
			}
		});
		lblreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblreturn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblreturn.setForeground(Color.WHITE);
				lblreturn.setIcon(new ImageIcon(""));
				lblreturn.setBounds(380, 170, 170, 32);
			}
		});
		lblreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				
				NEW_UPDATE_MESSAGE_WINDOW = new new_update_message_window();
				NEW_UPDATE_MESSAGE_WINDOW.setVisible(true);
			}
		});
		lblreturn.setText("Regresar");
		lblreturn.setHorizontalAlignment(SwingConstants.CENTER);
		lblreturn.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblreturn.setForeground(Color.WHITE);
		lblreturn.setBounds(390, 170, 168, 32);
		PanelContDown.add(lblreturn);
	}
	
	public static void window_opened_event() {
		
		lblchangeleft.setVisible(false);
		lblchangeright.setVisible(false);
		PanelContDesc.setVisible(false);
		lblrow4.setVisible(false);
		lbliconinterface1.setVisible(false);
		
		lblreturn.setBounds(390, 170, 168, 32);
	}
	
	public static void plantilla1_event() {
				
		lblicon.setVisible(true);
		btnexplorer.setVisible(true);
		lblreturn.setVisible(true);
		
		lblrow1.setBounds(223, 50, 724, 50);
		lblrow2.setBounds(223, 140, 724, 40);
		lblrow3.setBounds(223, 220, 724, 40);
		
		lblrow1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 46));
		lblrow2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 37));
		lblrow3.setFont(new Font("Century Gothic", Font.BOLD, 22));
		
		lblrow1.setText("Bienvenid@ a la nueva versión");
		lblrow2.setText("Versión: 4.1");
		lblrow3.setText("TicTacToe Game se ha actualizado correctamente");
		
		window_opened_event();
	}
	
	public static void plantilla2_event() {
		
		plantilla = 2;
		
		/*Modificación de los textos en las etiquetas del panel inferior*/
		lbldesc1.setText("- El nombre de usuario se almacena");
		lbldesc2.setText("- Puedes modificarlo o conservarlo");
		lbldesc3.setText("- Modificarlo cuantas veces quieras");
		lbldesc4.setText("- Guardar cambios y continuar al juego");
		
		/*Modificación de las medidas y los textos de las etiquetas del panel superior*/
		lblrow1.setBounds(0, 50, 947, 50);
		lblrow2.setBounds(0, 140, 947, 50);
		lblrow3.setBounds(0, 200, 947, 50);
		lblrow4.setBounds(0, 230, 947, 50);
		lblrow1.setText("Versión: 4.1 | Tic Tac Toe Game");
		lblrow2.setText("'Funcionalidad para el usuario'");
		lblrow3.setText("Mejora de funcionalidad en la ventana ‘identificación de usuarios’.");
		lblrow4.setText("Lanzar un mensaje con los cambios guardados y opción de aceptar o modificar datos.");
		
		/*Modificar el tamaño de las fuentes de las etiquetas row3 y row4*/
		lblrow3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblrow4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		lbliconinterface1.setBounds(24, 39, 357, 190);
		lbliconinterface1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\user(2).png"));
				
		elements_visible_event();
	}
	
	public static void plantilla3_event() {
		
		plantilla = 3;
		
		/*Modificación de los textos en las etiquetas del panel inferior*/
		lbldesc1.setText("- Todas las actualizaciones");
		lbldesc2.setText("- Versiones pasadas, actuales y futuras");
		lbldesc3.setText("- Todas disponibles para todos los usuarios");
		lbldesc4.setText("- Consultar las futuras versiones en el sitio web");
	
		/*Modificar las medidas y los textos de las etiquetas del panel superior*/
		lblrow1.setBounds(0, 50, 947, 50);
		lblrow2.setBounds(0, 140, 947, 50);
		lblrow3.setBounds(0, 200, 947, 50);
		lblrow4.setBounds(0, 230, 947, 50);
		lblrow1.setText("Versión: 4.1 | Tic Tac Toe Game");
		lblrow2.setText("'Versiones y actualizaciones del juego'");
		lblrow3.setText("Creación de una nueva ventana ‘historial de versiones’");
		lblrow4.setText("información abierta para todo publico.");
		
		/*Modificar el tamaño de las fuentes de las etiquetas row3 y row4*/
		lblrow3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblrow4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		lbliconinterface1.setBounds(24, 39, 357, 190);
		lbliconinterface1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\actualizaciones.png"));
		
		elements_visible_event();
	}
	
	public static void plantilla4_event() {
		
        plantilla = 4;
		
		/*Modificación de los textos en las etiquetas del panel inferior*/
		lbldesc1.setText("- Consultar las indicaciones del juego");
		lbldesc2.setText("- Cambios de interfaz gráfica");
		lbldesc3.setText("- Aprender a usar la aplicación");
		lbldesc4.setText("- Instrucciones e información del modo de juego");
	
		/*Modificar las medidas y los textos de las etiquetas del panel superior*/
		lblrow1.setBounds(0, 50, 947, 50);
		lblrow2.setBounds(0, 140, 947, 50);
		lblrow3.setBounds(0, 200, 947, 50);
		lblrow4.setBounds(0, 230, 947, 50);
		lblrow1.setText("Versión: 4.1 | Tic Tac Toe Game");
		lblrow2.setText("'Cambios en la interfaz gráfica de usuario'");
		lblrow3.setText("Actualización de las ventanas emergente informativas:");
		lblrow4.setText("‘persona contra persona’ y ‘persona contra algoritmo’.");
		
		/*Modificar el tamaño de las fuentes de las etiquetas row3 y row4*/
		lblrow3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblrow4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		lbliconinterface1.setBounds(24, 39, 390, 190);
		lbliconinterface1.setVerticalAlignment(SwingConstants.CENTER);
		lbliconinterface1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbliconinterface1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\personvscomputer_1.png"));
		
		elements_visible_event();
	}
	
    public static void plantilla5_event() {
		
        plantilla = 5;
		
		/*Modificación de los textos en las etiquetas del panel inferior*/
		lbldesc1.setText("- Cambios en la interfaz gráfica de usuario");
		lbldesc2.setText("- Más didáctico para el usuario");
		lbldesc3.setText("- Mejor diseño y estilo de fuentes");
		lbldesc4.setText("");
	
		/*Modificar las medidas y los textos de las etiquetas del panel superior*/
		lblrow1.setBounds(0, 50, 947, 50);
		lblrow2.setBounds(0, 140, 947, 50);
		lblrow3.setBounds(0, 200, 947, 50);
		lblrow4.setBounds(0, 230, 947, 50);
		lblrow1.setText("Versión: 4.1 | Tic Tac Toe Game");
		lblrow2.setText("'Correción de errores'");
		lblrow3.setText(" Cambios de interfaz de usuario en la ventana: ‘Selección de avatar‘.");
		lblrow4.setText("");
		
		/*Modificar el tamaño de las fuentes de las etiquetas row3 y row4*/
		lblrow3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblrow4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
	    lbliconinterface1.setBounds(24, 39, 400, 190);
		lbliconinterface1.setVerticalAlignment(SwingConstants.CENTER);
		lbliconinterface1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbliconinterface1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\updates_explorer_window\\avatar_position.png"));
		
		elements_visible_event();
	}
	
	public static void elements_visible_event() {
		
		/*Mostrar el panel con las descripciones*/
		PanelContDesc.setVisible(true);
		
		/*Ocultar la etiqueta con el icono*/
		lblicon.setVisible(false);
		
		/*Mostrar etiqueta lblrow4*/
		lblrow4.setVisible(true);
		
		/*Mostrar las flechas de dirección de las plantillas*/
		lblchangeleft.setVisible(true);
		lblchangeright.setVisible(true);
		
		if(String.valueOf(plantilla).equals(String.valueOf(value5))) {
			
			lblchangeright.setVisible(false);
		}
		
		/*Ocultar el botón principal*/
		btnexplorer.setVisible(false);
		
		/*Mostrar el icono*/
		lbliconinterface1.setVisible(true);
		
                /*Ocultar la flecha de retorno*/
		lblreturn.setVisible(false);
	}
}