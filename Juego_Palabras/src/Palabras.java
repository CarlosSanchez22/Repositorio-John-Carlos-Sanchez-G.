import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;

public class Palabras {

	private JFrame frame;
	public ArrayList<JLabel> labels = new ArrayList <JLabel>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palabras window = new Palabras();
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
	public Palabras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stu
				char ch3 = Character.toUpperCase(e.getKeyChar());
				String s = String.valueOf(ch3);
				System.out.println("ch3");
				
				for(Iterator iterator= labels.iterator(); iterator.hasNext();) {
					JLabel jlabel = (JLabel) iterator.next();
					
					System.out.println(jlabel.getText());
					
					if(jlabel.getText().equals(s)) {
						Random rand = new Random();
						float r = rand.nextFloat();
						float g = rand.nextFloat();
						float b = rand.nextFloat();
						
						jlabel.setBackground(new Color(r,g,b));
					}else {
						jlabel.setBackground(Color.LIGHT_GRAY);
					}
				}
				
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(124, 252, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Esperando");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		labels.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel_1);
		labels.add(lblNewLabel_1);
		
		JLabel lblNewLabel_31 = new JLabel("Palabra escribir");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblNewLabel_31);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_30 = new JLabel("Espacio");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_30);
		labels.add(lblNewLabel_30);
		
		JLabel lblNewLabel_2 = new JLabel("Borrando");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_2);
		labels.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 9, 1, 1));
		
		JLabel lblNewLabel_10 = new JLabel("Q");
		lblNewLabel_10.setBackground(new Color(192, 192, 192));
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_10);
		labels.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("W");
		lblNewLabel_11.setBackground(new Color(192, 192, 192));
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_11);
		labels.add(lblNewLabel_11);
		
		JLabel lblNewLabel_4 = new JLabel("E");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.LIGHT_GRAY);
		panel_2.add(lblNewLabel_4);
		labels.add(lblNewLabel_4);
		
		JLabel lblNewLabel_9 = new JLabel("R");
		lblNewLabel_9.setBackground(new Color(192, 192, 192));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setOpaque(true);
		panel_2.add(lblNewLabel_9);
		labels.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("T");
		lblNewLabel_12.setBackground(new Color(192, 192, 192));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setOpaque(true);
		panel_2.add(lblNewLabel_12);
		labels.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Y");
		lblNewLabel_13.setBackground(new Color(192, 192, 192));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setOpaque(true);
		panel_2.add(lblNewLabel_13);
		labels.add(lblNewLabel_13);
		
		JLabel lblNewLabel_18 = new JLabel("U");
		lblNewLabel_18.setBackground(new Color(192, 192, 192));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setOpaque(true);
		panel_2.add(lblNewLabel_18);
		labels.add(lblNewLabel_18);
		
		JLabel lblNewLabel_22 = new JLabel("I");
		lblNewLabel_22.setBackground(new Color(192, 192, 192));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setOpaque(true);
		panel_2.add(lblNewLabel_22);
		labels.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("O");
		lblNewLabel_23.setBackground(new Color(192, 192, 192));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setOpaque(true);
		panel_2.add(lblNewLabel_23);
		labels.add(lblNewLabel_23);
		
		JLabel lblNewLabel_14 = new JLabel("P");
		lblNewLabel_14.setBackground(new Color(192, 192, 192));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setOpaque(true);
		panel_2.add(lblNewLabel_14);
		labels.add(lblNewLabel_14);
		
		JLabel lblNewLabel_21 = new JLabel("A");
		lblNewLabel_21.setBackground(new Color(192, 192, 192));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setOpaque(true);
		panel_2.add(lblNewLabel_21);
		labels.add(lblNewLabel_21);
		
		JLabel lblNewLabel_8 = new JLabel("S");
		lblNewLabel_8.setBackground(new Color(192, 192, 192));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setOpaque(true);
		panel_2.add(lblNewLabel_8);
		labels.add(lblNewLabel_8);
		
		JLabel lblNewLabel_17 = new JLabel("D");
		lblNewLabel_17.setBackground(new Color(192, 192, 192));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setOpaque(true);
		panel_2.add(lblNewLabel_17);
		labels.add(lblNewLabel_17);
		
		JLabel lblNewLabel_16 = new JLabel("F");
		lblNewLabel_16.setBackground(new Color(192, 192, 192));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setOpaque(true);
		panel_2.add(lblNewLabel_16);
		labels.add(lblNewLabel_16);
		
		JLabel lblNewLabel_25 = new JLabel("G");
		lblNewLabel_25.setBackground(new Color(192, 192, 192));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setOpaque(true);
		panel_2.add(lblNewLabel_25);
		labels.add(lblNewLabel_25);
		
		JLabel lblNewLabel_7 = new JLabel("H");
		lblNewLabel_7.setBackground(new Color(192, 192, 192));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setOpaque(true);
		panel_2.add(lblNewLabel_7);
		labels.add(lblNewLabel_7);
		
		JLabel lblNewLabel_28 = new JLabel("J");
		lblNewLabel_28.setBackground(new Color(192, 192, 192));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setOpaque(true);
		panel_2.add(lblNewLabel_28);
		labels.add(lblNewLabel_28);
		
		JLabel lblNewLabel_6 = new JLabel("K");
		lblNewLabel_6.setBackground(new Color(192, 192, 192));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setOpaque(true);
		panel_2.add(lblNewLabel_6);
		labels.add(lblNewLabel_6);
		
		JLabel lblNewLabel_15 = new JLabel("L");
		lblNewLabel_15.setBackground(new Color(192, 192, 192));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setOpaque(true);
		panel_2.add(lblNewLabel_15);
		labels.add(lblNewLabel_15);
		
		JLabel lblNewLabel_5 = new JLabel("Ñ");
		lblNewLabel_5.setBackground(new Color(192, 192, 192));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setOpaque(true);
		panel_2.add(lblNewLabel_5);
		labels.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Z");
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setOpaque(true);
		panel_2.add(lblNewLabel_3);
		labels.add(lblNewLabel_3);
		
		JLabel lblNewLabel_19 = new JLabel("X");
		lblNewLabel_19.setBackground(new Color(192, 192, 192));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setOpaque(true);
		panel_2.add(lblNewLabel_19);
		labels.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("C");
		lblNewLabel_20.setBackground(new Color(192, 192, 192));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setOpaque(true);
		panel_2.add(lblNewLabel_20);
		labels.add(lblNewLabel_20);
		
		JLabel lblNewLabel_24 = new JLabel("V");
		lblNewLabel_24.setBackground(new Color(192, 192, 192));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setOpaque(true);
		panel_2.add(lblNewLabel_24);
		labels.add(lblNewLabel_24);
		
		JLabel lblNewLabel_26 = new JLabel("B");
		lblNewLabel_26.setBackground(new Color(192, 192, 192));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setOpaque(true);
		panel_2.add(lblNewLabel_26);
		labels.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("N");
		lblNewLabel_27.setBackground(new Color(192, 192, 192));
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setOpaque(true);
		panel_2.add(lblNewLabel_27);
		labels.add(lblNewLabel_27);
		
		JLabel lblNewLabel_29 = new JLabel("M");
		lblNewLabel_29.setBackground(new Color(192, 192, 192));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setOpaque(true);
		panel_2.add(lblNewLabel_29);
		labels.add(lblNewLabel_29);
		
		
		
		
		
	}

}
