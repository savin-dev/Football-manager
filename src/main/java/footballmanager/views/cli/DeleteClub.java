package footballmanager.views.cli;

import footballmanager.controller.LeagueManager;

import java.util.Scanner;

public class DeleteClub extends AbstractCLI{
    LeagueManager manager;

    public DeleteClub(LeagueManager manager) throws Exception{
        super(true);
        this.manager=manager;
    }

    @Override
    protected void draw(){

    }

    @Override
    protected void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert team name : ");
        String clubName = scanner.nextLine().trim();
        manager.deleteExistingClub(clubName);
        System.out.println("Club deleted.");
    }
}
