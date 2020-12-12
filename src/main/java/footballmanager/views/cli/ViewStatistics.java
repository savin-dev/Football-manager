package footballmanager.views.cli;

import footballmanager.controller.LeagueManager;
import footballmanager.models.FootballClub;

import java.util.Scanner;

public class ViewStatistics extends AbstractCLI{

    public ViewStatistics(LeagueManager manager) throws Exception{
        super(false);
        this.manager=manager;
    }

    FootballClub club;
    @Override
    protected void draw() {
        System.out.println("Club name: "+club.getNameOfTheClub());
        System.out.println("Captain name: "+club.getCaptianName());
        //Methana club eke wisthara tika print wenna oni points gnan, win count arawa mewa tika.ok
    }

    @Override
    protected void getInputs() {
        System.out.print("Insert club name  : ");
        Scanner scanner=new Scanner(System.in);
        String clubName=scanner.nextLine().trim();
        club=manager.getStatics(clubName);
        draw();
    }
}
