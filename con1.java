import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class con1 extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField t1;
    double result;
    JLabel l1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					con1 frame = new con1();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public con1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 589, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/3-this.getSize().height/2);
		
		JComboBox c1 = new JComboBox();
		c1.setForeground(new Color(0, 0, 139));
		c1.setBackground(SystemColor.inactiveCaptionBorder);
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Indian rupee", "Nepalese rupee", "American dollar(USD)", "UAE-Dirham"}));
		c1.setBounds(30, 62, 194, 30);
		panel.add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setForeground(new Color(0, 0, 139));
		c2.setBackground(SystemColor.inactiveCaptionBorder);
		c2.setFont(new Font("Tahoma", Font.BOLD, 15));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Nepalese rupee", "American dollar(USD)", "Indian rupee(INR)", "UAE-Dirham"}));
		c2.setBounds(335, 62, 210, 30);
		panel.add(c2);
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char h=e.getKeyChar();
				if(Character.isLetter(h)&&!e.isAltDown()) {
					e.consume();
				}
			}
		});
		t1.setFont(new Font("Tahoma", Font.BOLD, 16));
		t1.setBounds(30, 113, 194, 37);
		panel.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(124, 252, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals(""))
				{
				JOptionPane.showMessageDialog(null, "Please enter a value");	
				}
			
				else
				{		
				int t1text=Integer.parseInt(t1.getText());
				if(c1.getSelectedItem().equals("Indian rupee")&&c2.getSelectedItem().equals("Nepalese rupee"))
		       {
					result=(t1text*1.61);
					l1.setText(Double.toString(result));
			
		       }
				else
					if(c1.getSelectedItem().equals("Nepalese rupee")&&c2.getSelectedItem().equals("Indian rupee(INR)"))
					{
						result=(t1text*0.62);
				    	l1.setText(Double.toString(result));
					}
					else
						if(c1.getSelectedItem().equals("Indian rupee")&&c2.getSelectedItem().equals("UAE-Dirham"))
						{
							result=(t1text*0.050);
					    	l1.setText(Double.toString(result));
						}
						else
							if(c1.getSelectedItem().equals("Nepalese rupee")&&c2.getSelectedItem().equals("UAE-Dirham"))
							{
								result=(t1text*0.031);
						    	l1.setText(Double.toString(result));
							}
							else
								if(c1.getSelectedItem().equals("Nepalese rupee")&&c2.getSelectedItem().equals("American dollar(USD)"))
								{
									result=(t1text*0.0085);
							    	l1.setText(Double.toString(result));
								}
								else
									if(c1.getSelectedItem().equals("Indian rupee")&&c2.getSelectedItem().equals("American dollar(USD)"))
									{
										result=(t1text*0.014);
								    	l1.setText(Double.toString(result));
									}
									else
										if(c1.getSelectedItem().equals("American dollar(USD)")&&c2.getSelectedItem().equals("Indian rupee"))
										{
											result=(t1text*73.06);
									    	l1.setText(Double.toString(result));
										}
										else
											if(c1.getSelectedItem().equals("American dollar(USD)")&&c2.getSelectedItem().equals("Nepalese rupee"))
											{
												result=(t1text*117.32);
										    	l1.setText(Double.toString(result));
											}
											else
												if(c1.getSelectedItem().equals("American dollar(USD)")&&c2.getSelectedItem().equals("UAE-Dirham"))
												{
													result=(t1text*3.67);
											    	l1.setText(Double.toString(result));
												}
												else
													if(c1.getSelectedItem().equals("UAE-Dirham")&&c2.getSelectedItem().equals("Indian rupee"))
													{
														result=(t1text*19.87);
												    	l1.setText(Double.toString(result));
													}
													else
														if(c1.getSelectedItem().equals("UAE-Dirham")&&c2.getSelectedItem().equals("Nepalese rupee"))
														{
															result=(t1text*31.94);
													    	l1.setText(Double.toString(result));
														}
														else
															if(c1.getSelectedItem().equals("UAE-Dirham")&&c2.getSelectedItem().equals("American dollar(USD)"))
															{
																result=(t1text*0.27);
														    	l1.setText(Double.toString(result));
															}
															else
															{
																JOptionPane.showMessageDialog(null,"Error Please select valid currebcy");												
																}
		                                                   	}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(215, 191, 148, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("currency converter");
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(179, 10, 193, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(335, 113, 210, 37);
		panel.add(panel_1);
		
		l1 = new JLabel("0");
		panel_1.add(l1);
		l1.setBackground(Color.WHITE);
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/images/pi.jpg")));//please change the url address if you want to change the background image create folder in src and name it as image 
		lblNewLabel_1.setBounds(0, 0, 589, 264);
		panel.add(lblNewLabel_1);
	}
}
