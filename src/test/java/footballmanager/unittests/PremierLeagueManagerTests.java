package footballmanager.unittests;

import footballmanager.controller.LeagueManager;
import footballmanager.controller.impl.PremierLeagueManager;
import footballmanager.models.FootballClub;
import footballmanager.models.SportsClub;

import java.util.List;

public class PremierLeagueManagerTests {
    private static LeagueManager leagueManager;

    private static void createTeamTest() throws Exception {
        leagueManager.createNewFootballClub("TFC",50,"amal","sarath");
        leagueManager.createNewFootballClub("DMC",60,"savin","niduwara");
        leagueManager.createNewFootballClub("NNC",75,"amal","sarath");
        leagueManager.createNewFootballClub("BBC",100,"amal","sarath");
        leagueManager.createNewFootballClub("BBA",100,"ravindu","kenula");
        System.out.println("New Clubs Created");
//        System.out.println(leagueManager.getStatics("TFC"));
    }

    private static void deleteTeamTest(){
        leagueManager.deleteExistingClub("TFC");
        System.out.println("Deleted successfully");
    }

    private static void showIndividualTeamStatistic(){
        leagueManager.getStatics("TFC");
    }

    private static void showLeagueTable(){
        List<FootballClub> clubs = (List<FootballClub>) leagueManager.getLeagueTable();
        System.out.println("Displaying Demo League Table in Order of their points.");
        System.out.println("Current Test Implementation prints the team statistics and not a table");
        for (FootballClub club : clubs) {
            System.out.println(club);
        }
    }

    public static void main(String[] args) throws Exception {
        leagueManager=new PremierLeagueManager();
        System.out.println("1. Creating New Clubs");
        createTeamTest();
        System.out.println("2. Verifying created clubs (Prints the current league table)");
        showLeagueTable();
        System.out.println("3. Deleting team TFC");
        deleteTeamTest();
        System.out.println("4. Verifying deletion (Prints the current league table");
        showLeagueTable();
//        showIndividualTeamStatistic();
    }
}