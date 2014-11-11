package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window 
{
	private JFrame frame = new JFrame("Date of Birth Validator");
	
	private JPanel pnlMain = new JPanel();
	private JPanel pnlDay = new JPanel();
	private JPanel pnlMonth = new JPanel();
	private JPanel pnlYear = new JPanel();
	
	private JLabel lblDay = new JLabel("Day");
	private JLabel lblMonth = new JLabel("Month");
	private JLabel lblYear = new JLabel("Year");
	
	private JTextField txtDay = new JTextField(2);
	private JTextField txtMonth = new JTextField(2);
	private JTextField txtYear = new JTextField(4);
	
	private JButton btnValidate = new JButton("Validate input");
	
	public Window()
	{
		frame.setSize(390, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pnlMain);
		
		pnlMain.add(pnlDay);
		pnlMain.add(pnlMonth);
		pnlMain.add(pnlYear);
		pnlMain.add(btnValidate);
		
		pnlDay.add(lblDay);
		pnlDay.add(txtDay);
		
		pnlMonth.add(lblMonth);
		pnlMonth.add(txtMonth);
		
		pnlYear.add(lblYear);
		pnlYear.add(txtYear);
		
		frame.setVisible(true);
	}
}
