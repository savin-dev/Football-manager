package footballmanager.controller.impl;

import footballmanager.controller.LeagueManager;
import footballmanager.models.FootballClub;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PremierLeagueManager implements LeagueManager {

    private ArrayList<FootballClub> teams = new ArrayList<>(20);
    private final int TEAM_COUNT = 20;

    public PremierLeagueManager() {
        try {
            FileInputStream fileInputStream = new FileInputStream("teams");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            teams = (ArrayList<FootballClub>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createNewFootballClub(String clubName, int numberOfMembers, String coachName, String captainName) throws Exception {
        FootballClub club = new FootballClub(clubName, captainName, coachName, numberOfMembers);
        if (TEAM_COUNT > teams.size())
            teams.add(club);
        else
            throw new RuntimeException("Exceeded team capacity for Premier League");
    }

    public void deleteExistingClub(String clubName) {
        int index = findTeamFromList(clubName);
        teams.remove(index);
    }

    public FootballClub getStatics(String clubName) {
        int index = findTeamFromList(clubName);
        if (index >= 0) {
            return teams.get(index);
        }
        return null;
    }

    public List<FootballClub> getLeagueTable() {
        Collections.sort(teams, (s1, s2) -> s2.getTheNumberOfPoints() - s1.getTheNumberOfPoints());
        return teams;
    }

    public void save() {
        saveToFile();
    }

    //kothanada enne. penwanna .test wala
    public void playedMatch(String homeTeamName, String awayTeamName, int homeGoals, int awayGoals) {
        FootballClub home = null;
        FootballClub away = null;

        int hometeamIndex = -1, awayteamIndex = -1;
        hometeamIndex = findTeamFromList(homeTeamName);
        awayteamIndex = findTeamFromList(awayTeamName);
        if (hometeamIndex >= 0) {
            home = teams.get(hometeamIndex);
        } else {
            throw new RuntimeException("No such club in league.");
        }

        if (awayteamIndex >= 0) {
            away = teams.get(awayteamIndex);
        } else {
            throw new RuntimeException("No such club in league.");
        }

        if (homeGoals < 0) {
            throw new RuntimeException("You have to enter number of home goals");
        }

        if (awayGoals < 0) {
            throw new RuntimeException("You have to enter number of away goals");
        }

        if (homeGoals > awayGoals) {
            home.setTheNumberOfPoints(home.getTheNumberOfPoints() + 3);
            home.setWinCount(home.getWinCount() + 1);
            away.setDefeatsCount(away.getDefeatsCount() + 1);
        } else if (awayGoals > homeGoals) {
            away.setTheNumberOfPoints(away.getTheNumberOfPoints() + 3);
            away.setWinCount(away.getWinCount() + 1);
            home.setDefeatsCount(home.getDefeatsCount() + 1);
        } else {
            home.setTheNumberOfPoints(home.getTheNumberOfPoints() + 1);
            away.setTheNumberOfPoints(home.getTheNumberOfPoints() + 1);
            home.setDrawsCount(home.getDrawsCount() + 1);
            away.setDrawsCount(away.getDrawsCount() + 1);
        }
    }

    private int findTeamFromList(String clubName) {
        for (int i = 0; i < teams.size(); i++) {
            FootballClub club = teams.get(i);
            if (club.getNameOfTheClub().equals(clubName))
                return i;
        }
        return -1;
    }

    private void saveToFile(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("teams");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(teams);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}