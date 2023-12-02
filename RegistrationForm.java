package swingEx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField age;
	private JTextField mob;
	private JTextField mail;
	private JPasswordField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField uname;
	private JTextField txtadd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
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
	public RegistrationForm() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Euphorigenic", Font.PLAIN, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\abc.png"));
		setTitle("Registration Form");
		setBounds(100, 100, 389, 494);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 32, 119, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(41, 63, 119, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(41, 206, 119, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Age");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(41, 129, 119, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile No.");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(41, 171, 119, 13);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Gender");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(41, 94, 119, 13);
		contentPane.add(lblNewLabel_2_3);
		
		txtName = new JTextField();
		txtName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtName.setBackground(Color.WHITE);
		txtName.setForeground(Color.BLACK);
		txtName.setBounds(170, 29, 165, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		age = new JTextField();
		age.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		age.setBackground(Color.WHITE);
		age.setForeground(Color.BLACK);
		age.setColumns(10);
		age.setBounds(170, 126, 165, 19);
		contentPane.add(age);
		
		mob = new JTextField();
		mob.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mob.setBackground(Color.WHITE);
		mob.setForeground(Color.BLACK);
		mob.setColumns(10);
		mob.setBounds(170, 168, 165, 19);
		contentPane.add(mob);
		
		mail = new JTextField();
		mail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mail.setBackground(Color.WHITE);
		mail.setForeground(Color.BLACK);
		mail.setColumns(10);
		mail.setBounds(170, 203, 165, 19);
		contentPane.add(mail);
		
		JLabel lblNewLabel_2_4 = new JLabel("Password");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(41, 280, 119, 13);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("User Name");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBounds(41, 245, 119, 13);
		contentPane.add(lblNewLabel_2_2_1);
		
		password = new JPasswordField();
		password.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		password.setBackground(Color.WHITE);
		password.setForeground(Color.BLACK);
		password.setBounds(170, 279, 165, 19);
		contentPane.add(password);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbMale.setBackground(Color.GRAY);
		rbMale.setForeground(Color.BLACK);
		buttonGroup.add(rbMale);
		rbMale.setBounds(170, 92, 78, 21);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbFemale.setBackground(Color.GRAY);
		rbFemale.setForeground(Color.BLACK);
		buttonGroup.add(rbFemale);
		rbFemale.setBounds(257, 92, 78, 21);
		contentPane.add(rbFemale);
		
		uname = new JTextField();
		uname.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		uname.setBackground(Color.WHITE);
		uname.setForeground(Color.BLACK);
		uname.setBounds(170, 244, 165, 19);
		contentPane.add(uname);
		uname.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtadd.setText("");
				buttonGroup.clearSelection();
				age.setText("");
				mob.setText("");
				mail.setText("");
				uname.setText("");
				password.setText("");
				
			}
		});
		btnReset.setBackground(Color.WHITE);
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(41, 394, 294, 39);
		contentPane.add(btnReset);
		
		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","123456");
					String query = "insert into registration values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, txtName.getText());
					ps.setString(2,txtadd.getText());
					if (rbMale.isSelected()==true) 
						ps.setString(3,rbMale.getText());
					
					else 
						ps.setString(3,rbFemale.getText());
				
					ps.setInt(4,Integer.parseInt(age.getText()));
					ps.setInt(5,Integer.parseInt(mob.getText()));
					ps.setString(6, mail.getText());
					ps.setString(7, uname.getText());
					ps.setString(8, password.getText());
					
					int i = ps.executeUpdate();
					
					JOptionPane.showMessageDialog(btnValidate,i+" Record Added");
					ps.close();
					con.close();
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			}
		});
		btnValidate.setBackground(Color.WHITE);
		btnValidate.setForeground(Color.BLACK);
		btnValidate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnValidate.setBounds(41, 338, 294, 39);
		contentPane.add(btnValidate);
		
		txtadd = new JTextField();
		txtadd.setForeground(Color.BLACK);
		txtadd.setColumns(10);
		txtadd.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtadd.setBackground(Color.WHITE);
		txtadd.setBounds(170, 62, 165, 19);
		contentPane.add(txtadd);
	}
}
