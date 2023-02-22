import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Lab-5.Task_1 || Klem Stepan 244(Б) 

public class Dialog {
 public static void main(String[] args){
	// фрагмент as is (1)
	 try {
		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	 }
	 
	 catch(Exception e){
	 }
	 
	 JFrame frm = new JFrame("The first dialog app");
	 frm.setSize(150, 150);
	 
	 Container c = frm.getContentPane();
	 c.add(new JLabel("Hello, my name is Stepan"));
	 
	// фрагмент as is (2)
	 WindowListener wndCloser = new WindowAdapter() {
		 public void windowClosing(WindowEvent e){
			 System.exit(0);
		 	}
	 };
	 
	 frm.addWindowListener(wndCloser);
	 frm.setVisible(true);
	 }
}