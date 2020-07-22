package Modul2.collections.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
private Integer[] ages = new Integer[5];
    JTextArea textArea;
    public MainFrame(){

        for (int i=1; i<5; i++){
            ages[i] = i;
        }

        setTitle("Student Application");//titulka
        setSize(500, 500);//razmer
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("HERE ALL STUDENT"); // prosto text v
        label.setSize(400, 30);
        label.setLocation(200,5);
        add(label);

//        JTextField textField = new JTextField(); // polya dla texta
//        textField.setSize(200,30);
//        textField.setLocation(180, 100);
//        add(textField);
//
         textArea = new JTextArea();
        textArea.setSize(430,350);
        textArea.setLocation(50, 50);
        add(textArea);

        JLabel label5 = new JLabel("1)Information 2)Technologies 3)Economics 4)Mathematics");
        label5.setSize(500, 30);
        label5.setLocation(100, 20);
        add(label5);

//        JComboBox comboBox = new JComboBox(ages);
//        comboBox.setSize(50, 30);
//        comboBox.setLocation(310 , 140);
//        add(comboBox);

//        JButton button = new JButton("Click me");// cnopka
//        button.setSize(200,30 );
//        button.setLocation(100,140);
//        //pri najatie vipolnat kod
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String string = textField.getText();
//
//                if (!string.equals("")){
//                    Integer age = (Integer) comboBox.getSelectedItem();
//                    textArea.append(string +" - "+ age +  "\n");
//                    textField.setText("");
//                }
//            }
//        });
//        add(button);

        JButton backButton = new JButton("Back");
        backButton.setSize(80, 50);
        backButton.setLocation(400,400);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Main.menu.setVisible(true);
            }
        });
        add(backButton);


    }

    public void upadata(){
        for (int i = 0; i< SecondPage.counter; i++){
            textArea.append(SecondPage.students[i].toString()+"\n ");
        }
    }
}
