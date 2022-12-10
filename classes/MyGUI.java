package classes;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;



public class MyGUI extends JFrame{
    //Fields
    AL al = new AL();
    //labels
    JLabel label = new JLabel();
    //buttons
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton Submit = new JButton("Submit");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton timesButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton clearButton = new JButton("Clear");
    //textfields
    JTextField textField = new JTextField();



    public MyGUI(){
        setSize(500,500);
        setTitle("MyGUI");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void set(){
        textField.setEditable(false);
        label.setText("Hello");
        textField.setPreferredSize(new Dimension(400, 50));
        button0.addActionListener(al);
        button1.addActionListener(al);
        button2.addActionListener(al);
        button3.addActionListener(al);
        button4.addActionListener(al);
        button5.addActionListener(al);
        button6.addActionListener(al);
        button7.addActionListener(al);
        button8.addActionListener(al);
        button9.addActionListener(al);
        Submit.addActionListener(al);
        plusButton.addActionListener(al);
        minusButton.addActionListener(al);
        timesButton.addActionListener(al);
        divButton.addActionListener(al);
        clearButton.addActionListener(al);
        add(button0);
        add(button1);
        add(button2); 
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(plusButton);
        add(minusButton);
        add(timesButton);
        add(divButton);
        add(clearButton);
        add(Submit);
        add(textField);
        add(label);
        
    }
}