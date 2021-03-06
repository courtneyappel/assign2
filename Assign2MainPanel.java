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
	JLabel nameText;
	JLabel edText;
	JLabel jobText;
	ImageIcon profilePic;
	JLabel Image;

	public Assign2MainPanel()
	{
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(900, 700));

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

		nameText = new JLabel("");
		edText = new JLabel("");
		jobText = new JLabel("");

		ImageIcon profilePic = new ImageIcon("computer.gif");
		Image = new JLabel(profilePic);

		add(courtneyButton);
		add(jeffButton);
		add(joshButton);
		add(wyattButton);
		add(Image);
		add(nameText);
		add(edText);
		add(jobText);

	}

	private class courtneyListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					profilePic = new ImageIcon("cna.gif");
					Image.setIcon(profilePic);
					nameText.setText("NAME: Courtney Appel");
					edText.setText("EDUCATION: 3rd year");
					jobText.setText("JOB: Compter Science Department");
				}
	}

	private class jeffListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					profilePic = new ImageIcon("jeff.gif");
					Image.setIcon(profilePic);
					nameText.setText("NAME: Jeff Bagley");
					edText.setText("EDUCATION: 3rd year");
					jobText.setText("JOB: Killing the Software Science Game");
				}
	}

	private class joshListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					profilePic = new ImageIcon("josh.gif");
					Image.setIcon(profilePic);
					nameText.setText("NAME: Josh Tiefenthaler");
					edText.setText("EDUCATION: 4th year");
					jobText.setText("JOB: Programmer guy. ");
				}
	}

	private class wyattListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					profilePic = new ImageIcon("wyatt.gif");
					Image.setIcon(profilePic);
					nameText.setText("NAME: Wyatt");
					edText.setText("EDUCATION: Trying");
					jobText.setText("JOB: Senior Manager at Chuck E Cheese");
				}
	}

}
