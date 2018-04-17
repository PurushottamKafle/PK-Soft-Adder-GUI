package pksoft;
import javax.swing.*;
import javax.swing.JOptionPane;
public class first {
	public static void main(String args[]) {
String x = JOptionPane.showInputDialog("Enter First Number");
String y = JOptionPane.showInputDialog("Enter Seccond Number");


int Num1 = Integer.parseInt(x);
int Num2 = Integer.parseInt(x);
int sum = Num1+Num2;

JOptionPane.showMessageDialog(null, "Your Answer is: "+sum, "PK Soft Adder", JOptionPane.PLAIN_MESSAGE);

	}
	
}
