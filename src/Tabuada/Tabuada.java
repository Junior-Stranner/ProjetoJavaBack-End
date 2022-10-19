package Tabuada;

public class Tabuada{
	private int x ,y ;
	private double res;

	
	public String testeTabuada(String nome ) {
		 
		return nome += x +"*"+y +"="+ res;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public double getRes() {
		return res;
	}


	public void setRes(double res) {
		this.res = res;
	}
	
	
}