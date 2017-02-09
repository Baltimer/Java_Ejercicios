/* Kata en el cual se calcula el resultado de una partida de
 * bolos. El usuario nos da un carta de puntuación (String) y 
 * devolvemos la puntuación obtenida en esa partida.
 * 
 * Author: Lluis Cifre Font
 * Date: 01/02/2017
 */

package org.foobarspam.bowling.game;

public class ScoreCard {
	// -------------------- Propiedades de la Clase --------------------
	private String scoreCard = "";
	private int totalScore = 0;
	private String symbols = "-123456789X/";
	
	//-------------------- CONSTRUCTORES --------------------
	
	public ScoreCard (){
		//Constructor por defecto
	}
	public ScoreCard (String scoreCard){
		this.scoreCard = scoreCard;
	}

	
	// -------------------- Setters y Getters --------------------
	public void setScoreCard(String scoreCard){
		this.scoreCard = scoreCard;
	}
	public String getScoreCard(){
		return this.scoreCard;
	}
	public void setTotalScore(int roll){
		this.totalScore += roll;
	}
	public int getTotalScore(){
		return totalScore;
	}
	public String getSymbols(){
		return this.symbols;
	}
	
	// -------------------- MÉTODOS DE LA CLASE --------------------
	// Método que convierte el ScoreCard de String a Array de int.
	private int[] initIntCard(){
		// Inicializamos el array
		int[] intCard = new int[21];
			// Recorremos la Score Card y vamos rellenando el array
			for (int i = 0; i<getScoreCard().length(); i++){
				// Si no es spare
				if (getSimbolValue(scoreCard.charAt(i)) != 11){
					intCard[i] = getSimbolValue(scoreCard.charAt(i));
				} else{ // Si es spare
					// Nunca dará error ya que el spare nunca puede
					// encontrarse en la primera tirada
					intCard[i] = 10 - intCard[i-1];
				}
			}
			return intCard;
	}
	
	//Método que convierte devuelve el valor de la tirada.
	private int getSimbolValue(char value){
		int index = getSymbols().indexOf(value);
		return index;
	}
	
	// Métoco que calcula la puntuación del juego
	public void calculateScore(){
		// Creamos el array de enteros con las tiradas
		int[] intCard = initIntCard();
		// Recorremos el array 10 veces (10 turnos) y vamos actualizando
		// la puntuación total
		int pointer = 0;
		for (int frame = 0; frame < 10; frame++){
			if (isStrike(pointer, intCard)){
				setTotalScore(intCard[pointer] + intCard[pointer + 1] 
								+ intCard[pointer + 2]);
				pointer += 1;
			} else if (isSpare(pointer, intCard)){
				setTotalScore(10 + intCard[pointer + 2]);
				pointer += 2;
			} else{
				setTotalScore(intCard[pointer] + intCard[pointer+1]);
				pointer += 2;
			}
		}
	}
	
	// Métodos que nos indican si la tirada es Spare o Strike
	public Boolean isSpare(int pointer, int[] intCard){
		return 10 == intCard[pointer] + intCard[pointer + 1];
	}
	public Boolean isStrike(int pointer, int[] intCard){
		return 10 == intCard[pointer];
	}
	
}