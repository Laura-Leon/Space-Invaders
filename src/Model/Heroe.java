package Model;

import java.util.ArrayList;
import static processing.core.PConstants.ENTER;
import static processing.core.PConstants.LEFT;
import static processing.core.PConstants.RIGHT;


import processing.core.PApplet;
import Model.Bala;

public class Heroe extends Personaje {
	
	ArrayList<Bala> balas;
	public Heroe(int posX,int posY,PApplet app) {
		super(posX,posY,app);
	
		
		balas = new ArrayList<>();
		
	//	this.vida = 3;
}
		
		
		
	
	
	public void pintar() {
		app.fill(180,50,50);
		app.rect(this.posX,this.posY,50,30);
		for (int i = 0; i < balas.size(); i++) {
			balas.get(i).pintar();
		}
	}
	public void moverDer() {
		if(this.posX<650) {
		this.posX += this.vel;
		}else { this.posX += 0;
			
		}
		
	}
	public void moverIzq() {
		if(this.posX<0) {
			this.posX-=0;
		}else {this.posX -=this.vel;
		}
		
	}

	public void disparar() {
		Bala b = new Bala(this.posX+25,this.posY-20,app);
		balas.add(b);
	}
	public void keyPressed() {
		if(app.keyCode==RIGHT) {
			moverDer();
			
		}
		if(app.keyCode==LEFT) {
			moverIzq();
		}
		if(app.keyCode==ENTER) {
			disparar();
		}
		
		
	}
	public void setBalas(ArrayList<Bala> Balas) {
		this.balas = balas;
	}

	public ArrayList<Bala> getBalas() {
		return balas;
	}
	

	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}
