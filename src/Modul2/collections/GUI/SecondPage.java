package Modul2.collections.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JFrame {

    //String[] faculty = {Information, Technologies, Economics, Mathematics};
    private Integer[] faculty = new Integer[4];
    static Student[] students = new Student[10];
    static int counter =0;

    public SecondPage(){

        for (int i=0; i<4; i++)
            faculty[i]=i;

        setTitle("Student Application");
        setSize(500,500);
        setLayout(null);

        JLabel label = new JLabel("1)Information 2)Technologies 3)Economics 4)Mathematics");
        label.setSize(1000, 30);
        label.setLocation(100, 210);
        add(label);

        JLabel label1 = new JLabel("name");
        label1.setSize(100,30);
        label1.setLocation(100,50);
        add(label1);

        JLabel label2 = new JLabel("surname");
        label2.setSize(100,30);
        label2.setLocation(100,90);
        add(label2);

        JLabel label3 = new JLabel("faculty");
        label3.setSize(100,30);
        label3.setLocation(100,140);
        add(label3);

        JLabel label4 = new JLabel("group");
        label4.setSize(100,30);
        label4.setLocation(100,180);
        add(label4);

        JTextField field1 = new JTextField();
        field1.setSize(100, 30);
        field1.setLocation(210, 50);
        add(field1);

        JTextField field2 = new JTextField();
        field2.setSize(100, 30);
        field2.setLocation(210, 90);
        add(field2);

        JTextField field4 = new JTextField();
        field4.setSize(100, 30);
        field4.setLocation(210, 180);
        add(field4);


        JComboBox comboBox = new JComboBox(faculty);
        comboBox.setSize(100, 30);
        comboBox.setLocation(210 , 140);
        add(comboBox);

        JButton button = new JButton("ADD ");// cnopka
        button.setSize(100,40 );
        button.setLocation(100,290);
        //pri najatie vipolnat kod
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = field1.getText();
                String surname = field2.getText();
                String group =field4.getText();
                int faculty = (Integer) comboBox.getSelectedItem();

                Student student = new Student(name, surname,faculty, group);
                students[counter] = student;
                counter++;
            }
        });
        add(button);

        JButton backButton = new JButton("Back");
        backButton.setSize(100,40);
        backButton.setLocation(215,290);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Main.menu.setVisible(true);
            }
        });
        add(backButton);
    }
}
