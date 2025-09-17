import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionalCalculator extends JFrame {
private JTextField num1Field,num2Field,resultField;
private JButton divideButton;
public DivisionCalculator() {
setTitle("Divide Calculators");
setSize("Division Calculators");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(