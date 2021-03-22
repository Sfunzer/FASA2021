package nl.furusupport.basic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mission {
    private String missionName;
    private LocalDate launchDate;
    private LocalDate splashDownDate;
    private Long missionSpaceDays;

    public Mission(String missionName, String launchDate){
        this.missionName = missionName;
        this.launchDate = LocalDate.parse(launchDate);
    }

    public boolean setSplashDownDate(String splashDownDate) {


        if(launchDate.isAfter(LocalDate.parse(splashDownDate)))  {
            return false;
        }

        this.splashDownDate = LocalDate.parse(splashDownDate);
        missionSpaceDays = ChronoUnit.DAYS.between(launchDate, this.splashDownDate);
            return true;




    }


}


// added field "missionSpaceDays"
// added "set SplashDownDate"