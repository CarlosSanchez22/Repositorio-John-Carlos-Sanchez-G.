import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.TableView.TableRow;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class Pacman {

	private JFrame frame;
	public int speed = 10;
	public int pac_x = 220, pac_y = 190, numero=0, puntos=0;
	public elemet pacman = new elemet(pac_x, pac_y, 30, 30, Color.yellow);
	public elemet pared1 = new elemet(4, 0, 175, 10, Color.decode("#1336F7"));
	public elemet pared2 = new elemet(466, 0, 175, 10, Color.decode("#1336F7"));
	public elemet pared3 = new elemet(15, 0, 10, 450, Color.decode("#1336F7"));
	public elemet pared4 = new elemet(4, 215, 170, 10, Color.decode("#1336F7"));
	public elemet pared5 = new elemet(466, 215, 170, 10, Color.decode("#1336F7"));
	public elemet pared6 = new elemet(15, 375, 10, 450, Color.decode("#1336F7"));

	// derecha
	public elemet pared8 = new elemet(395, 165, 10, 70, Color.decode("#1336F7"));
	public elemet pared14 = new elemet(395, 135, 10, 70, Color.decode("#1336F7"));
	public elemet pared15 = new elemet(385, 135, 40, 10, Color.decode("#1336F7"));

	// izquierda
	public elemet pared9 = new elemet(15, 135, 10, 70, Color.decode("#1336F7"));
	public elemet pared7 = new elemet(15, 165, 10, 70, Color.decode("#1336F7"));
	public elemet pared16 = new elemet(85, 135, 40, 10, Color.decode("#1336F7"));

	// cuadritos izquierda
	public elemet pared10 = new elemet(55, 40, 20, 50, Color.decode("#1336F7"));
	public elemet pared11 = new elemet(55, 90, 10, 50, Color.decode("#1336F7"));

	public elemet pared12 = new elemet(145, 40, 20, 50, Color.decode("#1336F7"));
	public elemet pared13 = new elemet(145, 90, 85, 10, Color.decode("#1336F7"));

	// izquierda abajo
	public elemet pared17 = new elemet(15, 215, 10, 70, Color.decode("#1336F7"));
	public elemet pared18 = new elemet(15, 245, 10, 70, Color.decode("#1336F7"));
	public elemet pared19 = new elemet(85, 215, 40, 10, Color.decode("#1336F7"));

	// derecha abajo
	public elemet pared20 = new elemet(395, 245, 10, 70, Color.decode("#1336F7"));
	public elemet pared21 = new elemet(395, 215, 10, 70, Color.decode("#1336F7"));
	public elemet pared22 = new elemet(385, 215, 40, 10, Color.decode("#1336F7"));

	// medio
	public elemet pared23 = new elemet(235, 10, 50, 10, Color.decode("#1336F7"));
	public elemet pared24 = new elemet(235, 290, 50, 10, Color.decode("#1336F7"));

	// cuadritos derecha
	public elemet pared25 = new elemet(285, 40, 20, 50, Color.decode("#1336F7"));
	public elemet pared26 = new elemet(375, 90, 10, 50, Color.decode("#1336F7"));

	public elemet pared27 = new elemet(375, 40, 20, 50, Color.decode("#1336F7"));
	public elemet pared28 = new elemet(325, 90, 85, 10, Color.decode("#1336F7"));

	// cuadritos izquierda abajo
	public elemet pared29 = new elemet(55, 330, 10, 140, Color.decode("#1336F7"));
	public elemet pared30 = new elemet(130, 280, 50, 10, Color.decode("#1336F7"));

	public elemet pared31 = new elemet(55, 290, 10, 40, Color.decode("#1336F7"));
	public elemet pared32 = new elemet(180, 280, 10, 120, Color.decode("#1336F7"));

	// cuadritos derecha abajo
	public elemet pared33 = new elemet(285, 330, 10, 140, Color.decode("#1336F7"));
	public elemet pared34 = new elemet(340, 280, 50, 10, Color.decode("#1336F7"));

	public elemet pared35 = new elemet(390, 290, 10, 40, Color.decode("#1336F7"));
	public elemet pared36 = new elemet(190, 90, 10, 100, Color.decode("#1336F7"));
	
	public elemet pared37 = new elemet(190, 230, 10, 100, Color.decode("#1336F7"));
	
	//centro
	public elemet pared38 = new elemet(190, 230, 10, 100, Color.decode("#1336F7"));
	public elemet pared39 = new elemet(190, 180, 10, 30, Color.decode("#1336F7"));
	public elemet pared40 = new elemet(260, 180, 10, 30, Color.decode("#1336F7"));
	public elemet pared43 = new elemet(190, 190, 40, 10, Color.decode("#1336F7"));
	public elemet pared44 = new elemet(280, 190, 40, 10, Color.decode("#1336F7"));
	
	public elemet pared41 = new elemet(145, 215, 30, 10, Color.decode("#1336F7"));
	public elemet pared42 = new elemet(325, 215, 30, 10, Color.decode("#1336F7"));
	public elemet pared45 = new elemet(190, 130, 10, 100, Color.decode("#1336F7"));

	// limites
	public elemet limEje_x = new elemet(-10, 90, 190, 10, Color.decode("#000000"));
	public elemet limEje_x2 = new elemet(480, 90, 190, 10, Color.decode("#000000"));
	
	//bolitas
	public elemet bolita1 = new elemet(30, 25, 5, 5, Color.yellow);
	public elemet bolita2 = new elemet(30, 55, 5, 5, Color.yellow);
	public elemet bolita3 = new elemet(30, 85, 5, 5, Color.yellow);
	public elemet bolita4 = new elemet(30, 115, 5, 5, Color.yellow);
	public elemet bolita5 = new elemet(60, 115, 5, 5, Color.yellow);
	public elemet bolita6 = new elemet(90, 115, 5, 5, Color.yellow);
	public elemet bolita7 = new elemet(120, 115, 5, 5, Color.yellow);
	public elemet bolita8 = new elemet(120, 145, 5, 5, Color.yellow);
	public elemet bolita9 = new elemet(120, 175, 5, 5, Color.yellow);
	
	public elemet bolita10 = new elemet(120, 205, 5, 5, Color.yellow);
	public elemet bolita11 = new elemet(120, 235, 5, 5, Color.yellow);
	public elemet bolita12 = new elemet(120, 265, 5, 5, Color.yellow);
	public elemet bolita13 = new elemet(120, 295, 5, 5, Color.yellow);
	
	public elemet bolita14 = new elemet(120, 315, 5, 5, Color.yellow);
	public elemet bolita15 = new elemet(90, 315, 5, 5, Color.yellow);
	public elemet bolita16 = new elemet(60, 315, 5, 5, Color.yellow);
	public elemet bolita17 = new elemet(30, 315, 5, 5, Color.yellow);
	public elemet bolita18 = new elemet(30, 295, 5, 5, Color.yellow);
	public elemet bolita19 = new elemet(30, 265, 5, 5, Color.yellow);
	public elemet bolita20 = new elemet(60, 265, 5, 5, Color.yellow);
	
	public elemet bolita21 = new elemet(90, 265, 5, 5, Color.yellow);
	public elemet bolita22 = new elemet(30, 315, 5, 5, Color.yellow);
	public elemet bolita23 = new elemet(30, 345, 5, 5, Color.yellow);
	public elemet bolita24 = new elemet(60, 355, 5, 5, Color.yellow);
	public elemet bolita25 = new elemet(90, 355, 5, 5, Color.yellow);
	public elemet bolita26 = new elemet(120, 355, 5, 5, Color.yellow);
	public elemet bolita27 = new elemet(150, 355, 5, 5, Color.yellow);
	public elemet bolita28 = new elemet(180, 355, 5, 5, Color.yellow);
	public elemet bolita29 = new elemet(210, 355, 5, 5, Color.yellow);
	public elemet bolita30 = new elemet(240, 355, 5, 5, Color.yellow);
	
	public elemet bolita39 = new elemet(270, 355, 5, 5, Color.yellow);
	public elemet bolita31 = new elemet(300, 355, 5, 5, Color.yellow);
	public elemet bolita32 = new elemet(330, 355, 5, 5, Color.yellow);
	public elemet bolita33 = new elemet(360, 355, 5, 5, Color.yellow);
	public elemet bolita34 = new elemet(390, 355, 5, 5, Color.yellow);
	public elemet bolita35 = new elemet(420, 355, 5, 5, Color.yellow);
	public elemet bolita36 = new elemet(450, 355, 5, 5, Color.yellow);
	public elemet bolita37 = new elemet(450, 325, 5, 5, Color.yellow);
	public elemet bolita38 = new elemet(450, 295, 5, 5, Color.yellow);
	public elemet bolita40 = new elemet(450, 265, 5, 5, Color.yellow);
	
	public elemet bolita41 = new elemet(420, 265, 5, 5, Color.yellow);
	public elemet bolita42 = new elemet(390, 265, 5, 5, Color.yellow);
	public elemet bolita43 = new elemet(360, 265, 5, 5, Color.yellow);
	public elemet bolita44 = new elemet(330, 265, 5, 5, Color.yellow);
	public elemet bolita45 = new elemet(300, 265, 5, 5, Color.yellow);
	public elemet bolita46 = new elemet(270, 265, 5, 5, Color.yellow);
	public elemet bolita47 = new elemet(240, 265, 5, 5, Color.yellow);
	public elemet bolita48 = new elemet(210, 265, 5, 5, Color.yellow);
	public elemet bolita49 = new elemet(180, 265, 5, 5, Color.yellow);
	public elemet bolita50 = new elemet(150, 265, 5, 5, Color.yellow);
	
	
	public elemet bolita51 = new elemet(360, 235, 5, 5, Color.yellow);
	public elemet bolita52 = new elemet(360, 205, 5, 5, Color.yellow);
	public elemet bolita54 = new elemet(360, 175, 5, 5, Color.yellow);
	public elemet bolita55 = new elemet(360, 145, 5, 5, Color.yellow);
	public elemet bolita56 = new elemet(360, 115, 5, 5, Color.yellow);
	public elemet bolita57 = new elemet(360, 85, 5, 5, Color.yellow);
	public elemet bolita53 = new elemet(360, 55, 5, 5, Color.yellow);
	
	public elemet bolita58 = new elemet(390, 25, 5, 5, Color.yellow);
	public elemet bolita59 = new elemet(420, 25, 5, 5, Color.yellow);
	public elemet bolita60 = new elemet(450, 25, 5, 5, Color.yellow);
	
	public elemet bolita61 = new elemet(360, 25, 5, 5, Color.yellow);
	public elemet bolita62 = new elemet(330, 25, 5, 5, Color.yellow);
	public elemet bolita63 = new elemet(300, 25, 5, 5, Color.yellow);
	public elemet bolita64 = new elemet(270, 25, 5, 5, Color.yellow);
	
	
	public elemet bolita65 = new elemet(200, 25, 5, 5, Color.yellow);
	public elemet bolita66 = new elemet(170, 25, 5, 5, Color.yellow);
	public elemet bolita67 = new elemet(140, 25, 5, 5, Color.yellow);
	public elemet bolita68 = new elemet(110, 25, 5, 5, Color.yellow);
	public elemet bolita69 = new elemet(80, 25, 5, 5, Color.yellow);
	public elemet bolita70 = new elemet(50, 25, 5, 5, Color.yellow);
	
	
	public elemet bolita71 = new elemet(450, 25, 5, 5, Color.yellow);
	public elemet bolita72 = new elemet(450, 55, 5, 5, Color.yellow);
	public elemet bolita73 = new elemet(450, 85, 5, 5, Color.yellow);
	public elemet bolita74 = new elemet(450, 115, 5, 5, Color.yellow);
	public elemet bolita75 = new elemet(420, 115, 5, 5, Color.yellow);
	
	public elemet bolita76 = new elemet(390, 115, 5, 5, Color.yellow);
	public elemet bolita77 = new elemet(360, 295, 5, 5, Color.yellow);
	public elemet bolita78 = new elemet(360, 315, 5, 5, Color.yellow);
	public elemet bolita79 = new elemet(390, 315, 5, 5, Color.yellow);
	public elemet bolita80 = new elemet(420, 315, 5, 5, Color.yellow);
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
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
	public Pacman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel tablero = new JPanel();

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Puntos: " + puntos);
		panel.add(lblNewLabel);
		
		
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyCode());
				if (e.getKeyCode() == 38) {
					pacman.y -= speed;
				}
				if (e.getKeyCode() == 40) {
					pacman.y += speed;
				}
				if (e.getKeyCode() == 37) {
					pacman.x -= speed;
				}
				if (e.getKeyCode() == 39) {
					pacman.x += speed;
				}

				if (pacman.tocando(pared1) || pacman.tocando(pared2) || pacman.tocando(pared3) || pacman.tocando(pared4)
						|| pacman.tocando(pared5) || pacman.tocando(pared6) || pacman.tocando(pared7)
						|| pacman.tocando(pared8) || pacman.tocando(pared9) || pacman.tocando(pared10)
						|| pacman.tocando(pared11) || pacman.tocando(pared12) || pacman.tocando(pared13)
						|| pacman.tocando(pared14) || pacman.tocando(pared15) || pacman.tocando(pared16)
						|| pacman.tocando(pared17) || pacman.tocando(pared18) || pacman.tocando(pared19)
						|| pacman.tocando(pared20) || pacman.tocando(pared21) || pacman.tocando(pared22)
						|| pacman.tocando(pared23) || pacman.tocando(pared24) || pacman.tocando(pared25)
						|| pacman.tocando(pared26) || pacman.tocando(pared27) || pacman.tocando(pared28)
						|| pacman.tocando(pared29) || pacman.tocando(pared30) || pacman.tocando(pared31)
						|| pacman.tocando(pared32) || pacman.tocando(pared33) || pacman.tocando(pared34)
						|| pacman.tocando(pared35) || pacman.tocando(pared36) || pacman.tocando(pared37)
						|| pacman.tocando(pared38) || pacman.tocando(pared39) || pacman.tocando(pared40)
						|| pacman.tocando(pared41) || pacman.tocando(pared42) || pacman.tocando(pared43)
						|| pacman.tocando(pared44) || pacman.tocando(pared45)) {
					if (e.getKeyCode() == 38) {
						pacman.y += speed;
					}
					if (e.getKeyCode() == 37) {
						pacman.x += speed;
					}
					if (e.getKeyCode() == 40) {
						pacman.y -= speed;
					}
					if (e.getKeyCode() == 39) {
						pacman.x -= speed;
					}

				}
				
				
				if (pacman.tocando(bolita1) || pacman.tocando(bolita2) || pacman.tocando(bolita3) || pacman.tocando(bolita4)
				  ||pacman.tocando(bolita5) || pacman.tocando(bolita6) || pacman.tocando(bolita7) || pacman.tocando(bolita8)
				  ||pacman.tocando(bolita9) || pacman.tocando(bolita10) || pacman.tocando(bolita11) || pacman.tocando(bolita12)
				  ||pacman.tocando(bolita13) || pacman.tocando(bolita14) || pacman.tocando(bolita15) || pacman.tocando(bolita16)
				  ||pacman.tocando(bolita17) || pacman.tocando(bolita18) || pacman.tocando(bolita19) || pacman.tocando(bolita20)
				  ||pacman.tocando(bolita21) || pacman.tocando(bolita22) || pacman.tocando(bolita23) || pacman.tocando(bolita24)
				  ||pacman.tocando(bolita25) || pacman.tocando(bolita26) || pacman.tocando(bolita27) || pacman.tocando(bolita28)
				  ||pacman.tocando(bolita29) || pacman.tocando(bolita30) || pacman.tocando(bolita31) || pacman.tocando(bolita32)
				  ||pacman.tocando(bolita33) || pacman.tocando(bolita34) || pacman.tocando(bolita35) || pacman.tocando(bolita36)
						) {
					puntos++;
					lblNewLabel.setText("Puntos: "+puntos);
					
					panel.repaint();
					panel.revalidate();
				}
				
				
				
				
				
				//desaparecer las bolitas
				if (pacman.tocando(bolita1)) {numero = bolita1.y;
					if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita1.y =  500 ;}
					Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
							if (tik == 0) {tik = 1;} else {bolita1.y =numero;
								tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita2)) {numero = bolita2.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita2.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita2.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita3)) {numero = bolita3.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita3.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita3.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita4)) {numero = bolita4.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita4.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita4.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita5)) {numero = bolita5.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita5.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita5.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita6)) {numero = bolita6.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita6.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita6.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita7)) {numero = bolita7.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita7.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita7.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita8)) {numero = bolita8.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita8.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita8.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita9)) {numero = bolita9.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita9.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita9.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita10)) {numero = bolita10.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita10.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita10.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita11)) {numero = bolita11.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita11.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita11.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				if (pacman.tocando(bolita12)) {numero = bolita12.y;
				if (e.getKeyCode() == 38 ||e.getKeyCode() == 37 ||e.getKeyCode() == 40 || e.getKeyCode() == 39) {bolita12.y =  500 ;}
				Timer timer = new Timer();TimerTask task = new TimerTask() {int tik = 0;@Override public void run() {
						if (tik == 0) {tik = 1;} else {bolita12.y =numero;
							tablero.revalidate();tablero.repaint();timer.cancel();}}};timer.schedule(task, 10, 2000);}
				
				
				
				
				

				if (pacman.tocando(limEje_x)) {
					if (e.getKeyCode() == 37) {
						pacman.x = 450;
					}
				}

				if (pacman.tocando(limEje_x2)) {
					if (e.getKeyCode() == 39) {
						pacman.x = 0;
					}
				}

				tablero.repaint();
			}
		});
		frame.setFocusable(true);
		frame.requestFocus();

		

		tablero.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);

		tablero.add(new MyGraphics());
		panel.repaint();
		panel.revalidate();
		
	}

	public class MyGraphics extends JComponent {

		private static final long serialVersionUID = 1L;

		MyGraphics() {
			setPreferredSize(new Dimension(480, 420));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			// fondo
			g.setColor(Color.decode("#000000"));
			g.fillRect(0, 0, 480, 420);

			// Pacman
			g.setColor(pacman.c);
			g.fillArc(pacman.x, pacman.y, pacman.w, pacman.h, 0, 360);

			// paredes
			g.setColor(pared1.c);
			g.drawRect(pared1.x, pared1.y, pared1.w, pared1.h);
			g.setColor(pared2.c);
			g.drawRect(pared2.x, pared2.y, pared2.w, pared2.h);
			g.setColor(pared3.c);
			g.drawRect(pared3.x, pared3.y, pared3.w, pared3.h);
			g.drawRect(pared4.x, pared4.y, pared4.w, pared4.h);
			g.drawRect(pared5.x, pared5.y, pared5.w, pared5.h);
			g.drawRect(pared6.x, pared6.y, pared6.w, pared6.h);
			g.drawRect(pared7.x, pared7.y, pared7.w, pared7.h);
			g.drawRect(pared8.x, pared8.y, pared8.w, pared8.h);
			g.drawRect(pared9.x, pared9.y, pared9.w, pared9.h);
			g.drawRect(pared10.x, pared10.y, pared10.w, pared10.h);
			g.drawRect(pared11.x, pared11.y, pared11.w, pared11.h);
			g.drawRect(pared12.x, pared12.y, pared12.w, pared12.h);
			g.drawRect(pared13.x, pared13.y, pared13.w, pared13.h);
			g.drawRect(pared14.x, pared14.y, pared14.w, pared14.h);
			g.drawRect(pared15.x, pared15.y, pared15.w, pared15.h);
			g.drawRect(pared16.x, pared16.y, pared16.w, pared16.h);
			g.drawRect(pared17.x, pared17.y, pared17.w, pared17.h);
			g.drawRect(pared18.x, pared18.y, pared18.w, pared18.h);
			g.drawRect(pared19.x, pared19.y, pared19.w, pared19.h);
			g.drawRect(pared20.x, pared20.y, pared20.w, pared20.h);
			g.drawRect(pared21.x, pared21.y, pared21.w, pared21.h);
			g.drawRect(pared22.x, pared22.y, pared22.w, pared22.h);
			g.drawRect(pared23.x, pared23.y, pared23.w, pared23.h);
			g.drawRect(pared24.x, pared24.y, pared24.w, pared24.h);
			g.drawRect(pared25.x, pared25.y, pared25.w, pared25.h);
			g.drawRect(pared26.x, pared26.y, pared26.w, pared26.h);
			g.drawRect(pared27.x, pared27.y, pared27.w, pared27.h);
			g.drawRect(pared28.x, pared28.y, pared28.w, pared28.h);
			g.drawRect(pared29.x, pared29.y, pared29.w, pared29.h);
			g.drawRect(pared30.x, pared30.y, pared30.w, pared30.h);
			g.drawRect(pared31.x, pared31.y, pared31.w, pared31.h);
			g.drawRect(pared32.x, pared32.y, pared32.w, pared32.h);
			g.drawRect(pared33.x, pared33.y, pared33.w, pared33.h);
			g.drawRect(pared34.x, pared34.y, pared34.w, pared34.h);
			g.drawRect(pared35.x, pared35.y, pared35.w, pared35.h);
			g.drawRect(pared36.x, pared36.y, pared36.w, pared36.h);
			g.drawRect(pared37.x, pared37.y, pared37.w, pared37.h);
			g.drawRect(pared38.x, pared38.y, pared38.w, pared38.h);
			g.drawRect(pared39.x, pared39.y, pared39.w, pared39.h);
			g.drawRect(pared40.x, pared40.y, pared40.w, pared40.h);
			g.drawRect(pared41.x, pared41.y, pared41.w, pared41.h);
			g.drawRect(pared42.x, pared42.y, pared42.w, pared42.h);
			g.drawRect(pared43.x, pared43.y, pared43.w, pared43.h);
			g.drawRect(pared44.x, pared44.y, pared44.w, pared44.h);
			g.drawRect(pared45.x, pared45.y, pared45.w, pared45.h);
			
			//bolitas
			g.setColor(bolita1.c);
			g.fillOval(bolita1.x, bolita1.y, bolita1.w, bolita1.h);
			g.fillOval(bolita2.x, bolita2.y, bolita2.w, bolita2.h);
			g.fillOval(bolita3.x, bolita3.y, bolita3.w, bolita3.h);
			g.fillOval(bolita4.x, bolita4.y, bolita4.w, bolita4.h);
			g.fillOval(bolita5.x, bolita5.y, bolita5.w, bolita5.h);
			g.fillOval(bolita6.x, bolita6.y, bolita6.w, bolita6.h);
			g.fillOval(bolita7.x, bolita7.y, bolita7.w, bolita7.h);
			g.fillOval(bolita8.x, bolita8.y, bolita8.w, bolita8.h);
			g.fillOval(bolita9.x, bolita9.y, bolita9.w, bolita9.h);
			
			
			g.fillOval(bolita10.x, bolita10.y, bolita10.w, bolita10.h);
			g.fillOval(bolita11.x, bolita11.y, bolita11.w, bolita11.h);
			g.fillOval(bolita12.x, bolita12.y, bolita12.w, bolita12.h);
			g.fillOval(bolita13.x, bolita13.y, bolita13.w, bolita13.h);
			g.fillOval(bolita14.x, bolita14.y, bolita14.w, bolita14.h);
			g.fillOval(bolita15.x, bolita15.y, bolita15.w, bolita15.h);
			g.fillOval(bolita16.x, bolita16.y, bolita16.w, bolita16.h);
			g.fillOval(bolita17.x, bolita17.y, bolita17.w, bolita17.h);
			g.fillOval(bolita18.x, bolita18.y, bolita18.w, bolita18.h);
			g.fillOval(bolita19.x, bolita19.y, bolita19.w, bolita19.h);
			g.fillOval(bolita20.x, bolita20.y, bolita20.w, bolita20.h);
			
			
			g.fillOval(bolita21.x, bolita21.y, bolita21.w, bolita21.h);
			g.fillOval(bolita22.x, bolita22.y, bolita22.w, bolita22.h);
			g.fillOval(bolita23.x, bolita23.y, bolita23.w, bolita23.h);
			g.fillOval(bolita24.x, bolita24.y, bolita24.w, bolita24.h);
			g.fillOval(bolita25.x, bolita25.y, bolita25.w, bolita25.h);
			g.fillOval(bolita26.x, bolita26.y, bolita26.w, bolita26.h);
			g.fillOval(bolita27.x, bolita27.y, bolita27.w, bolita27.h);
			g.fillOval(bolita28.x, bolita28.y, bolita28.w, bolita28.h);
			g.fillOval(bolita29.x, bolita29.y, bolita29.w, bolita29.h);
			g.fillOval(bolita30.x, bolita30.y, bolita30.w, bolita30.h);
			
			
			
			g.fillOval(bolita31.x, bolita31.y, bolita31.w, bolita31.h);
			g.fillOval(bolita32.x, bolita32.y, bolita32.w, bolita32.h);
			g.fillOval(bolita33.x, bolita33.y, bolita33.w, bolita33.h);
			g.fillOval(bolita34.x, bolita34.y, bolita34.w, bolita34.h);
			g.fillOval(bolita35.x, bolita35.y, bolita35.w, bolita35.h);
			g.fillOval(bolita36.x, bolita36.y, bolita36.w, bolita36.h);
			g.fillOval(bolita37.x, bolita37.y, bolita37.w, bolita37.h);
			g.fillOval(bolita38.x, bolita38.y, bolita38.w, bolita38.h);
			g.fillOval(bolita39.x, bolita39.y, bolita39.w, bolita39.h);
			g.fillOval(bolita40.x, bolita40.y, bolita40.w, bolita40.h);
			
			g.fillOval(bolita41.x, bolita41.y, bolita41.w, bolita41.h);
			g.fillOval(bolita42.x, bolita42.y, bolita42.w, bolita42.h);
			g.fillOval(bolita43.x, bolita43.y, bolita43.w, bolita43.h);
			g.fillOval(bolita44.x, bolita44.y, bolita44.w, bolita44.h);
			g.fillOval(bolita45.x, bolita45.y, bolita45.w, bolita45.h);
			g.fillOval(bolita46.x, bolita46.y, bolita46.w, bolita46.h);
			g.fillOval(bolita47.x, bolita47.y, bolita47.w, bolita47.h);
			g.fillOval(bolita48.x, bolita48.y, bolita48.w, bolita48.h);
			g.fillOval(bolita49.x, bolita49.y, bolita49.w, bolita49.h);
			g.fillOval(bolita50.x, bolita50.y, bolita50.w, bolita50.h);
			
			g.fillOval(bolita51.x, bolita51.y, bolita51.w, bolita51.h);
			g.fillOval(bolita52.x, bolita52.y, bolita52.w, bolita53.h);
			g.fillOval(bolita53.x, bolita53.y, bolita53.w, bolita53.h);
			g.fillOval(bolita54.x, bolita54.y, bolita54.w, bolita54.h);
			g.fillOval(bolita55.x, bolita55.y, bolita55.w, bolita55.h);
			g.fillOval(bolita56.x, bolita56.y, bolita56.w, bolita56.h);
			g.fillOval(bolita57.x, bolita57.y, bolita57.w, bolita57.h);
			
			g.fillOval(bolita58.x, bolita58.y, bolita58.w, bolita58.h);
			g.fillOval(bolita59.x, bolita59.y, bolita59.w, bolita59.h);
			g.fillOval(bolita60.x, bolita60.y, bolita60.w, bolita60.h);
			g.fillOval(bolita61.x, bolita61.y, bolita61.w, bolita61.h);
			g.fillOval(bolita62.x, bolita62.y, bolita62.w, bolita62.h);
			g.fillOval(bolita63.x, bolita63.y, bolita63.w, bolita63.h);
			g.fillOval(bolita64.x, bolita64.y, bolita64.w, bolita64.h);
			g.fillOval(bolita65.x, bolita65.y, bolita65.w, bolita65.h);
			g.fillOval(bolita66.x, bolita66.y, bolita66.w, bolita66.h);
			g.fillOval(bolita67.x, bolita67.y, bolita67.w, bolita67.h);
			g.fillOval(bolita68.x, bolita68.y, bolita68.w, bolita68.h);
			g.fillOval(bolita69.x, bolita69.y, bolita69.w, bolita69.h);
			g.fillOval(bolita70.x, bolita70.y, bolita70.w, bolita70.h);
			g.fillOval(bolita71.x, bolita71.y, bolita71.w, bolita71.h);
			g.fillOval(bolita72.x, bolita72.y, bolita72.w, bolita72.h);
			g.fillOval(bolita73.x, bolita73.y, bolita73.w, bolita73.h);
			g.fillOval(bolita74.x, bolita74.y, bolita74.w, bolita74.h);
			g.fillOval(bolita75.x, bolita75.y, bolita75.w, bolita75.h);
			
			g.fillOval(bolita76.x, bolita76.y, bolita76.w, bolita76.h);
			g.fillOval(bolita77.x, bolita77.y, bolita77.w, bolita77.h);
			g.fillOval(bolita78.x, bolita78.y, bolita78.w, bolita78.h);
			g.fillOval(bolita79.x, bolita79.y, bolita79.w, bolita79.h);
			g.fillOval(bolita80.x, bolita80.y, bolita80.w, bolita80.h);

			// limites 
			g.setColor(limEje_x.c);// para el eje de las x negativo
			g.drawRect(limEje_x.x, limEje_x.y, limEje_x.w, limEje_x.h);

			g.setColor(limEje_x2.c);// para el eje de las x positivo
			g.drawRect(limEje_x2.x, limEje_x2.y, limEje_x2.w, limEje_x2.h);
		}
	}

	public class elemet {

		int x, y, h, w;
		Color c;

		public elemet(int x, int y, int h, int w, Color c) {
			this.x = x;
			this.y = y;
			this.h = h;
			this.w = w;
			this.c = c;
		}

		public boolean tocando(elemet e) {

			if (this.x < e.x + e.w && this.x + this.w > e.x &&

					this.y < e.y + e.h && this.y + this.h > e.y) {
				return true;
			} else {

			}
			return false;
		}

	}

}
