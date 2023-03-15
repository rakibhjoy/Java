import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstPage extends JFrame implements ActionListener
{
		JLabel l1;
		JButton b1,b2,b3,b4,b5;
		JPanel p1;
		
	public FirstPage()
	{
		super(" Page-1 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(0, 255, 255);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,600));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("Pathology Management System");
		l1.setFont(new Font("Sans_Serif",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(220,50,750,100);
		p1.add(l1);
		
		b1 = new JButton("Admin Login");
		b1.setFont(new Font("Calibri",Font.BOLD,30));
		b1.setForeground(Color.blue);
		b1.setBounds(420,220,220,80);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("User Login");
		b2.setFont(new Font("Calibri",Font.BOLD,30));
		b2.setForeground(Color.blue);
		b2.setBounds(420,320,220,80);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		b4 = new JButton("Exit");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b4.setForeground(Color.blue);
		b4.setBounds(750,530,120,40);
		b4.addActionListener(this);
		p1.add(b4);	
		
		
		b5 = new JButton("Prev");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b5.setForeground(Color.blue);
		b5.setBounds(120,530,120,40);
		b5.addActionListener(this);
		p1.add(b5);	
		
        this.add(p1);		
       
	}

		public void actionPerformed(ActionEvent ae)
		{
			
		     if(ae.getSource()==b1)
			{
				Form1 f1 = new Form1();
				this.setVisible(false);
				f1.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form2 f2 = new Form2();
				this.setVisible(false);
				f2.setVisible(true);
			}
			
			else if(ae.getSource()==b5)
			{
				HomePage2 p = new HomePage2();
				this.setVisible(false);
				p.setVisible(true);
			}
			
			else if(ae.getSource()==b4)
			{
                System.exit(0);
			}
		}


}

