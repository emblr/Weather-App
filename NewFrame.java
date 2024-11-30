import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewFrame extends JFrame{

    JButton button = new JButton();
    JLabel label = new JLabel();
    void Frame(){

        this.setTitle("Weather App");//title for app
        
        ImageIcon image = new ImageIcon("Search.png");//this is the image
        label.setBounds(335, -20, 0, 0);//this is the position of the image
        Image image2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);//this is to resize the image
        ImageIcon image3 = new ImageIcon(image2);//this is the final image after resizing
        
        label.setIcon(image3);
        label.setSize(100, 100);
        this.setResizable(false);
        this.setSize(420, 620);

        this.setLocationRelativeTo(null);//this is to center the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this to stop the program since withiut it, the program will still run in the background
        this.getContentPane().setBackground(Color.black);//this is the background color of the frame
        
        
        
        this.setVisible(true);
        this.add(label);
        
        
        

        button = new JButton();
        button.setBounds(360, 10, 50, 50);
        this.add(button);
        
        button.addActionListener(e -> System.out.println("Button clicked"));
        

    }


    

    
}