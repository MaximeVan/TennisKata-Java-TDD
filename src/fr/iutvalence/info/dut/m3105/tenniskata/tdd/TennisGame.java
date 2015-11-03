package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private static final String LOVE_ALL = "love_all";
	private static final String FIFTEEN_ALL = "fifteen_all";
	private static final String LOVE_FIFTEEN = "love_fifteen";
	private static final String FIFTEEN_LOVE = "fifteen_love";
	private int scoreServer;
	private int scoreReceiver;
	
	public TennisGame(int scoreServer, int scoreReceiver)
	{
		this.scoreServer = scoreServer;
		this.scoreReceiver = scoreReceiver;
	}

	public String getScore()
	{
		if (this.scoreServer == 1 & this.scoreReceiver == 0)
		{
			return FIFTEEN_LOVE;
		}
		
		if (this.scoreServer == 0 & this.scoreReceiver == 1)
		{
			return LOVE_FIFTEEN;
		}
		
		if (this.scoreServer == 1 & this.scoreReceiver == 1)
		{
			return FIFTEEN_ALL;
		}
		
		return LOVE_ALL;
	}

	
	
	public int getScoreServer()
	{
		return scoreServer;
	}

	public void setScoreServer(int scoreServer)
	{
		this.scoreServer = scoreServer;
	}

	public int getScoreReceiver()
	{
		return scoreReceiver;
	}

	public void setScoreReceiver(int scoreReceiver)
	{
		this.scoreReceiver = scoreReceiver;
	}
	
	
}

