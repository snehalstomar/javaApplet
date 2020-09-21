import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MoveObject2 extends Applet implements ActionListener
{
	Button revButton;
	TextField in,out;
	Panel panel1;
	int in_num, out_num, rem;
	Label label1,label2;
	
	public void init()
	{
		label1=new Label();                                      
		label2=new Label();                                       
		label1.setText("Enter a number:");
		label2.setText("Result:");
		add(label1);
		add(label2);
		revButton = new Button("calculate");
		add(revButton); 
		in = new TextField("",25);
		add(in);
		out = new TextField("",25);
		add(out);
		revButton.addActionListener(this);
	}	

	public void paint(Graphics g)
	{
		this.resize(650,450);
		this.revButton.setLocation(250,100);
		this.label2.setLocation(150,50);
		this.label1.setLocation(150,10);
		this.in.setLocation(300,10);
		this.out.setLocation(300,50);
	}

    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == revButton)
		{
			in_num = Integer.parseInt(in.getText());
			out_num=0;
			while(in_num!=0)
			{
				rem=in_num%10;
				out_num=out_num*10+rem;
				in_num=in_num/10;
			}
			out.setText(String.valueOf(out_num));
		}
	}
}
