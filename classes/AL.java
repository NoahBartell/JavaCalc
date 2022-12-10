package classes;
import javax.swing.*;
//import javax.xml.transform.Source;
//import java.awt.*;
import java.awt.event.*;


public class AL implements ActionListener {
    //fields
    BtnMath btns = new BtnMath();
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == Main.gui.button0){
            btns.button0();
        }
        if(source == Main.gui.button1){
            btns.button1();
        }
        if(source == Main.gui.button2){
            btns.button2();
        }
        if(source == Main.gui.button3){
            btns.button3();
        }
        if(source == Main.gui.button4){
            btns.button4();
        }
        if(source == Main.gui.button5){
            btns.button5();
        }
        if(source == Main.gui.button6){
            btns.button6();
        }
        if(source == Main.gui.button7){
            btns.button7();
        }
        if(source == Main.gui.button8){
            btns.button8();
        }
        if(source == Main.gui.button9){
            btns.button9();
        }
        if(source == Main.gui.button9){
            btns.button9();
        }
        if(source == Main.gui.Submit){
            btns.Submit();
        }
        if(source == Main.gui.plusButton){
            btns.plusButton();
        }
        if(source == Main.gui.minusButton){
            btns.minusButton();
        }
        if(source == Main.gui.timesButton){
            btns.timesButton();
        }
        if(source == Main.gui.divButton){
            btns.divButton();
        }
        if(source == Main.gui.clearButton){
            btns.clearButton();
        }
    }
}
