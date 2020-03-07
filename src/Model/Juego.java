package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Juego {
	public PApplet app; 
	int pantalla; 
	ArrayList<Invasor>invasor;
	Heroe h;
	public Heroe getH() {
		return h;

	}
	public Juego(PApplet app) {
		this.app = app;
		pantalla = 0;
		 h = new Heroe(350,640,app);
		 invasor = new ArrayList<>();
		 
		 
		 for(int i= 0;i<12;i++) {
			 invasor.add(new Invasor(80*i,50,app));
			 
		 }
	}
		 
		 public void ejecutar() {
			 switch(pantalla) {
			 case 0:
				 app.background(255);
				 break;
			 case 1:
			 app.background(0);
			 h.pintar();
			 
			 for (int i = 0; i < invasor.size(); i++) {
					invasor.get(i).pintar();
					invasor.get(i).mover();
					
					System.out.println(invasor.get(i).getPosY());
					
					if(invasor.get(i).getPosY() > 43000) {
						pantalla = 2;
					}

					}

			 for (int i = 0; i < h.getBalas().size(); i++) {
					for (int j = 0; j < invasor.size(); j++) {
						if(PApplet.dist(h.getBalas().get(i).getPosX(), h.getBalas().get(i).getPosY(), invasor.get(j).getPosX()+50,
							invasor.get(j).getPosY())<50) {
							
							invasor.remove(j);
							
							h.getBalas().get(i).setPosX(5000);
						}
					}
				}
				break;
				case 2:
					
					app.background(330,40,93);
					break;
				}	
			}
			
		 public void mouse() {
				switch(pantalla) {
				case 0:
					pantalla = 1;
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				}
			}
		 public void key() {
				h.keyPressed();
			}
		 public int getPantalla() {
				return pantalla;
			}

			public void setPantalla(int pantalla) {
				this.pantalla = pantalla;
			}
}
			
			
			

		 
					
			 
			 
			 