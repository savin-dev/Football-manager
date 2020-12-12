package footballmanager;

import footballmanager.controller.LeagueManager;
import footballmanager.controller.impl.PremierLeagueManager;
import footballmanager.views.cli.MainMenu;

public class FootballManagerApplication{
    public static void main(String[] args) throws Exception{
        LeagueManager manager=new PremierLeagueManager();
        while(true){
            new MainMenu(manager);
        }
    }
}