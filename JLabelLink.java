package tic_tac_toe_game_java;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;

public class JLabelLink extends JLabel{
	
		    private String text="";
		    private String TextLink=null;
		    private URI uri;

		    public JLabelLink(){
		        super();
		        this.setCursor(Cursor.getPredefinedCursor( Cursor.HAND_CURSOR ));
		        this.setPreferredSize( new Dimension(34,14) );
		        this.setVisible(true);
		        //Eventos del raton sobre el JLabel
		        addMouseListener(new MouseAdapter() {
		            @Override
		                public void mouseClicked(MouseEvent e) {
		                    Abrir_URL(uri);
		                }
		         
		        });

		    }

		    /**
		 * Coloca la dirección web
		 */
		    public void setLink( String link )
		    {        
		        try {
		            uri = new URI(link);
		        } catch (URISyntaxException e) {
		            throw new RuntimeException(e);
		        }
		    }

		    /**
		 * Coloca el texto que contiene el enlace web
		 */
		    public void setTextLink( String texto )
		    {
		        this.TextLink = texto;
		    }

		    /**
		 * Abre enlace web en el navegador
		 */
		    private void Abrir_URL(URI uri) {
		      if (Desktop.isDesktopSupported()) {
		          Desktop desktop = Desktop.getDesktop();
		          try {
		             desktop.browse(uri);
		          } catch (IOException e) {
		             System.err.println("Error: No se pudo abrir el enlace" + e.getMessage() );
		          }
		      } else {
		          System.err.println("Error: Error de compatibilidad en la plataforma actual. No se puede abrir enlaces web.");
		      }
		    }

		}