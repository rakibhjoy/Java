import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		JPasswordField pf;
		
	public SignUp()
	{
		super(" Page-2 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(57, 121, 133);
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("Create Account");
		l1.setFont(new Font("Serif",Font.BOLD,60));
		l1.setForeground(Color.GREEN);
		l1.setBounds(500,50,750,100);
		p1.add(l1);
		
		l2 = new JLabel("User Name :");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,24));
		l2.setForeground(Color.blue);
		l2.setBounds(350,170,220,100);
		p1.add(l2);
		
		l3 = new JLabel("Email :");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,24));
		l3.setForeground(Color.blue);
		l3.setBounds(350,220,220,100);
		p1.add(l3);
		
		l4 = new JLabel("Password :");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,24));
		l4.setForeground(Color.blue);
		l4.setBounds(350,270,220,100);
		p1.add(l4);
		
		l5 = new JLabel("Confirm Password :");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,24));
		l5.setForeground(Color.blue);
		l5.setBounds(350,320,300,100);
		p1.add(l5);
		
		
		
		
		t1 = new JTextField();
		t1.setBounds(570,210,300,30);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(570,255,300,30);
		p1.add(t2);
		
		pf = new JPasswordField();
		pf.setBounds(570,310,300,30);
		p1.add(pf);
		
		t4 = new JTextField();
		t4.setBounds(570,360,300,30);
		p1.add(t4);
		
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b1.setForeground(Color.green);
		b1.setBounds(170,510,120,60);
		b1.addActionListener(this);
		p1.add(b1);


		b2 = new JButton("Comfirm");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(900,510,120,60);
		b2.addActionListener(this);
		p1.add(b2);	
		
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
				Form2 f2 = new Form2();
				this.setVisible(false);
				f2.setVisible(true);
			}
		}


}
