package personal.darius.gtmass;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Portcullis extends JFrame {

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
					Portcullis frame = new Portcullis();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portcullis() {
		setTitle("Growtopia Mass - Portcullis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCutaway = new JLabel("Portcullis");
		lblCutaway.setBounds(10, 35, 63, 14);
		contentPane.add(lblCutaway);
		
		textField = new JTextField();
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
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		label_1.setBounds(20, 190, 164, 84);
		contentPane.add(label_1);
		
		JLabel lblItemNeeded = new JLabel("Item Needed :");
		lblItemNeeded.setBounds(206, 11, 117, 14);
		contentPane.add(lblItemNeeded);
		
		JLabel lblCosts = new JLabel("Costs :");
		lblCosts.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblCosts.setBounds(206, 159, 207, 27);
		
		
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
		
		JLabel lblNewLabel = new JLabel("Tresure Chest: ");
		lblNewLabel.setBounds(216, 40, 196, 14);
		lblNewLabel.setVisible(false);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ice: ");
		lblNewLabel_1.setBounds(216, 54, 196, 14);
		lblNewLabel_1.setVisible(false);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(206, 132, 218, 2);
		contentPane.add(separator_4);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(260, 213, 153, 38);
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
		
		JLabel lblNewLabel_3 = new JLabel("Dirt: ");
		lblNewLabel_3.setBounds(216, 68, 196, 14);
		lblNewLabel_3.setVisible(false);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblBrick = new JLabel("Brick:");
		lblBrick.setBounds(216, 82, 196, 14);
		lblBrick.setVisible(false);
		contentPane.add(lblBrick);
		
		JLabel lblLa = new JLabel("La:");
		lblLa.setBounds(216, 96, 199, 14);
		contentPane.add(lblLa);
		
		JLabel lblLe = new JLabel("Le:");
		lblLe.setBounds(216, 110, 197, 14);
		contentPane.add(lblLe);
		
		label_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblLe.setVisible(false);
		lblLa.setVisible(false);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main mains = new Main();
				mains.setVisible(true);
				mains.setLocationRelativeTo(null);
				mains.setResizable(false);
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			
			String tfg ;
			  String tfc ;
			
			public void actionPerformed(ActionEvent e) {
				tfg = textField.getText();
			    tfc = textField.getText();
				if(textField.getText().toString().equals("0") || textField.getText().toString().equals("") || textField.getText().toString().equals(" ") || textField.getText().toString().matches("[a-zA-Z]+")) {
					JOptionPane.showMessageDialog(Portcullis.this,
						    "Tree Amount Should Be 1 or More",
						    "Invalid Tree Amount",
						    JOptionPane.ERROR_MESSAGE);
				}
				if(!tfg.equals("0")) {
					try {
						
						int tfgg = Integer.parseInt(tfc.trim());
						// S TC
				        int trcs = tfgg * 5;                 
				        double trcp = 1.0 / 100;                
				        int trcc = (int) (trcp * trcs);
				        lblNewLabel.setText("Door: " + trcs);
				        lblNewLabel.setVisible(true);
				        // E TC
				        
				        // S Ice
				        int ices = tfgg * 3;                 
				        double icesz = 1.0 / 50.0;                
				        int icess = (int) (ices * icesz);
				        lblNewLabel_1.setText("Rock: " + ices);
				        lblNewLabel_1.setVisible(true);
				        // E Ice
				        
				        // S Dirt
				        int dirts = tfgg * 3;                 
				        double dirz = 1.0 / 400.0;                
				        int dorts = (int) (dirts * dirz);
				        lblNewLabel_3.setText("Cave Bg: " + dirts);
				        lblNewLabel_3.setVisible(true);
				        // E Brick
				        
				        int bricks = tfgg * 2;            
				        double bri = 1.0 / 100.0;                
				        int brieck = (int) (bricks * bri);
				        lblBrick.setText("Lava: " + bricks);
				        lblBrick.setVisible(true);
				        
				        int bg = tfgg * 2;                 
						double bgri = 1.0 / 200.0;                
						int brtt = (int) (bg * bgri);
						lblLe.setText("Rock Bg: " + bg);
						lblLe.setVisible(true);
						        
						int wn = tfgg * 3;                 
						double win = 1.0 / 40.0;                
						int wnn = (int) (wn * win);
						lblLa.setText("Window: " + wn);
						lblLa.setVisible(true);
				        
				        lblNewLabel_2.setVisible(true);
				        System.out.println("Hay" + brieck + " " + dorts +  "" + trcc + " " + icess);
				        lblNewLabel_2.setText(String.valueOf(brieck + dorts + trcc + icess + wnn + brtt));
				        label_1.setVisible(true);
				        
				        double x = (30.0 / 100.0) * tfgg;
				        int y = (int) (tfgg - x);
				        
				        label_1.setText(String.valueOf(tfgg - y));
                   } catch (NumberFormatException se) {

                   }
                }
			}
		});
		setVisible(true);
	}
}
