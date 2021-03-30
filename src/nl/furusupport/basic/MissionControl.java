package nl.furusupport.basic;

import java.util.ArrayList;

public class MissionControl {
    private String missionControlName;
    private String missionControlLocation;
    private boolean splashcheck;

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

    public void addMission(Mission newMission) {
                missionStore.add(newMission);
            }

    public void showTravelCompanions(Astronaut keyNaut){
        for (Mission linkedMission: keyNaut.getAssignedMissions()) {


            for (Astronaut aCompanion:astronautsStore) {


            }
        }

            }

    public ArrayList<Mission> getMissionStore() {
        return missionStore;
    }

    public boolean setTotalSplashdown (Mission whichMission, String splashDay) {
        for (Mission nextMission:missionStore) {
            if (whichMission.equals(nextMission)) {
                splashcheck = nextMission.setSplashDownDate(splashDay);
                
            }
            return splashcheck;
        }
        if (!splashcheck) {

            for (Astronaut nextAstronaut:astronautsStore) {
               splashcheck = nextAstronaut.setAstronautSplashdown(whichMission, splashDay);
                
            }
        }
        return splashcheck;
    }


    public Mission getSpecificMission(Integer missionID){
        return missionStore.get(missionID);
    }

    public Astronaut getSpecificAstronaut(Integer astronautID){
        return astronautsStore.get(astronautID);
    }

    public void setAstronautMission(Mission newMission, Astronaut whichAstronaut){
        for (Astronaut nextAstronaut: astronautsStore) {
            if (whichAstronaut.equals(nextAstronaut)){
                nextAstronaut.assignMission(newMission);
            }
        }
    }

    public ArrayList<Astronaut> getAstronautsStore() {
        return astronautsStore;
    }


}