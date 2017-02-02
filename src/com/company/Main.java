package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.Image;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Main extends JFrame {

    public JPanel mainPanel;
    public JTextField inField;
    public JLabel outField;
    public JLabel imageLabel;
    public JButton enterButton;
    public JComboBox comboBox;
    public JComboBox leftBox;
    public JComboBox rightBox;

    public String leftButtonStr="кг";
    public String rightButtonStr="кг";

    public int rightButtonCode = 0;
    public int leftButtonCode = 0;
    public int request = 1;
    public int answer = 1;
    public int indexOfMeasure = 1;

    Main(){
        super("CONVERTER");
        getContentPane().setBackground(Color.BLACK);
        setBounds(300,300,500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Color bgndColor = new Color(18, 56, 95);
        Color elementsColor = new Color(32, 104, 185);
        Color elementsDarkColor = new Color(81, 122, 200);
        Font mainFont = new Font("Lucida Console", Font.BOLD, 14);
        Font mainFontBig = new Font("Lucida Console", Font.BOLD, 21);

        //setBackground(bgndColor);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(bgndColor);

        inField = new JTextField(""+request,5);
        inField.setBorder(BorderFactory.createEmptyBorder(7, 5, 7, 5));
        inField.setSize(125,50);
        inField.setLocation(25,25);
        inField.setFont(mainFontBig);

        outField = new JLabel("" + answer);
        outField.setBackground(Color.WHITE);
        outField.setOpaque(true);
        outField.setBorder(BorderFactory.createEmptyBorder(7,5,7,5));
        outField.setSize(125, 50);
        outField.setLocation(350, 25);
        outField.setFont(mainFontBig);


        imageLabel = new JLabel(new ImageIcon("mainAnimationDark.gif"));
        imageLabel.setSize(150,50);
        imageLabel.setLocation(175, 25);


        enterButton = new JButton("ПРЕОБРАЗОВАТЬ");
        enterButton.setSize( 200, 50);
        enterButton.setLocation( 150,  95);
        enterButton.setOpaque(true);
        enterButton.setFont(mainFont);
        enterButton.setBackground(elementsColor);
        enterButton.setForeground(Color.WHITE);
        enterButton.setBorderPainted(false);
        enterButton.setHorizontalAlignment(JLabel.CENTER);
        enterButton.setPressedIcon(new ImageIcon("pressedButton.png"));
        enterButton.setRolloverIcon(new ImageIcon("pressedButton.png"));



        /*
        leftButt = new JLabel("" + leftButtonStr);
        leftButt.setSize(75,25);
        leftButt.setLocation( 50, 80);
        leftButt.setOpaque(true);
        leftButt.setFont(mainFont);
        leftButt.setBackground(elementsColor);
        leftButt.setForeground(Color.WHITE);
        leftButt.setHorizontalAlignment(JLabel.CENTER);
        //leftButt.setBorderPainted(false);



        rightButt = new JLabel("" + rightButtonStr);
        rightButt.setSize(75,25);
        rightButt.setLocation( 375, 80);
        rightButt.setOpaque(true);
        rightButt.setFont(mainFont);
        rightButt.setBackground(elementsColor);
        rightButt.setForeground(Color.WHITE);
        rightButt.setHorizontalAlignment(JLabel.CENTER);
        //rightButt.setBorderPainted(false);
        */

        String[] leftItemsOfWeight = {"кг","фунт"};
        leftBox = new JComboBox(leftItemsOfWeight);
        leftBox.setSize(75,25);
        leftBox.setLocation( 50, 80);
        leftBox.setOpaque(true);



        String[] items = {"Вес", "Длина", "Время", "Информация"};

        comboBox = new JComboBox(items);
        comboBox.setLocation(200,150);
        comboBox.setSize(100,30);

        mainPanel.add(inField);
        mainPanel.add(outField);
        mainPanel.add(leftBox);
       // mainPanel.add(rightBox);
        mainPanel.add(comboBox);
        mainPanel.add(imageLabel);
        mainPanel.add(enterButton);




        getContentPane().setBackground(Color.BLACK);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
