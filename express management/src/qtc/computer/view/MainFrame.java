package qtc.computer.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MainFrame extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			LoginFrame frame = new LoginFrame();
			frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setBounds(199, 107, 464, 116);
		getContentPane().add(lblNewLabel);
	}
}
