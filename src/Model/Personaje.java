package Model;

import processing.core.PApplet;

public abstract class Personaje {
	
	int posX;
	int posY;
	int vel;
	PApplet app;
	public Personaje (int posX,int posY,PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.vel = 20;
		this.app = app;
	
		
	}
	public abstract void pintar() ;
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
