import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.TableView.TableRow;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

public class Pacman {

	private JFrame frame;
	public int speed = 10;
	public int pac_x = 220, pac_y = 190;
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
	public elemet pared24 = new elemet(235, 325, 50, 10, Color.decode("#1336F7"));

	// cuadritos derecha
	public elemet pared25 = new elemet(285, 40, 20, 50, Color.decode("#1336F7"));
	public elemet pared26 = new elemet(375, 90, 10, 50, Color.decode("#1336F7"));

	public elemet pared27 = new elemet(375, 40, 20, 50, Color.decode("#1336F7"));
	public elemet pared28 = new elemet(325, 90, 85, 10, Color.decode("#1336F7"));

	// limites
	public elemet limEje_x = new elemet(-10, 90, 190, 10, Color.decode("#000000"));
	public elemet limEje_x2 = new elemet(480, 90, 190, 10, Color.decode("#000000"));

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
						|| pacman.tocando(pared4) || pacman.tocando(pared6) || pacman.tocando(pared7)
						|| pacman.tocando(pared8) || pacman.tocando(pared9) || pacman.tocando(pared10)
						|| pacman.tocando(pared11) || pacman.tocando(pared12) || pacman.tocando(pared13)
						|| pacman.tocando(pared14) || pacman.tocando(pared15) || pacman.tocando(pared16)
						|| pacman.tocando(pared17) || pacman.tocando(pared18) || pacman.tocando(pared19)
						|| pacman.tocando(pared20) || pacman.tocando(pared21) || pacman.tocando(pared22)
						|| pacman.tocando(pared23) || pacman.tocando(pared24) || pacman.tocando(pared25)
						|| pacman.tocando(pared26) || pacman.tocando(pared27) || pacman.tocando(pared28)) {
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

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);

		tablero.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);

		tablero.add(new MyGraphics());

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
