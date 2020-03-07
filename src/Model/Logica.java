package Model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logica {
	public PApplet app; 
	private ArrayList<Invasor>invasor;
	Heroe h;
	
	public Logica(PApplet app) {
		this.app = app;
		h = new Heroe(500, 400, app);
		
		invasor = new ArrayList();
		for (int i = 0; i < 10; i++) {
			invasor.add(new Invasor(app.height / 2, 60 + (120) * i, app));

		}
	}
		
		public void ejecutar() {

			app.background(255);
			h.pintar();
			

			for (int i = 0; i < h.getBalas().size(); i++) {
				for (int j = 0; j < invasor.size(); j++) {
					if (PApplet.dist(h.getBalas().get(i).getPosX(), h.getBalas().get(i).getPosY(), invasor.get(j).getPosX()+15,
							invasor.get(j).getPosY()) < 20) {
						invasor.remove(j);
						h.getBalas().get(i).setPosX(5000);
						
					}
				}
			}
			
			//FALTA AGREGAR PIERDE JUGADOR
			for (int i = 0; i < invasor.size(); i++) {

				invasor.get(i).pintar();
				invasor.get(i).mover();
			}

			
	}
		
		public void mouse() {}
		public void key() {
			h.keyPressed();
		}
		public PApplet getPApplet() {

			return app;
		}

}
