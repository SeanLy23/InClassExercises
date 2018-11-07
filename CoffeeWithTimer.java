import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.MBeanNotificationInfo;
import javax.management.timer.Timer;
import javax.swing.JOptionPane;

public class CoffeeWithTimer
{
    private static final int delay = 1000;

    class DrinkCoffee implements ActionListener 
    {
        private int gulps;
        
        public DrinkCoffee (int inGulps)
        {
            gulps = inGulps;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            // TODO Auto-generated method stub
            if (gulps > 0)
            {
                System.out.println(gulps);
                gulps--;
            }
            else if (gulps == 0)
            {
                System.out.println("end");
            }
            
        }
        
    }
    public CoffeeWithTimer()
    {
        
    }

    public static void main(String[] args)
    {
        
      
        MBeanNotificationInfo dc;
        // TODO Auto-generated method stub
        Timer t = new Timer ();
        t.start();
        
        JOptionPane.showMessageDialog(null,  "Make another?");
        

    }

}
