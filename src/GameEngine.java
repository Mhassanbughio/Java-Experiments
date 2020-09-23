import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class GameEngine extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int xMouse,yMouse;
	private Random selectRandomBlock;
	private JButton []btnNewButtons; 
	ArrayList<JButton> buttons ;
	//HashMap<JButton,> hashMap;
	private static int computerCounter=9;
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
	@SuppressWarnings("unchecked")
	public GameEngine() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButtons=new JButton[11];
		buttons=new ArrayList();
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse=e.getX();
				yMouse=e.getY();
			}
		});
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int currentX=e.getXOnScreen(),currentY=e.getYOnScreen();
				setLocation(currentX-xMouse,currentY-yMouse);
			}
		});
		panel.setBackground(new Color(72, 209, 204));
		panel.setBounds(0, 0, 600, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 227, 31);
		panel.add(lblNewLabel);
		
		btnNewButtons[0] = new JButton("Cancel");
		btnNewButtons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			
		});
		btnNewButtons[0].setOpaque(true);
		btnNewButtons[0].setBackground(new Color(255, 250, 250));
		btnNewButtons[0].setBounds(500, 78, 90, 30);
		contentPane.add(btnNewButtons[0]);
		
				
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 128, 128), 2));
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(31, 46, 440, 444);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButtons[1] = new JButton("-");
		btnNewButtons[1].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[1].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[1].setBackground(new Color(144, 238, 144));
		btnNewButtons[1].setOpaque(true);
		btnNewButtons[1].setBounds(0, 0, 148, 148);
		panel_1.add(btnNewButtons[1]);
		
		 btnNewButtons[2] = new JButton("-");
		btnNewButtons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[2].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[2].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[2].setBounds(0, 147, 148, 148);
		btnNewButtons[2].setBackground(new Color(144, 238, 144));
		btnNewButtons[2].setOpaque(true);
		panel_1.add(btnNewButtons[2]);
		
		 btnNewButtons[3] = new JButton("-");
		btnNewButtons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[3].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[3].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[3].setBackground(new Color(144, 238, 144));
		btnNewButtons[3].setOpaque(true);
		btnNewButtons[3].setBounds(0, 294, 148, 148);
		panel_1.add(btnNewButtons[3]);
		
		 btnNewButtons[4] = new JButton("-");
		btnNewButtons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[4].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[4].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[4].setBackground(new Color(144, 238, 144));
		btnNewButtons[4].setOpaque(true);
		btnNewButtons[4].setBounds(146, 0, 148, 148);
		panel_1.add(btnNewButtons[4]);
		
		 btnNewButtons[5] = new JButton("-");
		btnNewButtons[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[5].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[5].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[5].setBackground(new Color(144, 238, 144));
		btnNewButtons[5].setOpaque(true);
		btnNewButtons[5].setBounds(146, 147, 148, 148);
		panel_1.add(btnNewButtons[5]);
		
		 btnNewButtons[6] = new JButton("-");
		btnNewButtons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[6].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[6].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[6].setBackground(new Color(144, 238, 144));
		btnNewButtons[6].setOpaque(true);
		btnNewButtons[6].setBounds(146, 295, 148, 148);
		panel_1.add(btnNewButtons[6]);
		
		 btnNewButtons[7] = new JButton("-");
		btnNewButtons[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[7].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[7].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[7].setBackground(new Color(144, 238, 144));
		btnNewButtons[7].setOpaque(true);
		btnNewButtons[7].setBounds(293, 0, 148, 148);
		panel_1.add(btnNewButtons[7]);
		
		btnNewButtons[8] = new JButton("-");
		btnNewButtons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[8].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[8].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[8].setBackground(new Color(144, 238, 144));
		btnNewButtons[8].setOpaque(true);
		btnNewButtons[8].setBounds(293, 147, 148, 148);
		panel_1.add(btnNewButtons[8]);
		
		 btnNewButtons[9] = new JButton("-");
		btnNewButtons[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtons[9].setText(WelcomePage.returnUserSymbol());
				System.out.println(WelcomePage.returnUserSymbol());
				computerGamePlay(computerCounter);
				computerCounter--; 
			}
		});
		btnNewButtons[9].setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButtons[9].setBackground(new Color(144, 238, 144));
		btnNewButtons[9].setOpaque(true);
		btnNewButtons[9].setBounds(293, 294, 148, 148);
		panel_1.add(btnNewButtons[9]);
		setUndecorated(true);
		
		
		btnNewButtons[10] = new JButton("Reset");
		btnNewButtons[10].setBackground(new Color(255, 250, 250));
		btnNewButtons[10].setOpaque(true);
		btnNewButtons[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*when the reset button is pressed, all the buttons will change to -
				 * Or in other words the game will be reseted*/
				 setNull(btnNewButtons[9]);
				 setNull(btnNewButtons[8]);
				 setNull(btnNewButtons[7]);
				 setNull(btnNewButtons[6]);
				 setNull(btnNewButtons[5]);
				 setNull(btnNewButtons[4]);
				 setNull(btnNewButtons[3]);
				 setNull(btnNewButtons[2]);
				 setNull(btnNewButtons[1]);
			}
		});
		btnNewButtons[10].setBounds(500, 134, 90, 30);
		contentPane.add(btnNewButtons[10]);
		buttons.add(btnNewButtons[9]);
		buttons.add(btnNewButtons[8]);
		buttons.add(btnNewButtons[7]);
		buttons.add(btnNewButtons[6]);
		buttons.add(btnNewButtons[5]);
		buttons.add(btnNewButtons[4]);
		buttons.add(btnNewButtons[3]);
		buttons.add(btnNewButtons[2]);
		buttons.add(btnNewButtons[1]);
	}
	public void checkWinner(JButton jb1,JButton jb2,JButton jb3) {
		if(jb1.getText().equalsIgnoreCase(jb2.getText())&&jb2.getText().equalsIgnoreCase(jb3.getText())) {
			JOptionPane.showConfirmDialog(null, message);
		}
	}
	private void setNull(JButton button) {
		button.setText("-");
	}
	private void computerGamePlay(int possible_combo) {
		selectRandomBlock =new Random();
		int index=selectRandomBlock.nextInt(possible_combo)+1;
		buttons.get(index).setText(WelcomePage.returnComputerSymbol());
		buttons.remove(index);
	}
}
