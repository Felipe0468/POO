import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circuferencia extends JApplet {

  public void paint (Graphics g) {
   Graphics2D G2D = (Graphics2D) g;
   G2D.setColor( Color.ORANGE );
   G2D.setFont( new Font( "Corbel Light", Font.PLAIN, 100 ) );
   G2D.setRenderingHint( RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB );
   g.drawString ("O", 60, 100);
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    Circuferencia circuferenciaApplet = new Circuferencia();
    circuferenciaApplet.init();
    frame.getContentPane().add(circuferenciaApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}