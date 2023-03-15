import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserLogin extends JFrame implements ActionListener
{
		JLabel l1;
		JButton b1,b2,b3;
		JPanel p1;
		
	public UserLogin()
	{
		super(" Page-3 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(115, 173, 139);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,600));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("User");
		l1.setFont(new Font("Serif",Font.BOLD,70));
		l1.setForeground(Color.GREEN);
		l1.setBounds(500,50,750,100);
		p1.add(l1);
		
		
		
		b1 = new JButton("Select Test");
		b1.setFont(new Font("Calibri",Font.BOLD,25));
		b1.setForeground(Color.BLUE);
		b1.setBounds(500,200,240,70);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Select Appointment List");
		b2.setFont(new Font("Calibri",Font.BOLD,25));
		b2.setForeground(Color.BLUE);
		b2.setBounds(500,350,300,70);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		b3 = new JButton("BACK");
		b3.setFont(new Font("Calibri",Font.BOLD,20));
		b3.setForeground(Color.green);
		b3.setBounds(120,540,120,40);
		b3.addActionListener(this);
		p1.add(b3);	
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
		   if(ae.getSource()==b3)
			{
			    Form2 f2 = new Form2();
				this.setVisible(false);
				f2.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
				PatientForm pf = new PatientForm();
				this.setVisible(false);
				pf.setVisible(true);
			}
			
		}


}

