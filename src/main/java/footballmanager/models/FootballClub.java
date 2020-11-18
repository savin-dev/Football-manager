package footballmanager.models;

import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportsClub {
    private int winCount;
    private int drawsCount;
    private int defeatsCount;
    private int numberOfGoalsReceived;
    private int getNumberOfGoalsScored;
    private int theNumberOfPoints;
    private int theNumberOfMachesPlayed;
    private String captianName;
    private String coachName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballClub)) return false;
        FootballClub that = (FootballClub) o;
        return getWinCount() == that.getWinCount() &&
                getDrawsCount() == that.getDrawsCount() &&
                getDefeatsCount() == that.getDefeatsCount() &&
                getNumberOfGoalsReceived() == that.getNumberOfGoalsReceived() &&
                getGetNumberOfGoalsScored() == that.getGetNumberOfGoalsScored() &&
                getTheNumberOfPoints() == that.getTheNumberOfPoints() &&
                getTheNumberOfMachesPlayed() == that.getTheNumberOfMachesPlayed();
    }


    public FootballClub(){

    }

    public FootballClub(String nameOfTheClub, String location, int winCount, int drawsCount, int defeatsCount, int numberOfGoalsReceived, int getNumberOfGoalsScored, int theNumberOfPoints, int theNumberOfMachesPlayed, String captianName, String coachName) {
        super(nameOfTheClub, location);
        this.winCount = winCount;
        this.drawsCount = drawsCount;
        this.defeatsCount = defeatsCount;
        this.numberOfGoalsReceived = numberOfGoalsReceived;
        this.getNumberOfGoalsScored = getNumberOfGoalsScored;
        this.theNumberOfPoints = theNumberOfPoints;
        this.theNumberOfMachesPlayed = theNumberOfMachesPlayed;
        this.captianName = captianName;
        this.coachName = coachName;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getDrawsCount() {
        return drawsCount;
    }

    public void setDrawsCount(int drawsCount) {
        this.drawsCount = drawsCount;
    }

    public int getDefeatsCount() {
        return defeatsCount;
    }

    public void setDefeatsCount(int defeatsCount) {
        this.defeatsCount = defeatsCount;
    }

    public int getNumberOfGoalsReceived() {
        return numberOfGoalsReceived;
    }

    public void setNumberOfGoalsReceived(int numberOfGoalsReceived) {
        this.numberOfGoalsReceived = numberOfGoalsReceived;
    }

    public int getGetNumberOfGoalsScored() {
        return getNumberOfGoalsScored;
    }

    public void setGetNumberOfGoalsScored(int getNumberOfGoalsScored) {
        this.getNumberOfGoalsScored = getNumberOfGoalsScored;
    }

    public int getTheNumberOfPoints() {
        return theNumberOfPoints;
    }

    public void setTheNumberOfPoints(int theNumberOfPoints) {
        this.theNumberOfPoints = theNumberOfPoints;
    }

    public int getTheNumberOfMachesPlayed() {
        return theNumberOfMachesPlayed;
    }

    public void setTheNumberOfMachesPlayed(int theNumberOfMachesPlayed) {
        this.theNumberOfMachesPlayed = theNumberOfMachesPlayed;
    }

    public String getCaptianName() {
        return captianName;
    }

    public void setCaptianName(String captianName) {
        this.captianName = captianName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWinCount(), getDrawsCount(), getDefeatsCount(), getNumberOfGoalsReceived(), getGetNumberOfGoalsScored(), getTheNumberOfPoints(), getTheNumberOfMachesPlayed(), getCaptianName(), getCoachName());
    }
}