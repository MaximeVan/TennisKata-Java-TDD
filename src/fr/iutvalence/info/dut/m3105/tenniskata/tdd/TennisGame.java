package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private String score;
	private int scoreServer;
	private int scoreReceiver;
	
	public TennisGame(String score, int scoreServer, int scoreReceiver){
		this.score = "love_all";
		this.scoreServer = scoreServer;
		this.scoreReceiver = scoreReceiver;
	}
	
	public void setScore(String score)
	{
		this.score = score;
	}

	public String getScore()
	{
		if (this.scoreServer == 1 & this.scoreReceiver == 0)
		{
			this.score = "fifteen_love";
		}
		
		if (this.scoreServer == 0 & this.scoreReceiver == 1)
		{
			this.score = "love_fifteen";
		}
		
		if (this.scoreServer == 1 & this.scoreReceiver == 1)
		{
			this.score = "fifteen_all";
		}
		
		return score;
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

