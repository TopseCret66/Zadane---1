package com.company.obstacles;

import com.company.participants.Competitor;
import com.company.participants.Team;

public final class Competition {

    public static void startCompetition(Team team, Obstacle[] obstacles){
        Competitor[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Competitor c: teamMembers){
                for (Obstacle o: obstacles){
                    o.pass(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
