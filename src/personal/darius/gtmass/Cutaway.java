package personal.darius.gtmass;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Cutaway extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cutaway frame = new Cutaway();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cutaway() {
		setTitle("Growtopia Mass - Cutaway");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCutaway = new JLabel("Cutaway");
		lblCutaway.setBounds(10, 35, 63, 14);
		contentPane.add(lblCutaway);
		
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		textField = new JFormattedTextField(decimalFormat);
		
		textField.setBounds(83, 48, 101, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTreeAmount = new JLabel("Tree Amount :");
		lblTreeAmount.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblTreeAmount.setBounds(10, 51, 93, 14);
		contentPane.add(lblTreeAmount);
		
		JLabel lblSeedLoss = new JLabel("Seed Loss :");
		lblSeedLoss.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblSeedLoss.setBounds(10, 129, 283, 86);
		contentPane.add(lblSeedLoss);
		
		JLabel label_1 = new JLabel("0%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		label_1.setBounds(83, 190, 101, 84);
		contentPane.add(label_1);
		
		JLabel lblItemNeeded = new JLabel("Item Needed :");
		lblItemNeeded.setBounds(206, 11, 117, 14);
		contentPane.add(lblItemNeeded);
		
		JLabel lblCosts = new JLabel("Costs :");
		lblCosts.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblCosts.setBounds(206, 159, 167, 27);
		
		
		contentPane.add(lblCosts);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(194, 79+16+50, 11, 156);
		contentPane.add(separator);
		
		JSeparator separators = new JSeparator();
		separators.setOrientation(SwingConstants.VERTICAL);
		separators.setBounds(7, 95+50, 11, 156);
		contentPane.add(separators);
		
		JSeparator separatorss = new JSeparator();
		separatorss.setOrientation(SwingConstants.VERTICAL);
		separatorss.setBounds(423, 95+50, 11, 156);
		contentPane.add(separatorss);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 95+50, 417, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 250+50, 417, 2);
		contentPane.add(separator_5);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(206, 35, 218, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(206, 35, 1, 98);
		contentPane.add(separator_3);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(422, 36, 1, 98);
		contentPane.add(separator_10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(216, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(216, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(206, 132, 218, 2);
		contentPane.add(separator_4);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(260, 213, 63, 38);
		contentPane.add(lblNewLabel_2);
		
		JButton button = new JButton("< Back");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setBounds(10, 7, 89, 23);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setMargin(new Insets(0, 0, 0, 0));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setOpaque(false);
		contentPane.add(button);
		
		Button button_1 = new Button("Count");
		button_1.setBounds(114, 74, 70, 22);
		contentPane.add(button_1);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().toString().equals("0") || textField.getText().toString().equals("") || textField.getText().toString().equals(" ") || textField.getText().toString().matches("[a-zA-Z]+")) {
					JOptionPane.showMessageDialog(Cutaway.this,
						    "Tree Amount Should Be 1 or More",
						    "Invalid Tree Amount",
						    JOptionPane.ERROR_MESSAGE);
				}
				if(!textField.getText().toString().equals("0")) {
					
				}
			}
		});
		setVisible(true);
	}
}
