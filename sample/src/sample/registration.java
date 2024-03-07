package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 64));
		frame.setBackground(new Color(0, 255, 64));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION PAGE");
		lblNewLabel_1.setBackground(new Color(0, 255, 64));
		lblNewLabel_1.setBounds(187, 11, 124, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setBackground(new Color(0, 255, 64));
		lblNewLabel_2.setBounds(201, 59, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ROLL NO");
		lblNewLabel_3.setBackground(new Color(0, 255, 64));
		lblNewLabel_3.setBounds(201, 92, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(0, 255, 64));
		tb1.setBounds(295, 56, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBackground(new Color(0, 255, 64));
		tb2.setBounds(295, 89, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH");
		lblNewLabel_4.setBackground(new Color(0, 255, 64));
		lblNewLabel_4.setBounds(201, 124, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(0, 255, 64));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "DS", "IT", "ECE", "MECH"}));
		cb1.setBounds(295, 120, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_5 = new JLabel("GENDER");
		lblNewLabel_5.setBackground(new Color(0, 255, 64));
		lblNewLabel_5.setBounds(201, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBackground(new Color(0, 255, 64));
		r1.setBounds(253, 153, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBackground(new Color(0, 255, 64));
		r2.setBounds(361, 153, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_6 = new JLabel("PROG LANGS");
		lblNewLabel_6.setBackground(new Color(0, 255, 64));
		lblNewLabel_6.setBounds(179, 186, 68, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
		JCheckBox c1 = new JCheckBox("PYTHON");
		c1.setBackground(new Color(0, 255, 64));
		c1.setBounds(253, 182, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(new Color(0, 255, 64));
		c2.setBounds(362, 182, 97, 23);
		frame.getContentPane().add(c2);
		
		 ButtonGroup brg=new ButtonGroup();
		 brg.add(r1);
		 brg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				
				String gender=" ";
				String languages=" ";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
				languages= languages+" python";	
				}
				if(c2.isSelected())
				{
				languages= languages+" java";	
				}
				JOptionPane.showMessageDialog(btnNewButton, " NAME "+name+"\n ROLL NO"+rollno+
						"\nBRANCH "+branch+"\n GENDER  "+gender+"\n prog langs "+languages);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setBounds(305, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 255, 64));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BG.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
