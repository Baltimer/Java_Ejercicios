package org.foogbarspam.Yatzy.tirada;
//Imports
import static org.junit.Assert.*;
import org.junit.*;

public class YatzyTest {

	@Test
	public void chanceTest(){
		assertEquals(15, Yatzy.chance(1, 2, 3, 4, 5));
	}
	
	@Test
	public void yatzyScoreTest(){
		assertEquals(50, Yatzy.YatzyScore(5,5,5,5,5));
	}
	
	@Test
	public void onesTest(){
		assertEquals(2, Yatzy.ones(1,2,3,1,2));
	}
	
	@Test
	public void twosTest(){
		assertEquals(4, Yatzy.twos(1,2,3,4,2));
	}
	
	@Test
	public void threesTest(){
		assertEquals(9, Yatzy.threes(1,3,3,5,3));
	}
	
	@Test
	public void foursTest(){
		Yatzy inyector = new Yatzy(1,4,2,4,4);
		assertEquals(12, inyector.fours());
	}
	
	@Test
	public void fivesTest(){
		Yatzy inyector = new Yatzy(1,3,5,2,5);
		assertEquals(10, inyector.fives());
	}
	
	@Test
	public void sixsTest(){
		Yatzy inyector = new Yatzy(1,6,2,6,6);
		assertEquals(18, inyector.sixs());
	}
	
	@Test
	public void ScorePairTest(){
		assertEquals(12, Yatzy.ScorePair(1,3,2,6,6));
		assertEquals(12, Yatzy.ScorePair(6,6,2,1,2));
		assertEquals(0, Yatzy.ScorePair(1,2,3,4,5));
	}
	
	@Test
	public void ScoreTwoPairsTest(){
		assertEquals(16, Yatzy.ScoreTwoPairs(2,2,3,6,6));
		assertEquals(6, Yatzy.ScoreTwoPairs(2,1,2,3,1));
		assertEquals(0, Yatzy.ScoreTwoPairs(1,3,2,5,5));
	}
	
	@Test
	public void ThreeOfAKindTest(){
		assertEquals(9, Yatzy.ThreeOfAKind(1,2,3,3,3));
		assertEquals(6, Yatzy.ThreeOfAKind(1,2,3,2,2));
		assertEquals(0, Yatzy.ThreeOfAKind(1,2,3,4,5));
	}
	
	@Test
	public void FourOfAKindTest(){
		assertEquals(16, Yatzy.FourOfAKind(4,4,4,4,1));
		assertEquals(12, Yatzy.FourOfAKind(3,2,3,3,3));
		assertEquals(0, Yatzy.FourOfAKind(1,2,3,4,5));
	}
	
	@Test
	public void SmallStraightTest(){
		assertEquals(15, Yatzy.SmallStraight(1,2,3,4,5));
		assertEquals(15, Yatzy.SmallStraight(3,1,2,5,4));
		assertEquals(0, Yatzy.SmallStraight(1,6,2,3,4));
	}
	
	@Test
	public void LargeStraightTest(){
		assertEquals(20, Yatzy.LargeStraight(2,3,4,5,6));
		assertEquals(20, Yatzy.LargeStraight(3,6,2,5,4));
		assertEquals(0, Yatzy.LargeStraight(1,6,2,3,4));
	}
	
	
	@Test
	public void FullHouseTest(){
		assertEquals(13, Yatzy.FullHouse(2,2,3,3,3));
		assertEquals(27, Yatzy.FullHouse(5,6,5,5,6));
		assertEquals(0, Yatzy.FullHouse(1,2,5,4,4));
	}
}







