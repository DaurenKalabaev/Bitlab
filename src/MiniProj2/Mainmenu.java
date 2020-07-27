package MiniProj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainmenu extends JFrame {
    private MainFrame parent;
    private Secondpage secondpage;

    private JButton firstPageButton;
    private JButton secondpageButton;
    private JButton exitButton;

    public Mainmenu(MainFrame parent, Secondpage secondpage)  {
        this.parent = parent;
        this.secondpage = secondpage;

        setTitle("Student Application");
        setSize(500,500);
        setLayout(null);

        firstPageButton = new JButton("LIST STUDENT ");
        firstPageButton.setSize(300,30);
        firstPageButton.setLocation(100,100);
        firstPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(true);
                parent.update();
                setVisible(false);
            }
        });
        add(firstPageButton);

        secondpageButton = new JButton("ADD STUDENT");
        secondpageButton.setSize(300,30);
        secondpageButton.setLocation(100,150);
        secondpageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondpage.setVisible(true);
                setVisible(false);

            }
        });
        add(secondpageButton);


        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);

    }

}

