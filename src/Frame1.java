import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private double firstNumber;
	private double secondNumber;
	private String operation;
	private double result;
	private String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
					window.frame.setTitle("Calculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 358, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton button = new JButton("7");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + button.getText();
				textField.setText(number);
			}
		});
		button.setBounds(20, 176, 50, 40);
		frame.getContentPane().add(button);

		JButton btnNewButton = new JButton("2");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setBounds(83, 278, 50, 40);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setBounds(20, 227, 50, 40);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("5");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setBounds(83, 227, 50, 40);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String number = textField.getText() + btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setBounds(20, 278, 50, 40);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setBounds(83, 176, 50, 40);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5.setBounds(148, 278, 50, 40);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setBounds(148, 227, 50, 40);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setBounds(148, 176, 50, 40);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnNewButton_8.setBounds(214, 278, 50, 40);
		frame.getContentPane().add(btnNewButton_8);

		JButton button_1 = new JButton("-");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		button_1.setBounds(274, 278, 50, 40);
		frame.getContentPane().add(button_1);

		JButton btnX = new JButton("*");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnX.setBounds(274, 227, 50, 40);
		frame.getContentPane().add(btnX);

		JButton button_2 = new JButton("/");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		button_2.setBounds(214, 227, 50, 40);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("=");
		button_3.setForeground(Color.RED);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;

				secondNumber = Double.parseDouble(textField.getText());

				if (operation == "+") {

					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);

					textField.setText(answer);

				}
				else if( operation == "-"){
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);

					textField.setText(answer);
				}

				else if( operation == "*"){
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);

					textField.setText(answer);
				}
				else if( operation == "/"){
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);

					textField.setText(answer);
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(214, 329, 110, 40);
		frame.getContentPane().add(button_3);

		JButton btnNewButton_9 = new JButton("\u221A");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sqrt(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnNewButton_9.setBounds(214, 176, 50, 40);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! textField.getText().contains("."))
		          {
		          textField.setText(textField.getText() + btnNewButton_10.getText());
		          }
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_10.setBounds(148, 329, 50, 40);
		frame.getContentPane().add(btnNewButton_10);

		JButton button_4 = new JButton("0");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + button_4.getText();
				textField.setText(number);
			}
		});
		button_4.setBounds(83, 329, 50, 40);
		frame.getContentPane().add(button_4);

		JButton btnCe = new JButton("CE");
		btnCe.setForeground(Color.RED);
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
			}
		});
		btnCe.setBounds(20, 329, 50, 40);
		frame.getContentPane().add(btnCe);

		JButton btnNewButton_11 = new JButton("x\u00B2");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * ops;
				textField.setText(String.valueOf(ops));
			}
		});
		btnNewButton_11.setBounds(274, 176, 50, 40);
		frame.getContentPane().add(btnNewButton_11);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(Color.BLACK);
		textField.setBounds(20, 30, 304, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton button_5 = new JButton("+/-");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * -1;
				textField.setText(String.valueOf(ops));

			}
		});
		button_5.setBounds(204, 126, 60, 40);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("%");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		button_6.setBounds(274, 125, 50, 40);
		frame.getContentPane().add(button_6);

		JButton btnSinX = new JButton("sin");
		btnSinX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSinX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sin(ops);
				textField.setText(String.valueOf(ops));

			}
		});
		btnSinX.setBounds(138, 125, 60, 40);
		frame.getContentPane().add(btnSinX);

		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.cos(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnCos.setBounds(73, 125, 60, 40);
		frame.getContentPane().add(btnCos);

		JButton btnNewButton_12 = new JButton("C");
		btnNewButton_12.setForeground(Color.RED);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backSpace = null;

				if (textField.getText().length() > 0) {

					StringBuilder bld = new StringBuilder(textField.getText());

					bld.deleteCharAt(textField.getText().length() - 1);
					backSpace = bld.toString();
					textField.setText(backSpace);
					;

				}
			}
		});
		btnNewButton_12.setBounds(20, 125, 45, 40);
		frame.getContentPane().add(btnNewButton_12);
	}
}
