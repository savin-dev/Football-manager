package footballmanager.views.cli;

//me class eke oya mukuth karanna oni na. meka mehmmama thiyanna. ok
public abstract class AbstractCLI {
    protected boolean drawAtStart = true;
    public AbstractCLI(boolean drawAtStart) throws Exception{
        this.drawAtStart = drawAtStart;
        if (drawAtStart) {
            draw();
            getInputs();
        }
    }

    protected abstract void draw() throws Exception;

    protected abstract void getInputs() throws Exception;
}
