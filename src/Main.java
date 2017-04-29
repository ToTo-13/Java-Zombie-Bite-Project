import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame /*implements actionListener*/
{
	private JButton sGameButton = new JButton("Start Game");
	private JButton optionButton = new JButton("Options");
    private JButton scoreButton  = new JButton ("Score");
	
	public Main()
	{
		super("Zombie-Bite");
		setSize(1366,720);
		setLayout(null);
		setVisible(true);
		//getContentPane().setBackground(Color.black);
		addWindowListener(new WindowAdapter(){
			public void windowOpened(WindowEvent e)
			{
				ZombieBite.playSound("");
			}
		});
		setContentPane(new JLabel(new ImageIcon("img\\mainbackground.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButtons();
		setResizable(false);
	}
	public void setButtons()
	{
		/*Start Game Button*/
		sGameButton.setBounds(600,450,150,60);
		sGameButton.setForeground(Color.green);
		sGameButton.setFocusPainted(false);
		sGameButton.setBorderPainted(true);
		sGameButton.setBackground(Color.darkGray);
		sGameButton.setFont(new Font ("Bates Shower", Font.BOLD,15));
		sGameButton.setBorder(BorderFactory.createBevelBorder(0,Color.red,Color.orange,Color.red,Color.orange));
		sGameButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				ZombieBite game = new ZombieBite();
			}
		}
		);
		add(sGameButton);
		
		/*Option Button*/
		optionButton.setBounds(600,520,150,60);
		optionButton.setForeground(Color.green);
		optionButton.setFocusPainted(false);
		optionButton.setBorderPainted(true);
		optionButton.setBackground(Color.darkGray);
		optionButton.setFont(new Font ("Bates Shower", Font.BOLD,15));
		optionButton.setBorder(BorderFactory.createBevelBorder(0,Color.red,Color.orange,Color.red,Color.orange));
		optionButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				Option opt = new Option();
			}
		}
		);
		add(optionButton);
		
		/*Score Button*/
		scoreButton.setBounds(600,590,150,60);
		scoreButton.setForeground(Color.green);
		scoreButton.setFocusPainted(false);
		scoreButton.setBorderPainted(true);
		scoreButton.setBackground(Color.darkGray);
		scoreButton.setFont(new Font ("Bates Shower", Font.BOLD,15));
		scoreButton.setBorder(BorderFactory.createBevelBorder(0,Color.red,Color.orange,Color.red,Color.orange));
		add(scoreButton);
	}
	
	public static void main(String [] args)
	{
		Main m = new Main();
	}
}