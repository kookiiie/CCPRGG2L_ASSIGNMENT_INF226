import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MainMenu extends JFrame {

    MainMenu(){

        JLabel ImageLabel = new JLabel();
        ImageIcon imej = new ImageIcon("kat.jfif");
        ImageLabel.setIcon(imej);
        this.add(ImageLabel);

        //Jbutton

        JButton button1 = new JButton();
        button1.setText("start");
        button1.setFont(new Font("Arial" , Font.BOLD, 20));

        EventHandler handler = new EventHandler();
        button1.addActionListener((ActionListener) handler);
        //add button to frame
        this.add(button1);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake geym");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
    
    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            //goes to game frame
            new GameFrame();
            //closes window
            dispose();
        }
    }
}
