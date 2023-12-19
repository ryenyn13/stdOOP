package Login;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setVisible(true); //make this visible: làm cho khung xuất hiện
		this.setSize(513, 513);//set x, y
		this.setTitle("Homestay");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of app
		this.setResizable(false);// prevent this from being resize: ngăn chặn thay đổi kích cở khung
		
		
		
		URL urlLogo = MyFrame.class.getResource("logo.png");
		Image img= Toolkit.getDefaultToolkit().createImage(urlLogo);
		this.setIconImage(img);		
				//ImageIcon image = new ImageIcon("logo.png"); //creata imageicon
		//this.setIconImage(image.getImage()); //change icon ò fr
		
		this.getContentPane().setBackground(new Color(0xadd8e6));//change cl ò backgroud
		

			 
		
			/**
			 * @param args
			 */
      }
	

	public static void main(String[] args) {
        new MyFrame();
    }
}
