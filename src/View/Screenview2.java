package View;

import Controller.Screen2Controller;
import processing.core.PApplet;

public class Screenview2 {
	PApplet app;
	Screen2Controller controlador;
	
	public Screenview2(PApplet app) {
		this.app = app;
		this.controlador = new Screen2Controller(app);
		
	}
	
	public void inicioJuego(){
		controlador.iniciar();
	}
	public void inicioTecla() {
		controlador.tecla();
	}
	public void inicioRaton() {
		controlador.raton();
	}
	

}
