/* Program:  NFL Player 
  * File:     OffensePlayer.java
  * Summary:  Offense player class with properties and getter and setter
  * Author:   Daniel Saad
  * Date:     12/16/18
 */

//Extend NFLPlayer Class to Offense
public class OffensePlayer extends NFLPlayer {
	//Addtional Offensive Properties
	private int YardsGained; 
	private int PassRecieved;
	private int Runs; 
	private int YardsRan;
	private int penalties;      
	private int Yardslost;  
	
        //No Args Constructor
	public OffensePlayer() { 
	}
        
        //With Arguments Constructor
        public OffensePlayer(String InPlayerName, String InPlayerTeam, String InPlayerPosition, int InPlayerAge, int InPlayerNumber, int InPlayerHeight, int InPlayerWeight, int InNumofPenalties, double InAverageyards, double InAverageTDs,
                int inYardsGained, int inPassReceived, int inRuns, int inYardsRan, int inPenalties, int inYardslost) 
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
        YardsGained =  inYardsGained;
        PassRecieved = inPassReceived;
        Runs = inRuns;
        YardsRan = inYardsRan;
        penalties = inPenalties;
        Yardslost = inYardslost;
        }
	
        //Getters and Setters for Offense Players
	public int getYardsGained() {  
		return this.YardsGained;
	}
	public void setYardsGained(int newYardsGained) {
		this.YardsGained = newYardsGained;
	}
	
	public int getPassRecieved() {
		return this.PassRecieved;
	}
	public void setPassRecieved(int newPassRecieved) {
		this.PassRecieved = newPassRecieved;
	}
	
	public int getRuns() {
		return this.Runs;
	}
	public void setRuns(int newRuns) {
		this.Runs = newRuns;
	}
	
	public int getYardsRan() {
		return this.YardsRan;
	}
	public void setYardsRan(int newYardsRan) {
		this.YardsRan = newYardsRan;
	}
	
	public int getPenalties() {
		return this.penalties;
	}
	public void setPenalties(int newRec) {
		this.penalties = newRec;
	}
	
	public int getYardslost() {
		return this.Yardslost;
	}
	public void setYardslost(int newYardslost) {
		this.Yardslost = newYardslost;
	}
	
	public float getYardsPerPass() {
		return (((float)this.YardsGained)/((float)this.PassRecieved));
	}
	
	public float getYardsPerRun() {
		return ((((float)this.YardsRan)/((float)this.Runs)));
	}
	
	public float getYardsLostperPenalty() {
		return ((((float)this.Yardslost)/((float)this.penalties)));
	}
        
	//ToString Method
	public String toString() {
		return getPlayerName() + ", " + getPlayerPosition() + ", " + getPlayerAge() + ", " + getPlayerFPoints() + ", " + YardsGained + ", " + PassRecieved + ", " + Runs + ", " + YardsRan + ", " + penalties + ", " + Yardslost;
	}
}
