import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public void paint(Graphics g) {
		super.paint(g);

		// Eje x, eje y, ejex tam, ejey tam

		// Arbusto verde..............
		g.setColor(Color.decode("#000000"));
		g.drawOval(80, 490, 40, 40);
		g.setColor(Color.decode("#299229"));
		g.fillOval(80, 490, 40, 40);
		g.setColor(Color.decode("#299229"));
		g.fillOval(60, 500, 70, 70);
		g.setColor(Color.decode("#000000"));
		g.drawOval(60, 500, 70, 70);

		// Sombras
		g.setColor(Color.decode("#000000"));
		g.fillRect(260, 370, 100, 160);

		// Piso
		g.setColor(Color.decode("#F1C697"));
		g.fillRect(30, 530, 761, 20);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(30, 530, 761, 20);

		// Piso bajo
		g.setColor(Color.decode("#D88B21"));
		g.fillRect(30, 550, 761, 50);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(30, 550, 761, 50);

		// Cuadros cafes....................
		g.setColor(Color.decode("#D88B21"));
		g.fillRect(30, 370, 50, 50);
		g.setColor(Color.decode("#D88B21"));
		g.fillRect(160, 200, 50, 50);
		g.setColor(Color.decode("#D88B21"));
		g.fillRect(210, 200, 50, 50);
		g.setColor(Color.decode("#D88B21"));
		g.fillRect(720, 250, 50, 50);
		// contornos
		g.setColor(Color.decode("#000000"));
		g.drawRect(30, 370, 50, 50);
		g.setColor(Color.decode("#000000"));
		g.drawRect(160, 200, 50, 50);
		g.setColor(Color.decode("#000000"));
		g.drawRect(210, 200, 50, 50);
		g.setColor(Color.decode("#000000"));
		g.drawRect(720, 250, 50, 50);

		// Cuadrado azul.....................
		g.setColor(Color.decode("#0580D6"));
		g.fillRect(220, 350, 120, 180);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(220, 350, 120, 180);

		// Sombras
		g.setColor(Color.decode("#000000"));
		g.fillRect(200, 430, 100, 100);
		
		// Cuadrado rosa.....................
		g.setColor(Color.decode("#F4CD98"));
		g.fillRect(160, 410, 120, 120);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(160, 410, 120, 120);

		// Tubo verde
		g.setColor(Color.decode("#077613"));
		g.fillRect(430, 440, 90, 90);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(430, 440, 90, 90);

		// Tubo verde parte arriba
		g.setColor(Color.decode("#077613"));
		g.fillRect(420, 410, 110, 30);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(420, 410, 110, 30);

		// Cuadrado verde.....................
		g.setColor(Color.decode("#10E227"));
		g.fillRect(700, 410, 91, 120);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawRect(700, 410, 91, 120);

		// circulos cuadro rosa..............
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(170, 420, 10, 10);
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(170, 510, 10, 10);
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(260, 510, 10, 10);
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(260, 420, 10, 10);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawOval(170, 420, 10, 10);
		g.setColor(Color.decode("#000000"));
		g.drawOval(170, 510, 10, 10);
		g.setColor(Color.decode("#000000"));
		g.drawOval(260, 510, 10, 10);
		g.setColor(Color.decode("#000000"));
		g.drawOval(260, 420, 10, 10);

		// circulos cuadro azul..............
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(230, 360, 10, 10);
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(320, 360, 10, 10);
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(320, 510, 10, 10);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawOval(230, 360, 10, 10);
		g.setColor(Color.decode("#000000"));
		g.drawOval(320, 360, 10, 10);
		g.setColor(Color.decode("#000000"));
		g.drawOval(320, 510, 10, 10);

		// circulos cuadro verde..............
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(710, 420, 10, 10);
		g.setColor(Color.decode("#FFFFFF"));
		g.fillOval(710, 510, 10, 10);
		// contorno
		g.setColor(Color.decode("#000000"));
		g.drawOval(710, 420, 10, 10);
		g.setColor(Color.decode("#000000"));
		g.drawOval(710, 510, 10, 10);

		// Cuadritos negros
		// cuadro 1
		g.setColor(Color.decode("#000000"));
		g.fillRect(35, 375, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(35, 410, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(70, 375, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(70, 410, 5, 5);
		// cuadro 2
		g.setColor(Color.decode("#000000"));
		g.fillRect(165, 205, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(200, 205, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(200, 240, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(165, 240, 5, 5);
		// cuadro 3
		g.setColor(Color.decode("#000000"));
		g.fillRect(215, 205, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(250, 205, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(250, 240, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(215, 240, 5, 5);
		// cuadro 4
		g.setColor(Color.decode("#000000"));
		g.fillRect(725, 255, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(760, 255, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(725, 290, 5, 5);
		g.setColor(Color.decode("#000000"));
		g.fillRect(760, 290, 5, 5);

	}

	public Ventana() {
		// Configuracion basica
		this.setVisible(true);
		this.setSize(800, 600);
		this.setLayout(null);
		this.setTitle("Diseño");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);// Centro de la pantalla
		this.getContentPane().setBackground(Color.decode("#88F8FF"));
	}

}