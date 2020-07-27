package MiniProj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private Integer[] age = new Integer[30];
    JTextArea textArea;

    public MainFrame() {

        for (int i=1; i<30; i++){
            age[i]=i;
        }

        setTitle("Student Application");//titulka
        setSize(500, 500);//razmer
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("HERE ALL STUDENT"); // prosto text v
        label.setSize(400, 30);
        label.setLocation(200, 5);
        add(label);

        textArea = new JTextArea();
        textArea.setSize(430, 350);
        textArea.setLocation(50, 50);
        add(textArea);

        JButton backButton = new JButton("Back");
        backButton.setSize(80, 50);
        backButton.setLocation(400, 400);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Main.menu.setVisible(true);
            }
        });

        add(backButton);


    }



    public void update() {
        for (int i=0; i<Secondpage.counter; i++){
            textArea.append(Secondpage.students[i].toString());
        }
    }

}


