package footballmanager.views.cli;

import footballmanager.controller.LeagueManager;
import footballmanager.controller.impl.PremierLeagueManager;

import java.util.Scanner;

// 1->4 wenakn karanna. Awulak awoth ahapn.ok ayye playedMatch() eke error enawa run wenakota
public class MainMenu extends AbstractCLI {

    LeagueManager manager;
    public MainMenu() throws Exception{
        super(true);
        manager=new PremierLeagueManager();
    }

    public void draw(){
        System.out.println("****Main Menu****");
        System.out.println("1. Create Team");
        System.out.println("2. View team statistics");
        System.out.println("3. Play match");
        System.out.println("4. Delete a club");
        // methana thawa league table eka adui.ok run karala balamu

        // 1
        //me widihata Wenna oni wadata tika print karanna
    }

    @Override
    protected void getInputs() {
        System.out.print("Insert Menu Option: ");
        int option=0;
        // 2
        //methana scanner use karala user gen input ekak ganna koi option ekatada yanne kiyala.
        //scanner eken ena value eka option variable ekata set karanna
        Scanner scanner=new Scanner(System.in);
        option=scanner.nextInt();
        try {
            goToOption(option);
        } catch (Exception e) {
            //methana exceptions handle karanna
            //ekko print karala dala nikan inna
            //nathnm hariyata condtions walin balala handle karanna
            // oya kamathi widihak
        }
    }

    private void goToOption(int option) throws Exception{
        if (option == 1){
            new CreateTeam(manager);
        }
        if (option==2){
            new ViewStatistics(manager);
        }
        if(option==3){
            new PlayMatch(manager);
        }
        if (option==4){
            new DeleteClub(manager);
        }

        // 3
        //mewidhata if condition daagena methanin adala menu walata yawanna
        //dn mn oya aluthen team ekak hadanna thama set karala thiyenne.

        // 6
        //e widihata anith wada walatath classes hadanna.
    }
}
