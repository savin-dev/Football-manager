package footballmanager.models;

import java.io.Serializable;

public class UniversityFootballClub extends FootballClub {

    private int unicode;

    public UniversityFootballClub(){

    }

    public UniversityFootballClub(int unicode, String univercityCaptainName, String univercityCoachName) {
        this.unicode = unicode;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityFootballClub)) return false;
        UniversityFootballClub that = (UniversityFootballClub) o;
        return getUnicode() == that.getUnicode() && super.equals(that);
    }
}