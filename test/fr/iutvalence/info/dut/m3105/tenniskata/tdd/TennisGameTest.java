package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void loveAll()
	{
		TennisGame score = new TennisGame("love_all",0,0);
		assertEquals(score.getScore(), "love_all");
	}
	
	@Test
	public void ifServerHasScoredOnePointScoreIsFifteenLove()
	{
		TennisGame score = new TennisGame("fifteen_love",1,0);
		assertEquals(score.getScore(), "fifteen_love");
	}
	
	@Test
	public void ifReceiverHasScoredOnePointScoreIsLoveFifteen()
	{
		TennisGame score = new TennisGame("love_fifteen",0,1);
		assertEquals(score.getScore(), "love_fifteen");	
	}
	
	@Test
	public void ifReceiverAndServerHaveScoredOnePointScoreIsFifteenAll()
	{
		TennisGame score = new TennisGame("fifteen_all",1,1);
		assertEquals(score.getScore(), "fifteen_all");
	}

}
