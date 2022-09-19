package changecolor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Changecolor extends  JFrame implements  ActionListener, MouseListener
{

    JFrame jF;
    JLabel L1;
    public Changecolor() 
    {
        setupJFrame();
        L1 = new JLabel("COLOR IS :  ");
        L1.setFont(new Font("cambria",Font.BOLD,20));
        jF.add(L1);
        
         L1.addMouseListener(this);
        jF.setVisible(true);
        
    }
      void setupJFrame()
    {
        jF = new JFrame("change the background color");
        jF.setLayout(new FlowLayout());
    // jF.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));        
       jF.getContentPane().setBackground(Color.PINK);
        jF.setSize(800, 500);
        //jF.setLocation(200, 200);
       jF.setLocationByPlatform(true);
        jF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    } 
    public static void main(String[] args)
    {
        new Changecolor();
    }

  
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
        jF.getContentPane().setBackground(Color.black);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       //  jF.getContentPane().setBackground(Color.yellow);
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        L1.setText("COLOR IS YELLOW");
         jF.getContentPane().setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        L1.setText("COLOR IS CYAN");
        jF.getContentPane().setBackground(Color.cyan);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
