package nl.furusupport.basic;

import java.util.ArrayList;

public class Astronaut {
    private String astronautName;
    private String astronautNationality;
    private ArrayList<Mission> assignedMissions;
    private Long totalSpaceDays;
    private boolean splashcheck;


    public Astronaut(String astronautName, String astronautNationality){
        this.astronautName = astronautName;
        this.astronautNationality = astronautNationality;

        assignedMissions = new ArrayList();
    }
    public void assignMission (Mission nextMission){
        assignedMissions.add(nextMission);
        //return true;
    }

    public boolean setAstronautSplashdown(Mission whichMission, String splashDay) {
        for (Mission nextMission:assignedMissions) {
            if (whichMission.equals(nextMission)) {
                splashcheck = nextMission.setSplashDownDate(splashDay);

            }
            //return splashcheck;
        }
        return splashcheck;
    }


    public Long calculateTotalSpaceDays(){
        for (Mission nextSpaceDaysCount:assignedMissions) {
            totalSpaceDays = totalSpaceDays + nextSpaceDaysCount.getMissionSpaceDays();
        }
        return totalSpaceDays;
    }

    public ArrayList<Mission> getAssignedMissions() {
        return assignedMissions;
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
                '}';
    }
}


