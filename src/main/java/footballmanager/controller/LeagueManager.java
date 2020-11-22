package footballmanager.controller;

import footballmanager.models.FootballClub;
import footballmanager.models.SportsClub;

import java.util.List;

public interface LeagueManager {
    void createNewFootballClub(String clubName, int numberOfMembers, String coachName, String captainName) throws Exception;      // Create a new football club and add it in the premier league
    void deleteExistingClub(String clubName);                              // Delete (relegate) an existing club from the premier league
    FootballClub getStatics(String clubName);                                  // Display the various statistics for a selected club
    List<? extends SportsClub> getLeagueTable();                                   // Display the Premier League Table
    void savingInformation(int indexNo);                                   // Saving in a file of all the information entered by the user
    void playedMatch(String homeTeamName,String awayTeamName,int homeGoals,int awayGoals);

}
