import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1;
		JPasswordField pf;
		
	public Form2()
	{
		super(" Page-2 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(115, 173, 139);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("USER");
		l1.setFont(new Font("Serif",Font.BOLD,50));
		l1.setForeground(Color.BLUE);
		l1.setBounds(480,30,500,100);
		p1.add(l1);
		
		l2 = new JLabel("User Name");
		l2.setFont(new Font("Calibri",Font.BOLD,30));
		l2.setForeground(Color.BLUE);
		l2.setBounds(200,200,300,40);
		p1.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Calibri",Font.BOLD,30));
		l3.setForeground(Color.BLUE);
		l3.setBounds(200,300,300,40);
		p1.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(500,200,200,30);
		p1.add(t1);

		pf = new JPasswordField();
		pf.setBounds(500,300,200,30);
		p1.add(pf);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Calibri",Font.PLAIN,20));
		b1.setForeground(Color.blue);
		b1.setBounds(170,510,120,40);
		b1.addActionListener(this);
		p1.add(b1);	

		b2 = new JButton("Enter");
		b2.setFont(new Font("Calibri",Font.PLAIN,20));
		b2.setForeground(Color.blue);
		b2.setBounds(500,360,120,40);
		b2.addActionListener(this);
		p1.add(b2);	
		
		b3 = new JButton("Sign Up");
		b3.setFont(new Font("Calibri",Font.BOLD,25));
		b3.setForeground(Color.blue);
		b3.setBounds(800,510,180,40);
		b3.addActionListener(this);
		p1.add(b3);	
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				FirstPage f = new FirstPage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				UserLogin ul = new UserLogin();
				this.setVisible(false);
				ul.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				SignUp su = new SignUp();
				this.setVisible(false);
				su.setVisible(true);
			}
		}


}