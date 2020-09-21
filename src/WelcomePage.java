import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomePage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBox;
	private String []options;

	private int mousePosX,mousePosY;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(0, 0, 500, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePosX=e.getX();
				mousePosY=e.getY();
			}
		});
		panel_1.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int tempX=e.getXOnScreen(), tempY=e.getYOnScreen();
				setLocation(tempX-mousePosX,tempY-mousePosY);
			}
		});
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setBounds(0, 0, 500, 36);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(455, 0, 45, 36);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tic Tac Toe");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 10, 154, 17);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Enter Player Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 46, 149, 23);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(169, 46, 321, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		options=new String[] {"Select","O","X"};
		comboBox = new JComboBox(options);
		comboBox.setBounds(169, 130, 116, 21);
		panel.add(comboBox);
		
		JButton btnNewButton =  new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(notNull(textField)&&notNull(comboBox)) {
					new GameEngine().setVisible(true);
					GameEngine gameEngine=new GameEngine();
					
					dispose();
				}
				if(!(notNull(textField)&&notNull(comboBox))){
					JOptionPane.showConfirmDialog(null,"Enter Both Symbol and Name", "Error", JOptionPane.PLAIN_MESSAGE);
				}
				else if(!notNull(textField)) {
					JOptionPane.showConfirmDialog(null,"Please Enter Name", "Name Error", JOptionPane.PLAIN_MESSAGE);
				}
				else if(!notNull(comboBox)) {
					JOptionPane.showConfirmDialog(null,"Please Select A Symbol", "Symbol Error", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
			}
		);
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setOpaque(true);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(93, 195, 85, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(207, 195, 85, 30);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Select Symbol:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 128, 126, 23);
		panel.add(lblNewLabel_1);
		
		setUndecorated(true);
	}


	private Boolean notNull(JTextField textField) {
		if(textField.getText().equalsIgnoreCase(""))return false;
		return true;
	}
	private Boolean notNull(JComboBox comboBox) {
		if(comboBox.getSelectedItem().equals("Select"))return false;
		return true;
	}
}
