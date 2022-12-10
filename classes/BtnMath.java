package classes;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;

import javax.lang.model.element.Element;
import java.lang.Math;
import java.util.*;

public class BtnMath {

    public void button0() {
        String str = Main.gui.textField.getText();
        Main.gui.textField.setText(str + "0");
    }

    public void button1() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "1");
    }

    public void button2() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "2");
    }

    public void button3() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "3");
    }

    public void button4() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "4");
    }

    public void button5() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "5");
    }

    public void button6() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "6");
    }

    public void button7() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "7");
    }

    public void button8() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "8");
    }

    public void button9() {
        Main.gui.textField.setText(Main.gui.textField.getText() + "9");
    }

    public void divButton() {
        Main.gui.textField.setText(Operators(Main.gui.textField.getText(), "/"));
    }

    public void timesButton() {
        Main.gui.textField.setText(Operators(Main.gui.textField.getText(), "*"));
    }

    public void minusButton() {
        Main.gui.textField.setText(Operators(Main.gui.textField.getText(), "-"));
    }

    public void plusButton() {
        Main.gui.textField.setText(Operators(Main.gui.textField.getText(), "+"));
    }

    public String Operators(String str, String op){
        String result = str;
        if(str.isEmpty()){
            return str;
        }
        else if(str.charAt(str.length()-1) != '+' 
        || str.charAt(str.length()-1) == '-'
        || str.charAt(str.length()-1) == '/'
        || str.charAt(str.length()-1) == '*'){
            result += op;
            return result;
        }
        else{
            return str;
        }
        
    }

    public static String addSpaces(String s) {
        // Create a new string builder to store the result
        StringBuilder sb = new StringBuilder();
        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  
            // If the current character is not a space, add a space before it
            if (c != ' ') {
                sb.append(' ');
            }  
            // Add the current character to the result string
            sb.append(c);
        }
        // Return the resulting string
        return sb.toString();
    }

    //public boolean 

    public void Submit() {
        if(Main.gui.textField.getText().isEmpty()){
            Main.gui.label.setText("0");
            return;
        }
        double a = 0;
        int b = 0;
        int c = 0;
        //String input = addSpaces(Main.gui.textField.getText());
        String input = Main.gui.textField.getText();
        double result = 0;
        //old method
        //Scanner scanner = new Scanner(input);

        // StringTokenizer tokenizer = new StringTokenizer(input);
        // Double result = Double.parseDouble(tokenizer.nextToken());
        //Double next 

        // Use a switch statement to evaluate the operations
        // while (tokenizer.hasMoreTokens()) {
        // String operation = tokenizer.nextToken();
        // Double operand = Double.parseDouble(tokenizer.nextToken());

        //     switch (operation) {
        //         case "+":
        //         result += operand;
        //         break;
        //         case "-":
        //         result -= operand;
        //         break;
        //         case "*":
        //         result *= operand;
        //         break;
        //         case "/":
        //         result /= operand;
        //         break;
        //         default:
        //         System.out.println("Invalid operation: " + operation);
        //         break;
        //     }
        // }
        // Main.gui.label.setText(Double.toString(result));
        //scanner.close();



        
        //new method
        //double[] num1 = new double[6];
        //double[] num2 = new double[6];
        List<Double> num1 = new ArrayList<>();
        List<Double> num2 = new ArrayList<>();
        input.strip();
        String op = "";
        String op2 = "";
        for(int i = 0; i < input.length(); i++){
            String chr = input.substring(i, i+1);
            if((!op.isEmpty()) &&
            chr.equals("+") 
            || chr.equals("*")
            || chr.equals("-")
            || chr.equals("/")){
                op2 = chr;
            }

            boolean ch = chr.equals("+") ;
            // || chr == "-"
            // || chr == "/"
            // || chr == "*";

            boolean ab = op.isEmpty();

            boolean cd = ch && ab;

            if((chr.equals("+") 
            || chr.equals("*")
            || chr.equals("-")
            || chr.equals("/")) 
            && op==""){
                op = chr;
            }
            else{
                if (op.isEmpty()){
                    num1.add(Double.parseDouble(input.substring(i, i+1)));
                    //b++;
                }
                else if(!op.isEmpty() && op2.isEmpty()){
                    num2.add(Double.parseDouble(input.substring(i, i+1)));
                    //c++;
                }
                if((!op.isEmpty() && !op2.isEmpty()) || i == input.length()-1){
                    double fixedNum1 = compList(num1);
                    double fixedNum2 = compList(num2);
                    switch (op) {
                        case "+":
                        result += fixedNum1 + fixedNum2;
                        break;
                        case "-":
                        result += fixedNum1 - fixedNum2;
                        break;
                        case "*":
                        result += fixedNum1 * fixedNum2;
                        break;
                        case "/":
                        result += fixedNum1 / fixedNum2;
                        break;
                        default:
                        System.out.println("Invalid operation: " + op);
                        break; 
                    }
                    a = 0;
                    op = op2;
                    b = 0;
                }
            }
        }
        Main.gui.label.setText(Double.toString(result));
    }

    private double compList(List<Double> list) {
        StringBuilder sb = new StringBuilder();

        // Loop through the numbers array
        for (Double num : list) {
            // Append each number to the StringBuilder
            sb.append((int)num.doubleValue());
        }

        // Convert the StringBuilder to a String
        String str = sb.toString();

        // Use the parseInt method to convert the string to an integer
        int result = Integer.parseInt(str);
        return result;
    }

    // public double compArray(double[] arr){
    //     int index = 0;
    //     Double newArr = new Double[];
    //     for(int i = 0; i < arr.length; i++){
    //         if (arr[i] != 0){
    //             index = i;
    //         }
    //     }
    //     // double result = 0;
    //     // for(int i = index; i > 0; i--){
    //     //     result += arr[index] * Math.pow(10, index - i );
    //     // }
    //     // return result;

    //     //new way
    //     // Create a StringBuilder object
    //     StringBuilder sb = new StringBuilder();

    //     // Loop through the numbers array
    //     for (double num : arr) {
    //         // Append each number to the StringBuilder
    //         sb.append(num);
    //     }

    //     // Convert the StringBuilder to a String
    //     String str = sb.toString();

    //     // Use the parseInt method to convert the string to an integer
    //     int result = Integer.parseInt(str);
    //     return result;
    // } 

	public void clearButton() {
        Main.gui.textField.setText("");
	}
}
