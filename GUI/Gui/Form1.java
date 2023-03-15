import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1,t2;
		JButton b1,b2; 
		JPanel p1;
		JPasswordField pf;
		
	public Form1()
	{
		super(" Page-2 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(0, 191, 255);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("ADMIN");
		l1.setFont(new Font("Serif",Font.BOLD,60));
		l1.setForeground(Color.GREEN);
		l1.setBounds(460,30,500,100);
		p1.add(l1);
		
		l2 = new JLabel("User Name");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		l2.setForeground(Color.blue);
		l2.setBounds(200,200,300,40);
		p1.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		l3.setForeground(Color.blue);
		l3.setBounds(200,300,300,40);
		p1.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(500,200,200,30);
		p1.add(t1);

		pf = new JPasswordField();
		pf.setBounds(500,300,200,30);
		p1.add(pf);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b1.setForeground(Color.green);
		b1.setBounds(170,510,120,40);
		b1.addActionListener(this);
		p1.add(b1);	

		b2 = new JButton("Next");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b2.setForeground(Color.green);
		b2.setBounds(800,510,120,40);
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
				AdminLogin al = new AdminLogin();
				this.setVisible(false);
				al.setVisible(true);
			}
		}


}














