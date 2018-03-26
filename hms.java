

/**
 *
 * @author Shriyansh gupta
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class hms
{
	JFrame frame;
	JPanel panel;
	JLabel label,labelpass,topic;
	JTextField text;
	private JPasswordField pass;
	JButton button,button2,button3;
	public static void main(String args[])
	{

		hms a=new hms();	
	}
	
	 public hms()
	{
  
		frame=new JFrame("Hospital Management System");
		frame.setLayout(new BorderLayout());
		frame.setContentPane(new JLabel(new ImageIcon("icon.jpg")));
		frame.setLayout(new FlowLayout());

		topic =new JLabel("Hospital Management");
		topic.setBounds(130,30,150,50);
		frame.add(topic);

		label=new JLabel("Username Id");
		label.setBounds(40,70,100,100);
		frame.add(label);

		labelpass =new JLabel("password");
		labelpass.setBounds(40,90,150,150);	
		frame.add(labelpass);

		text =new JTextField(10);		
		text.setBounds(130,110,200,25);
		frame.add(text);
		
		pass = new JPasswordField(10);
		pass.setBounds(130,155,200,25);
		frame.add(pass);

		button = new JButton("Log in");
		button.setBounds(100,200,80,20);
		frame.add(button);
		
		button2 = new JButton("sign up");		
		button2.setBounds(200,200,90,20);
		frame.add(button2);

		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//signin i=new signin();
				//frame.setVisible(false);
			}
		});

		button3 = new JButton("Exit");		
		button3.setBounds(260,10,90,20);
		frame.add(button3);

		button.addActionListener(new MyAction());
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                frame.setVisible(false);
			}
		});

		//frame.setBackground(Color.red);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(360,300);
		//frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.jpg"));
		frame.setVisible(true);	
	}
   
class MyAction implements ActionListener
 {
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		String value1=text.getText().trim();
	    String value2=pass.getText().trim();

		try
		{
			if(value1.equals("admin") && value2.equals("admin"))
		 	{
				//homepage w=new homepage();
				//frame.setVisible(false);
  	        }  
			else if (value1.equals("admin"))
			{
			  JOptionPane.showMessageDialog(frame,"Invalid  password.Try again","Error Message",JOptionPane.ERROR_MESSAGE);    
                        } 
			else if (value2.equals("admin"))
		        {
			  JOptionPane.showMessageDialog(frame,"Invalid  username id.Try again","Error Message",JOptionPane.ERROR_MESSAGE);    
	                } 
			else 
			{
			  JOptionPane.showMessageDialog(frame,"Invalid account. Try again.","Error Message", JOptionPane.ERROR_MESSAGE);
			}
		}catch(Exception ex)
			{
			  JOptionPane.showMessageDialog(null,"GENERAL EXCEPTION","WARNING!!!",JOptionPane.INFORMATION_MESSAGE);
			}
	}

 }
}