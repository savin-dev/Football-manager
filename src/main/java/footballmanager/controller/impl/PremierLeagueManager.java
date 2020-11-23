package footballmanager.controller.impl;

import footballmanager.controller.LeagueManager;
import footballmanager.models.FootballClub;
import footballmanager.models.SportsClub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PremierLeagueManager implements LeagueManager{

    private ArrayList<FootballClub> teams = new ArrayList<>(20);
    private final int TEAM_COUNT = 20;

    public void createNewFootballClub(String clubName, int numberOfMembers, String coachName, String captainName) throws Exception{
        FootballClub club = new FootballClub(clubName, captainName, coachName, numberOfMembers);
        if (TEAM_COUNT>teams.size())
            teams.add(club);
        else
            throw new RuntimeException("Exceeded team capacity for Premier League");
    }

    public void deleteExistingClub(String clubName) {
        int index=findTeamFromList(clubName);
        teams.remove(index);
    }

        public FootballClub getStatics(String clubName) {
            int index=findTeamFromList(clubName);
            if (index >= 0){
                return teams.get(index);
            }
            return null;
        }

    public List<FootballClub> getLeagueTable(){
        Collections.sort(teams, (s1, s2) -> s2.getTheNumberOfPoints() - s1.getTheNumberOfPoints());
        return teams;
    }

    public void savingInformation(int indexNo) {

    }

    public void playedMatch(String homeTeamName, String awayTeamName, int homeGoals, int awayGoals) {

    }

    private int findTeamFromList(String clubName){
        for(int i=0;i<teams.size();i++){
            FootballClub club=teams.get(i);
            if (club.getNameOfTheClub().equals(clubName))
                return i;
        }
        return -1;
    }
}
