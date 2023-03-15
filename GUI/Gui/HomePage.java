import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JButton b1; 
		JPanel p1;
		
	public HomePage()
	{
		super(" Page-1 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(241, 160, 0);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,600));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("WELCOME");
		l1.setFont(new Font("Serif",Font.BOLD,50));
		l1.setForeground(Color.BLUE);
		l1.setBounds(420,60,300,60);
		p1.add(l1);
	
		l2 = new JLabel("TO");
		l2.setFont(new Font("Serif",Font.BOLD,30));
		l2.setForeground(Color.BLUE);
		l2.setBounds(535,120,300,60);
		p1.add(l2);
		
		l3 = new JLabel("TEAMB28");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		l3.setForeground(Color.blue);
		l3.setBounds(450,250,600,40);
		p1.add(l3);
		
		l4 = new JLabel("PATHOLOGY MANAGEMENT SYSTEM");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,45));
		l4.setForeground(Color.blue);
		l4.setBounds(150,350,1000,40);
		p1.add(l4);
		
		l5 = new JLabel("PROJECT WORK");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		l5.setForeground(Color.blue);
		l5.setBounds(430,450,1000,40);
		p1.add(l5);
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Calibre",Font.PLAIN,20));
		b1.setForeground(Color.blue);
		b1.setBounds(800,550,120,60);
		b1.addActionListener(this);
		p1.add(b1);	
		
        this.add(p1);		
	}
       
		public void actionPerformed(ActionEvent ae)
		{
			
			 if(ae.getSource()==b1)
			{
				HomePage2 p = new HomePage2();
				this.setVisible(false);
				p.setVisible(true);
			}
		}
}














