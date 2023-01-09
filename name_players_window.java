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

public class name_players_window extends JDialog {

	static final JPanel Panel1 = new JPanel();
	
	static game_mode_selection_window game_mode_selection_page;
	static tic_tac_toe_game_mode_classic start;
    static username_error_window USERNAME_ERROR_MESSAGE;
	static username_message USERNAME_CHARACTER_ERROR;
	static position_confirmation_window CONFIRMATION_WINDOW;
	static JLabel lbl1_message, lbl2_message, lbl3, lbl1_playerX, lbl1_playerO, lblDR;
	static JLabel lbl_return;
	static JButton btnContinue, btn_exit;
	static JPanel Panel3, Panel2, Panelcont1, Panelcont2;
	static final String j = "Escribe tu nombre de usuario...", g = "";
	static final String option1 = "Guardar cambios", option2 = "Continuar al juego";
	static JTextPane txt1, txt2;
	static JSeparator SP;
	static JSeparator separator1;
	static JSeparator separator2;
	static JLabel lbltest;
	static JLabel lbl_avatar1, lbl_avatar2;
	static int act1, act2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			name_players_window dialog = new name_players_window();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public name_players_window() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				/*WINDOW_OPENED_EVENT();*/
								
				Panelcont1.setVisible(false);
				Panelcont2.setVisible(false);
			    
				lbl1_playerX.setBounds(50, 0, 214, 300);
				lbl_avatar1.setBounds(246, 0, 126, 300);
				
				lbl1_playerO.setBounds(50, 0, 214, 300);
				lbl_avatar2.setBounds(246, 0, 126, 300);
				
				lbl1_message.setText("Seleccionen una posici�n para jugar.");
				
				btnContinue.setBackground(new Color(141, 186, 232));
				/*btnContinue.setForeground(new Color(242, 243, 244));*/
				btnContinue.setEnabled(false);
				
				act1 = 0;act2 = 0;
			}
		});
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\Index_gato_game\\Index\\Icon\\Page_name_players\\user_as.png"));
		setTitle("TicTacToe Game | Selecci�n de avatar");
		setType(Type.POPUP);
		setResizable(false);
		setBounds(130, 30, 1100, 664);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBackground(new Color(234, 237, 237));
		Panel1.setBorder(new LineBorder(new Color(192, 192, 192), 0));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		Panel1.setLayout(null);
		
		Panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				MOUSE_ENTERED_EVENT();
			}
		});
		
		Panel3 = new JPanel();
		Panel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel3_click_event();
			}
		});
		Panel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel3.setBackground(new Color(239, 72, 68));
				txt2.setBackground(new Color(239, 72, 68));
				
				Panelcont2.setBackground(new Color(239, 72, 68));
				
				Panel3_mouse_entered_event();
			}
		});
		Panel3.setLayout(null);
		Panel3.setBorder(new LineBorder(new Color(204, 42, 39), 5, true));
		Panel3.setBackground(new Color(230, 65, 61));
		Panel3.setBounds(588, 186, 400, 300);
		Panel1.add(Panel3);
		
		Panel2 = new JPanel();
		Panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel2_click_event();
			}
		});
		Panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel2.setBackground(new Color(72, 167, 158));
				txt1.setBackground(new Color(72, 167, 158));
				
				Panelcont1.setBackground(new Color(72, 167, 158));
				
				Panel2_mouse_entered_event();
			}
		});
		Panel2.setBackground(new Color(73, 158, 150));
		Panel2.setBorder(new LineBorder(new Color(0, 128, 128), 5, true));
		Panel2.setBounds(105, 186, 400, 300);
		Panel1.add(Panel2);
		Panel2.setLayout(null);
		
		Panelcont1 = new JPanel();
		Panelcont1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel2_mouse_entered_event();
			}
		});
		Panelcont1.setBackground(new Color(73, 158, 150));
		Panelcont1.setBounds(10, 180, 380, 66);
		Panelcont1.setLayout(null);
		Panel2.add(Panelcont1);
		
		Panelcont2 = new JPanel();
		Panelcont2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Panel3_mouse_entered_event();
			}
		});
		Panelcont2.setBackground(new Color(230, 65, 61));
		Panelcont2.setBounds(10, 180, 380, 66);
		Panelcont2.setLayout(null);
		Panel3.add(Panelcont2);
		
		/**
		lbl3 = new JLabel();
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lbl3.setBounds(0, 68, 855, 40);
		Panel1.add(lbl3);
		**/
		
		JTextField tf = new JTextField();
		tf.setBounds(0, 0, 0, 0);
		Panel1.add(tf);
		
		txt1 = new JTextPane();
		txt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				
				txt1_action();
			}
		});
		txt1.setForeground(new Color(243, 243, 243));
		txt1.setBackground(new Color(70, 158, 150));
		txt1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		txt1.setText("Escribe tu nombre de usuario...");
		txt1.setBounds(30, 11, 320, 32);
		Panelcont1.add(txt1);
		
		txt2 = new JTextPane();
		txt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				
				txt2_action();
			}
 		});
		txt2.setBackground(new Color(230, 65, 61));
		txt2.setText("Escribe tu nombre de usuario...");
		txt2.setForeground(new Color(243, 243, 243));
		txt2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		txt2.setBounds(30, 11, 320, 32);
		Panelcont2.add(txt2);
		
		separator1 = new JSeparator();
		separator1.setForeground(Color.WHITE);
		separator1.setBackground(Color.WHITE);
		separator1.setBounds(30, 45, 320, 4);
		Panelcont1.add(separator1);
		
		separator2 = new JSeparator();
		separator2.setForeground(Color.WHITE);
		separator2.setBackground(Color.WHITE);
		separator2.setBounds(30, 45, 320, 4);
		Panelcont2.add(separator2);
		
		lbl1_playerX = new JLabel("Posici\u00F3n ");
		/*lbl1_playerX.setBounds(50, 0, 214, 169);*/
		lbl1_playerX.setForeground(SystemColor.text);
		lbl1_playerX.setFont(new Font("Forte", Font.PLAIN, 54));
		lbl1_playerX.setHorizontalAlignment(SwingConstants.CENTER);
		Panel2.add(lbl1_playerX);

		lbl1_playerO = new JLabel("Posici\u00F3n ");
		/*lbl1_playerO.setBounds(50, 0, 214, 169);*/
		lbl1_playerO.setForeground(SystemColor.text);
		lbl1_playerO.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_playerO.setFont(new Font("Forte", Font.PLAIN, 54));
		Panel3.add(lbl1_playerO);
		
		lbl_avatar1 = new JLabel("X");
		lbl_avatar1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 97));
		lbl_avatar1.setForeground(Color.WHITE);
		lbl_avatar1.setHorizontalAlignment(SwingConstants.CENTER);
		/*lbl_avatar1.setBounds(246, 0, 126, 169);*/
		Panel2.add(lbl_avatar1);
		
		lbl_avatar2 = new JLabel("O");
		lbl_avatar2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_avatar2.setForeground(Color.WHITE);
		lbl_avatar2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 97));
		/*lbl_avatar2.setBounds(246, 0, 126, 169);*/
		Panel3.add(lbl_avatar2);
		
		btnContinue = new JButton();
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(act1 == 1 && act2 == 2) {
					
					btnContinue.setBackground(new Color(36, 113, 163));
					btnContinue.setCursor(new Cursor(Cursor.HAND_CURSOR));
					
				}
			}
		});
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String a = txt1.getText();
				String b = txt2.getText();
				
				if(a.equals(j) && b.equals(j) || a.equals(g) && b.equals(g) || a.equals(j) || b.equals(g) || a.equals(g) || b.equals(j)){
					
					username_null_error();
					
				}else if(a.length() >= 14 && b.length() >= 14 || a.length() >= 14 || b.length() >= 14){

                    username_character_error(a,b);

                }else if(a.length() < 14 && b.length() < 14){

                    username_registred_complete(a,b);
                }
            }
		});
		btnContinue.setFont(new Font("Yu Gothic UI", Font.PLAIN, 27));
		btnContinue.setVerticalAlignment(SwingConstants.TOP);
		btnContinue.setText("Guardar cambios");
		/*btnContinue.setBackground(new Color(71, 118, 167));*/
		btnContinue.setForeground(Color.WHITE);
		btnContinue.setBorderPainted(false);
		btnContinue.setBounds(402, 545, 284, 46);
		Panel1.add(btnContinue);
		
	    /**
		btn_exit = new JButton();
		btn_exit.setText("Salir");
		btn_exit.setBackground(Color.RED);
		btn_exit.setForeground(Color.WHITE);
		btn_exit.setBorderPainted(false);
		btn_exit.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btn_exit.setBounds(576, 598, 110, 30);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_exit.setBackground(new Color(255, 53, 53));
				btn_exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		Panel1.add(btn_exit);
		*/
		
		/**
		lblDR = new JLabel("Ovilex Software | � Todos los derechos reservados - 2022");
		lblDR.setHorizontalAlignment(SwingConstants.CENTER);
		lblDR.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblDR.setBounds(0, 665, 855, 30);
		Panel1.add(lblDR);
		**/
		
		lbl_return = new JLabel();
		lbl_return.addMouseListener(new MouseAdapter() {
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
				game_mode_selection_page = new game_mode_selection_window();
				game_mode_selection_page.setVisible(true);
			}
		});
		lbl_return.setText("Regresar");
		lbl_return.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lbl_return.setForeground(new Color(108, 108, 108));
		lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_name_players\\flecha-hacia-atras(2).png"));
		lbl_return.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_return.setBounds(6, 10, 126, 30);
		Panel1.add(lbl_return);
		
		lbl1_message = new JLabel();
		lbl1_message.setForeground(new Color(211, 84, 0));
		lbl1_message.setFont(new Font("Berlin Sans FB", Font.PLAIN, 47));
		lbl1_message.setBounds(0, 70, 1094, 54);
		lbl1_message.setHorizontalAlignment(SwingConstants.CENTER);
		//lbl1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Index_gato_game\\Index\\Icon\\page_name_players\\icon_principal_auto_x2_colored_toned.jpg"));
		Panel1.add(lbl1_message);
		
		/*
		lbl1_message_1 = new JLabel();
		lbl1_message_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_message_1.setForeground(new Color(211, 84, 0));
		lbl1_message_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl1_message_1.setBounds(0, 95, 1094, 60);
		Panel1.add(lbl1_message_1);
		*/
		
		/*
		lbl2_message = new JLabel();
		lbl2_message.setText("jugadores");
		lbl2_message.setForeground(new Color(211, 84, 0));
		lbl2_message.setFont(new Font("Segoe UI", Font.PLAIN, 40));
		lbl2_message.setBounds(124, 57, 612, 70);
		lbl2_message.setHorizontalAlignment(SwingConstants.CENTER);
		Panel1.add(lbl2_message);
		*/
	}
	
	public static void username_null_error() {
		
		USERNAME_ERROR_MESSAGE = new username_error_window();
		USERNAME_ERROR_MESSAGE.setVisible(true);
	}
	
	public static void username_character_error(String a, String b) {
		
		USERNAME_CHARACTER_ERROR = new username_message(a,b);
		USERNAME_CHARACTER_ERROR.setVisible(true);
	}

    public void username_registred_complete(String a, String b){

        if(btnContinue.getText() == option1) {
								
            String player1 = a;
            String player2 = b;
            
            CONFIRMATION_WINDOW = new position_confirmation_window(player1,player2);
            CONFIRMATION_WINDOW.setVisible(true);
            
            btnContinue.setText(option2);
            
        }else if(btnContinue.getText() == option2) {
            
            String player1 = a;
            String player2 = b;
            
            dispose();
            start = new tic_tac_toe_game_mode_classic(player1, player2);
            start.setVisible(true);
        }
    }
	
	public static void MOUSE_ENTERED_EVENT() {
		
		/* Panels and text area's */
		Panel2.setBackground(new Color(73, 158, 150));
		txt1.setBackground(new Color(73, 158, 150));
		Panel3.setBackground(new Color(230, 65, 61));
		txt2.setBackground(new Color(230, 65, 61));
		
		Panelcont1.setBackground(new Color(72, 158, 150));
		Panelcont2.setBackground(new Color(230, 65, 61));
		
		if(act1 == 1 && act2 == 2) {
			
			btnContinue.setBackground(new Color(71, 118, 167));
			btnContinue.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
		}
	
	}
	
	public static void Panel2_mouse_entered_event() {
		
		switch(act1) {
		case 0:
			Panel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			break;
		case 1:
			Panel2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}
	
	public static void Panel3_mouse_entered_event() {
		
		switch(act2) {
		case 0:
			Panel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			break;
		case 2:
			Panel3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}
	
	public static void panel2_click_event() {
		
		lbl1_playerX.setBounds(50, 0, 214, 169);
		lbl_avatar1.setBounds(246, 0, 126, 169);
		
		Panelcont1.setVisible(true);
		
		lbl1_message.setText("Ingresen su nombre real o un nombre de usuario.");
				
		if(act2 == 2) {
			
			btnContinue.setEnabled(true);
			
		}else if(act2 == 0) {
			
			btnContinue.setEnabled(false);
		}
		
		act1 = 1;
	}
	
	public static void panel3_click_event() {
	    
		lbl1_playerO.setBounds(50, 0, 214, 169);
		lbl_avatar2.setBounds(246, 0, 126, 169);
		
		Panelcont2.setVisible(true);
	    
	    lbl1_message.setText("Ingresen su nombre real o un nombre de usuario.");
	    
        if(act1 == 1) {
			
			btnContinue.setEnabled(true);
			
		}else if(act1 == 0) {
			
			btnContinue.setEnabled(false);
		}
			
		act2 = 2;
	}
	
	public static void txt1_action() {
		
		txt1.setFont(new Font("YU Gothic UI", Font.PLAIN, 20));
		txt1.setForeground(Color.WHITE);
		
		btnContinue.setText(option1);
		
		String a = txt1.getText();
		
		if(a.equals(j)) {
			
			txt1.setText(g);
			
		}else {
			
			txt1.setText(a+"");
		}
		
	}
	
	public static void txt2_action() {
		
		txt2.setFont(new Font("YU Gothic UI", Font.PLAIN, 20));
		txt2.setForeground(Color.WHITE);
		
		btnContinue.setText(option1);
		
		String b = txt2.getText();
		
		if(b.equals(j)) {
			
			txt2.setText(g);
			
		}else {
			
			txt2.setText(b+"");
		}
	}
	
	public static void MOUSE_ENTERED_EVENT_lbl_return() {
		
		lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_name_players\\flecha-hacia-atras.png"));
		lbl_return.setForeground(new Color(27, 27, 27));
		lbl_return.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	public static void MOUSE_EXITED_EVENT_lbl_return() {
		
		lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_name_players\\flecha-hacia-atras(2).png"));
		lbl_return.setForeground(new Color(108, 108, 108));
        lbl_return.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
}