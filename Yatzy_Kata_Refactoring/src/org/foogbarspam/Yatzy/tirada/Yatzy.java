package org.foogbarspam.Yatzy.tirada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Yatzy {
	protected ArrayList<Integer> dice;
	
	public Yatzy(int...dice){
		this.dice = new ArrayList<Integer>();
		for (int die : dice){
			this.dice.add(die);
		}
	}
	
	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		total += d1;
		total += d2;
		total += d3;
		total += d4;
		total += d5;
		return total;
	}
	
	public static int YatzyScore(int...dice){
		for (int die : dice){
			if(die != dice[1]){
				return 0;
			}
		}
		return 50;
	}
	
	public static int ones(int...dice){
		int score = 0;
		for (int die : dice){
			if (die == 1){
				score += die;
			}
		}
		return score;
	}
	
	public static int twos(int...dice){
		int score = 0;
		for (int die : dice){
			if (die == 2){
				score += die;
			}
		}
		return score;
	}
	
	public static int threes(int...dice){
		int score = 0;
		for (int die : dice){
			if (die == 3){
				score += die;
			}
		}
		return score;
	}
	
	public int fours(){
		int score = 0;
		for (int die : dice){
			if (die == 4){
				score += die;
			}
		}
		return score;
	}
	
	public int fives(){
		int score = 0;
		for (int die : dice){
			if (die == 5){
				score += die;
			}
		}
		return score;
	}
	
	public int sixs(){
		int score = 0;
		for (int die : dice){
			if (die == 6){
				score += die;
			}
		}
		return score;
	}
	
	public static int ScorePair(int...dice){
		int score = 0;
		Arrays.sort(dice);
		for (int i = 4; i > 0; i--){
			if (dice[i] == dice[i-1]){
				return score = dice[i]*2;
			}
		}
		return score;
	}
	
	public static int ScoreTwoPairs(int...dice){
		int score = 0;
		int pairsFound = 0;
		Arrays.sort(dice);
		for (int i = 4; i > 0; i--){
			if(dice[i] == dice[i-1]){
				score += dice[i] * 2;
				pairsFound += 1;
				i -= 1;
			}
			if(pairsFound == 2){
				return score;
			}
		}
		return 0;
	}
	
	
	public static int ThreeOfAKind(int...dice){
		int score = 0;
		Arrays.sort(dice);
		for (int i = 4; i>1; i--){
			if ((dice[i] == dice[i-2])){
				return score = dice[i] * 3;
			}
		}		
		return score;
	}
	
	public static int FourOfAKind(int...dice){
		int score = 0;
		Arrays.sort(dice);
		for (int i = 4; i>2; i--){
			if((dice[i] == dice[i-3])){
				return score = dice [i] * 4;
			}
		}
		return score;
	}
	
	public static int SmallStraight(int...dice){
		int score = 15;
		Arrays.sort(dice);
		if (dice[0] != 1){
			return 0;
		}
		for (int i = 0; i < dice.length - 1; i++){
			if (dice[i+1] != (dice[i] + 1)){
				return 0;
			}
		}
		return score;
	}
	
	public static int LargeStraight(int...dice){
		int score = 20;
		Arrays.sort(dice);
		if (dice[0] == 1){
			return 0;
		}
		for (int i = 0; i < dice.length - 1; i++){
			if (dice[i+1] != (dice[i] + 1)){
				return 0;
			}
		}
		return score;
	}
		
	
	public static int FullHouse(int...dice){
		int score = 0;
		int pairFound = 0;
		int threeFound = 0;
		Arrays.sort(dice);
		ArrayList<Integer> dices = new ArrayList<Integer>();
		for (int i = 0; i< dice.length; i++){
			dices.add(dice[i]);
		}
		Collection<Integer> d = dices;
		for (Integer die : dices){
			int freq = Collections.frequency(d, die);
			if (freq == 3 && threeFound != 1){
				score += die * freq;
				threeFound +=1;
			} else if (freq == 2 && pairFound != 1){
				score += die * freq;
				pairFound += 1;
			}
		}
		if (pairFound == 1 && threeFound == 1){
			return score;
		}
		return 0;
	}
}