package tic_tac_toe_game_java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JDialog {

	private final JPanel Panel1 = new JPanel();
	
	winning_message_window WINNING_MESSAGE_WINDOW;
	static String player1, player2;
	static String scr1, scr2;
	static JButton btnsave;
	static JLabel lblply1, lblply2, lblscr1, lblscr2;
	static JTextField txtply1, txtply2, txtscr1, txtscr2;
	private JSeparator JS;
	static int SCR1, SCR2;
	static JPanel de;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			test dialog = new test();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public test() {
		setBounds(100, 100, 450, 372);
		getContentPane().setLayout(new BorderLayout());
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel1, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		Panel1.setLayout(null);
		
		lblply1 = new JLabel();
		lblply1.setText("Escribe tu nombre de usuario (jugador1)");
		lblply1.setHorizontalAlignment(SwingConstants.CENTER);
		lblply1.setBounds(5, 13, 193, 14);
		Panel1.add(lblply1);
		
		txtply1 = new JTextField();
		txtply1.setBounds(210, 10, 200, 20);
		Panel1.add(txtply1);
		
		lblscr1 = new JLabel();
		lblscr1.setText("Ingresa el puntaje (jugador 1)");
		lblscr1.setHorizontalAlignment(SwingConstants.LEFT);
		lblscr1.setBounds(5, 53, 190, 14);
		Panel1.add(lblscr1);
		
		txtscr1 = new JTextField();
		txtscr1.setBounds(210, 50, 200, 20);
		Panel1.add(txtscr1);
		
		JS = new JSeparator();
		JS.setBounds(5, 99, 405, 4);
		JS.setBackground(Color.BLACK);
		JS.setForeground(Color.BLACK);
		Panel1.add(JS);
		
		lblply2 = new JLabel();
		lblply2.setText("Escribe tu nombre de usuario (jugador2)");
		lblply2.setHorizontalAlignment(SwingConstants.CENTER);
		lblply2.setBounds(5, 130, 193, 14);
		Panel1.add(lblply2);
		
		txtply2 = new JTextField();
		txtply2.setBounds(210, 130, 200, 20);
		Panel1.add(txtply2);
		
		lblscr2 = new JLabel();
		lblscr2.setText("Ingresa el puntaje (jugador 2)");
		lblscr2.setHorizontalAlignment(SwingConstants.LEFT);
		lblscr2.setBounds(5, 180, 190, 14);
		Panel1.add(lblscr2);
		
		txtscr2 = new JTextField();
		txtscr2.setBounds(210, 180, 200, 20);
		Panel1.add(txtscr2);
		
		btnsave = new JButton();
		btnsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				player1 = txtply1.getText();
				scr1 = txtscr1.getText();
				
				player2 = txtply2.getText();
				scr2 = txtscr2.getText();
				
				if(player1 == "" || player2 == "" || scr1 == "" || scr2 == "" || player1 == null || player2 == null || scr1 == null || scr2 == null) {
					
					JOptionPane.showMessageDialog(null, "Faltan datos, revisa e intenta de nuevo", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
					
				}else {
					
					SCR1 = Integer.parseInt(scr1);
					SCR2 = Integer.parseInt(scr2);
					
					WINNING_MESSAGE_WINDOW = new winning_message_window(player1, player2, SCR1, SCR2);
					WINNING_MESSAGE_WINDOW.setVisible(true);
				}
				
			}
		});
		btnsave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnsave.setText("Guardar y continuar");
		btnsave.setBounds(138, 232, 150, 40);
		Panel1.add(btnsave);
		
	}
}