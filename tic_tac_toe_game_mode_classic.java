package tic_tac_toe_game_java;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

import jdk.jfr.SettingControl;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class tic_tac_toe_game_mode_classic extends JDialog {

  private final JPanel Panel1 = new JPanel();
  
  static name_players_window NAME_PLAYERS_WINDOW;
  static exit_window exit_panel;
  static indication_window INDICATIONS;
  static about_development ABOUT_DEVELOP;
  static winning_message_window WINNING_MESSAGE;
  static JButton b01, b02, b03, b04, b05, b06, b07, b08, b09;
  static JButton btnRepeat, btnFinish, btnPanel, btnReset, btn, btn_about_menu, btn_developer_menu, btn_style_menu;
  static JPanel Panel2, Panel3, Panel4, Panel_menu;
  static JLabel lblDR, lbl_player1_x, lbl_player2_O, lbl_competition_players, lbl_close_menu, lbl_menu_icon, lbl_about_menu, lbl_style_menu;
  static JLabel lblturn, lblwinner, lbl2, lblresult, lbl3, lblscore1, lblscore2, lbl4, lbl_close, lblsrc1, lblsrc2;
  static JLabel lbl_competition_players_mss, lblwinnerfinalx, lblwinnerfinalo;
  static JLabel lbl_return;
  static final String turn1 = "Sigue: X", turn2 = "Sigue: O", start = "Empieza: X", result1 = "Aún no hay ganador o empate";
  static final String score1 = "Jugador X:", score2 = "Jugador O:", scr1 = "---", scr2 = "---", condition = "desconocid@";
  static final String cndtUser1 = "No se encontro registro de", cndtUser2 = "nombre de usuarios";
  static int scoreX, scoreO;
  static String player1, player2;
  static JMenuBar menuBar;
  static JMenu styles, about, configuration, fonts;
  static JMenuItem developer, font_example, font1, font2, font4, font3, font5, font6, indications;
  static JMenuItem mntmNewMenuItem;
  static int value;
  static final String a = "Escribe tu nombre de usuario...";
  /*static final String value_scr = "10";
  static int SCR1, SCR2;*/
 
  public static void main(String[] args) {
    try {
      tic_tac_toe_game_mode_classic dialog = new tic_tac_toe_game_mode_classic(player1, player2);
      dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      dialog.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Create the dialog.
   */
  public tic_tac_toe_game_mode_classic(String player1, String player2) {
    
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowOpened(WindowEvent e) {
        
        if(player1 == null || player2 == null || player1 == "" || player2 == "" || player1.equals(a) || player2.equals(a)) {
          
          userName_null();

        }else {
          
          userName_activated(player1, player2);
       
        }
        
        b01.setText("");
        b02.setText("");
        b03.setText("");
        b04.setText("");
        b05.setText("");
        b06.setText("");
        b07.setText("");
        b08.setText("");
        b09.setText("");
        
        b01.setEnabled(true);
        b02.setEnabled(true);
        b03.setEnabled(true);
        b04.setEnabled(true);
        b05.setEnabled(true);
        b06.setEnabled(true);
        b07.setEnabled(true);
        b08.setEnabled(true);
        b09.setEnabled(true);
        
        lblturn.setText(start);
        lblresult.setText(result1);
        
        Panel3.setVisible(true);
        Panel3.setBounds(692, 130, 325, 388);
        Panel4.setVisible(false);
        
        btnPanel.setVisible(false);
        
        lblsrc1.setText(scr1);
        lblsrc2.setText(scr2);
      
      }
    });
    
    setTitle("TicTacToe Game | Modo de juego: uno VS uno (cl\u00E1sico)");
    setResizable(false);
    setType(Type.POPUP);
    setBounds(140, 10, 1079, 706);
    getContentPane().setLayout(new BorderLayout());
    Panel1.setBackground(new Color(234, 237, 237));
    Panel1.setBorder(new EmptyBorder(8, 5, 8, 5));
    getContentPane().add(Panel1, BorderLayout.CENTER);
    Panel1.setLayout(null);
    Panel1.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        
        btnRepeat.setBackground(new Color(60, 98, 151));
        btnFinish.setBackground(new Color(255, 145, 23));
        btnPanel.setBackground(new Color(52, 73, 94));
        btnReset.setBackground(new Color(66, 129, 13));
        
        btnRepeat.setBorderPainted(false);
        btnFinish.setBorderPainted(false);
        btnReset.setBorderPainted(false);
        
      }
    });
    
    Panel1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		
    		
    	}
    });
    
    btn = new JButton();
    btn.setBounds(0, 0, 0, 0);
    Panel1.add(btn);
    
    Panel2 = new JPanel();
    Panel2.setBackground(Color.BLACK);
    Panel2.setBounds(148, 140, 398, 398);
    Panel1.add(Panel2);
    Panel2.setLayout(null);
    
    Panel4 = new JPanel();
    Panel4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		btnRepeat.setBorderPainted(false);
            btnFinish.setBorderPainted(false);
            btnReset.setBorderPainted(false);
            
            btnRepeat.setBackground(new Color(60, 98, 151));
            btnFinish.setBackground(new Color(255, 145, 23));
            btnReset.setBackground(new Color(66, 129, 13));
    	}
    });
    Panel4.setBounds(692, 423, 325, 177);
    Panel4.setBackground(new Color(237, 237, 237));
    Panel4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(112, 128, 144)));
    Panel4.setLayout(null);
    Panel1.add(Panel4);
    
    btnPanel = new JButton("Abrir panel de informaci\u00F3n");
    btnPanel.setBounds(692, 130, 325, 42);
    btnPanel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          
        String a = lblsrc1.getText();
        String b = lblsrc2.getText();
        
        if(Panel4.isVisible()) {
          
          Panel3.setVisible(true);
          btnPanel.setVisible(false);
          
          if(a == "10" || b == "10") {
            
            Panel4.setBounds(692, 420, 325, 130);
            Panel3.setBounds(692, 11, 325, 388);

          }else {
            
            Panel4.setBounds(692, 413, 325, 184);
            Panel3.setBounds(692, 11, 325, 388);

          }

        }else {
          
          Panel3.setVisible(true);
          btnPanel.setVisible(false);
          Panel3.setBounds(692, 130, 325, 388);

        }
      }
    });
    btnPanel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        
          btnPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
          btnPanel.setBackground(new Color(93, 109, 126));
      }
    });
    btnPanel.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
    btnPanel.setBackground(new Color(52, 73, 94));
    btnPanel.setHorizontalAlignment(SwingConstants.CENTER);
    btnPanel.setBorderPainted(false);
    btnPanel.setForeground(Color.WHITE);
    Panel1.add(btnPanel);
    
    b01 = new JButton("");
    b01.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  
          ACTION_B01(player1, player2);
     
        }
    });
    b01.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b01.setForeground(Color.BLACK);
    b01.setBackground(new Color(234, 237, 237));
    b01.setVerticalAlignment(SwingConstants.BOTTOM);
    b01.setBounds(0, 0, 130, 130);
    b01.setBorderPainted(false);
    Panel2.add(b01);
    
    b02 = new JButton("");
    b02.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B02(player1, player2);
        
      }
    });
    b02.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b02.setForeground(Color.BLACK);
    b02.setBackground(new Color(234, 237, 237));
    b02.setBounds(134, 0, 130, 130);
    b02.setBorderPainted(false);
    b02.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b02);
    
    b03 = new JButton("");
    b03.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B03(player1, player2);
      }
    });
    b03.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b03.setBackground(new Color(234, 237, 237));
    b03.setForeground(Color.BLACK);
    b03.setBounds(268, 0, 130, 130);
    b03.setBorderPainted(false);
    b03.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b03);
    
    b04 = new JButton("");
    b04.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B04(player1, player2);
      }
    });
    b04.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b04.setBackground(new Color(234, 237, 237));
    b04.setForeground(Color.BLACK);
    b04.setBounds(0, 135, 130, 130);
    b04.setBorderPainted(false);
    b04.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b04);
    
    b05 = new JButton("");
    b05.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B05(player1, player2);
      }
    });
    b05.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b05.setBackground(new Color(234, 237, 237));
    b05.setForeground(Color.BLACK);
    b05.setBounds(134, 135, 130, 130);
    b05.setBorderPainted(false);
    b05.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b05);
    
    b06 = new JButton("");
    b06.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B06(player1, player2);
      }
    });
    b06.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b06.setBackground(new Color(234, 237, 237));
    b06.setForeground(Color.BLACK);
    b06.setBounds(268, 135, 130, 130);
    b06.setBorderPainted(false);
    b06.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b06);
    
    b07 = new JButton("");
    b07.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B07(player1, player2);
      }
    });
    b07.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b07.setBackground(new Color(234, 237, 237));
    b07.setForeground(Color.BLACK);
    b07.setBounds(0, 271, 130, 130);
    b07.setBorderPainted(false);
    b07.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b07);
    
    b08 = new JButton("");
    b08.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B08(player1, player2);
      }
    });
    b08.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b08.setBackground(new Color(234, 237, 237));
    b08.setForeground(Color.BLACK);
    b08.setBounds(134, 271, 130, 130);
    b08.setBorderPainted(false);
    b08.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b08);
    
    b09 = new JButton("");
    b09.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        ACTION_B09(player1, player2);
      }
    });
    b09.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
    b09.setBackground(new Color(234, 237, 237));
    b09.setForeground(Color.BLACK);
    b09.setBounds(268, 271, 130, 130);
    b09.setBorderPainted(false);
    b09.setVerticalAlignment(SwingConstants.BOTTOM);
    Panel2.add(b09);
    
    Panel3 = new JPanel();
    Panel3.setBounds(692, 11, 325, 388);
    Panel3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(112, 128, 144)));
    Panel3.setBackground(new Color(52, 73, 94));
    Panel3.setLayout(null);
    Panel1.add(Panel3);
    
    lblturn = new JLabel();
    lblturn.setText("Empieza: X");
    lblturn.setForeground(Color.WHITE);
    lblturn.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
    lblturn.setHorizontalAlignment(SwingConstants.CENTER);
    lblturn.setBounds(0, 100, 324, 41);
    Panel3.add(lblturn);
    
    lbl4 = new JLabel("Movimientos");
    lbl4.setHorizontalAlignment(SwingConstants.CENTER);
    lbl4.setForeground(new Color(255, 122, 0));
    lbl4.setFont(new Font("Nirmala UI", Font.PLAIN, 25));
    lbl4.setBounds(0, 59, 324, 33);
    Panel3.add(lbl4);
    
    
    lbl2 = new JLabel("Resultados de la ronda");
    lbl2.setForeground(new Color(255, 122, 0));
    lbl2.setHorizontalAlignment(SwingConstants.CENTER);
    lbl2.setFont(new Font("Nirmala UI", Font.PLAIN, 25));
    lbl2.setBounds(0, 155, 324, 41);
    Panel3.add(lbl2);
    
    lblresult = new JLabel("");
    lblresult.setForeground(Color.WHITE);
    lblresult.setHorizontalAlignment(SwingConstants.CENTER);
    lblresult.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
    lblresult.setBounds(0, 200, 324, 41);
    Panel3.add(lblresult);
    
    lbl3 = new JLabel("Puntaje");
    lbl3.setForeground(new Color(255, 122, 0));
    lbl3.setHorizontalAlignment(SwingConstants.CENTER);
    lbl3.setFont(new Font("Nirmala UI", Font.PLAIN, 25));
    lbl3.setBounds(0, 255, 324, 41);
    Panel3.add(lbl3);
    
    lblscore1 = new JLabel("Jugador X: ");
    lblscore1.setForeground(Color.WHITE);
    lblscore1.setHorizontalAlignment(SwingConstants.CENTER);
    lblscore1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
    lblscore1.setBounds(20, 301, 304, 41);
    Panel3.add(lblscore1);
    
    lblscore2 = new JLabel("Jugador O: ");
    lblscore2.setForeground(Color.WHITE);
    lblscore2.setHorizontalAlignment(SwingConstants.CENTER);
    lblscore2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
    lblscore2.setBounds(20, 336, 304, 41);
    Panel3.add(lblscore2);
    
    lbl_close = new JLabel("");
    lbl_close.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_game\\icon_table_close (1).png"));
    lbl_close.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        
    	  lbl_close.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_game\\icon_close_table (2).png"));
          lbl_close.setCursor(new Cursor(Cursor.HAND_CURSOR));
          
        }
    });
    lbl_close.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    	   lbl_close.setForeground(Color.WHITE);
    	   lbl_close.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
           lbl_close.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\Page_game\\icon_table_close (1).png"));
    	}
    });
    lbl_close.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        
        String a = lblsrc1.getText();
        String b = lblsrc2.getText();
        
        if(Panel4.isVisible()) {
          
            Panel3.setVisible(false);
            btnPanel.setVisible(true);
          
          if(a == "10"  || b == "10") {
            
                Panel4.setBounds(692, 228, 325, 130);
                
          }else {
            
              Panel4.setBounds(692, 228, 325, 177);
          }
          
        }else {
          
            Panel3.setVisible(false);
            btnPanel.setVisible(true);
        }
      }
    });
    lbl_close.setForeground(Color.WHITE);
    lbl_close.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
    lbl_close.setHorizontalAlignment(SwingConstants.LEFT);
    lbl_close.setBounds(17, 17, 26, 26);
    Panel3.add(lbl_close);
    
    lblsrc1 = new JLabel("");
    lblsrc1.setForeground(Color.WHITE);
    lblsrc1.setHorizontalAlignment(SwingConstants.LEFT);
    lblsrc1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
    lblsrc1.setBounds(230, 301, 46, 40);
    Panel3.add(lblsrc1);
    
    lblsrc2 = new JLabel("");
    lblsrc2.setHorizontalAlignment(SwingConstants.LEFT);
    lblsrc2.setForeground(Color.WHITE);
    lblsrc2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
    lblsrc2.setBounds(230, 337, 46, 40);
    Panel3.add(lblsrc2);
    
    lbl_player1_x = new JLabel();
    lbl_player1_x.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_player1_x.setForeground(Color.WHITE);
    lbl_player1_x.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
    lbl_player1_x.setBounds(7, 301, 110, 41);
    Panel3.add(lbl_player1_x);
    
    lbl_player2_O = new JLabel();
    lbl_player2_O.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_player2_O.setForeground(Color.WHITE);
    lbl_player2_O.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
    lbl_player2_O.setBounds(7, 336, 110, 41);
    Panel3.add(lbl_player2_O);
    
    btnFinish = new JButton();
    btnFinish.setText("Finalizar y salir");
    btnFinish.setBounds(10, 127, 305, 40);
    btnFinish.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        
          btnFinish.setBackground(new Color(255, 174, 83));
	      btnFinish.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
	      btnFinish.setBorderPainted(true);
          btnFinish.setCursor(new Cursor(Cursor.HAND_CURSOR));
      }
    });
    btnFinish.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
    	String a = lblsrc1.getText();
    	String b = lblsrc2.getText();
    	
        btnFinish.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        
        if(a == scr1 && b == scr2 || a != "10" && b != "10") {
        	
        	int value = 2;
        	exit_panel = new exit_window(a, b, player1, player2, value);
        	exit_panel.setVisible(true);
        	
        }else if(a == "10" || b == "10") {
        	
        	int value = 3;
        	exit_panel = new exit_window(a, b, player1, player2, value);
        	exit_panel.setVisible(true);
        }
      }
    });
    btnFinish.setForeground(Color.WHITE);
    btnFinish.setBackground(new Color(255, 145, 23));
    btnFinish.setFont(new Font("Berlin Sans FB", Font.PLAIN, 21));
    btnFinish.setBorderPainted(false);
    Panel4.add(btnFinish);
    
    btnReset = new JButton();
    btnReset.setText("Reiniciar juego");
    btnReset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        String a = lblsrc1.getText();
        String b = lblsrc2.getText();
        
        if(a == "10" || b == "10") {
          
          if(a == "10") {
            
            if(JOptionPane.showInternalOptionDialog(null, " Juego terminado \n\n Ganador: X ("+player1+") \n\n Iniciar de nuevo", "Comenzar una nueva partida", 
            		JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Aceptar", "Cancelar"}, "Aceptar") == JOptionPane.YES_OPTION) {
              
              reset_or_newGame(player1, player2);
            }
            
          }else if(b == "10") {
            
                  if(JOptionPane.showInternalOptionDialog(null, " Juego terminado \n\n Ganador: O ("+player2+") \n\n Iniciar de nuevo", "Comenzar una nueva partida", 
                		  JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Aceptar", "Cancelar"}, "Aceptar") == JOptionPane.YES_OPTION) {
              
                    reset_or_newGame(player1, player2);
            }
                  
          }
          
        }else if(a != "10" || b != "10") {
          
          if(JOptionPane.showInternalOptionDialog(null, " ¿Deseas reiniciar el juego? \n\n Esta acción borrara el puntaje de los jugadores \n y comenzara en cero. \n\n", 
        		  "Reiniciar juego", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Reiniciar juego", "Cancelar"}, "Cancelar") == 
        		  JOptionPane.YES_OPTION) {
                
            reset_or_newGame(player1, player2);
          }
          
        }
        
      }
    });
    btnReset.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        
        btnReset.setBackground(new Color(119, 198, 54));
		btnReset.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
		btnReset.setBorderPainted(true);
        btnReset.setCursor(new Cursor(Cursor.HAND_CURSOR));
      }
    });
    btnReset.setBounds(10, 68, 305, 40);
    btnReset.setBorderPainted(false);
    btnReset.setForeground(Color.WHITE);
    btnReset.setBackground(new Color(66, 129, 13));
    btnReset.setFont(new Font("Berlin Sans FB", Font.PLAIN, 21));
    Panel4.add(btnReset);
    
    btnRepeat = new JButton();
    btnRepeat.setText("Intentar de nuevo");
    btnRepeat.setBounds(10, 11, 305, 40);
    btnRepeat.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        
        btnRepeat.setBackground(new Color(94, 133, 188));
        btnRepeat.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2f)));
		btnRepeat.setBorderPainted(true);
        btnRepeat.setCursor(new Cursor(Cursor.HAND_CURSOR));
      }
    });
    btnRepeat.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        btnRepeat.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                
        b01.setText("");
        b02.setText("");
        b03.setText("");
        b04.setText("");
        b05.setText("");
        b06.setText("");
        b07.setText("");
        b08.setText("");
        b09.setText("");
        
        b01.setBackground(new Color(234, 237, 237));
        b02.setBackground(new Color(234, 237, 237));
        b03.setBackground(new Color(234, 237, 237));
        b04.setBackground(new Color(234, 237, 237));
        b05.setBackground(new Color(234, 237, 237));
        b06.setBackground(new Color(234, 237, 237));
        b07.setBackground(new Color(234, 237, 237));
        b08.setBackground(new Color(234, 237, 237));
        b09.setBackground(new Color(234, 237, 237));

        b01.setEnabled(true);
        b02.setEnabled(true);
        b03.setEnabled(true);
        b04.setEnabled(true);
        b05.setEnabled(true);
        b06.setEnabled(true);
        b07.setEnabled(true);
        b08.setEnabled(true);
        b09.setEnabled(true);
        
        lblturn.setText(start);
        lblresult.setText(result1);
        
        Panel4.setVisible(false);
        Panel3.setBounds(692, 130, 325, 388);
      }
    });
    btnRepeat.setForeground(Color.white);
    btnRepeat.setBackground(new Color(60, 98, 151));
    btnRepeat.setFont(new Font("Berlin Sans FB", Font.PLAIN, 21));
    btnRepeat.setBorderPainted(false);
    Panel4.add(btnRepeat);
    
    lbl_competition_players = new JLabel("<dynamic> VS <dynamic>");
    lbl_competition_players.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
    lbl_competition_players.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_competition_players.setForeground(new Color(211, 84, 0));
    lbl_competition_players.setBounds(0, 80, 682, 42);
    Panel1.add(lbl_competition_players);
    
    lbl_competition_players_mss = new JLabel();
    lbl_competition_players_mss.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 32));
    lbl_competition_players_mss.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_competition_players_mss.setForeground(new Color(95, 106, 106));
    lbl_competition_players_mss.setBounds(0, 70, 682, 42);
    Panel1.add(lbl_competition_players_mss);
    
    /* JLabel -> lbl_return */
    
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
    		
    		String a = lblsrc1.getText();
    		String b = lblsrc2.getText();
    		
    		if(a == scr1 && b == scr2) {
    			
    			dispose();
    			NAME_PLAYERS_WINDOW = new name_players_window();
    			NAME_PLAYERS_WINDOW.setVisible(true);
    			
    		}else if(a != scr1 || b != scr2){
    			
    			if(JOptionPane.showInternalOptionDialog(null,"\n ¿Deseas volver? \n\n Si realizas esta acción se cerrara esta venatana y \n "
        				+ "se perdera el estado actual del juego, se tendra que \n comenzar desde el inicio. \n\n", "Regresar | Aviso de usuario", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
        				null, new Object[] {"Regresar de todos modos", "Cancelar, continuar en el juego\n"}, "Cancelar, continuar en el juego") == JOptionPane.YES_OPTION) {
        			
        			dispose();
        			NAME_PLAYERS_WINDOW = new name_players_window();
        			NAME_PLAYERS_WINDOW.setVisible(true);
        			
        		}
    		}
    	}
    });
    lbl_return.setText("Regresar");
    lbl_return.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
    lbl_return.setForeground(new Color(108, 108, 108));
    lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_game\\flecha-hacia-atras(2).png"));
    lbl_return.setHorizontalAlignment(SwingConstants.CENTER);
    /*lbl_return.setBounds(0, 1, 124, 40);*/
    Panel1.add(lbl_return);
    
    /*
    lblDR = new JLabel("Ovilex Software | ï¿½ Todos los derechos reservados - 2022");
    lblDR.setSize(1073, 30);
    lblDR.setLocation(0, 634);
    lblDR.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
    lblDR.setHorizontalAlignment(SwingConstants.CENTER);
    Panel1.add(lblDR);
    */
    
    /* MENU */
    
    menuBar = new JMenuBar();
    menuBar.setMargin(new Insets(10, 10, 10, 10));
    menuBar.setForeground(Color.BLACK);
    menuBar.setBackground(new Color(97, 106, 107));
    setJMenuBar(menuBar);
    
    about = new JMenu("Acerca de");
    about.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		about.setCursor(new Cursor(Cursor.HAND_CURSOR));
    		about.setForeground(new Color(191, 201, 202));
    	}
    });
    about.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    		about.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    		about.setForeground(Color.WHITE);
    	}
    });
    about.setForeground(Color.WHITE);
    about.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
    menuBar.add(about);
    
    configuration = new JMenu("Configuración");
    configuration.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		configuration.setCursor(new Cursor(Cursor.HAND_CURSOR));
    		configuration.setForeground(new Color(191, 201, 202));
    	}
    });
    configuration.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    		configuration.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    		configuration.setForeground(Color.WHITE);
    	}
    });
    configuration.setHorizontalAlignment(SwingConstants.RIGHT);
    configuration.setForeground(Color.WHITE);
    configuration.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
    menuBar.add(configuration);
    
    indications = new JMenuItem("Consultar indicaciones del juego");
    indications.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		INDICATIONS = new indication_window();
    		INDICATIONS.setVisible(true);
    	}
    });
    indications.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 17));
    about.add(indications);
    
    developer = new JMenuItem("Desarrollador");
    developer.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		ABOUT_DEVELOP = new about_development();
    		ABOUT_DEVELOP.setVisible(true);
    	}
    });
    developer.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 17));
    about.add(developer);
    
    styles = new JMenu("Dise\u00F1o");
    styles.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 17));
    configuration.add(styles);
    
    fonts = new JMenu("Tipos de fuentes");
    fonts.setHorizontalAlignment(SwingConstants.LEFT);
    fonts.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 16));
    styles.add(fonts);
    
    font_example = new JMenuItem("Yu Gothic UI Semilight (prederteminado)");
    font_example.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font_predetermined();
    	}
    });
    font_example.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font_predetermined();
    	}
    });
    font_example.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
    fonts.add(font_example);
    
    font1 = new JMenuItem("Forte");
    font1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font1_selected();
    	}
    });
    font1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font1_selected();
    	}
    });
    font1.setFont(new Font("Forte", Font.PLAIN, 15));
    fonts.add(font1);
    
    font2 = new JMenuItem("Bell MT");
    font2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font2_selected();
    	}
    });
    font2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font2_selected();
    	}
    });
    font2.setFont(new Font("Bell MT", Font.PLAIN, 15));
    fonts.add(font2);
    
    font3 = new JMenuItem("Goudy Old Style");
    font3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font3_selected();
    	}
    });
    font3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font3_selected();
    	}
    });
    font3.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
    fonts.add(font3);
    
    font4 = new JMenuItem("Tempus Sans ITC");
    font4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font4_selected();
    	}
    });
    font4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font4_selected();
    	}
    });
    font4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
    fonts.add(font4);
    
    font5 = new JMenuItem("Viner Hand ITC");
    font5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font5_selected();
    	}
    });
    font5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font5_selected();
    	}
    });
    font5.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
    fonts.add(font5);
    
    font6 = new JMenuItem("Microsoft JhengHei UI Light");
    font6.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		font6_selected();
    	}
    });
    font6.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		font6_selected();
    	}
    });
    font6.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
    fonts.add(font6);//top
  
  }
  
  /* FONTS */

public static void font_predetermined() {
	  
	  b01.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b02.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b03.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b04.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b05.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b06.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b07.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b08.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  b09.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 99));
	  
	  b01.setVerticalAlignment(SwingConstants.BOTTOM);
	  b02.setVerticalAlignment(SwingConstants.BOTTOM);
	  b03.setVerticalAlignment(SwingConstants.BOTTOM);
	  b04.setVerticalAlignment(SwingConstants.BOTTOM);
	  b05.setVerticalAlignment(SwingConstants.BOTTOM);
	  b06.setVerticalAlignment(SwingConstants.BOTTOM);
	  b07.setVerticalAlignment(SwingConstants.BOTTOM);
	  b08.setVerticalAlignment(SwingConstants.BOTTOM);
	  b09.setVerticalAlignment(SwingConstants.BOTTOM);
  }
  
public static void font1_selected() {
	  
	  b01.setFont(new Font("Forte", Font.PLAIN, 99));
	  b02.setFont(new Font("Forte", Font.PLAIN, 99));
	  b03.setFont(new Font("Forte", Font.PLAIN, 99));
	  b04.setFont(new Font("Forte", Font.PLAIN, 99));
	  b05.setFont(new Font("Forte", Font.PLAIN, 99));
	  b06.setFont(new Font("Forte", Font.PLAIN, 99));
	  b07.setFont(new Font("Forte", Font.PLAIN, 99));
	  b08.setFont(new Font("Forte", Font.PLAIN, 99));
	  b09.setFont(new Font("Forte", Font.PLAIN, 99));
	  
	  b01.setVerticalAlignment(SwingConstants.TOP);
	  b02.setVerticalAlignment(SwingConstants.TOP);
	  b03.setVerticalAlignment(SwingConstants.TOP);
	  b04.setVerticalAlignment(SwingConstants.TOP);
	  b05.setVerticalAlignment(SwingConstants.TOP);
	  b06.setVerticalAlignment(SwingConstants.TOP);
	  b07.setVerticalAlignment(SwingConstants.TOP);
	  b08.setVerticalAlignment(SwingConstants.TOP);
	  b09.setVerticalAlignment(SwingConstants.TOP);

  }
  
public static void font2_selected() {
	  
	  b01.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b02.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b03.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b04.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b05.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b06.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b07.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b08.setFont(new Font("Bell MT", Font.PLAIN, 99));
	  b09.setFont(new Font("Bell MT", Font.PLAIN, 99));

	  b01.setVerticalAlignment(SwingConstants.BOTTOM);
	  b02.setVerticalAlignment(SwingConstants.BOTTOM);
	  b03.setVerticalAlignment(SwingConstants.BOTTOM);
	  b04.setVerticalAlignment(SwingConstants.BOTTOM);
	  b05.setVerticalAlignment(SwingConstants.BOTTOM);
	  b06.setVerticalAlignment(SwingConstants.BOTTOM);
	  b07.setVerticalAlignment(SwingConstants.BOTTOM);
	  b08.setVerticalAlignment(SwingConstants.BOTTOM);
	  b09.setVerticalAlignment(SwingConstants.BOTTOM);

  }

public static void font3_selected() {
	  
	  b01.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b02.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b03.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b04.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b05.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b06.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b07.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b08.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));
	  b09.setFont(new Font("Goudy Old Style", Font.PLAIN, 99));

	  b01.setVerticalAlignment(SwingConstants.BOTTOM);
	  b02.setVerticalAlignment(SwingConstants.BOTTOM);
	  b03.setVerticalAlignment(SwingConstants.BOTTOM);
	  b04.setVerticalAlignment(SwingConstants.BOTTOM);
	  b05.setVerticalAlignment(SwingConstants.BOTTOM);
	  b06.setVerticalAlignment(SwingConstants.BOTTOM);
	  b07.setVerticalAlignment(SwingConstants.BOTTOM);
	  b08.setVerticalAlignment(SwingConstants.BOTTOM);
	  b09.setVerticalAlignment(SwingConstants.BOTTOM);

  }

public static void font4_selected() {
	  
	  b01.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b02.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b03.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b04.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b05.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b06.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b07.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b08.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));
	  b09.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 99));

	  b01.setVerticalAlignment(SwingConstants.TOP);
	  b02.setVerticalAlignment(SwingConstants.TOP);
	  b03.setVerticalAlignment(SwingConstants.TOP);
	  b04.setVerticalAlignment(SwingConstants.TOP);
	  b05.setVerticalAlignment(SwingConstants.TOP);
	  b06.setVerticalAlignment(SwingConstants.TOP);
	  b07.setVerticalAlignment(SwingConstants.TOP);
	  b08.setVerticalAlignment(SwingConstants.TOP);
	  b09.setVerticalAlignment(SwingConstants.TOP);

  }

public static void font5_selected() {
	  
	  b01.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b02.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b03.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b04.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b05.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b06.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b07.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b08.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  b09.setFont(new Font("Viner Hand ITC", Font.PLAIN, 99));
	  
	  b01.setVerticalAlignment(SwingConstants.TOP);
	  b02.setVerticalAlignment(SwingConstants.TOP);
	  b03.setVerticalAlignment(SwingConstants.TOP);
	  b04.setVerticalAlignment(SwingConstants.TOP);
	  b05.setVerticalAlignment(SwingConstants.TOP);
	  b06.setVerticalAlignment(SwingConstants.TOP);
	  b07.setVerticalAlignment(SwingConstants.TOP);
	  b08.setVerticalAlignment(SwingConstants.TOP);
	  b09.setVerticalAlignment(SwingConstants.TOP);

  } 


public static void font6_selected() {
    	  
	  b01.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b02.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b03.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b04.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b05.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b06.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b07.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b08.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  b09.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 99));
	  
	  b01.setVerticalAlignment(SwingConstants.CENTER);
	  b02.setVerticalAlignment(SwingConstants.CENTER);
	  b03.setVerticalAlignment(SwingConstants.CENTER);
	  b04.setVerticalAlignment(SwingConstants.CENTER);
	  b05.setVerticalAlignment(SwingConstants.CENTER);
	  b06.setVerticalAlignment(SwingConstants.CENTER);
	  b07.setVerticalAlignment(SwingConstants.CENTER);
	  b08.setVerticalAlignment(SwingConstants.CENTER);
	  b09.setVerticalAlignment(SwingConstants.CENTER);

  }

  public static void ACTION_B01(String player1, String player2) {
    
    String var = lblturn.getText();
    String var_b02 = b02.getText();
    String var_b03 = b03.getText();
    String var_b04 = b04.getText();
    String var_b05 = b05.getText();
    String var_b06 = b06.getText();
    String var_b07 = b07.getText();
    String var_b08 = b08.getText();
    String var_b09 = b09.getText();
   
    if(var.equals(start)){
      
      b01.setText("X");
      b01.setEnabled(false);
      lblturn.setText(turn2);
      
    }else if(var.equals(turn1)){
      
      b01.setText("X");
      b01.setEnabled(false);
      lblturn.setText(turn2);
      
      if(var_b02 == "X" && var_b03 == "X") {
        
        x_bo1_winner_option1(player1, player2);
        
      }else if(var_b04 == "X" && var_b07 == "X") {
        
        x_bo1_winner_option2(player1, player2);
        
      }else if(var_b05 == "X" && var_b09 == "X") {
        
        x_bo1_winner_option3(player1,player2);
        
      }else if(b01.isEnabled() == false &&  b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
        
        lost();
        button_verification();
        
      }
      
    }else if(var.equals(turn2)) {
      
      b01.setText("O");
      b01.setEnabled(false);
        lblturn.setText(turn1);
        
            if(var_b02 == "O" && var_b03 == "O") {
        
        o_b01_winner_option1( player2, player1);
        
      }else if(var_b04 == "O" && var_b07 == "O") {
        
      o_b01_winner_option2( player2, player1);
        
      }else if(var_b05 == "O" && var_b09 == "O") {
        
       o_b01_winner_option3( player2, player1);
        
      }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
        
        lost();
        button_verification();
      }
    }
    
  }
  
     public static void ACTION_B02(String player1, String player2) {
    
    String var = lblturn.getText();
    String var_b01 = b01.getText();
    String var_b02 = b02.getText();
    String var_b03 = b03.getText();
    String var_b04 = b04.getText();
    String var_b05 = b05.getText();
    String var_b06 = b06.getText();
    String var_b07 = b07.getText();
    String var_b08 = b08.getText();
    String var_b09 = b09.getText();
    
    if(var.equals(start)){
      
      b02.setText("X");
      b02.setEnabled(false);
      lblturn.setText(turn2);
      
    }else if(var.equals(turn1)){
      
      b02.setText("X");
      b02.setEnabled(false);
      lblturn.setText(turn2);
      
      if(var_b01 == "X" && var_b03 == "X") {
        
        x_b02_winner_option1(player1, player2);
        
      }else if(var_b05 == "X" && var_b08 == "X") {
        
        x_b02_winner_option2(player1, player2);
        
      }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
        
        lost();
        button_verification();
      }
      
    }else if(var.equals(turn2)) {
      
      b02.setText("O");
      b02.setEnabled(false);
      lblturn.setText(turn1);
        
      if(var_b01 == "O" && var_b03 == "O") {
        
      o_b02_winner_option1(player2,player1);
        
      }else if(var_b05 == "O" && var_b08 == "O") {
        
      o_b02_winner_option2(player2, player1);
        
      }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
        
        lost();
        button_verification();
      }
    }
    
  }

    public static void ACTION_B03(String player1, String player2) {
  
  String var = lblturn.getText();
  String var_b01 = b01.getText();
  String var_b02 = b02.getText();
  String var_b03 = b03.getText();
  String var_b04 = b04.getText();
  String var_b05 = b05.getText();
  String var_b06 = b06.getText();
  String var_b07 = b07.getText();
  String var_b08 = b08.getText();
  String var_b09 = b09.getText();
  
  if(var.equals(start)){
    
    b03.setText("X");
    b03.setEnabled(false);
    lblturn.setText(turn2);
    
  }else if(var.equals(turn1)){
    
    b03.setText("X");
    b03.setEnabled(false);
    lblturn.setText(turn2);
    
    if(var_b01 == "X" && var_b02 == "X") {
      
      x_b03_winner_option1(player1, player2);
      
    }else if(var_b05 == "X" && var_b07 == "X") {
      
      x_b03_winner_option2(player1, player2);
      
    }else if(var_b06 == "X" && var_b09 == "X") {
      
      x_b03_winner_option3(player1, player2);
      
    }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
      
      lost();
      button_verification();
    }
    
  }else if(var.equals(turn2)) {
    
    b03.setText("O");
    b03.setEnabled(false);
      lblturn.setText(turn1);
      
        if(var_b01 == "O" && var_b02 == "O") {
      
      o_b03_winner_option1(player2, player1);
      
    }else if(var_b05 == "O" && var_b07 == "O") {
      
      o_b03_winner_option2(player2, player1);
      
    }else if(var_b06 == "O" && var_b09 == "O") {
      
      o_b03_winner_option3(player2, player1);
      
    }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
      
      lost();
      button_verification();
    }
  }
  
}
    
    public static void ACTION_B04(String player1, String player2) {
      
      
      String var = lblturn.getText();
      String var_b01 = b01.getText();
      String var_b02 = b02.getText();
      String var_b03 = b03.getText();
      String var_b04 = b04.getText();
      String var_b05 = b05.getText();
      String var_b06 = b06.getText();
      String var_b07 = b07.getText();
      String var_b08 = b08.getText();
      String var_b09 = b09.getText();
      
      if(var.equals(start)) {
        
        b04.setText("X");
        b04.setEnabled(false);
        lblturn.setText(turn2);
        
      }else if(var.equals(turn1)) {
        
        b04.setText("X");
        b04.setEnabled(false);
        lblturn.setText(turn2);
        
        if(var_b01 == "X" && var_b07 == "X") {
          
          x_b04_winner_option1(player1, player2);
          
        }else if(var_b05 == "X" && var_b06 == "X") {
          
          x_b04_winner_option2(player1, player2);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
        
      }else if(var.equals(turn2)) {
        
        b04.setText("O");
        b04.setEnabled(false);
        lblturn.setText(turn1);

            if(var_b01 == "O" && var_b07 == "O") {
          
          o_b04_winner_option1(player2, player1);
          
        }else if(var_b05 == "O" && var_b06 == "O") {
          
          o_b04_winner_option2(player2, player1);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
      }
    }
    }
    
    public static void ACTION_B05(String player1, String player2) {
      
      
      String var = lblturn.getText();
      String var_b01 = b01.getText();
      String var_b02 = b02.getText();
      String var_b03 = b03.getText();
      String var_b04 = b04.getText();
      String var_b05 = b05.getText();
      String var_b06 = b06.getText();
      String var_b07 = b07.getText();
      String var_b08 = b08.getText();
      String var_b09 = b09.getText();
      
      if(var.equals(start)) {
        
        b05.setText("X");
        b05.setEnabled(false);
        lblturn.setText(turn2);
        
      }else if(var.equals(turn1)) {
        
        b05.setText("X");
        b05.setEnabled(false);
        lblturn.setText(turn2);
        
        if(var_b02 == "X" && var_b08 == "X") {
          
          x_b05_winner_option1(player1,player2);
          
        }else if(var_b04 == "X" && var_b06 == "X") {
          
          x_b05_winner_option2(player1, player2);
          
        }else if(var_b01 == "X" && var_b09 == "X") {
          
          x_b05_winner_option3(player1, player2);
          
        }else if(var_b07 == "X" && var_b03 == "X") {
          
          x_b05_winner_option4(player1, player2);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
        
      }else if(var.equals(turn2)) {
        
        b05.setText("O");
        b05.setEnabled(false);
        lblturn.setText(turn1);
        
            if(var_b02 == "O" && var_b08 == "O") {
          
          o_b05_winner_option1(player2, player1);
          
        }else if(var_b04 == "O" && var_b06 == "O") {
          
          o_b05_winner_option2(player2, player1);
          
        }else if(var_b01 == "O" && var_b09 == "O") {
          
          o_b05_winner_option3(player2, player1);
          
        }else if(var_b07 == "O" && var_b03 == "O") {
          
          o_b05_winner_option4(player2,player1);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
      }
    }
    
    public static void ACTION_B06(String player1, String player2) {
      
      
      String var = lblturn.getText();
      String var_b01 = b01.getText();
      String var_b02 = b02.getText();
      String var_b03 = b03.getText();
      String var_b04 = b04.getText();
      String var_b05 = b05.getText();
      String var_b06 = b06.getText();
      String var_b07 = b07.getText();
      String var_b08 = b08.getText();
      String var_b09 = b09.getText();
      
      if(var.equals(start)) {
        
        b06.setText("X");
        b06.setEnabled(false);
        lblturn.setText(turn2);
        
      }else if(var.equals(turn1)) {
        
        b06.setText("X");
        b06.setEnabled(false);
        lblturn.setText(turn2);
        
        if(var_b03 == "X" && var_b09 == "X") {
          
          x_b06_winner_option1(player1, player2);
          
        }else if(var_b04 == "X" && var_b05 == "X") {
          
          x_b06_winner_option2(player1, player2);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
        
      }else if(var.equals(turn2)) {
        
        b06.setText("O");
        b06.setEnabled(false);
        lblturn.setText(turn1);
        
            if(var_b03 == "O" && var_b09 == "O") {
          
           o_b06_winner_option1(player2, player1);
          
        }else if(var_b04 == "O" && var_b05 == "O") {
          
           o_b06_winner_option2(player2, player1);
          
        }else if(b01.isEnabled() == false && b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
      }
    }
    
     public static void ACTION_B07(String player1, String player2) {
      
      String var = lblturn.getText();
      String var_b01 = b01.getText();
      String var_b02 = b02.getText();
      String var_b03 = b03.getText();
      String var_b04 = b04.getText();
      String var_b05 = b05.getText();
      String var_b06 = b06.getText();
      String var_b07 = b07.getText();
      String var_b08 = b08.getText();
      String var_b09 = b09.getText();
      
      if(var.equals(start)) {
        
        b07.setText("X");
        b07.setEnabled(false);
        lblturn.setText(turn2);
        
      }else if(var.equals(turn1)) {
        
        b07.setText("X");
        b07.setEnabled(false);
        lblturn.setText(turn2);
        
        if(var_b01 == "X" && var_b04 == "X") {
          
          x_b07_winner_option1(player1, player2);
          
        }else if(var_b05 == "X" && var_b03 == "X") {
          
          x_b07_winner_option2(player1, player2);
          
        }else if(var_b08 == "X" && var_b09 == "X") {
          
          x_b07_winner_option3(player1, player2);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
        
      }else if(var.equals(turn2)) {
        
        b07.setText("O");
        b07.setEnabled(false);
        lblturn.setText(turn1);
        
        if(var_b01 == "O" && var_b04 == "O") {
          
          o_b07_winner_option1(player2, player1);
          
        }else if(var_b05 == "O" && var_b03 == "O") {
          
          o_b07_winner_option2(player2, player1);
          
        }else if(var_b08 == "O" && var_b09 == "O") {
          
          o_b07_winner_option3(player2, player1);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
      }
    }
     
     public static void ACTION_B08(String player1, String player2) {
      
      String var = lblturn.getText();
      String var_b01 = b01.getText();
      String var_b02 = b02.getText();
      String var_b03 = b03.getText();
      String var_b04 = b04.getText();
      String var_b05 = b05.getText();
      String var_b06 = b06.getText();
      String var_b07 = b07.getText();
      String var_b08 = b08.getText();
      String var_b09 = b09.getText();
      
      if(var.equals(start)) {
        
        b08.setText("X");
        b08.setEnabled(false);
        lblturn.setText(turn2);
        
      }else if(var.equals(turn1)) {
        
        b08.setText("X");
        b08.setEnabled(false);
        lblturn.setText(turn2);
        
        if(var_b07 == "X" && var_b09 == "X") {
          
          x_b08_winner_option1(player1, player2);
          
        }else if(var_b05 == "X" && var_b02 == "X") {
          
          x_b08_winner_option2(player1, player2);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
        
      }else if(var.equals(turn2)) {
        
        b08.setText("O");
        b08.setEnabled(false);
        lblturn.setText(turn1);
        
        if(var_b07 == "O" && var_b09 == "O") {
          
          o_b08_winner_option1(player2, player1);
          
        }else if(var_b05 == "O" && var_b02 == "O") {
          
          o_b08_winner_option2(player2, player1);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
      }
     }
     
     public static void ACTION_B09(String player1, String player2) {
      
      String var = lblturn.getText();
      String var_b01 = b01.getText();
      String var_b02 = b02.getText();
      String var_b03 = b03.getText();
      String var_b04 = b04.getText();
      String var_b05 = b05.getText();
      String var_b06 = b06.getText();
      String var_b07 = b07.getText();
      String var_b08 = b08.getText();
      String var_b09 = b09.getText();
      
      
      if(var.equals(start)) {
        
        b09.setText("X");
        b09.setEnabled(false);
        lblturn.setText(turn2);
        
      }else if(var.equals(turn1)) {
        
        b09.setText("X");
        b09.setEnabled(false);
        lblturn.setText(turn2);
        
        if(var_b01 == "X" && var_b05 == "X") {
          
          x_b09_winner_option1(player1, player2);
          
        }else if(var_b07 == "X" && var_b08 == "X") {
          
          x_b09_winner_option2(player1, player2);
          
        }else if(var_b03 == "X" && var_b06 == "X") {
          
          x_b09_winner_option3(player1, player2);
          
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
        
      }else if(var.equals(turn2)) {
        
        b09.setText("O");
        b09.setEnabled(false);
        lblturn.setText(turn1);
        
        if(var_b01 == "O" && var_b05 == "O") {
          
          o_b09_winner_option1(player2, player1);
          
        }else if(var_b07 == "O" && var_b08 == "O") {
          
          o_b09_winner_option2(player2, player1);
          
        }else if(var_b03 == "O" && var_b06 == "O") {
          
          o_b09_winner_option3(player2, player1);
           
        }else if(b01.isEnabled() == false && b02.isEnabled() == false && b03.isEnabled()  == false && b04.isEnabled()  == false && b05.isEnabled()  == false && b06.isEnabled()  == false && b07.isEnabled()  == false && b08.isEnabled()  == false && b09.isEnabled()  == false) {
          
          lost();
          button_verification();
        }
      }
     }
     
     /* LOST ACTION */
          
     public static void lost() {
       
       lblturn.setText("En espera");
       lblresult.setText("Empate");
       
      if(Panel3.isVisible()) {
         
        Panel4.setVisible(true);
        Panel3.setBounds(692, 11, 325, 388);
        Panel4.setBounds(692, 413, 325, 177);
        
       }else {
         
         Panel4.setVisible(true);
         Panel4.setBounds(692, 222, 325, 177);
       }
     }
     
     /* SCORE - PLAYER X */
     
     public static void score_x(String player1, String player2) {
       //score1 = "Jugador X:", score2 = "Jugador O:", scr1 = "---", scr2 = "---";

       String j = lblsrc1.getText();
       
       if(j == scr1) {
         
         lblsrc1.setText("1");
         
       }else if(j == "1"){
         
         lblsrc1.setText("2");
       }else if(j == "2"){
        
         lblsrc1.setText("3");
       }else if(j == "3"){
         
         lblsrc1.setText("4");
       }else if(j == "4"){
         
         lblsrc1.setText("5");
       }else if(j == "5"){
         
         lblsrc1.setText("6");
       }else if(j == "6"){
         
         lblsrc1.setText("7");
       }else if(j == "7"){
         
         lblsrc1.setText("8");
       }else if(j == "8"){
         
         lblsrc1.setText("9");
       }else if(j == "9"){
    	   
         String a1 = "Desconocid@1", a2 = "Desconocid@2";
         
         lblsrc1.setText("10");
         
         if(player1 == null && player2 == null || player1 == "" && player2 == "") {
             JOptionPane.showMessageDialog(null, "Felicidades "+a1+" le ganaste a "+a2+" !!", "Tenemos un ganador",JOptionPane.INFORMATION_MESSAGE);
         }else {
             JOptionPane.showMessageDialog(null, "Felicidades "+player1+" le ganaste a "+player2+" !!", "Tenemos un ganador",JOptionPane.INFORMATION_MESSAGE);
         }
        
        /*
         *  String a = lblsrc1.getText();
    	 SCR1 = Integer.parseInt(a);
    	 
    	 if(lblsrc2.getText().equals(scr2)) {
    		 
    		 SCR2 = 0;
    		 
    	 }else {
    		 
    		 String b = lblsrc2.getText();
    		 SCR2 = Integer.parseInt(b);
    	 }
    	 
    	 if(player1 == null && player2 == null || player1 == "" && player2 == "") {
    		 
    		 player1 = a1;
    		 player2 = a2;
    	 }
    	 
    	 INNING_MESSAGE = new winning_message_window(player1, player2, SCR1, SCR2);
    	 WINNING_MESSAGE.setVisible(true);
         */
         
         btnFinish.setBounds(10, 11, 305, 40);
         btnReset.setBounds(10, 80, 305, 40);
         
         if(Panel3.isVisible()) {
           
             Panel4.setBounds(692, 431, 325, 130);
         }else {
           
        Panel4.setBounds(692, 222, 325, 130);
         }
       }
     }
     
     /* SCORE - PLAYER O */
     
     public static void score_o(String player2, String player1) {
       //score1 = "Jugador X:", score2 = "Jugador O:", scr1 = "---", scr2 = "---";

       String j = lblsrc2.getText();
       
       if(j == scr2) {
         
         lblsrc2.setText("1");
         
       }else if(j == "1"){
         
         lblsrc2.setText("2");
       }else if(j == "2"){
        
         lblsrc2.setText("3");
       }else if(j == "3"){
         
         lblsrc2.setText("4");
       }else if(j == "4"){
         
         lblsrc2.setText("5");
       }else if(j == "5"){
         
         lblsrc2.setText("6");
       }else if(j == "6"){
         
         lblsrc2.setText("7");
       }else if(j == "7"){
         
         lblsrc2.setText("8");
       }else if(j == "8"){
         
         lblsrc2.setText("9");
       }else if(j == "9"){
    
         String a1 = "Desconocid@1", a2 = "Desconocid@2";
         
         lblsrc2.setText("10");
         /*lblwinnerfinalo.setVisible(true);*/
         
         if(player1 == null && player2 == null || player1 == "" && player2 == "") {
             JOptionPane.showMessageDialog(null, "Felicidades "+a2+" le ganaste a "+a1+" !!", "Tenemos un ganador",JOptionPane.INFORMATION_MESSAGE);
         }else {
        	 JOptionPane.showMessageDialog(null, "Bien "+player2+" le ganaste a "+player1+" !!", "Tenemos un ganador", JOptionPane.INFORMATION_MESSAGE);
         }
         
         Panel4.setBounds(692, 481, 325, 138);
         btnFinish.setBounds(10, 11, 305, 40);
         btnReset.setBounds(10, 80, 305, 40);
         
             if(Panel3.isVisible()) {
           
             Panel4.setBounds(692, 481, 325, 130);
         }else {
           
        Panel4.setBounds(692, 222, 325, 130);
         }
       }
     }
     
     public static void panel_action() {
       
       if(Panel3.isVisible()) {
         
        Panel4.setVisible(true);
        Panel3.setBounds(692, 30, 325, 388);
        Panel4.setBounds(692, 440, 325, 177);
        
       }else {
         
         Panel4.setVisible(true);
         Panel4.setBounds(692, 222, 325, 177);
       } 
     }
     
     public static void button_verification() {
       
       String a = lblsrc1.getText();
       String b = lblsrc2.getText();
       
       if(a == "10") {
         
         btnRepeat.setVisible(false);
         
       }else if(b == "10") {
         
         btnRepeat.setVisible(false);
       }else if(a != "10") {
           
         if(Panel3.isVisible()) {
               
              Panel4.setVisible(true);
              Panel3.setBounds(692, 30, 325, 388);
              Panel4.setBounds(692, 440, 325, 177);
              btnFinish.setBounds(10, 68, 305, 40);
              btnReset.setBounds(10, 127, 305, 40);
              btnRepeat.setBounds(10, 11, 305, 40);
              
             }else {
               
               Panel4.setVisible(true);
               Panel4.setBounds(692, 222, 325, 177);
             } 
          
       }else if(b != "10") {
         
         if(Panel3.isVisible()) {
             
            Panel4.setVisible(true);
            Panel3.setBounds(692, 30, 325, 388);
            Panel4.setBounds(692, 440, 325, 177);
            btnFinish.setBounds(10, 68, 305, 40);
            btnReset.setBounds(10, 127, 305, 40);
            btnRepeat.setBounds(10, 11, 305, 40);
            
           }else {
             
             Panel4.setVisible(true);
             Panel4.setBounds(692, 222, 325, 177);
           } 
       }
     }
     
     public static void reset_or_newGame(String player1, String player2) {
       
       btnReset.setCursor(new Cursor(Cursor.WAIT_CURSOR));
         
         b01.setText("");
         b02.setText("");
         b03.setText("");
         b04.setText("");
         b05.setText("");
         b06.setText("");
         b07.setText("");
         b08.setText("");
         b09.setText("");
         
         b01.setBackground(new Color(234, 237, 237));
         b02.setBackground(new Color(234, 237, 237));
         b03.setBackground(new Color(234, 237, 237));
         b04.setBackground(new Color(234, 237, 237));
         b05.setBackground(new Color(234, 237, 237));
         b06.setBackground(new Color(234, 237, 237));
         b07.setBackground(new Color(234, 237, 237));
         b08.setBackground(new Color(234, 237, 237));
         b09.setBackground(new Color(234, 237, 237));

         b01.setEnabled(true);
         b02.setEnabled(true);
         b03.setEnabled(true);
         b04.setEnabled(true);
         b05.setEnabled(true);
         b06.setEnabled(true);
         b07.setEnabled(true);
         b08.setEnabled(true);
         b09.setEnabled(true);
         
         lblturn.setText(start);
         lblresult.setText(result1);
         lblscore1.setText(score1);
         lblscore2.setText(score2);
         lblsrc1.setText(scr1);
         lblsrc2.setText(scr2);
         
         if(player1 == "" && player2 == "" || player1 == null && player2 == null || player1 == null || player1 == "" || player2 == null || player2 == "") {
        	 
        	 userName_null();
        	 
         }else {
        	 
        	 userName_activated(player1, player2); 
         }
         
         btnPanel.setVisible(false);
         Panel4.setVisible(false);
         Panel3.setBounds(692, 130, 325, 388);
         Panel3.setVisible(true);
     }
     
     public static void verification_username_player1(String player1) {
    	 
    	 if(player1 == null || player1 == "") {
    		 
    		 lblresult.setText("Ganador: X    ("+condition+")");
    		 
    	 }else {
    		 
    		 lblresult.setText("Ganador: X    ("+player1+")");
    	 }
     }
     
     public static void verification_username_player2(String player2) {
    	 
    	 if(player2 == null || player2 == "") {
    		 
    		 lblresult.setText("Ganador: O    ("+condition+")");
    		 
    	 }else {
    		 
    		 lblresult.setText("Ganador: O    ("+player2+")");
    	 }
     }
     
     /* NAME USER(S) -> NULL */
     
     public static void userName_null() {
    	 
    	 lbl_competition_players.setText(cndtUser1);
         lbl_competition_players_mss.setText(cndtUser2);
         lbl_competition_players_mss.setVisible(true);
         lbl_competition_players.setBounds(148, 35, 398, 42);
         lbl_competition_players_mss.setBounds(148, 73, 398, 42);
         lbl_return.setBounds(0, 1, 124, 40);
         lbl_player1_x.setText("Sin nombre");
         lbl_player2_O.setText("Sin nombre");
     }
     
     /* NAME PLAYER(S) -> COMPLETED */
     
     public static void userName_activated(String player1, String player2) {
    	 
       	 lbl_competition_players.setBounds(0, 65, 682, 42);
         lbl_return.setBounds(10, 16, 124, 40);
         lbl_competition_players_mss.setVisible(false);
         lbl_competition_players.setText(player1+" (X)  VS  "+player2+" (O)");
         lbl_competition_players.setForeground(new Color(220, 118, 51));
         lbl_competition_players.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
         lbl_player1_x.setText(player1);
         lbl_player2_O.setText(player2);
     }
     
    /* lbl_return EVENT'S */
    
    public static void MOUSE_ENTERED_EVENT_lbl_return() {
    	
    	lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_game\\flecha-hacia-atras.png"));
    	lbl_return.setForeground(new Color(27, 27, 27));
    	lbl_return.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    public static void MOUSE_EXITED_EVENT_lbl_return() {
    	
    	lbl_return.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SaspraGames\\tic_tac_toe_game_java\\Icon\\page_game\\flecha-hacia-atras(2).png"));
    	lbl_return.setForeground(new Color(108, 108, 108));
    	lbl_return.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
    
    /* lbl_return EVENT'S finished*/
     
    public static void x_bo1_winner_option1(String player1, String player2) {
       
         b01.setBackground(new Color(153, 255, 102));
         b02.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
         //score1 = "Jugador X: ---", score2 = "Jugador O: ---", scr1 = "Jugador X: ", scr2 = "Jugador O: ";
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
                        
     }
     
     public static void x_bo1_winner_option2(String player1, String player2) {
       
         b01.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
          
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_bo1_winner_option3(String player1, String player2) {
       
       b01.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
          
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     /**
      * Evaluar el ganador b02
      */
     
     public static void x_b02_winner_option1(String player1, String player2) {
       
       b01.setBackground(new Color(153, 255, 102));
         b02.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_b02_winner_option2(String player1, String player2) {
       
       b02.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }

     
     
     /**
      * Evaluar el ganador b03
      */
     
     public static void x_b03_winner_option1(String player1, String player2) {
       
         b01.setBackground(new Color(153, 255, 102));
         b02.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_b03_winner_option2(String player1, String player2) {
       
         b03.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_b03_winner_option3(String player1, String player2) {
       
       b03.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     
     
     public static void x_b04_winner_option1(String player1, String player2) {
       
         b01.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
       
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_b04_winner_option2(String player1, String player2) {
       
       b04.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
       
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     /**
      * Evaluar el ganador b05
      */
     
     public static void x_b05_winner_option1(String player1, String player2) {
       
         b02.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2); 
     }
     
     public static void x_b05_winner_option2(String player1, String player2) {
       
       b04.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2); 
     }
     
     public static void x_b05_winner_option3(String player1, String player2) {
       
       b01.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_b05_winner_option4(String player1, String player2) {
       
       b07.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);

     }
     
     /**
      * Evaluar el ganador b06
      */
     
     public static void x_b06_winner_option1(String player1, String player2) {
       
       b03.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2); 
     }
    
     public static void x_b06_winner_option2(String player1, String player2) {
       
       b04.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     
     /**
      * Evaluar el ganador b07
      */
     
     public static void x_b07_winner_option1(String player1, String player2) {
       
       b01.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2); 
     }
     
     public static void x_b07_winner_option2(String player1, String player2) {
       
       b07.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2); 
     }
     
     public static void x_b07_winner_option3(String player1, String player2) {
       
       b07.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     /**
      * Evaluar el ganador b08
      */
     
     public static void x_b08_winner_option1(String player1, String player2) {
       
       b07.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);  
     }
     
     public static void x_b08_winner_option2(String player1, String player2) {
       
       b02.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     /**
      * Evaluar el ganador b09
      */
     
     public static void x_b09_winner_option1(String player1, String player2) {
       
       b01.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2); 
     }
     
     public static void x_b09_winner_option2(String player1, String player2) {
       
       b07.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     public static void x_b09_winner_option3(String player1, String player2) {
       
       b03.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
          
         lblturn.setText("En espera");
        
         verification_username_player1(player1);
         panel_action();
         button_verification();
         score_x(player1, player2);
     }
     
     /**
      * 
      * Evaluar jugador O
      * 
      */
     
     public static void o_b01_winner_option1(String player2, String player1) {
       
         b01.setBackground(new Color(153, 255, 102));
         b02.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
       
         lblturn.setText("En espera");
        
         verification_username_player2(player2);
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b01_winner_option2(String player2, String player1) {
         
         b01.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
       
         lblturn.setText("En espera");
         
         verification_username_player2(player2);
         panel_action();
         button_verification();
         score_o(player2, player1);
     }

     public static void o_b01_winner_option3(String player2, String player1) {
       
         b01.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
        
         verification_username_player2(player2);
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     
     
     public static void o_b02_winner_option1(String player2, String player1) {
       
         b01.setBackground(new Color(153, 255, 102));
         b02.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");
         
         verification_username_player2(player2);
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b02_winner_option2(String player2, String player1) {
       
       b02.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     
     
     public static void o_b03_winner_option1(String player2, String player1) {
       
       b01.setBackground(new Color(153, 255, 102));
         b02.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b03_winner_option2(String player2, String player1) {
       
       b03.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b03_winner_option3(String player2, String player1) {
       
       b03.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     
     
     public static void o_b04_winner_option1(String player2, String player1) {
       
       b01.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
       
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b04_winner_option2(String player2, String player1) {
       
       b05.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);        
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     
     
     public static void o_b05_winner_option1(String player2, String player1) {
       
         b02.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);        
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b05_winner_option2(String player2, String player1) {
       
       b04.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }

     public static void o_b05_winner_option3(String player2, String player1) {
       
       b01.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();  
         score_o(player2, player1);
     }

     public static void o_b05_winner_option4(String player2, String player1) {
   
       b07.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();  
         score_o(player2, player1);
     }
     

     
     public static void o_b06_winner_option1(String player2, String player1) {
       
       b03.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
       
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b06_winner_option2(String player2, String player1) {
       
       b04.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     

     
     public static void o_b07_winner_option1(String player2, String player1) {
       
       b01.setBackground(new Color(153, 255, 102));
         b07.setBackground(new Color(153, 255, 102));
         b04.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");

         verification_username_player2(player2);        
         panel_action();
         button_verification();
         score_o(player2, player1);
         
     }
     
     public static void o_b07_winner_option2(String player2 , String player1) {
       
       b07.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b03.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b07_winner_option3(String player2 , String player1) {
       
       b07.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
       
         lblturn.setText("En espera");

         verification_username_player2(player2);         
          panel_action();
          button_verification();
          score_o(player2, player1);
     }
     

     
     public static void o_b08_winner_option1(String player2 , String player1) {
       
       b07.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b08_winner_option2(String player2, String player1) {
       
       b02.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);        
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     

     
     public static void o_b09_winner_option1(String player2, String player1) {
       
       b01.setBackground(new Color(153, 255, 102));
         b05.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
         
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b09_winner_option2(String player2, String player1) {
       
         b07.setBackground(new Color(153, 255, 102));
         b08.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);        
         panel_action();
         button_verification();
         score_o(player2, player1);
     }
     
     public static void o_b09_winner_option3(String player2, String player1) {
       
         b03.setBackground(new Color(153, 255, 102));
         b06.setBackground(new Color(153, 255, 102));
         b09.setBackground(new Color(153, 255, 102));
        
         lblturn.setText("En espera");

         verification_username_player2(player2);         
         panel_action();
         button_verification();
         score_o(player2, player1);
         
     }
}