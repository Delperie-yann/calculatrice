package calculatrice;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class Frame extends JFrame implements ActionListener {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
	}

	private JPanel pan = new JPanel();
	private JMenuBar menubar = new JMenuBar();
	private JMenu menu1 = new JMenu("file");
	private JMenuItem item1 = new JMenuItem("exit");
	private Font calcul = new Font("joan", Font.PLAIN, 40);
	private Font error = new Font("transformers movie", Font.PLAIN, 40);
	private JLabel lab1 = new JLabel("");
	private JLabel lab2 = new JLabel("");
	private JLabel lab3 = new JLabel("");
	private JLabel lab4 = new JLabel("");
	private JLabel lab5 = new JLabel("");
	private JLabel lab6 = new JLabel("");
	private JButton b0 = new JButton("0");
	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");
	private JButton b10 = new JButton("+");
	private JButton b11 = new JButton("=");
	private JButton b12 = new JButton("-");
	private JButton b13 = new JButton("*");
	private JButton b14 = new JButton("C");
	private JButton b15 = new JButton(":");
	private JButton b16 = new JButton("²");
	private JButton b17 = new JButton("sup");
	private double result;

	public Frame() throws IOException {

		this.setTitle("Calculatrice");
		this.setSize(600, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		pan.setLayout(null);
		menubar.setBounds(0, 0, 600, 20);
		lab1.setBounds(0, 140, 260, 40);
		lab2.setBounds(285, 140, 100, 40);
		lab3.setBounds(325, 140, 260, 40);
		lab4.setBounds(0, 140, 600, 40);
		lab5.setBounds(0, 100, 600, 40);
		lab6.setBounds(0, 140, 600, 40);
		lab1.setFont(calcul);
		lab2.setFont(calcul);
		lab3.setFont(calcul);
		lab4.setFont(calcul);
		lab5.setFont(error);
		lab5.setForeground(Color.RED);
		lab6.setFont(error);
		lab6.setForeground(Color.RED);
		lab1.setHorizontalAlignment(SwingConstants.RIGHT);
		lab4.setHorizontalAlignment(SwingConstants.CENTER);
		lab5.setHorizontalAlignment(SwingConstants.CENTER);
		lab6.setHorizontalAlignment(SwingConstants.CENTER);

		b0.setBounds(10, 294, 45, 45);
		b0.addActionListener(this);
		b1.setBounds(60, 294, 45, 45);
		b1.addActionListener(this);
		b2.setBounds(110, 294, 45, 45);
		b2.addActionListener(this);
		b3.setBounds(160, 294, 45, 45);
		b3.addActionListener(this);
		b4.setBounds(210, 294, 45, 45);
		b4.addActionListener(this);
		b5.setBounds(260, 294, 45, 45);
		b5.addActionListener(this);
		b6.setBounds(310, 294, 45, 45);
		b6.addActionListener(this);
		b7.setBounds(360, 294, 45, 45);
		b7.addActionListener(this);
		b8.setBounds(410, 294, 45, 45);
		b8.addActionListener(this);
		b9.setBounds(460, 294, 45, 45);
		b9.addActionListener(this);
		b10.setBounds(110, 394, 45, 45);
		b10.addActionListener(this);
		b11.setBounds(310, 394, 45, 45);
		b11.addActionListener(this);
		b12.setBounds(160, 394, 45, 45);
		b12.addActionListener(this);
		b13.setBounds(210, 394, 45, 45);
		b13.addActionListener(this);
		b14.setBounds(550, 20, 45, 45);
		b14.addActionListener(this);
		b15.setBounds(260, 394, 45, 45);
		b15.addActionListener(this);
		b16.setBounds(510, 294, 45, 45);
		b16.addActionListener(this);
		b17.setBounds(495, 20, 55, 45);
		b17.addActionListener(this);

		menubar.add(menu1);
		menu1.add(item1);
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		pan.add(b0);
		pan.add(b1);
		pan.add(b2);
		pan.add(b3);
		pan.add(b4);
		pan.add(b5);
		pan.add(b6);
		pan.add(b7);
		pan.add(b8);
		pan.add(b9);
		pan.add(b10);
		pan.add(b11);
		pan.add(b12);
		pan.add(b13);
		pan.add(b14);
		pan.add(b15);
		pan.add(b16);
		pan.add(b17);
		pan.add(lab1);
		pan.add(lab2);
		pan.add(lab3);
		pan.add(lab4);
		pan.add(lab5);
		pan.add(lab6);
		pan.add(menubar);

		this.setContentPane(pan);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b0) // 0
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "0");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "0");
			}
		}
		if (e.getSource() == b1) // 1
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "1");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "1");
			}
		}
		if (e.getSource() == b2) // 2
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "2");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "2");
			}
		}
		if (e.getSource() == b3) // 3
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "3");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "3");
			}
		}
		if (e.getSource() == b4) // 4
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "4");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "4");
			}
		}
		if (e.getSource() == b5) // 5
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "5");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "5");
			}
		}
		if (e.getSource() == b6) // 6
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "6");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "6");
			}
		}
		if (e.getSource() == b7) // 7
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "7");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "7");
			}
		}
		if (e.getSource() == b8) // 8
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "8");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "8");
			}
		}
		if (e.getSource() == b9) // 9
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
			lab4.setText("");
			if (lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText() + "9");
			}
			if (lab2.getText().isEmpty() == false) {
				lab3.setText(lab3.getText() + "9");
			}
		}
		if (e.getSource() == b10) // +
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().isEmpty() == false) {
				lab2.setText("+");
			}
			if (lab4.getText().isEmpty() == false) {
				lab1.setText(lab4.getText());
				lab2.setText("+");
				lab4.setText("");
			}
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
		}
		if (e.getSource() == b11) // =
		{
			if (lab2.getText() == "+") {
				try {
					result = (double) Integer.parseInt(lab1.getText()) + (double) Integer.parseInt(lab3.getText());
					lab4.setText("= " + result);
				} catch (Exception e1) {
					lab5.setText("syntax error:");
					lab6.setText(e1.getMessage());
				}
			}
			if (lab2.getText() == "-") {
				try {
					result = Integer.parseInt(lab1.getText()) - Integer.parseInt(lab3.getText());
					lab4.setText("= " + result);
				} catch (Exception e2) {
					lab5.setText("syntax error:");
					lab6.setText(e2.getMessage());
				}
			}
			if (lab2.getText() == "*") {
				try {
					result = Integer.parseInt(lab1.getText()) * Integer.parseInt(lab3.getText());
					lab4.setText("= " + result);
				} catch (Exception e3) {
					lab5.setText("syntax error:");
					lab6.setText(e3.getMessage());
				}
			}
			if (lab2.getText() == ":") {
				try {
					result = (double) Integer.parseInt(lab1.getText()) / (double) Integer.parseInt(lab3.getText());
					lab4.setText("= " + result);
				} catch (Exception e4) {
					lab5.setText("syntax error:");
					lab6.setText(e4.getMessage());
				}
			}
			if (lab1.getText().endsWith("²")) {
				try {
					lab1.setText(lab1.getText().replace("²", ""));
					result = (int) Math.pow(Integer.parseInt(lab1.getText()), 2);
					lab4.setText(result + "");
				} catch (Exception e5) {
					lab5.setText("syntax error:");
					lab6.setText(e5.getMessage());
				}
			}
			lab1.setText("");
			lab2.setText("");
			lab3.setText("");
		}
		if (e.getSource() == b12) // -
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().isEmpty() == false) {
				lab2.setText("-");
			}
			if (lab4.getText().isEmpty() == false) {
				lab1.setText(lab4.getText());
				lab2.setText("-");
				lab4.setText("");
			}
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
		}
		if (e.getSource() == b13) // *
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().isEmpty() == false) {
				lab2.setText("*");
			}
			if (lab4.getText().isEmpty() == false) {
				lab1.setText(lab4.getText());
				lab2.setText("*");
				lab4.setText("");
			}
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
		}
		if (e.getSource() == b14) // erase
		{
			lab1.setText("");
			lab2.setText("");
			lab3.setText("");
			lab4.setText("");
			lab5.setText("");
			lab6.setText("");
		}
		if (e.getSource() == b15) // :
		{
			lab5.setText("");
			lab6.setText("");
			if (lab1.getText().isEmpty() == false) {
				lab2.setText(":");
			}
			if (lab4.getText().isEmpty() == false) {
				lab1.setText(lab4.getText());
				lab2.setText(":");
				lab4.setText("");
			}
			if (lab1.getText().contains("=")) {
				lab1.setText(lab1.getText().substring(2));
			}
		}
		if (e.getSource() == b16) {
			lab1.setText(lab1.getText() + "²");
		}
		if (e.getSource() == b17) {
			if (lab1.getText().isEmpty() == false && lab2.getText().isEmpty() == true) {
				lab1.setText(lab1.getText().substring(0, lab1.getText().length() - 1));
			}
			if (lab2.getText().isEmpty() == false && lab3.getText().isEmpty() == true) {
				lab2.setText(lab2.getText().substring(0, lab2.getText().length() - 1));
			}
			if (lab2.getText().isEmpty() == false && lab3.getText().isEmpty() == false) {
				lab3.setText(lab3.getText().substring(0, lab3.getText().length() - 1));
			}
			if (lab1.getText().isEmpty() == true) {

			}
		}
	}

}
