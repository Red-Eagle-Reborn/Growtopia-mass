package personal.darius.gtmass;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Main() {		    
		setTitle("Growtopia Mass");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCopyright = new JLabel("Copyright \u00A9 2015 Darius Ellert Klaus");
		lblCopyright.setBounds(10, 179, 253, 14);
		contentPane.add(lblCopyright);
		
		Button btnCow = new Button("Cow");
		btnCow.setBounds(10, 11, 89, 23);
		contentPane.add(btnCow);
		
		Button btnBulletinBoard = new Button("Bulletin Board");
		btnBulletinBoard.setEnabled(false);
		btnBulletinBoard.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBulletinBoard.setBounds(109, 11, 95, 23);
		contentPane.add(btnBulletinBoard);
		
		Button btnChandelier = new Button("Portcullis");
		btnChandelier.setBounds(10, 45, 89, 23);
		contentPane.add(btnChandelier);
		
		Button btnChicken = new Button("Chicken");
		btnChicken.setBounds(10, 79, 89, 23);
		contentPane.add(btnChicken);
		
		Button btnScienceStat = new Button("Science Stat");
		btnScienceStat.setEnabled(false);
		btnScienceStat.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnScienceStat.setBounds(109, 45, 95, 23);
		contentPane.add(btnScienceStat);
		
		Button btnCheckpoint = new Button("Chandelier");
		btnCheckpoint.setEnabled(false);
		btnCheckpoint.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCheckpoint.setBounds(109, 79, 95, 23);
		contentPane.add(btnCheckpoint);
		
		Button btnCloudstone = new Button("Cloudstone");
		btnCloudstone.setEnabled(false);
		btnCloudstone.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCloudstone.setBounds(109, 113, 95, 23);
		contentPane.add(btnCloudstone);
		
		Button btnNewButton = new Button("Cutaway");
		btnNewButton.setBounds(10, 113, 89, 23);
		contentPane.add(btnNewButton);
		
		Button btnCoffeMaker = new Button("Coffe Maker");
		btnCoffeMaker.setEnabled(false);
		btnCoffeMaker.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCoffeMaker.setBounds(109, 145, 95, 23);
		contentPane.add(btnCoffeMaker);
		
		Button btnDragonGate = new Button("Ice");
		btnDragonGate.setEnabled(false);
		btnDragonGate.setBounds(10, 147, 89, 23);
		contentPane.add(btnDragonGate);
		
		Button btnNewButton_1 = new Button("Display Box");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(214, 11, 95, 23);
		contentPane.add(btnNewButton_1);
		
		Button btnNewButton_2 = new Button("Dragon Gate");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.setBounds(214, 45, 95, 23);
		contentPane.add(btnNewButton_2);
		
		Button button = new Button("Checkpoint");
		button.setEnabled(false);
		button.setBounds(214, 79, 95, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Dreamstone");
		button_1.setEnabled(false);
		button_1.setBounds(214, 113, 95, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("House Entrance");
		button_2.setEnabled(false);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_2.setBounds(214, 145, 95, 22);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Gold Block");
		button_3.setEnabled(false);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		button_3.setBounds(319, 11, 95, 23);
		contentPane.add(button_3);
		
		Button button_4 = new Button("Leather Jacket");
		button_4.setEnabled(false);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 9));
		button_4.setBounds(319, 45, 95, 22);
		contentPane.add(button_4);
		
		Button button_5 = new Button("Magic Bacon");
		button_5.setEnabled(false);
		button_5.setBounds(319, 79, 95, 22);
		contentPane.add(button_5);
		
		Button button_6 = new Button("Mannequin");
		button_6.setEnabled(false);
		button_6.setBounds(319, 113, 95, 22);
		contentPane.add(button_6);
		
		Button button_7 = new Button("Military Radio");
		button_7.setEnabled(false);
		button_7.setBounds(319, 145, 95, 22);
		contentPane.add(button_7);
		
		Button button_8 = new Button("The Darkness");
		button_8.setEnabled(false);
		button_8.setBounds(424, 11, 95, 22);
		contentPane.add(button_8);
		
		Button button_9 = new Button("Toxic Barrel");
		button_9.setEnabled(false);
		button_9.setBounds(424, 45, 95, 22);
		contentPane.add(button_9);
		
		Button button_10 = new Button("Treasure Chest");
		button_10.setEnabled(false);
		button_10.setBounds(424, 80, 95, 22);
		contentPane.add(button_10);
		
		btnChicken.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Chicken mains = new Chicken();
				mains.setLocationRelativeTo(null);
				mains.setResizable(false);
			}
		});
		
		btnChandelier.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Portcullis mains = new Portcullis();
				mains.setLocationRelativeTo(null);
				mains.setResizable(false);
			}
		});
		
		btnNewButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Cutaway mains = new Cutaway();
				mains.setLocationRelativeTo(null);
				mains.setResizable(false);
			}
		});
		
		btnCow.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Cow mains = new Cow();
				mains.setLocationRelativeTo(null);
				mains.setResizable(false);
			}
		});
		contentPane.setVisible(true);
	}
}
