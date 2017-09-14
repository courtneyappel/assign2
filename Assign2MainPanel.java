import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assign2MainPanel extends JPanel{

	JLabel companyTitle;
	JLabel companyName;
	JButton mainButton;
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

		mainButton = new JButton("Main Menu");
		courtneyButton = new JButton("Courtney");
		jeffButton = new JButton("Jeff");
		joshButton = new JButton("Josh");
		wyattButton = new JButton("Wyatt");

		courtneyButton.addActionListener(new courtneyListener());
		jeffButton.addActionListener(new jeffListener());
		joshButton.addActionListener(new joshListener());
		wyattButton.addActionListener(new wyattListener());
		mainButton.addActionListener(new mainButtonListener());

		mainButton.setVisible(false);

		add(courtneyButton);
		add(jeffButton);
		add(joshButton);
		add(wyattButton);
		add(mainButton);
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
					companyName.setVisible(false);
					companyTitle.setVisible(false);
					joshButton.setVisible(false);
					courtneyButton.setVisible(false);
					jeffButton.setVisible(false);
					wyattButton.setVisible(false);
					mainButton.setVisible(true);
				}
	}

	private class mainButtonListener implements ActionListener{
		public void actionPerformed (ActionEvent event){
			companyName.setVisible(true);
			companyTitle.setVisible(true);
			joshButton.setVisible(true);
			courtneyButton.setVisible(true);
			jeffButton.setVisible(true);
			wyattButton.setVisible(true);
			mainButton.setVisible(false);
		}
	}

	private class wyattListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
        {
					System.out.println("Wyatt");
				}
	}

}
