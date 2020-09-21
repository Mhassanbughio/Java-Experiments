import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GameEngine extends JFrame {

	private JPanel contentPane;
	private String symbol;
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
		WelcomePage welcome =new WelcomePage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 209, 204));
		panel.setBounds(0, 0, 600, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 227, 31);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setBounds(500, 78, 90, 30);
		contentPane.add(btnNewButton);
		
				
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 128, 128), 2));
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(31, 46, 440, 444);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setText(symbol);
				System.out.println(symbol);
			}
		});
		btnNewButton_2.setBackground(new Color(144, 238, 144));
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setBounds(0, 0, 148, 148);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(0, 147, 148, 148);
		btnNewButton_3.setBackground(new Color(144, 238, 144));
		btnNewButton_3.setOpaque(true);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("-");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBackground(new Color(144, 238, 144));
		btnNewButton_4.setOpaque(true);
		btnNewButton_4.setBounds(0, 294, 148, 148);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBackground(new Color(144, 238, 144));
		btnNewButton_5.setOpaque(true);
		btnNewButton_5.setBounds(146, 0, 148, 148);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.setBackground(new Color(144, 238, 144));
		btnNewButton_6.setOpaque(true);
		btnNewButton_6.setBounds(146, 147, 148, 148);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_7.setBackground(new Color(144, 238, 144));
		btnNewButton_7.setOpaque(true);
		btnNewButton_7.setBounds(146, 295, 148, 148);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("-");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8.setBackground(new Color(144, 238, 144));
		btnNewButton_8.setOpaque(true);
		btnNewButton_8.setBounds(293, 0, 148, 148);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_9.setBackground(new Color(144, 238, 144));
		btnNewButton_9.setOpaque(true);
		btnNewButton_9.setBounds(293, 147, 148, 148);
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_10.setBackground(new Color(144, 238, 144));
		btnNewButton_10.setOpaque(true);
		btnNewButton_10.setBounds(293, 294, 148, 148);
		panel_1.add(btnNewButton_10);
		setUndecorated(true);
		
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setNull(btnNewButton_10);
				 setNull(btnNewButton_9);
				 setNull(btnNewButton_8);
				 setNull(btnNewButton_7);
				 setNull(btnNewButton_6);
				 setNull(btnNewButton_5);
				 setNull(btnNewButton_4);
				 setNull(btnNewButton_3);
				 setNull(btnNewButton_2);
			}
		});
		btnNewButton_1.setBounds(500, 134, 90, 30);
		contentPane.add(btnNewButton_1);

	}
	private void setNull(JButton button) {
		button.setText("-");
	}
	public void setUserSymbol(String selectedOne) {
		symbol=selectedOne;
	}
}
