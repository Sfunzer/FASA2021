package nl.furusupport.basic;

import java.util.ArrayList;

public class MissionControl {
    private String missionControlName;
    private String missionControlLocation;

    private ArrayList<Astronaut> astronautsStore;
    private ArrayList<Mission> missionStore;


    public MissionControl(String missionControlName, String missionControlLocation){
        this.missionControlName = missionControlName;
        this.missionControlLocation = missionControlLocation;

        astronautsStore = new ArrayList<>();
        missionStore = new ArrayList<>();
        }

            public void addAstronaut(Astronaut newAstronaut){
                astronautsStore.add(newAstronaut);
                }

            public void addMission(Mission newMission){
                missionStore.add(newMission);
                }


}