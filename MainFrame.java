import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class MainFrame extends JFrame implements ActionListener{
	private static final int height = 250;
	private static final int width = 185;
	private static JTextField inputField;
	private static StringBuilder str = new StringBuilder("0");
	private static long input1 = 0;
	private static long answer = 0;
	private static int count = 0;
	private static JButton b1;
	private static JButton b2;
	private static JButton b3;
	private static JButton b4;
	private static JButton b5;
	private static JButton b6;
	private static JButton b7;
	private static JButton b8;
	private static JButton b9;
	private static JButton b0;
	private static JButton add;
	private static JButton divide;
	private static JButton multiply;
	private static JButton subtract;
	private static JButton equal;

	public MainFrame(){
		super("Calculator by Khan");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(width, height);
		setLocationRelativeTo(null);

		
		Font font  = new Font(Font.SERIF,Font.BOLD, 32);
		inputField = new JTextField(str.toString(), 5);
		inputField.setFont(font);
		inputField.setHorizontalAlignment(SwingConstants.RIGHT);
		inputField.setSize(50,120);
		add(inputField);

		divide = new JButton(" /  ");
		divide.setActionCommand("divide");
		divide.addActionListener(this);
		divide.setSize(50,150);
		add(divide);

		multiply = new JButton(" *  ");
		multiply.setActionCommand("multiply");
		multiply.addActionListener(this);
		multiply.setSize(50,150);
		add(multiply);

		subtract = new JButton(" -  ");
		subtract.setActionCommand("subtract");
		subtract.addActionListener(this);
		subtract.setSize(50,150);
		add(subtract);

		b7 = new JButton(" 7 ");
		b7.setActionCommand("7");
		b7.addActionListener(this);
		b7.setSize(50,150);
		add(b7);

		b8 = new JButton(" 8 ");
		b8.setActionCommand("8");
		b8.addActionListener(this);
		b8.setSize(50,150);
		add(b8);

		b9 = new JButton(" 9 ");
		b9.setActionCommand("9");
		b9.addActionListener(this);
		b9.setSize(50,150);
		add(b9);

		b4 = new JButton(" 4 ");
		b4.setActionCommand("4");
		b4.addActionListener(this);
		b4.setSize(50,150);
		add(b4);

		b5 = new JButton(" 5 ");
		b5.setActionCommand("5");
		b5.addActionListener(this);
		b5.setSize(50,150);
		add(b5);

		b6 = new JButton(" 6 ");
		b6.setActionCommand("6");
		b6.addActionListener(this);
		b6.setSize(50,150);
		add(b6);

		b1 = new JButton(" 1 ");
		b1.setActionCommand("1");
		b1.addActionListener(this);
		b1.setSize(50,150);
		add(b1);

		b2 = new JButton(" 2 ");
		b2.setActionCommand("2");
		b2.addActionListener(this);
		b2.setSize(50,150);
		add(b2);

		b3 = new JButton(" 3 ");
		b3.setActionCommand("3");
		b3.addActionListener(this);
		b3.setSize(50,150);
		add(b3);
      
      add = new JButton(" + ");
      add.setActionCommand("add");
      add.addActionListener(this);
      add.setSize(50,150);
      add(add);

      b0 = new JButton(" 0 ");
      b0.setActionCommand("0");
      b0.addActionListener(this);
      b0.setSize(50,150);
      add(b0);
      					
      equal = new JButton(" = ");
      equal.setActionCommand("equal");
      equal.addActionListener(this);
      equal.setSize(100,150);
      add(equal);



     
      
      	
   str = new StringBuilder("");   
	}
	

	public void actionPerformed(ActionEvent e){
	
		String line = e.getActionCommand();
		
		switch(line){
		
			case "1": str.append(line);
						inputField.setText(str.toString());
						break;
			case "2": str.append(line);
						inputField.setText(str.toString());
						break;
			case "3": str.append(line);
						inputField.setText(str.toString());
						break;
			case "4": str.append(line);
						inputField.setText(str.toString());
						break;
			case "5": str.append(line);
						inputField.setText(str.toString());
						break;
			case "6": str.append(line);
						inputField.setText(str.toString());
						break;
			case "7": str.append(line);
						inputField.setText(str.toString());
						break;
			case "8": str.append(line);                     
						inputField.setText(str.toString());
						break;
			case "9": str.append(line);
						inputField.setText(str.toString());
						break;
			case "0": str.append(line);
						inputField.setText(str.toString());
						break;
			
			 
			case "add": if(!(str.toString().equals(""))) input1 = Long.parseLong(str.toString());
						str = new StringBuilder("");
						
						count = 4;
					
						break;	                       
			case "multiply":	if(!(str.toString().equals(""))) input1 = Long.parseLong(str.toString());
						str = new StringBuilder("");
						
						count = 2;
						break;
			case "subtract" : if(!(str.toString().equals(""))) input1 = Long.parseLong(str.toString());
						str = new StringBuilder("");
						
						count = 3;
						break;
			case "divide" : if(!(str.toString().equals(""))) input1 = Long.parseLong(str.toString());
						str = new StringBuilder("");
						
						count = 1;
						break;
		
			case "equal": 	if(!str.toString().equals("")){
								if(count == 4)	answer = (long)Long.parseLong(str.toString())+input1;
								if(count == 2)	answer = (long)Long.parseLong(str.toString())*input1;
								if(count == 3)	answer = input1 - (long)Long.parseLong(str.toString());
								if(count == 1)	answer =input1 / (long)Long.parseLong(str.toString());
								//just for checking	
								//System.out.println(str.toString()+ input1);
								//System.out.println(count);
								input1 = answer;
								str = new StringBuilder("");
								
								inputField.setText(Long.toString(answer));
								}
								break;

								
											   
		}
	}
	
	public static void main(String [] args){
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}