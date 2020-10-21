package ru.geekbrains.lesson2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        /*
        JFrame – окно;
        JButton – кнопка;
        JLabel – надпись;
        JTextField – однострочное текстовое поле;
        JTextArea – многострочное текстовое поле;
        JScrollPane – контейнер для пролистывания контента;
        JMenuBar – верхнее меню программы;
        JTabel – таблица;
        JRadioButton – RadioButton;
        JCheckBox – CheckBox.
        */
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new BorderLayout());   // выбор компоновщика элементов

        GridLayout layoutUp = new GridLayout(2,1);
        JPanel panelUp = new JPanel(layoutUp);
        JLabel label1 = new JLabel("LABEL");
        panelUp.add(label1);
        JRadioButton radioButton1 = new JRadioButton("РУС");
        panelUp.add(radioButton1);
        add(panelUp, BorderLayout.NORTH);

        //GridLayout layoutCenter = new GridLayout(2,1);
        //JPanel panelCenter = new JPanel(layoutCenter);
        //JCheckBox checkBox1 = new JCheckBox("РУС");
        //panelCenter.add(checkBox1);

        GridLayout layoutDown = new GridLayout(1,2);
        JPanel panelDown = new JPanel(layoutDown);
        JButton btn1 = new JButton("Translate");
        panelDown.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    label1.setText("НАДПИСЬ");
                }
                else {
                    label1.setText("LABEL");
                }

            }
        });

        JButton btn2 = new JButton("Exit");
        panelDown.add(btn2);
        btn2.addActionListener(e -> System.exit(-1));
        add(panelDown, BorderLayout.SOUTH);

        setVisible(true);
    }
}
