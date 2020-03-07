package Model;

import processing.core.PApplet;

public class Bala {
	int posX;
	int posY;
	int vel;
	PApplet app;

	public Bala(int posX, int posY, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		vel = 8;
	}

	public void pintar() {

		disparar();
	}

	public void disparar() {
		app.fill(185, 214, 243);
		app.ellipse(this.posX, this.posY, 20, 20);
		this.posY -= this.vel;
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
