package MiniProj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Secondpage extends JFrame {
    static Student[] students = new Student[100];
    private Integer[] age = new Integer[30];
    static int counter =0;


    public Secondpage(){
        for (int i=0; i<30; i++){
            age[i]=i;
        }

        setTitle("Student Application");
        setSize(500,500);
        setLayout(null);

        JLabel label1 = new JLabel("name");
        label1.setSize(100,30);
        label1.setLocation(100,50);
        add(label1);

        JLabel label2 = new JLabel("surname");
        label2.setSize(100,30);
        label2.setLocation(100,90);
        add(label2);

        JLabel label3 = new JLabel("age");
        label3.setSize(100,30);
        label3.setLocation(100,140);
        add(label3);

        JTextField field1 = new JTextField();
        field1.setSize(100, 30);
        field1.setLocation(210, 50);
        add(field1);

        JTextField field2 = new JTextField();
        field2.setSize(100, 30);
        field2.setLocation(210, 90);
        add(field2);

        JComboBox comboBox = new JComboBox(age);
        comboBox.setSize(100, 30);
        comboBox.setLocation(210 , 140);
        add(comboBox);

        JButton button = new JButton("ADD ");// cnopka
        button.setSize(100,40 );
        button.setLocation(100,290);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = field1.getText();
                String surname = field2.getText();
                int age = (Integer) comboBox.getSelectedItem();

                Student student = new Student(name, surname, age);
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


