package org.foobarspam.bowlinggame.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.foobarspam.bowlinggame.game.*;

public class GameTest {
	
	private Game gameTest;
	
	@Before
	public void setUp(){
		gameTest = new Game();
	}
	
	@Test
	public void normalThrowTest(){
		gameTest.frameThrow(1, 2);
		assertEquals(3, gameTest.getScore());
	}
	
	@Test
	public void spareThrowTest(){
		gameTest.frameThrow(7, '/');
		assertEquals(10, gameTest.getScore());
	}
	
	@Test
	public void strikeThrowTest(){
		gameTest.frameThrow('X');
		assertEquals(10, gameTest.getScore());
	}
	
	@Test
	public void zeroPointsThrowTest(){
		gameTest.frameThrow('-', '-');
		assertEquals(0, gameTest.getScore());
	}
	
	@Test
	public void first0ThrowTest(){
		gameTest.frameThrow('-', 3);
		assertEquals(3, gameTest.getScore());
	}
	
	@Test
	public void fecond0ThrowTest(){
		gameTest.frameThrow(6, '-');
		assertEquals(6, gameTest.getScore());
	}
}
