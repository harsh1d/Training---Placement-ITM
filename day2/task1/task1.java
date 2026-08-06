// create ipl team collection and add there names into the collection ...

package day2.task1;

import java.util.ArrayList;
import java.util.Collection;

public class task1 {
    public static void main(String[] args) {
        Collection<String> iplTeams = new ArrayList<>();
        
        iplTeams.add("Chennai Super Kings");
        iplTeams.add("Mumbai Indians");
        iplTeams.add("Kolkata Knight Riders");
        iplTeams.add("Delhi Capitals");
        iplTeams.add("Royal Challengers Bangalore");
        iplTeams.add("Sunrisers Hyderabad");
        iplTeams.add("Rajasthan Royals");
        iplTeams.add("Punjab Kings");
        iplTeams.add("Lucknow Super Giants");
        iplTeams.add("Gujarat Titans");

        System.out.println("IPL Teams: " + iplTeams);
        // use contains method to check if a specific team is present in the collection
        System.out.println(iplTeams.contains("Chennai Super Kings"));
        // remove ipl team
        iplTeams.remove("Chennai Super Kings");   
        System.out.println("IPL Teams after removal: " + iplTeams);
    }
}