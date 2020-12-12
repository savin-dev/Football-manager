package footballmanager.views.cli;

import footballmanager.controller.LeagueManager;
import footballmanager.controller.impl.PremierLeagueManager;

//me class eke oya mukuth karanna oni na. meka mehmmama thiyanna. ok
public abstract class AbstractCLI {
    protected boolean drawAtStart = true;

    protected LeagueManager manager;
    public AbstractCLI(boolean drawAtStart) throws Exception{
        manager=new PremierLeagueManager();
        this.drawAtStart = drawAtStart;
        if (drawAtStart) {
            draw();
            getInputs();
        }
    }

    public AbstractCLI(boolean drawAtStart, LeagueManager manager) throws Exception{
        this.manager =manager;
        this.drawAtStart = drawAtStart;
        if (drawAtStart) {
            draw();
            getInputs();
        }
    }


    protected abstract void draw() throws Exception;

    protected abstract void getInputs() throws Exception;
}
