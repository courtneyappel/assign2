import javax.swing.*;

public class Assign2Frame {

	public static void main(String[] args)
    {

    		JFrame myFrame = new JFrame();

    		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		myFrame.getContentPane().add(new Assign2MainPanel());

    		myFrame.pack();

    		myFrame.setVisible(true);
    }
}
