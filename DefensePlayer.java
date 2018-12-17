/* Program:  NFL player 
  * File:     DefensePlayer.java
  * Summary:  Defense player class with properties and getter and setter
  * Author:   Daniel Saad
  * Date:     12/16/18
 */

public class DefensePlayer extends NFLPlayer {
	
	private int interception; 
	private int Yardslost;
	private int sacks; 
	private int penalties;
	
	public DefensePlayer() { 
	}
        public DefensePlayer(String InPlayerName, String InPlayerTeam, String InPlayerPosition, int InPlayerAge, int InPlayerNumber, int InPlayerHeight, int InPlayerWeight, int InNumofPenalties, double InAverageyards, double InAverageTDs,
                int ininterception, int inYardslost, int Insacks, int inpenalties) 
        {
        PlayerName = InPlayerName;
        PlayerAge = InPlayerAge;
        PlayerTeam = InPlayerTeam;
        PlayerNumber = InPlayerNumber;
        PlayerWeight = InPlayerWeight;
        PlayerHeight = InPlayerHeight;
        PlayerPosition = InPlayerPosition;
        NumofPenalties = InNumofPenalties;
        AverageYards = InAverageyards;
        AverageTDs = InAverageTDs;
        PlayerFPoints = (AverageYards + (25 * AverageTDs) - (15 * NumofPenalties));
        PlayerBMI = (PlayerWeight / PlayerHeight);
        interception = ininterception;
        Yardslost = inYardslost;
        sacks = Insacks;
        penalties = inpenalties;
        }
	
	public int getInter() { 
		return this.interception;
	}
	
	public void setInter(int newInter) {
		this.interception = newInter;
	}
	
	public int getYardslost() {
		return this.Yardslost;
	}
	
	public void setIYardslost(int newYardslost) {
		this.Yardslost = newYardslost;
	}
	
	public int getSacks() {
		return this.sacks;
	}
	
	public void setSacks(int newSacks) {
		this.sacks = newSacks;
	}
	
	public int getTackles() {
		return this.penalties;
	}
	
	public void setPenalties(int newPenalties) {
		this.penalties = newPenalties;
	}
	
	public String toString() {   
		return getPlayerName() + ", " + getPlayerPosition() + ", " + getPlayerAge() + ", " + getPlayerTeam() + ", " + interception + ", " + Yardslost + ", " + sacks + ", " + penalties;
	}
}
