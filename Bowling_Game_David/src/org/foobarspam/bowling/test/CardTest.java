package org.foobarspam.bowling.test;

import static org.junit.Assert.*;

import org.foobarspam.bowling.game.ScoreCard;
import org.junit.Before;
import org.junit.Test;

/* http://junit.sourceforge.net/javadoc/org/junit/package-summary.html */

public class CardTest {
	private ScoreCard scoreCard;
	
	@Before
	public void setUp(){
		scoreCard = new ScoreCard();
	}
	
	@Test
	public void TotalScoreHittingPins(){
		
		String pins = "12345123451234512345";
		int total = 60;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithFails(){

		String pins = "1234-123451-345123-5";
		int total = 49;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithFailsAndSpares(){
		
		String pins = "1234-123451/-34/23-5";
		int total = 60;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithFailsSparesAndStrikes(){
		
		String pins = "X34-1451/-3X2/23-5";
		int total = 89;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithSpares(){
		
		// Hitting pins total = 60
		String pins = "123/51234/123451234/3";
		int total = 74;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithStrikes(){
		
		String pins = "12X5123XX345123X23";
		int total = 103;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}

	@Test
	public void TotalScoreWithStrikesAndFails(){
		
		String pins = "X34-123453-X5123-5";
		int total = 74;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithStrikeAndSpares(){
		
		String pins = "123/X2345XX5/23X45";
		int total = 133;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreWithDoubleAndSpareInLastFrame(){
		
		String pins = "8/549-XX5/53639/9/X";
		int total = 149;
		
		scoreCard.setScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());			
	}
}
