package Controller;

import Model.Juego;
import processing.core.PApplet;

public class Screen2Controller {
	PApplet app;
	Juego logica;

	public Screen2Controller(PApplet app) {
		this.app = app;
		this.logica = new Juego(app);
	}

	public void iniciar() {
		logica.ejecutar();
	}

	public void key() {
		logica.key();
	}

	public void mouse() {
		logica.mouse();
	}

}
