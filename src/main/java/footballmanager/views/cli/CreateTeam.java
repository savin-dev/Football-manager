package footballmanager.views.cli;

import footballmanager.controller.LeagueManager;

import java.util.Scanner;

// 5
//anith wada walatath me wage classes hadanna. mn methawa view eka set karala thiyenne Team ekak create karanna
// E hadana hama class ekak ma AbstractCLI eken extend wenna oni. Eeta passe red color under line wana thana click karala
// Alt+Enter -> Implement Methods
// Eeta passe constructor eka me wagema hadanna
// CreateTeam wagema thawa oni wenawa ne ViewStatistics, PlayMatch wage classesuth
public class CreateTeam extends AbstractCLI {
    LeagueManager manager;
    public CreateTeam(LeagueManager manager) throws Exception{
        super(true);
        this.manager=manager;
    }

    @Override
    protected void draw() throws Exception {
        // 4
        // Methana oni karana data ganna prints and scanner use karala
        Scanner scanner=new Scanner(System.in);
        System.out.print("Insert the club Name     : ");
        String clubName=scanner.nextLine().trim();
        System.out.print("Insert number of members : ");
        int numberOfMembers = scanner.nextInt();
        System.out.print("Insert coach name        : ");
        String coachName = scanner.nextLine().trim();
        System.out.print("Insert captain name      : ");
        String captainName = scanner.nextLine().trim();
//      manager.createNewFootballClub(// methana oni karana values pass karanna team eka hadanna);
        manager.createNewFootballClub(clubName,numberOfMembers,coachName,captainName);

    }

    @Override
    protected void getInputs() {

    }
}
