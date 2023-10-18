import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {

        // Jlabel = a GUI display area for string of text, img or both

        JLabel label = new JLabel(); //create a label
        label.setText("THIS IS MY GUI PROGRAM"); // set text to label
        // working with position of label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, centre,
        label.setVerticalTextPosition(JLabel.TOP); // set txt to top
        label.setForeground(new Color(12,12,13)); // set font color
        label.setFont(new Font("MV Boli",Font.ITALIC,20)); // set font type
//        label.setIconTextGap() // KEEPING gap btw image and text
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // this will display background color
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of txt+img
        label.setHorizontalAlignment(JLabel.CENTER); //set horixontal position of txt+img
        
        // creating the border
        Border border = BorderFactory.createLineBorder(Color.BLUE); // making border
        label.setBorder(border); // seting the border
        // creating the frame
        JFrame frame = new JFrame();
        frame.setTitle("java gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(label);

    }
}
