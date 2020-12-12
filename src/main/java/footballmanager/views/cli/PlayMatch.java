package footballmanager.views.cli;

import footballmanager.controller.LeagueManager;

import java.util.Scanner;

public class PlayMatch extends AbstractCLI{

    LeagueManager manager;
    public PlayMatch(LeagueManager manager) throws Exception{
        super(false);
        this.manager=manager;
    }

    @Override
    protected void draw() {
        // Methana Team deke statistics print karanna
        // oni nm ViewStatics eka use karala karanna. nathnm nikan team deke points table eka print karanna
    }

    @Override
    protected void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert home team name : ");
        String homeTeamName = scanner.nextLine().trim();
        System.out.print("Insert away team name : ");
        String awayTeamName = scanner.nextLine().trim();
        System.out.print("Insert home goals     : ");
        int homeGoals = scanner.nextInt();
        System.out.print("Insert away goals     : ");
        int awayGoals = scanner.nextInt();
        manager.playedMatch(homeTeamName,awayTeamName,homeGoals,awayGoals);
    }
}
