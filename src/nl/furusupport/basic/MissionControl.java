package nl.furusupport.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissionControl {
    private final String missionControlName;
    private final String missionControlLocation;
    private boolean splashcheck;

    private final List<Astronaut> astronautsStore;
    private final List<Mission> missionStore;
    private final List<Astronaut> companionStore;
    private final List<Astronaut> companionStoreClean;

    public MissionControl(String missionControlName, String missionControlLocation){
        this.missionControlName = missionControlName;
        this.missionControlLocation = missionControlLocation;

        astronautsStore = new ArrayList<>();
        missionStore = new ArrayList<>();
        companionStore = new ArrayList<>();
        companionStoreClean = new ArrayList<>();
        }

    public void addAstronaut(Astronaut newAstronaut){
                astronautsStore.add(newAstronaut);
                }

    public void addMission(Mission newMission) {
                missionStore.add(newMission);
            }




    public List<Astronaut> showTravelCompanions(Astronaut keyNaut){
        companionStore.clear();
        companionStoreClean.clear();

        for (Mission linkedMission: keyNaut.getAssignedMissions()) {


            for (Astronaut aCompanion:astronautsStore) {
                for (Mission astronautAssignedMission:aCompanion.getAssignedMissions()) {
                    if (linkedMission.equals(astronautAssignedMission)) {
                        companionStore.add(aCompanion);
                    }
                }
            }
        }
        for (Astronaut tempoNaut20:companionStore) {
            if (!tempoNaut20.equals(keyNaut)){
                if (!companionStoreClean.contains(tempoNaut20)) {
                    companionStoreClean.add(tempoNaut20);
                }
            }
        }
        return Collections.unmodifiableList(companionStoreClean);
            }

    public List<Mission> getMissionStore() {
        return Collections.unmodifiableList(missionStore);
    }

    public boolean setTotalSplashdown (Mission whichMission, String splashDay) {
        for (Mission nextMission:missionStore) {
            if (whichMission.equals(nextMission)) {
                splashcheck = nextMission.setSplashDownDate(splashDay);
                
            }
        }
        if (!splashcheck) {
            for (Astronaut nextAstronaut:astronautsStore) {
               splashcheck = nextAstronaut.setAstronautSplashdown(whichMission, splashDay);
            }
        }
        return splashcheck;
    }

    public void calculateAllAstronautSpaceDays(){
        for (Astronaut nextAstronaut:astronautsStore) {
            nextAstronaut.calculateAstronautTotalSpaceDays();
        }
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

    public List<Astronaut> getAstronautsStore() {
        return Collections.unmodifiableList(astronautsStore);
    }
}


