package calculatrice;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.border.LineBorder;

import javax.swing.border.AbstractBorder;

import java.awt.SystemColor;

public class Calculos1 {

	private JFrame frame;
	private JTextField textField;
	private String signe = "";
	double nombre = 0;
	boolean operatorPerced = false;
	boolean OnOffaction = false;
	double[] tb = new double[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculos1 window = new Calculos1();

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
	public Calculos1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);

		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 364, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		AbstractBorder brdrLeft0 = new TextBubbleBorder(Color.BLACK, 2, 10, 10);
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBackground(Color.BLACK);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(26, 47, 287, 50);
		textField.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		textField.setBorder(brdrLeft0);
		textField.setOpaque(true);
		panel.add(textField);
		textField.setColumns(10);

		/**
		 * Field bottom 1-9 and .
		 */

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}

					String title = textField.getText() + btn0.getText();
					textField.setText(title);

				}
			}
		});
		btn0.setBounds(26, 313, 50, 50);
		btn0.setBorder(brdrLeft0);
		btn0.setOpaque(true);
		panel.add(btn0);

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}

					String title = textField.getText() + btn1.getText();
					textField.setText(title);
				}
			}
		});

		btn1.setBounds(26, 263, 50, 50);
		btn1.setBorder(brdrLeft0);
		btn1.setOpaque(true);
		panel.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn2.getText();
					textField.setText(title);

				}
			}
		});
		btn2.setBounds(86, 263, 50, 50);
		btn2.setBorder(brdrLeft0);
		btn2.setOpaque(true);
		panel.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn3.getText();
					textField.setText(title);

				}
			}
		});
		btn3.setBounds(146, 263, 50, 50);
		btn3.setBorder(brdrLeft0);
		btn3.setOpaque(true);
		panel.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn4.getText();
					textField.setText(title);

				}
			}
		});
		btn4.setBounds(26, 214, 50, 50);
		btn4.setBorder(brdrLeft0);
		btn4.setOpaque(true);
		panel.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn5.getText();
					textField.setText(title);

				}
			}
		});
		btn5.setBounds(86, 214, 50, 50);
		btn5.setBorder(brdrLeft0);
		btn5.setOpaque(true);
		panel.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn6.getText();
					textField.setText(title);

				}
			}
		});
		btn6.setBounds(146, 214, 50, 50);
		btn6.setBorder(brdrLeft0);
		btn6.setOpaque(true);
		panel.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn7.getText();
					textField.setText(title);

				}
			}
		});

		btn7.setBounds(26, 165, 50, 50);
		btn7.setBorder(brdrLeft0);
		btn7.setOpaque(true);
		panel.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn8.getText();
					textField.setText(title);

				}
			}
		});

		btn8.setBounds(86, 165, 50, 50);
		btn8.setBorder(brdrLeft0);
		btn8.setOpaque(true);
		panel.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btn9.getText();
					textField.setText(title);

				}
			}

		});
		btn9.setBounds(146, 165, 50, 50);
		btn9.setBorder(brdrLeft0);
		btn9.setOpaque(true);
		panel.add(btn9);

		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (operatorPerced) {
						textField.setText("");
						operatorPerced = false;
					}
					String title = textField.getText() + btnPoint.getText();
					textField.setText(title);

				}
			}
		});
		btnPoint.setBounds(86, 312, 50, 50);
		btnPoint.setBorder(brdrLeft0);
		btnPoint.setOpaque(true);
		panel.add(btnPoint);
		/**
		 * Methods operator bottom
		 */
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					String newSigne = "+";
					calcul(newSigne);
					operatorPerced = true;

				}
			}
		});
		btnPlus.setBounds(206, 263, 50, 100);
		btnPlus.setBorder(brdrLeft0);
		btnPlus.setOpaque(true);
		panel.add(btnPlus);

		JButton btnMoins = new JButton("-");
		btnMoins.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					String newSigne = "-";
					calcul(newSigne);
					operatorPerced = true;

				}
			}
		});
		btnMoins.setBounds(266, 263, 50, 50);
		btnMoins.setBorder(brdrLeft0);
		btnMoins.setOpaque(true);
		panel.add(btnMoins);

		JButton btnMulti = new JButton("*");
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					String newSigne = "*";
					calcul(newSigne);
					operatorPerced = true;

				}
			}
		});
		btnMulti.setBounds(206, 214, 50, 50);
		btnMulti.setBorder(brdrLeft0);
		btnMulti.setOpaque(true);
		panel.add(btnMulti);

		JButton btnDiv = new JButton("\u00F7");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					String newSigne = "\u00F7";
					 roundResult();
					calcul(newSigne);
					operatorPerced = true;

				}
			}
		});
		btnDiv.setBounds(266, 214, 50, 50);
		btnDiv.setBorder(brdrLeft0);
		btnDiv.setOpaque(true);
		panel.add(btnDiv);

		JButton btnRacine = new JButton("\u221A");
		btnRacine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRacine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					double nombre = Math.sqrt(Double.parseDouble(textField.getText()));
					
					textField.setText("" + nombre);
				
					operatorPerced = true;

				}
			}
		});
		btnRacine.setBounds(266, 165, 50, 50);
		btnRacine.setBorder(brdrLeft0);
		btnRacine.setOpaque(true);
		panel.add(btnRacine);

		JButton btnPosNeg = new JButton("+/-");
		btnPosNeg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					double nombre = -Double.parseDouble(textField.getText());

					textField.setText("" + nombre);
					operatorPerced = true;
				}
			}
		});
		btnPosNeg.setBounds(146, 313, 50, 50);
		btnPosNeg.setBorder(brdrLeft0);
		btnPosNeg.setOpaque(true);
		panel.add(btnPosNeg);

		JButton btnPourcent = new JButton("%");
		btnPourcent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					double pourcent = ((Double.parseDouble(textField.getText()))) / 100;

					textField.setText("" + pourcent);

					operatorPerced = true;

				}
			}
		});
		btnPourcent.setBounds(206, 165, 50, 50);
		btnPourcent.setBorder(brdrLeft0);
		btnPourcent.setOpaque(true);
		panel.add(btnPourcent);
		/**
		 * Clear bottom
		 */
		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (OnOffaction == true) {
					textField.setText("0");
					operatorPerced = true;
				}
			}
		});
		btnCE.setBounds(206, 116, 50, 50);
		btnCE.setBorder(brdrLeft0);
		btnCE.setOpaque(true);
		panel.add(btnCE);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == false) {
					btnC.setBackground(Color.GREEN);
					btnC.setForeground(Color.RED);
					color();
					OnOffaction = true;

				}
				signe = "";
				textField.setText("");
				
				operatorPerced = true;

			}
		});
		btnC.setBackground(Color.RED);
		btnC.setForeground(Color.BLACK);

		btnC.setBounds(266, 116, 50, 50);
		btnC.setBorder(brdrLeft0);
		btnC.setOpaque(true);
		panel.add(btnC);

		/**
		 * Memory bottom
		 */

		JButton btnMminus = new JButton("M-");
		btnMminus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if (OnOffaction == true) {
						tb[0] = tb[0] - Double.parseDouble(textField.getText());
					
						operatorPerced = true;
					}

				}
			}
		});
		btnMminus.setBounds(146, 116, 50, 50);
		btnMminus.setBorder(brdrLeft0);
		btnMminus.setOpaque(true);
		panel.add(btnMminus);

		JButton btnMplus = new JButton("M+");
		btnMplus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					tb[0] = tb[0] + Double.parseDouble(textField.getText());
				
					operatorPerced = true;

				}
			}
		});
		btnMplus.setBounds(87, 116, 50, 50);
		btnMplus.setBorder(brdrLeft0);
		btnMplus.setOpaque(true);
		panel.add(btnMplus);

		JButton btnMplusValeur = new JButton("MRC");
		btnMplusValeur.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMplusValeur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					nombre = tb[0];
					textField.setText(roundResult());
				
					operatorPerced = true;

				}
			}
		});
		btnMplusValeur.setBounds(26, 116, 50, 50);
		btnMplusValeur.setBorder(brdrLeft0);
		btnMplusValeur.setOpaque(true);

		panel.add(btnMplusValeur);

		/**
		 * bottom for end sequence
		 */

		JButton btnequals = new JButton("=");
		btnequals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OnOffaction == true) {
					if ((textField.getText()).equals("")) {
						textField.setText("");
					} else {
						calcul("");
						textField.setText(roundResult());
						operatorPerced = true;

					}
				}
			}
		});
		btnequals.setBounds(266, 313, 50, 50);
		btnequals.setBorder(brdrLeft0);
		btnequals.setOpaque(true);
		panel.add(btnequals);

		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(brdrLeft0);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(SystemColor.textHighlight);

		btnNewButton.setBounds(100, 6, 134, 30);
		panel.add(btnNewButton);
	}

	public String roundResult() {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat df = new DecimalFormat("#.###", otherSymbols);
		String resultFormat = df.format(nombre);
		return resultFormat;
	}

	/**
	 * Calcul field
	 * 
	 */

	public void calcul(String signe2) {

		if (signe.equals("")) {
			nombre = Double.parseDouble(textField.getText());
			signe = signe2;
		}

		else if (signe.equals("+")) {
			nombre = nombre + Double.parseDouble(textField.getText());
			signe = signe2;
			textField.setText("" + nombre);
			System.out.println("i2=" + nombre + "");

		} else if (signe.equals("-")) {
			nombre = nombre - Double.parseDouble(textField.getText());
			signe = signe2;
			textField.setText("" + nombre);
			System.out.println("i2=" + nombre + "");

		} else if (signe.equals("*")) {
			nombre = nombre * Double.parseDouble(textField.getText());
			signe = signe2;
			textField.setText("" + nombre);
			System.out.println("i2=" + nombre + "");

		} else if (signe.equals("\u00F7")) {
			if (Double.parseDouble(textField.getText()) == 0) {
				textField.setText("Division par 0 : impossible");
			} else {
				nombre = nombre / Double.parseDouble(textField.getText());
				signe = signe2;
				textField.setText("" + nombre);
				System.out.println("i2=" + nombre + "");
			}
		} else if (signe.equals("+/-")) {
			nombre = -Double.parseDouble(textField.getText());
			signe = signe2;
			textField.setText("" + nombre);
			System.out.println("i2=" + nombre + "");
		}

		
		roundResult();
	}

	/**
	 * 
	 */
	public void color() {

		textField.setBackground(Color.CYAN);

	}

	/**
	 * 
	 * Method to create around bottom
	 *
	 */
	@SuppressWarnings("serial")
	class TextBubbleBorder extends AbstractBorder {

		private Color color;
		private int thickness = 4;
		private int radii = 8;
		private int pointerSize = 7;
		private Insets insets = null;
		private BasicStroke stroke = null;
		private int strokePad;
		private boolean left = true;
		RenderingHints hints;

		TextBubbleBorder(Color color) {
			this(color, 4, 8, 7);
		}

		TextBubbleBorder(Color color, int thickness, int radii, int pointerSize) {
			this.thickness = thickness;
			this.radii = radii;
			this.pointerSize = pointerSize;
			this.color = color;

			stroke = new BasicStroke(thickness);
			strokePad = thickness / 2;

			hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			int pad = radii + strokePad;
			int bottomPad = pad + pointerSize + strokePad;
			insets = new Insets(pad, pad, bottomPad, pad);
		}

		TextBubbleBorder(Color color, int thickness, int radii, int pointerSize, boolean left) {
			this(color, thickness, radii, pointerSize);
			this.left = left;
		}

		@Override
		public Insets getBorderInsets(Component c) {
			return insets;
		}

		@Override
		public Insets getBorderInsets(Component c, Insets insets) {
			return getBorderInsets(c);
		}

		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

			Graphics2D g2 = (Graphics2D) g;

			int bottomLineY = height - thickness - pointerSize;

			RoundRectangle2D.Double bubble = new RoundRectangle2D.Double(0 + strokePad, 0 + strokePad,
					width - thickness, bottomLineY, radii, radii);

			Polygon pointer = new Polygon();

			Area area = new Area(bubble);
			area.add(new Area(pointer));

			g2.setRenderingHints(hints);

			// Paint the BG color of the parent, everywhere outside the clip
			// of the text bubble.
			Component parent = c.getParent();
			if (parent != null) {
				Color bg = parent.getBackground();
				Rectangle rect = new Rectangle(0, 0, width, height);
				Area borderRegion = new Area(rect);
				borderRegion.subtract(area);
				g2.setClip(borderRegion);
				g2.setColor(bg);
				g2.fillRect(0, 0, width, height);
				g2.setClip(null);
			}

			g2.setColor(color);
			g2.setStroke(stroke);
			g2.draw(area);
		}
	}

}