import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectTestList extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2;
	JPanel p1;
	JTextArea ta;
	JScrollPane sp;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	 public SelectTestList()
	{
		super(" Page-5 ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color c = new Color(115, 173, 139);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,600));
		p1.setBackground(c);
		p1.setLayout(null);
		
		l1 = new JLabel("Select Test");
		l1.setFont(new Font("Serif",Font.BOLD,70));
		l1.setForeground(Color.BLUE);
		l1.setBounds(500,50,750,100);
		p1.add(l1);
		
		ta = new JTextArea(10,10);
		sp = new JScrollPane(ta);
		p1.add(sp); 

		c1 = new JCheckBox("01. TC, DC, HB%, ESR  \t tk.320");
		c1.setFont(new Font("Serif",Font.BOLD,20));
		c1.setBounds(250,160,350,20);
		add(c1);
		
		
		c2 = new JCheckBox("02. TC DC             \t tk.180");
		c2.setFont(new Font("Serif",Font.BOLD,20));
		c2.setBounds(250,200,350,20);
		add(c2);
		
		c3 = new JCheckBox("03. HB%               \t tk.180");
		c3.setFont(new Font("Serif",Font.BOLD,20));
		c3.setBounds(250,240,350,20);
		add(c3);
		
		c4 = new JCheckBox( "04. ESR               \t tk.150");
		c4.setFont(new Font("Serif",Font.BOLD,20));
		c4.setBounds(250,280,350,20);
		add(c4);
		
		c5 = new JCheckBox("05. PCV               \t tk.180");
		c5.setFont(new Font("Serif",Font.BOLD,20));
		c5.setBounds(250,320,350,20);
		add(c5);
		
		c6 = new JCheckBox("06. MCH               \t tk.180");
		c6.setFont(new Font("Serif",Font.BOLD,20));
		c6.setBounds(250,360,350,20);
		add(c6);
		
		c7 = new JCheckBox("07. Platelet          \t tk.160");
		c7.setFont(new Font("Serif",Font.BOLD,20));
		c7.setBounds(250,400,350,20);
		add(c7);
		
		c8 = new JCheckBox("08. RBC               \t tk.180");
		c8.setFont(new Font("Serif",Font.BOLD,20));
		c8.setBounds(250,400,350,20);
		add(c8);
		
		c9 = new JCheckBox("09. Malarial Parasite (M.P)     \t tk.250");
		c9.setFont(new Font("Serif",Font.BOLD,20));
		c9.setBounds(250,440,350,20);
		add(c9);
		
		c10 = new JCheckBox("10. Blood Film        \t tk.250");
		c10.setFont(new Font("Serif",Font.BOLD,20));
		c10.setBounds(250,480,350,20);
		add(c10);
		/*
		c11 = new JCheckBox("11. Troponin-I        \t tk.12,000");
		c11.setFont(new Font("Serif",Font.BOLD,20));
		c11.setBounds(250,310,100,30);
		add(c11);
		
		c12 = new JCheckBox("12. Circulating Eosonophil   \t250");
		c12.setFont(new Font("Serif",Font.BOLD,20));
		c12.setBounds(250,320,100,30);
		add(c12);
		
		c13 = new JCheckBox("13. BT/CT             \t tk.250");
		c13.setFont(new Font("Serif",Font.BOLD,20));
		c13.setBounds(250,330,100,30);
		add(c13);
		
		c14 = new JCheckBox("14. Blood Sugar (F/R) \t tk.250");
		c14.setFont(new Font("Serif",Font.BOLD,20));
		c14.setBounds(250,340,100,30);
		add(c14);
		
		c15 = new JCheckBox( "15. 1 ½ / 2 hrs. ABF  \t tk.180");
		c15.setFont(new Font("Serif",Font.BOLD,20));
		c15.setBounds(250,350,100,30);
		add(c15);
		
		c16 = new JCheckBox( "16. G.T.T. with Urine (2 samples)  \t tk.250");
		c16.setFont(new Font("Serif",Font.BOLD,20));
		c16.setBounds(250,340,100,30);
		add(c16);
		
		c17 = new JCheckBox("17. Urea              \t tk.350");
		c17.setFont(new Font("Serif",Font.BOLD,20));
		c17.setBounds(250,340,100,30);
		add(c16);
		
		c18 = new JCheckBox( "18. Creatinine        \t tk.320");
		c18.setFont(new Font("Serif",Font.BOLD,20));
		c18.setBounds(250,340,100,30);
		add(c18);
		
		c19 = new JCheckBox("19. BUN               \t tk.250");
		c19.setFont(new Font("Serif",Font.BOLD,20));
		c19.setBounds(250,350,100,30);
		add(c19);
		
		c20 = new JCheckBox("20. Uric Acid         \t tk.350");
		c20.setFont(new Font("Serif",Font.BOLD,20));
		c20.setBounds(250,360,100,30);
		add(c20);
		*/
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b1.setForeground(Color.green);
		b1.setBounds(170,510,120,40);
		b1.addActionListener(this);
		p1.add(b1);	

		b2 = new JButton("Comfirm");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(800,510,120,40);
		b2.addActionListener(this);
		p1.add(b2);	
		
        this.add(p1);	
	}
	
	    public class event implements ItemListener
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(c1.isSelected())
				{
					c1.setText("01. TC, DC, HB%, ESR  \t tk.320");
				}
				
				
				if(c2.isSelected())
				{
					c2.setText("02. TC DC             \t tk.180");
				}
				
				if(c3.isSelected())
				{
					c3.setText("03. HB%               \t tk.180");
				}
				
				if(c4.isSelected())
				{
					c4.setText("04. ESR               \t tk.150");
				}
				
				if(c5.isSelected())
				{
					c5.setText("05. PCV               \t tk.180");
				}
				
				if(c6.isSelected())
				{
					c6.setText("06. MCH               \t tk.180");
				}
				
				if(c7.isSelected())
				{
					c7.setText("07. Platelet          \t tk.160");
				}
				
				if(c8.isSelected())
				{
					c8.setText( "08. RBC               \t tk.180");
				}
				
				if(c9.isSelected())
				{
					c9.setText("09. Malarial Parasite (M.P)     \t tk.250");
				}
				
				if(c10.isSelected())
				{
					c10.setText("10. Blood Film        \t tk.250");
				}
				/*
				if(c11.isSelected())
				{
					c11.setText("11. Troponin-I        \t tk.12,000");
				}
				
				if(c12.isSelected())
				{
					c12.setText( "12. Circulating Eosonophil   \t250");
				}
				
				if(c13.isSelected())
				{
					c13.setText("13. BT/CT             \t tk.250");
				}
				
				if(c14.isSelected())
				{
					c14.setText("14. Blood Sugar (F/R) \t tk.250");
				}
				
				if(c15.isSelected())
				{
					c15.setText("15. 1 ½ / 2 hrs. ABF  \t tk.180");
				}
				
				if(c16.isSelected())
				{
					c16.setText("16. G.T.T. with Urine (2 samples)  \t tk.250");
				}
				
				if(c17.isSelected())
				{
					c17.setText("17. Urea              \t tk.350");
				}
				
				if(c18.isSelected())
				{
					c18.setText("18. Creatinine        \t tk.320");
				}
				
				if(c19.isSelected())
				{
					c19.setText("19. BUN               \t tk.250");
				}
				
				if(c20.isSelected())
				{
					c20.setText("20. Uric Acid         \t tk.350");
				}
				*/
			}
		}

		public void actionPerformed(ActionEvent ae)
		{
			
		    if(ae.getSource()==b2)
			{
				SelectTestList stl = new SelectTestList();
				this.setVisible(false);
				stl.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
				PatientForm pf = new PatientForm();
				this.setVisible(false);
				pf.setVisible(true);
			}
		}
}