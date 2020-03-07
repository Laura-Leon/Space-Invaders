package View;


import Model.Juego;
import processing.core.PApplet;

public class Main extends PApplet {
	Screenview2 ini;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	public void settings() {
		size(700,700);
	}
	public void setup() {

		ini = new Screenview2(this);
		
	}
	public void draw() {
		background(120,180,350);
		ini.inicioJuego();
			
		
	}
	public void mousePressed() {
		ini.inicioRaton();
		
	}
	public void keyPressed() {
		ini.inicioTecla();
		
	}

}
