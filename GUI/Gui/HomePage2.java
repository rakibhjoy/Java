import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JButton b1,b2; 
		JPanel p1;
		
	public HomePage2()
	{
		super(" HomePage-2 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(0, 128, 255);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,600));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("GROUP-5");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,40));
		l1.setForeground(Color.blue);
		l1.setBounds(420,50,200,60);
		p1.add(l1);
		
		l2 = new JLabel("GROUP MEMBERS");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		l2.setForeground(Color.blue);
		l2.setBounds(420,180,300,40);
		p1.add(l2);
		
		
		l3 = new JLabel("1.ROY, PARTHA<20-43575-1>");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l3.setForeground(Color.green);
		l3.setBounds(170,350,500,30);
		p1.add(l3);
		
		l4 = new JLabel("2.AHMED, ISHTIAK<20-43553-1>");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.green);
		l4.setBounds(600,350,500,30);
		p1.add(l4);
		
		l5 = new JLabel("3.HASAN, MD. RAKIB<20-43540-1>");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l5.setForeground(Color.green);
		l5.setBounds(170,450,500,30);
		p1.add(l5);
		
		l6 = new JLabel("4.TUSHAR,MD TANBIN<20-43573-1>");
		l6.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l6.setForeground(Color.green);
		l6.setBounds(600,450,500,30);
		p1.add(l6);
		
		b1 = new JButton("Prev");
		b1.setFont(new Font("Calibre",Font.PLAIN,20));
		b1.setForeground(Color.blue);
		b1.setBounds(120,530,120,40);
		b1.addActionListener(this);
		p1.add(b1);	
		
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Calibre",Font.PLAIN,20));
		b2.setForeground(Color.blue);
		b2.setBounds(800,530,120,40);
		b2.addActionListener(this);
		p1.add(b2);	

        this.add(p1);		
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
			
			 if(ae.getSource()==b1)
			{
				HomePage hp = new HomePage();
				this.setVisible(false);
				hp.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				FirstPage fp = new FirstPage();
				this.setVisible(false);
				fp.setVisible(true);
			}
		}
	
}
