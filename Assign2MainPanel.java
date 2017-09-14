import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Assign2MainPanel extends JPanel{

	JLabel companyTitle;
	JLabel companyName;

	JButton courtneyButton;
	JButton jeffButton;
	JButton joshButton;
	JButton wyattButton;

	public Assign2MainPanel()
	{
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(500, 500));

		companyTitle = new JLabel("EWP");
		companyName = new JLabel("Engorged Wicket Pandoras");

		companyTitle.setFont(companyName.getFont().deriveFont(256f));
		companyName.setFont(companyName.getFont().deriveFont(32f));

		add(companyTitle);
		add(companyName);

		courtneyButton = new JButton("Courtney");
		jeffButton = new JButton("Jeff");
		joshButton = new JButton("Josh");
		wyattButton = new JButton("Wyatt");

		courtneyButton.addActionListener(new courtneyListener());
		jeffButton.addActionListener(new jeffListener());
		joshButton.addActionListener(new joshListener());
		wyattButton.addActionListener(new wyattListener());

		add(courtneyButton);
		add(jeffButton);
		add(joshButton);
		add(wyattButton);
	}

	private class courtneyListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					System.out.println("Courtney");
				}
	}

	private class jeffListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					System.out.println("Jeff");
				}
	}

	private class joshListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					System.out.println("Josh");
				}
	}

	private class wyattListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					wyattInfo info = new wyattInfo();

					JFrame myFrame = new JFrame();
					myFrame.getContentPane().add(new wyattInfo());
					myFrame.pack();
					myFrame.setVisible(true);
					wyattButton.setVisible(false);
				}
	}

	public class wyattInfo extends JPanel{
		JLabel text;
		JLabel info;
		JLabel about;
		public wyattInfo(){
			setBackground(Color.orange);
			setPreferredSize(new Dimension(350, 250));

			text = new JLabel("Wyatt -");
			info = new JLabel("About Me");
			about = new JLabel("<html>"+
			"Right now I am just typing to take up space"+
			"<br> I need to fill out room to test how"+
			"<br>long I can type so I can also"+
			"<br>plan things as well as getting the wrap"+
			"<br> text to work"+
			"<br> test line 1"+
			"<br> test line 2"+
			"<br> test line 3"+
			"</html>");
			text.setFont(companyName.getFont().deriveFont(32f));
			info.setFont(companyName.getFont().deriveFont(24f));
			about.setFont(companyName.getFont().deriveFont(16f));
			add(text);
			add(info);
			add(about);
		}
	}

}
