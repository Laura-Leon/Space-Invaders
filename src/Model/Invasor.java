package Model;

import processing.core.PApplet;

public class Invasor extends Personaje {
	 
	int cont;
	
	
	
	public Invasor(int posX,int posY,PApplet app) {
		super(posX,posY,app);
	
		cont = 0;
	}
	public void pintar() {
		app.fill(0,0,255);
		app.rect(this.posX,this.posY,70,30);
	
	}

	
	public void mover() {
		cont++;

		if (cont <= 60) {
			posX--;
			
		} else {
			posX++;
		}
		if (cont >= 120) {
			cont = 0;
			posY+=50;
			
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
	public PApplet getApp() {
		return app;
	}
	public void setApp(PApplet app) {
		this.app = app;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public void splice(int j) {
		// TODO Auto-generated method stub
		
	}
	

}


