import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PatientForm extends JFrame implements ActionListener
{
		JLabel l1,l2,l6,l7,l8,l9,l10,l11;
		JTextField t1,t2,t6,t7,t8;
		JButton b1,b2; 
		JRadioButton rb,rb1;
		JComboBox cob1;
		JPanel p1;
		
	public PatientForm()
	{
		super(" Page-4 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(115, 173, 139);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("Form");
		l1.setFont(new Font("Serif",Font.BOLD,50));
		l1.setForeground(Color.GREEN);
		l1.setBounds(500,10,750,100);
		p1.add(l1);
		
		l2 = new JLabel("Name :");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
		l2.setForeground(Color.blue);
		l2.setBounds(250,80,220,100);
		p1.add(l2);
		
		l6 = new JLabel("Phone Number :");
		l6.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
		l6.setForeground(Color.blue);
		l6.setBounds(250,120,220,100);
		p1.add(l6);
		
		l7 = new JLabel("Email :");
		l7.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
		l7.setForeground(Color.blue);
		l7.setBounds(250,160,220,100);
		p1.add(l7);
		
		l8 = new JLabel("Address :");
		l8.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
		l8.setForeground(Color.blue);
		l8.setBounds(250,170,220,200);
		p1.add(l8);
		

		t1 = new JTextField();
		t1.setBounds(450,115,200,25);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(450,155,200,25);
		p1.add(t2);
		
		t6 = new JTextField();
		t6.setBounds(450,195,200,25);
		p1.add(t6);
		
		t7 = new JTextField();
		t7.setBounds(450,260,200,25);
		p1.add(t7);
		
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b1.setForeground(Color.green);
		b1.setBounds(170,510,120,40);
		b1.addActionListener(this);
		p1.add(b1);


		b2 = new JButton("Submit");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(800,510,120,40);
		b2.addActionListener(this);
		p1.add(b2);	
		
		l9 = new JLabel("Gender :");
		l9.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l9.setForeground(Color.blue);
		l9.setBounds(250,320,220,100);
		p1.add(l9);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rb);
		group.add(rb1);
		
		rb =  new JRadioButton("Male");
		rb.setFont(new Font("Serif",Font.BOLD,20));
		rb.setBounds(380,350,120,40);
		rb.addActionListener(this);
		add(rb);
		
		rb1 = new JRadioButton("Female");
		rb1.setFont(new Font("Serif",Font.BOLD,20));
		rb1.setBounds(510,350,120,40);
		rb1.addActionListener(this);
		add(rb1);
		
		l10 = new JLabel("Blood Group :");
		l10.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l10.setForeground(Color.blue);
		l10.setBounds(650,320,220,100);
		p1.add(l10);
		
		String blood[] = new String[] {"A+","A-","B+","B-","O+","O-","AB+","AB-"};
		cob1 = new JComboBox(blood);
		cob1.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		cob1.setForeground(Color.blue);
		cob1.setBounds(820,350,80,40);
		add(cob1);
		
		l11 = new JLabel("Age :");
		l11.setFont(new Font("Comic Sans MS",Font.BOLD,22));
		l11.setForeground(Color.blue);
		l11.setBounds(250,400,220,100);
		p1.add(l11);
		t8 = new JTextField();
		t8.setBounds(350,420,80,40);
		p1.add(t8);
		
        this.add(p1);		
	}
	
	    
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				UserLogin ul = new UserLogin();
				this.setVisible(false);
				ul.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				SelectTestList stl = new SelectTestList();
				this.setVisible(false);
				stl.setVisible(true);
			}
			
		}


}