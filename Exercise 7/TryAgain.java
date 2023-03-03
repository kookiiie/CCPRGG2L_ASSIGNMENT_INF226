import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame {
   
    TryAgain(){

        JButton tryAgain = new JButton();
        tryAgain.setText("try again");
        tryAgain.setFont(new Font("Arial", Font.BOLD, 20));
        //add event
        TryAgainEventHandler handler2 = new TryAgainEventHandler();
        tryAgain.addActionListener(handler2);

        JButton exit = new JButton();
        exit.setText("exit");
        exit.setFont(new Font("Arial", Font.BOLD, 20));
        //add event
        ExitEventHandler handler3 = new ExitEventHandler();
        exit.addActionListener(handler3);

        this.add(tryAgain);
        this.add(exit);

        //close program
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //frame
        this.setSize(500, 500);
        this.setVisible(true);
        //set frame to center
        this.setLocationRelativeTo(null);
        // set bg
        this.getContentPane().setBackground(Color.BLACK);
        //lock frame
        this.setResizable(false);
    }

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){

          
        }
    }
    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            dispose();
        }   
    }
}
