import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {


 final private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
  final private JTextField t1,t2,t3;
  final private JLabel l1, l2;

    private class ButtonListener1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource()==b1){
                float a = Integer.parseInt(t1.getText());
                float b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a + b));}
                if (e.getSource() == b2) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    t3.setText(String.valueOf(a - b));
                }
                if (e.getSource() == b3) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    t3.setText(String.valueOf(a * b));
                }
                if (e.getSource() == b4) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    t3.setText(String.valueOf(a / b));
                }
                if (e.getSource() == b5) {
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                }
                if (e.getSource() == b6) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    t3.setText(String.valueOf(a / b));
                }
                if (e.getSource() == b7) {
                    t1.setText(""+1);
                }
                if (e.getSource() == b8) {
                    t1.setText("2");
                }
                if (e.getSource() == b9) {
                    t1.setText("3");
                }
                if (e.getSource() == b10) {
                    t1.setText("4");
                }
                if (e.getSource() == b11) {
                    t1.setText("5");
                }
                if (e.getSource() == b12) {
                    t1.setText("6");
                }
                if (e.getSource() == b13) {
                    t1.setText("7");
                }
                if (e.getSource() == b14) {
                    t1.setText("8");
                }
                if (e.getSource() == b15) {
                    t1.setText("9");
                }
                if (e.getSource() == b16) {
                    t1.setText("0");
                }
            } catch (Exception x) {JOptionPane.showMessageDialog(null, "Вы не ввели число");
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
            }
        }
    }
    private Calculator(String s) {
        super(s);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 300);
        setLayout(new FlowLayout());
        setResizable(false);
        setLocationRelativeTo(null);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b5 = new JButton("C");
        b6 = new JButton("=");
        b7 = new JButton("1");
        b8 = new JButton("2");
        b9 = new JButton("3");
        b10 = new JButton("4");
        b11 = new JButton("5");
        b12 = new JButton("6");
        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("0");
        t1 = new JTextField(8);
        t2 = new JTextField(8);
        t3 = new JTextField(15);
        l1 = new JLabel("Число1");
        l2 = new JLabel("Число2");
        b1.setBackground(Color.cyan);
        b2.setBackground(Color.cyan);
        b3.setBackground(Color.cyan);
        b4.setBackground(Color.cyan);
        b5.setBackground(Color.cyan);
        b6.setBackground(Color.cyan);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(t3);
        b1.addActionListener(new ButtonListener1());
        b2.addActionListener(new ButtonListener1());
        b3.addActionListener(new ButtonListener1());
        b4.addActionListener(new ButtonListener1());
        b5.addActionListener(new ButtonListener1());
        b6.addActionListener(new ButtonListener1());
        b7.addActionListener(new ButtonListener1());
        b8.addActionListener(new ButtonListener1());
        b9.addActionListener(new ButtonListener1());
        b10.addActionListener(new ButtonListener1());
        b11.addActionListener(new ButtonListener1());
        b12.addActionListener(new ButtonListener1());
        b13.addActionListener(new ButtonListener1());
        b14.addActionListener(new ButtonListener1());
        b15.addActionListener(new ButtonListener1());
        b16.addActionListener(new ButtonListener1());
    }
    public static void main(String[] args) {
        Calculator c = new Calculator("Калькулятор");
        c.setVisible(true);
    }
}