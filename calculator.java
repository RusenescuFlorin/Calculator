package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 325, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 286, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("R");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton.setBounds(10, 75, 58, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1.setBounds(10, 126, 58, 53);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x*Y");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 178, 58, 53);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x*3");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_3.setBounds(10, 230, 58, 53);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("x*2");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_4.setBounds(10, 282, 58, 53);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_5.setBounds(10, 334, 58, 53);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPlusMinus.setBounds(10, 387, 58, 53);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnNewButton_7 = new JButton("e*x");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_7.setBounds(67, 75, 58, 53);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnLogaritm = new JButton("Log");
		btnLogaritm.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnLogaritm.setBounds(67, 126, 58, 53);
		frame.getContentPane().add(btnLogaritm);
		
		JButton btnProcent = new JButton("%");
		btnProcent.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnProcent.setBounds(67, 178, 58, 53);
		frame.getContentPane().add(btnProcent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn7.setBounds(67, 230, 58, 53);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn4.setBounds(67, 282, 58, 53);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn1.setBounds(67, 334, 58, 53);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSin.setBounds(124, 75, 58, 53);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSinh.setBounds(124, 126, 58, 53);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCos.setBounds(181, 75, 58, 53);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnCosh.setBounds(181, 126, 58, 53);
		frame.getContentPane().add(btnCosh);
		
		JButton btnStergere = new JButton("C");
		btnStergere.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnStergere.setBounds(124, 178, 58, 53);
		frame.getContentPane().add(btnStergere);
		
		JButton btnNewButton_19 = new JButton("B");
		btnNewButton_19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_19.setBounds(181, 178, 58, 53);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn8.setBounds(124, 230, 58, 53);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn9.setBounds(181, 230, 58, 53);
		frame.getContentPane().add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn5.setBounds(124, 282, 58, 53);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn6.setBounds(181, 282, 58, 53);
		frame.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn2.setBounds(124, 334, 58, 53);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn3.setBounds(181, 334, 58, 53);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn0.setBounds(67, 387, 115, 53);
		frame.getContentPane().add(btn0);
		
		JButton btnPunct = new JButton(".");
		btnPunct.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPunct.setBounds(181, 387, 58, 53);
		frame.getContentPane().add(btnPunct);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTan.setBounds(238, 75, 58, 53);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnTanh.setBounds(238, 126, 58, 53);
		frame.getContentPane().add(btnTanh);
		
		JButton btnScadere = new JButton("+");
		btnScadere.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnScadere.setBounds(238, 178, 58, 53);
		frame.getContentPane().add(btnScadere);
		
		JButton btnAdunare = new JButton("-");
		btnAdunare.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnAdunare.setBounds(238, 230, 58, 53);
		frame.getContentPane().add(btnAdunare);
		
		JButton btnInmultire = new JButton("*");
		btnInmultire.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnInmultire.setBounds(238, 282, 58, 53);
		frame.getContentPane().add(btnInmultire);
		
		JButton btnImpartire = new JButton("/");
		btnImpartire.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnImpartire.setBounds(238, 334, 58, 53);
		frame.getContentPane().add(btnImpartire);
		
		JButton btnEgal = new JButton("=");
		btnEgal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnEgal.setBounds(238, 387, 58, 53);
		frame.getContentPane().add(btnEgal);
	}
}
