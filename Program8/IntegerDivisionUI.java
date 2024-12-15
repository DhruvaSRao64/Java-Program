import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JLabel label1 = new JLabel("Num1:");
        JTextField num1Field = new JTextField(10);

        JLabel label2 = new JLabel("Num2:");
        JTextField num2Field = new JTextField(10);

        JButton divideButton = new JButton("Divide");
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));
        panel.add(label1);
        panel.add(num1Field);
        panel.add(label2);
        panel.add(num2Field);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);
        panel.add(new JLabel()); 
        panel.add(divideButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
