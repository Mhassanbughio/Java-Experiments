import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GameEngine extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<JButton> buttonList;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameEngine frame = new GameEngine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public GameEngine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonList=new ArrayList<JButton>();
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 600, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel welcomeUserLabel = new JLabel(String.format("%s vs Computer","Dyslon"));
		welcomeUserLabel.setForeground(new Color(255, 250, 250));
		welcomeUserLabel.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		welcomeUserLabel.setBounds(10, 10, 398, 31);
		panel.add(welcomeUserLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(0, 40, 600, 410);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 10, 390, 390);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton button2 = new JButton("-");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setText(WelcomePage.returnUserSymbol());
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button2.setBackground(new Color(255, 140, 0));
		button2.setBounds(0, 129, 130, 130);
		panel_2.add(button2);
		
		JButton button3 = new JButton("-");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setText(WelcomePage.returnUserSymbol());
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button3.setBackground(new Color(255, 140, 0));
		button3.setBounds(0, 258, 130, 130);
		panel_2.add(button3);
		
		JButton button4 = new JButton("-");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setText(WelcomePage.returnUserSymbol());
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button4.setBackground(new Color(255, 140, 0));
		button4.setBounds(129, 0, 130, 130);
		panel_2.add(button4);
		
		JButton button6 = new JButton("-");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6.setText(WelcomePage.returnUserSymbol());
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button6.setBackground(new Color(255, 140, 0));
		button6.setBounds(129, 258, 130, 130);
		panel_2.add(button6);
		
		JButton button5 = new JButton("-");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.setText(WelcomePage.returnUserSymbol());
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button5.setBackground(new Color(255, 140, 0));
		button5.setBounds(129, 129, 130, 130);
		panel_2.add(button5);
		
		JButton button8 = new JButton("-");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.setText(WelcomePage.returnUserSymbol());
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button8.setBackground(new Color(255, 140, 0));
		button8.setBounds(259, 129, 130, 130);
		panel_2.add(button8);
		
		JButton button9 = new JButton("-");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.setText(WelcomePage.returnUserSymbol());
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button9.setBackground(new Color(255, 140, 0));
		button9.setBounds(259, 258, 130, 130);
		panel_2.add(button9);
		
		JButton button1 = new JButton("-");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setText(WelcomePage.returnUserSymbol());
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button1.setBackground(new Color(255, 140, 0));
		button1.setBounds(0, 0, 130, 130);
		panel_2.add(button1);
		
		JButton button7 = new JButton("-");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.setText(WelcomePage.returnUserSymbol());
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button7.setBackground(new Color(255, 140, 0));
		button7.setBounds(259, 0, 130, 130);
		panel_2.add(button7);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		cancelButton.setBounds(446, 31, 95, 35);
		panel_1.add(cancelButton);
		
		buttonList.add(button1);
		buttonList.add(button2);
		buttonList.add(button3);
		buttonList.add(button4);
		buttonList.add(button5);
		buttonList.add(button6);
		buttonList.add(button7);
		buttonList.add(button8);
		buttonList.add(button9);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNull(buttonList);
			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD, 15));
		reset.setBounds(446, 106, 95, 35);
		panel_1.add(reset);
		setUndecorated(true);
	}
	
	private void setNull(ArrayList<JButton> buttons) {
		for(JButton button:buttons) {
			button.setText("-");
		}
	}
}
