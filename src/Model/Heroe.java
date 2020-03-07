package Model;

import java.util.ArrayList;


import processing.core.PApplet;

public class Heroe {
	private static final int RIGHT = 0;
	private static final int LEFT = 0;
	private static final int ENTER = 0;
	int posX;
	int posY;
	int vel; 
	PApplet app;
	
	ArrayList<Bala> balas;
	public Heroe(int posX,int posY,PApplet app) {
		this.posX=posX;
		this.posY= posY;
		this.vel=6;
		this.app= app;
		balas = new ArrayList<>();
		
		
		
	}
	
	public void pintar() {
		app.fill(180,50,50);
		app.rect(this.posX,this.posY,50,30);
	}
	public void moverDer() {
		if(this.posX<650) {
		this.posX += this.vel;
		}else { this.posX += 0;
			
		}
		
	}
	public void moverIzq() {
		if(this.posX>0) {
			this.posX-=this.vel;
		}else {this.posX -=650;
		}
		
	}
	
	
	// Misiles

		public void setBalas(ArrayList<Bala> Balas) {
			this.balas = balas;
		}

		public ArrayList<Bala> getBalas() {
			return balas;
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
			moverDer();
		}
		if(app.keyCode==ENTER) {
			moverDer();
		}
		
		
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
