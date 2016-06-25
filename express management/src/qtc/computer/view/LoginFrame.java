package qtc.computer.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginFrame extends JFrame {
	
	private JTextField usernameT;
	private JTextField passwordT;


	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		

		
		setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF-\u767B\u5F55\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 352);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setBounds(99, 47, 94, 31);
		getContentPane().add(label);
		
		usernameT = new JTextField();
		usernameT.setBounds(190, 47, 216, 31);
		getContentPane().add(usernameT);
		usernameT.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setBounds(99, 128, 54, 15);
		getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("登录");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String username = usernameT.getText().toString().trim();
				String password = passwordT.getText().toString().trim();
				
				
				
				
			}
		});
		btnNewButton.setBounds(129, 195, 93, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(280, 195, 93, 23);
		getContentPane().add(btnNewButton_1);
		
		passwordT = new JTextField();
		passwordT.setBounds(190, 125, 216, 31);
		getContentPane().add(passwordT);
		passwordT.setColumns(10);

	}
}
