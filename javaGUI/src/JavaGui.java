import javax.swing.*;

public class JavaGui {

    public static void main(String[] args) {

        // Jframe = a GUI window to add component to

        JFrame frame = new JFrame();  // create a frame
        frame.setSize(420,420); // set the x-dimension & Y dimension of frame
        frame.setTitle("frame title goes here"); // set title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exist out of application
        frame.setResizable(false); // prevent from being resized
        frame.setVisible(true); // make it visible
       // ImageIcon image = new ImageIcon("filename.png") // create an image icon
       // frame.setIconImage(image.getImage()); //change icon of the frame
       // frame.getContentPane().setBackground(Color.green); //change background color
       // frame.getContentPane().setBackground(new Color(0,0,0));

    }
}
