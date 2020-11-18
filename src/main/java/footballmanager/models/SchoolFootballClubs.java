package footballmanager.models;

import java.io.Serializable;

public class SchoolFootballClubs extends FootballClub {
    private int schoolId;

    public SchoolFootballClubs(){

    }

    public SchoolFootballClubs(int schoolId, String schoolCaptainName, String schoolCoachName) {
        this.schoolId = schoolId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolFootballClubs)) return false;
        SchoolFootballClubs that = (SchoolFootballClubs) o;
        return getSchoolId() == that.getSchoolId() && super.equals(that);
    }
    
}