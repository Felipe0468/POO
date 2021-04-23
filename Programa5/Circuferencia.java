import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circuferencia extends JApplet {

  public void paint (Graphics g) {
   int a=100;
   int b=60;
   int c=100;
   Graphics2D G2D = (Graphics2D) g;
   while (a>=0){
   G2D.setColor( Color.ORANGE );
   G2D.setFont( new Font( "Corbel Light", Font.BOLD, a ) );
   G2D.setRenderingHint( RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB );
   g.drawString ("O", b, c);
   a=a-10;
   b=b+4;
   c=c-4;
   }
   
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