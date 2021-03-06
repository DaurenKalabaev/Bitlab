package Modul2.collections.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    private MainFrame parent;
    private SecondPage secondPage;

    private JButton firstPageButton;
    private JButton secondPageButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent, SecondPage secondPage) {

       this.parent = parent;
       this.secondPage=secondPage;

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
                parent.upadata();
                setVisible(false);
            }
        });
        add(firstPageButton);

        secondPageButton = new JButton("ADD STUDENT");
        secondPageButton.setSize(300,30);
        secondPageButton.setLocation(100,150);
        secondPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondPage.setVisible(true);
                setVisible(false);
            }
        });
        add(secondPageButton);

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
    }
}
