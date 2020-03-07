package Controller;

import Model.Juego;
import processing.core.PApplet;

public class Screen2Controller {
	PApplet app;
	Juego logicaJuego;

	public Screen2Controller(PApplet app) {
		this.app = app;
		this.logicaJuego = new Juego(app);
	}

	public void iniciar() {
		logicaJuego.ejecutar();
	}

	public void tecla() {
		logicaJuego.key();
	}

	public void raton() {
		logicaJuego.mouse();
	}

}
