import javax.swing.*;
import java.awt.*;

public class PasswordField {

    public static void main(String[] args) {
        JFrame frame = new JFrame("password field example");
        JPasswordField value = new JPasswordField();
        value.setBounds(100,100,100,30);
        JLabel label = new JLabel("password");
        label.setBounds(20,100,80,30);
        frame.add(value);  frame.add(label);
        frame.setSize(350,300);
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE())
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
