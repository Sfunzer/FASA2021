package nl.furusupport.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Astronaut {
    private final String astronautName;
    private final String astronautNationality;
    private final List<Mission> assignedMissions;
    private Long astronautTotalSpaceDays;
    private boolean splashcheck;


    public Astronaut(String astronautName, String astronautNationality){
        this.astronautName = astronautName;
        this.astronautNationality = astronautNationality;

        assignedMissions = new ArrayList<>();
    }
    public void assignMission (Mission nextMission){
        assignedMissions.add(nextMission);
    }

    public boolean setAstronautSplashdown(Mission whichMission, String splashDay) {
        for (Mission nextMission:assignedMissions) {
            if (whichMission.equals(nextMission)) {
                splashcheck = nextMission.setSplashDownDate(splashDay);

            }

        }
        return splashcheck;
    }


    public void calculateAstronautTotalSpaceDays(){
        astronautTotalSpaceDays = 0L;
        for (Mission nextSpaceDaysCount:assignedMissions) {
            astronautTotalSpaceDays = astronautTotalSpaceDays + nextSpaceDaysCount.getMissionSpaceDays();
        }
    }

    public List<Mission> getAssignedMissions() {
        return Collections.unmodifiableList(assignedMissions);
    }

    public String getAstronautName() {
        return astronautName;
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "astronautName='" + astronautName + '\'' +
                ", astronautNationality='" + astronautNationality + '\'' +
                ", assignedMissions=" + assignedMissions +
                "astronautTotalSpaceDays=" + astronautTotalSpaceDays +
                '}';
    }
}


