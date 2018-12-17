/*  Program:  NFL player 
  * File:     DefensePlayer.java
  * Summary:  Defense player class with properties and getter and setter
  * Author:   Daniel Saad
  * Date:     12/16/18
 */

//Extend NFLPlayer Class to Defense
public class DefensePlayer extends NFLPlayer {
	//Addtional Defense Properties
	private int interception; 
	private int Yardslost;
	private int sacks; 
	private int penalties;
        
	//No Args Constructor
	public DefensePlayer() { 
	}
        
        //With Arguments Constructor
        public DefensePlayer(String InPlayerName, String InPlayerTeam, String InPlayerPosition, int InPlayerAge, int InPlayerNumber, int InPlayerHeight, int InPlayerWeight, int InNumofPenalties, double InAverageyards, double InAverageTDs,
                int ininterception, int inYardslost, int insacks, int inpenalties) 
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
        sacks = insacks;
        penalties = inpenalties;
        }
	
        //Getters and Setters for Defense Players
	public int getIntercetion() { 
		return this.interception;
	}
	
	public void setIntercetion(int newinterception) {
		this.interception = newinterception;
	}
	
	public int getYardslost() {
		return this.Yardslost;
	}
	
	public void setYardslost(int newYardslost) {
		this.Yardslost = newYardslost;
	}
	
	public int getSacks() {
		return this.sacks;
	}
	
	public void setSacks(int newSacks) {
		this.sacks = newSacks;
	}
	
	public int getPenalties() {
		return this.penalties;
	}
	
	public void setPenalties(int newPenalties) {
		this.penalties = newPenalties;
	}
	
        //ToString Method
	public String toString() {   
		return getPlayerName() + ", " + getPlayerPosition() + ", " + getPlayerAge() + ", " + getPlayerTeam() + ", " + interception + ", " + Yardslost + ", " + sacks + ", " + penalties;
	}
}
