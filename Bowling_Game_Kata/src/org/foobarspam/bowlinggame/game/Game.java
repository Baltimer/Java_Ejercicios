package org.foobarspam.bowlinggame.game;

public class Game {
	//Declaramos una variables roll para 1 tirada, y un array
	//de 21 posiciones como máximo para todas las posibles
	//tiradas en un juego
//	private int roll = 0;
//	private int[] rolls = new int[21];	
	//Declaramos la puntuación
	private int score = 0;
	
	//Declaramos el setter y getter del score
	public void setScore(int score){
		this.score += score;
	}
	public int getScore(){
		return this.score;
	}
	public void frameThrow(int throw1, int throw2){
		setScore(throw1 + throw2);
	}
	public void frameThrow(int throw1, char throw2){
		int auxiliar = 0;
		if(throw2 == '/'){
			auxiliar = 10 - throw1;
		}
		setScore(throw1 + auxiliar);
	}
	public void frameThrow(char throw1){
		setScore(10);
	}
	public void frameThrow(char throw1, char throw2){
		setScore(0);
	}
	public void frameThrow(char throw1, int throw2){
		setScore(throw2);
	}
}
