package calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculos {

	private JFrame frame;
	private JTextField textField;
	private String operateur = "";
	double[] tab = {0,0,0};
	
	
	String[] signe = new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculos window = new calculos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(58, 43, 350, 50);
		panel.add(textField);
		textField.setColumns(10);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn0.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);

			}
		});
		btn0.setBounds(58, 382, 50, 50);
		panel.add(btn0);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String title = textField.getText() + btn1.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);
			}
		});

		btn1.setBounds(58, 321, 50, 50);
		panel.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn2.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);

			}
		});
		btn2.setBounds(140, 321, 50, 50);
		panel.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn3.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);
			}
		});
		btn3.setBounds(216, 321, 50, 50);
		panel.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn4.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);

			}
		});
		btn4.setBounds(58, 260, 50, 50);
		panel.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn5.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);
			}
		});
		btn5.setBounds(140, 260, 50, 50);
		panel.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn6.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);

			}
		});
		btn6.setBounds(216, 260, 50, 50);
		panel.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn7.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);

			}
		});

		btn7.setBounds(58, 199, 50, 50);
		panel.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn8.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);
			}
		});

		btn8.setBounds(140, 199, 50, 50);
		panel.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField.getText() + btn9.getText();
				textField.setText(title);
				tab[0] = Integer.parseInt(title);
				System.out.println(tab[0]);
			}

		});
		btn9.setBounds(216, 199, 50, 50);
		panel.add(btn9);

		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = btnPoint.getText();

				btnPoint.setText(title);
				textField.setText(title);

			}
		});
		btnPoint.setBounds(140, 382, 50, 50);
		panel.add(btnPoint);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operateur = "";
				textField.setText("");
				tab[0] = 0;
				tab[1] = 0;
				tab[2] = 0;

			}
		});
		btnC.setBackground(Color.GREEN);
		btnC.setForeground(Color.RED);
		btnC.setBounds(354, 137, 50, 50);
		panel.add(btnC);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				signe[0] = "+";
				tab[1] = tab[0];
				tab[2]=tab[0];
				calcul(signe[0]);
				String title = btnPlus.getText();
				
				
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]);
				btnPlus.setText(title);
				textField.setText("");

			}
		});
		btnPlus.setBounds(289, 321, 50, 111);
		panel.add(btnPlus);

		JButton btnMoins = new JButton("-");
		btnMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signe[0] = "-";
				tab[1] = tab[0];
				tab[2]=tab[0];
				calcul(signe[0]);
				String title = btnMoins.getText();
				
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]);
				btnMoins.setText(title);
			
				textField.setText("");

			}
		});
		btnMoins.setBounds(354, 321, 50, 50);
		panel.add(btnMoins);

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signe[0] = "*";
				tab[1]=1;
				tab[2]=tab[0];
				calcul(signe[0]);
				
				
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]+ "   tab2= " + tab[2]);
				String title = btnMulti.getText();
				btnMulti.setText(title);
				
				textField.setText("");

			}
		});
		btnMulti.setBounds(289, 260, 50, 50);
		panel.add(btnMulti);

		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signe[0] = "\u00F7";
				tab[1] = tab[0];
				tab[2]=tab[0];
				calcul(signe[0]);
				
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]+ "   tab2= " + tab[2]);
				String title = btnDiv.getText();
				btnDiv.setText(title);
				
				textField.setText("");

			}
		});
		btnDiv.setBounds(354, 260, 50, 50);
		panel.add(btnDiv);

		
		
		JButton btnRacine = new JButton("\u221A");
		btnRacine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signe[0] = "\u221A";
				tab[1] = tab[0];
				tab[2]=tab[0];
				calcul(signe[0]);
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]+ "   tab2= " + tab[2]);
				
				String title = btnRacine.getText();
				btnRacine.setText(title);
				textField.setText(String.valueOf(tab[0]));
				
			}
		});
		btnRacine.setBounds(354, 199, 50, 50);
		panel.add(btnRacine);

		JButton btnPosNeg = new JButton("+/-");
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signe[0] = "+/-";
				tab[1] = tab[0];
				tab[2]=tab[0];
				calcul(signe[0]);
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]+ "   tab2= " + tab[2]);
				
				String title = btnPosNeg.getText();
				btnPosNeg.setText(title);
				
				textField.setText("");
			}
		});
		btnPosNeg.setBounds(216, 382, 50, 50);
		panel.add(btnPosNeg);

		JButton btnPourcent = new JButton("%");
		btnPourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signe[0] = "%";
				tab[1] = tab[0];
				tab[2]=tab[0];
				calcul(signe[0]);
				System.out.println("tab0= " + tab[0] + "   tab1= " + tab[1]+ "   tab2= " + tab[2]);
				String title = btnPourcent.getText();

				btnPourcent.setText(title);
				textField.setText(title);
				textField.setText(String.valueOf(tab[0]));
				
			}
		});
		btnPourcent.setBounds(289, 199, 50, 50);
		panel.add(btnPourcent);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tab[1] = 0;
			}
		});
		btnCE.setBounds(289, 137, 50, 50);
		panel.add(btnCE);

		JButton btnMminus = new JButton("M-");
		btnMminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = btnMminus.getText();

				btnMminus.setText(title);
				textField.setText(title);
				operateur.equals(title);
			}
		});
		btnMminus.setBounds(214, 137, 50, 50);
		panel.add(btnMminus);

		JButton btnMplus = new JButton("M+");
		btnMplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = btnMplus.getText();

				btnMplus.setText(title);
				textField.setText(title);
				operateur.equals(title);
			}
		});
		btnMplus.setBounds(140, 137, 50, 50);
		panel.add(btnMplus);

		JButton btnMplusValeur = new JButton("MRC");
		btnMplusValeur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = btnMplusValeur.getText();

				btnMplusValeur.setText(title);
				operateur.equals(title);

			}
		});
		btnMplusValeur.setBounds(58, 138, 60, 50);
		panel.add(btnMplusValeur);

		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				String title = btnequals.getText();
				
				calcul(signe[0]);
				
				textField.setText(String.valueOf(tab[0]));
				System.out.printf("tab0= " + tab[0] + " tab1=" + tab[1] + "  tab2= " + tab[2] + "\n");

			}
		});
		btnequals.setBounds(354, 382, 50, 50);
		panel.add(btnequals);
	}

	public double calcul(String signe2) {
		if (signe2.equals(null)) {
			tab[0]=tab[0];
		}
		
		if (signe2.equals("+")) {

			tab[0] = tab[1] + tab[0];

		}
		if (signe2.equals("-")) {

			tab[0] = tab[1] - tab[0];
		}
		if (signe2.equals("*")) {

			tab[0] = tab[2] * tab[0];
		}
		if (signe2.equals("\u00F7")) {

			tab[0] = tab[1] / tab[0];
		}
		if   (signe2.equals("\u221A")) {
			tab[0]= Math.sqrt(tab[1]);
		}
		if   (signe2.equals("+/-")) {
			tab[0]=-tab[0];
		}
		if  (signe2.equals("%")) {
			tab[0]=tab[0]/100;
		}
		return tab[0];
	}

}
