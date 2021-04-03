package nl.furusupport.basic;
//Fontys Aeronautics and Space Administration

public class Main {

    static MissionControl houston;
    static Astronaut tempoNaut;

    public static void main(String[] args) {
	houston = new MissionControl("NASA", "Houston");

	houston.addMission(new Mission("STS-31", "1990-04-24"));
	houston.addMission(new Mission("STS-94", "1997-07-01"));
	houston.addMission(new Mission("STS-52", "1992-10-22"));
	houston.addMission(new Mission("STS-103", "1999-12-19"));
	houston.addMission(new Mission("SpX-DM2", "2020-05-30"));

	houston.addAstronaut(new Astronaut("Loren J. Shriver", "American"));
	houston.addAstronaut(new Astronaut("Charles F. Bolden Jr.", "American"));

	houston.addAstronaut(new Astronaut("James D. Halsell", "American"));
	houston.addAstronaut(new Astronaut("Susan L. Still", "American"));

	houston.addAstronaut(new Astronaut("Douglas Hurley", "American"));
	houston.addAstronaut(new Astronaut("Robert Behnken", "American"));

    houston.setAstronautMission(houston.getSpecificMission(0), houston.getSpecificAstronaut(0) );
    houston.setAstronautMission(houston.getSpecificMission(0), houston.getSpecificAstronaut(1) );
    houston.setAstronautMission(houston.getSpecificMission(0), houston.getSpecificAstronaut(2) );
    houston.setAstronautMission(houston.getSpecificMission(0), houston.getSpecificAstronaut(3) );

    houston.setAstronautMission(houston.getSpecificMission(1), houston.getSpecificAstronaut(2) );
    houston.setAstronautMission(houston.getSpecificMission(1), houston.getSpecificAstronaut(3) );

    houston.setAstronautMission(houston.getSpecificMission(4), houston.getSpecificAstronaut(4) );
    houston.setAstronautMission(houston.getSpecificMission(4), houston.getSpecificAstronaut(5) );

    houston.setAstronautMission(houston.getSpecificMission(3), houston.getSpecificAstronaut(0) );
    houston.setAstronautMission(houston.getSpecificMission(3), houston.getSpecificAstronaut(1) );
    houston.setAstronautMission(houston.getSpecificMission(3), houston.getSpecificAstronaut(2) );
    houston.setAstronautMission(houston.getSpecificMission(3), houston.getSpecificAstronaut(3) );

    houston.setTotalSplashdown(houston.getSpecificMission(0), "1990-04-30");
    houston.setTotalSplashdown(houston.getSpecificMission(1), "1997-07-17");
    houston.setTotalSplashdown(houston.getSpecificMission(2), "1992-11-01" );
    houston.setTotalSplashdown(houston.getSpecificMission(3), "1999-12-27" );
    houston.setTotalSplashdown(houston.getSpecificMission(4), "2020-08-02" );

    houston.calculateAllAstronautSpaceDays();

        System.out.println("\nMission List:\n");
        for (Mission nextMission: houston.getMissionStore()) {
            System.out.println(nextMission.toString());
        }
        System.out.println("\nAstronaut List:\n");
        for (Astronaut nextAstronaut: houston.getAstronautsStore()) {
            System.out.println(nextAstronaut.toString());
        }

        System.out.println("\nAstronaut MissionList:\n");
        for (Astronaut nextAstronaut: houston.getAstronautsStore()) {
            System.out.println("MissionList for: " + nextAstronaut.getAstronautName());
            for (Mission missionList: nextAstronaut.getAssignedMissions()){
                System.out.println(missionList.toString());
            }
            System.out.println();
        }

        tempoNaut = houston.getSpecificAstronaut(3);

        System.out.println("\nAstronaut CompanionList from: " + tempoNaut.getAstronautName() + "\n");
        for (Astronaut companionNauts: houston.showTravelCompanions(tempoNaut)) {
            System.out.println(companionNauts.getAstronautName());
        }

        tempoNaut = houston.getSpecificAstronaut(5);

        System.out.println("\nAstronaut CompanionList from: " + tempoNaut.getAstronautName() + "\n");
        for (Astronaut companionNauts: houston.showTravelCompanions(tempoNaut)) {
            System.out.println(companionNauts.getAstronautName());
        }

    }
}
