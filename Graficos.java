import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graficos extends JFrame implements ActionListener
{

	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;

	private JTextField txt1;
	private JTextField txt2;

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;

	public void crearGUI()
	{

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		label1 = new JLabel("Numero 1: ");
		label1.setBounds(10,10,100,30);
		add(label1);

		txt1 = new JTextField();
		txt1.setBounds(100,15,150,20);
		add(txt1);

		label2 = new JLabel("Numero 2: ");
		label2.setBounds(10,40,100,30);
		add(label2);

		txt2 = new JTextField();
		txt2.setBounds(100,45,150,20);
		add(txt2);

		boton1 = new JButton(" + ");
		boton1.setBounds(20,80,50,30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton(" - ");
		boton2.setBounds(80,80,50,30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton(" * ");
		boton3.setBounds(140,80,50,30);
		add(boton3);
		boton3.addActionListener(this);

		boton4 = new JButton(" / ");
		boton4.setBounds(200,80,50,30);
		add(boton4);
		boton4.addActionListener(this);

		label3 = new JLabel("Resultado: ");
		label3.setBounds(10,120,100,30);
		add(label3);

		label4 = new JLabel(" ");
		label4.setBounds(110,120,100,30);
		add(label4);

	}

	public void actionPerformed(ActionEvent event)
	{

		Object origen = event.getSource();
		int n1 = Integer.parseInt(txt1.getText());
		int n2 = Integer.parseInt(txt2.getText());
		int r = 0;

		if (origen == boton1)
		{

			r = n1 + n2;

		}

		if (origen == boton2)
		{

			r = n1 - n2;

		}

		if (origen == boton3)
		{

			r = n1 * n2;

		}

		if (origen == boton4)
		{

			r = n1 / n2;

		}

		label4.setText(Integer.toString(r));

	}

}
