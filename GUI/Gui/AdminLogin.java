import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener
{
		JLabel l1;
		JButton b1,b2,b3,b4;
		JPanel p1;
		
	public AdminLogin()
	{
		super(" Page-3 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c =new Color(0, 191, 255);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,600));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("ADMIN");
		l1.setFont(new Font("Serif",Font.BOLD,70));
		l1.setForeground(Color.GREEN);
		l1.setBounds(500,40,750,100);
		p1.add(l1);
		
		b1 = new JButton("TEST LIST");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b1.setForeground(Color.blue);
		b1.setBounds(300,230,225,70);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("INVOICE LIST");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b2.setForeground(Color.blue);
		b2.setBounds(600,230,225,70);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("PATIENT LIST");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b3.setForeground(Color.blue);
		b3.setBounds(500,430,225,70);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("BACK");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b4.setForeground(Color.green);
		b4.setBounds(170,530,120,40);
		b4.addActionListener(this);
		p1.add(b4);	
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
		    if(ae.getSource()==b4)
			{
				Form1 f1 = new Form1();
				this.setVisible(false);
				f1.setVisible(true);
			}
		}


}

