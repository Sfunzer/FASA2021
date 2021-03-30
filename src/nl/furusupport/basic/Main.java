package nl.furusupport.basic;
//Fontys Aeronautics and Space Administration

public class Main {

    static MissionControl Houston;

    public static void main(String[] args) {
	Houston = new MissionControl("NASA", "Houston");

	Houston.addMission(new Mission("STS-31", "1990-04-24"));

	Houston.addMission(new Mission("STS-94", "1997-07-01"));



	Houston.addAstronaut(new Astronaut("Loren J. Shriver", "American"));
	Houston.addAstronaut(new Astronaut("Charles F. Bolden Jr.", "American"));

	Houston.addAstronaut(new Astronaut("James D. Halsell", "American"));
	Houston.addAstronaut(new Astronaut("Susan L. Still", "American"));

    Houston.setAstronautMission(Houston.getSpecificMission(0), Houston.getSpecificAstronaut(0) );
    Houston.setAstronautMission(Houston.getSpecificMission(0), Houston.getSpecificAstronaut(1) );


    Houston.setTotalSplashdown(Houston.getSpecificMission(0), "1990-04-29");

        System.out.println("\nMission List:\n");
        for (Mission nextMission:Houston.getMissionStore()) {
            System.out.println(nextMission.toString());
        }
        System.out.println("\nAstronaut List:\n");
        for (Astronaut nextAstronaut: Houston.getAstronautsStore()) {
            System.out.println(nextAstronaut.toString());
        }

        System.out.println("\nAstronaut MissionList:\n");
        for (Astronaut nextAstronaut: Houston.getAstronautsStore()) {
            System.out.println("MissionList for: " + nextAstronaut.getAstronautName());
            for (Mission missionList: nextAstronaut.getAssignedMissions()){
                System.out.println(missionList.toString());
            }
            System.out.println();


        }





    }
}
