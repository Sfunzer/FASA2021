package nl.furusupport.basic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mission {
    private String missionName;
    private String launchDate;
    private String splashDownDate;
    private Long missionSpaceDays;

    public Mission(String missionName, String launchDate){
        this.missionName = missionName;
        this.launchDate = launchDate;
    }

    public void setSplashDownDate(String splashDownDate) {
        this.splashDownDate = splashDownDate;

        missionSpaceDays = ChronoUnit.DAYS.between(LocalDate.parse(launchDate), LocalDate.parse(splashDownDate));
    }


}
