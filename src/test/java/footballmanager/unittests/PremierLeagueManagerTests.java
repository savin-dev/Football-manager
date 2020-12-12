package footballmanager.unittests;

import footballmanager.controller.LeagueManager;
import footballmanager.controller.impl.PremierLeagueManager;
import footballmanager.models.FootballClub;
import java.util.List;

public class PremierLeagueManagerTests{
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
        System.out.println("Individual statics showing successfully.");
    }

    public static void showPlayedMatch() {
        leagueManager.playedMatch("BBC","DMC",12,10); // ithin bn DNC kiyala team ekak nane
         System.out.println("Played mach successfully."); // Ah hari godane ehenm. awlak na ela heta ehenm oya tika karala kypn
        // hari ayye thanx
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
        //File f1 = new File("teams");
        //FileInputStream fout = new FileInputStream(f1);
        leagueManager=new PremierLeagueManager();
        System.out.println("1. Creating New Clubs");
        createTeamTest();
        System.out.println("2. Verifying created clubs (Prints the current league table)");
        showLeagueTable();
        System.out.println("3. Deleting team TFC");
        deleteTeamTest();
        System.out.println("4. Verifying deletion (Prints the current league table");
        showLeagueTable();
        System.out.println("5. Show the individual statics.");
        showIndividualTeamStatistic();
        System.out.println("6. Show played match :");
        showPlayedMatch(); // comand line eke. run karal penwanna
        
    }
}