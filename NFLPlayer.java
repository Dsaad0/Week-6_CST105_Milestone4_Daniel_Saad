/* Program:  NFL player Class
  * File:     NFLPlayer.java
  * Summary:  NFL player class with properties and getter and setter
  * Author:   Daniel Saad
  * Date:     12/06/18
 */
import java.io.FileNotFoundException;
//Import java scanner
import java.util.Scanner;


//Initiate NFL Player Class
public class NFLPlayer {
    //Initiate Public Variables
    public int PlayerAge;
    public String PlayerName;
    public String PlayerTeam;
    public int PlayerNumber;
    public double PlayerFPoints;
    public int PlayerWeight;
    public int PlayerHeight;
    public double PlayerBMI;
    public String PlayerPosition;
    public int NumofPenalties;
    public double AverageYards;
    public double AverageTDs;

    //NFL constructor with Arugments
    public NFLPlayer(String InPlayerName, String InPlayerTeam, String InPlayerPosition, int InPlayerAge, int InPlayerNumber, int InPlayerHeight, int InPlayerWeight, int InNumofPenalties, double InAverageyards, double InAverageTDs) {
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
    }
    //Initialize default Player
    public NFLPlayer() {
        PlayerName = "Joe Schmoe";
        PlayerAge = 24;
        PlayerTeam = "Dallas Cowboys";
        PlayerNumber = 45;
        PlayerWeight = 205;
        PlayerHeight = 68;
        PlayerPosition = "Right Tackle";
        NumofPenalties = 5;
        AverageYards = 205;
        AverageTDs = 5;
        PlayerFPoints = (AverageYards + (25 * AverageTDs) - (15 * NumofPenalties));
    }
    
    //List of Getter Methodd
    public String getPlayerName() {
        return PlayerName;
    }
    public double getPlayerBMI() {
        return PlayerBMI = (PlayerWeight / PlayerHeight);
    }
    public int getPlayerAge() {
        return PlayerAge;
    }
    public String getPlayerTeam() {
        return PlayerTeam;
    }
    public int getPlayerNumber() {
        return PlayerNumber;
    }
    public double getPlayerFPoints() {
        return PlayerFPoints;
    }
    public int getPlayerHeight() {
        return PlayerHeight;
    }
    public int getPlayerWeight() {
        return PlayerWeight;
    }
    public String getPlayerPosition() {
        return PlayerPosition;
    }
    public int getPlayerNumofPenalties() {
        return PlayerHeight;
    }
    public double getPlayersAverageYards() {
        return AverageYards;
    }
    public double getPlayersAverageTDs() {
        return AverageTDs;
    }
    //List of Setter Methods
    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }
    public void setPlayerAge(int PlayerAge) {
        this.PlayerAge = PlayerAge;
    }
    public void setPlayerTeam(String PlayerTeam) {
        this.PlayerTeam = PlayerTeam;
    }
    public void setPlayerNumber(int PlayerNumber) {
        this.PlayerNumber = PlayerNumber;
    }
    public void setPlayerFPoints(double AverageYards, double AverageTDs, int NumofPenalties) {
        this.PlayerFPoints = (AverageYards + (25 * AverageTDs) - (15 * NumofPenalties));
    }
    public void setPlayerBMI(int PlayerHeight, int PlayerWeight) {
        this.PlayerBMI = (PlayerWeight / PlayerHeight);
    }
    public void setPlayerHeight(int PlayerHeight) {
        this.PlayerHeight = PlayerHeight;
    }
    public void setPlayerWeight(int PlayerWeight) {
        this.PlayerWeight = PlayerWeight;
    }
    public void setPlayerPosition(String PlayerPosition) {
        this.PlayerPosition = PlayerPosition;
    }
    public void setPlayerNumofPenalties(int NumofPenalties) {
        this.NumofPenalties = NumofPenalties;
    }
    public void setPlayerAverageYards(int AverageYards) {
        this.AverageYards = AverageYards;
    }
    public void setPlayerAverageTDs(int AverageTDs) {
        this.AverageTDs = AverageTDs;
    }
    
    //To String Method
    public String PlayerString() {
        return "PlayerName: " + PlayerName + " / Player Age: " + PlayerAge + " / Player's Team: " + PlayerTeam + " / Player Number: " + PlayerNumber + " / Player Position: " + PlayerPosition + " / Player Fantasy Points: "
                + PlayerFPoints + " / Player Height (Inches): " + PlayerHeight + " / Player Weight(LBs): " + PlayerWeight + " / Player Number of Penalties: " + NumofPenalties + " / Average Yards: " + AverageYards
                + " / Average Touchdowns: " + AverageTDs;
    }
    
    //Tester Driver Method
    public static void Driver() {
        //Initialize First and Second Players
        NFLPlayer FirstPlayer = new NFLPlayer();
        NFLPlayer SecondPlayer = new NFLPlayer("Daniel Saad", "LA RAMS", "Defensive Tackle", 33, 55, 69, 210, 10, 543, 3);
        
        //Test Print of First Player Attributes
        System.out.println("Print Blank - First Player");
        System.out.println();
        System.out.println("Player Name: " + FirstPlayer.getPlayerName());
        System.out.println("Player Team: " + FirstPlayer.getPlayerTeam());
        System.out.println("Player BMI: " + FirstPlayer.getPlayerBMI());
        System.out.println("Player Position: " + FirstPlayer.getPlayerPosition());
        System.out.println("Player Age: " + FirstPlayer.getPlayerAge());
        System.out.println("Player Height: " + FirstPlayer.getPlayerHeight());
        System.out.println("Player Weight: " + FirstPlayer.getPlayerWeight());
        System.out.println("Player Fantasy Points: " + FirstPlayer.getPlayerFPoints());
        System.out.println("Player Penalties: " + FirstPlayer.getPlayerNumofPenalties());
        System.out.println("Player Touchdowns: " + FirstPlayer.getPlayersAverageTDs());
        System.out.println();
        
        
        //Tesst Setters and getters
        FirstPlayer.setPlayerWeight(290);
        FirstPlayer.setPlayerHeight(69);
        FirstPlayer.setPlayerBMI(FirstPlayer.getPlayerHeight(),FirstPlayer.getPlayerWeight());
        
        //Retest First Player
        System.out.println("Print Blank - First Player");
        System.out.println();
        System.out.println("Player Name: " + FirstPlayer.getPlayerName());
        System.out.println("Player Team: " + FirstPlayer.getPlayerTeam());
        System.out.println("Player BMI: " + FirstPlayer.getPlayerBMI());
        System.out.println("Player Position: " + FirstPlayer.getPlayerPosition());
        System.out.println("Player Age: " + FirstPlayer.getPlayerAge());
        System.out.println("Player Height: " + FirstPlayer.getPlayerHeight());
        System.out.println("Player Weight: " + FirstPlayer.getPlayerWeight());
        System.out.println("Player Fantasy Points: " + FirstPlayer.getPlayerFPoints());
        System.out.println("Player Penalties: " + FirstPlayer.getPlayerNumofPenalties());
        System.out.println("Player Touchdowns: " + FirstPlayer.getPlayersAverageTDs());
        System.out.println();
        
        //Test Second Player
        System.out.println("Print Blank - Second Player");
        System.out.println();
        System.out.println("Player Name: " + SecondPlayer.getPlayerName());
        System.out.println("Player Team: " + SecondPlayer.getPlayerTeam());
        System.out.println("Player BMI: " + SecondPlayer.getPlayerBMI());
        System.out.println("Player Position: " + SecondPlayer.getPlayerPosition());
        System.out.println("Player Age: " + SecondPlayer.getPlayerAge());
        System.out.println("Player Height: " + SecondPlayer.getPlayerHeight());
        System.out.println("Player Weight: " + SecondPlayer.getPlayerWeight());
        System.out.println("Player Fantasy Points: " + SecondPlayer.getPlayerFPoints());
        System.out.println("Player Penalties: " + SecondPlayer.getPlayerNumofPenalties());
        System.out.println("Player Touchdowns: " + SecondPlayer.getPlayersAverageTDs());
        System.out.println();
    }
    //Main Class to test Driver Method
    public static void main(String[] args) {
        Driver();
    }
}
