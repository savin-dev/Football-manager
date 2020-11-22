package footballmanager.models;

import java.io.Serializable;

public class SportsClub implements Serializable {
    private String nameOfTheClub;
    private String location;

    public SportsClub(){

    }

    public SportsClub(String nameOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
    }

    public SportsClub(String nameOfTheClub, String location) {
        this.nameOfTheClub = nameOfTheClub;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        return this.nameOfTheClub.equals(((SportsClub)o).nameOfTheClub);
    }

    public String getNameOfTheClub() {
        return nameOfTheClub;
    }

    public void setNameOfTheClub(String nameOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}