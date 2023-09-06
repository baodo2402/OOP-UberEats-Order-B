import javax.swing.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class View extends JFrame
{
    private MyPanel panel = new MyPanel();
    
    public View()
    {
        super("UberEats");
        setup();
        build();
        
    }

    private void setup()
    {
        setSize(450, 450);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    private void build()
    {
        add(panel);
        
    }
    private class MyPanel extends JPanel
    {
        private JLabel choice;
        private JTextField choice1;

        private JButton set;
        private JLabel label;
        private JRadioButton viet;
        private JRadioButton thai;
        

        public MyPanel()
        {
            choice = new JLabel("Hello");
            viet = new JRadioButton("Vietnamese Restaurant");
            thai = new JRadioButton("Thai Restaurant");
            set = new JButton("set");
            
            setup();
            buildRestaurant();

        }

        private void setup()
        {
            set.addActionListener(new OurListener());
        }
        public void buildUberEats()
        {
            add(choice);
            
        }
        public void buildRestaurant()
        {
            add(viet);
            add(thai);
            add(set);
        }
        private class OurListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {

            }
        }
    }
}