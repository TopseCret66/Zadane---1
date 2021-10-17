package com.company;

import com.company.obstacles.*;
import com.company.participants.*;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        Team team = new Team("Winners", competitors);

        System.out.println("☢☢☢☢☢☢☢☢☢☢☢☢created new team☢☢☢☢☢☢☢☢☢☢☢☢");
        System.out.println(team.getTeamName());

        System.out.println("☢☢☢☢☢☢☢☢☢☢☢☢greeting team members☢☢☢☢☢☢☢☢☢☢☢☢");
        team.showResults();

        System.out.println("☢☢☢☢☢☢☢☢☢☢☢☢team goes to course☢☢☢☢☢☢☢☢☢☢☢☢");
        Competition.startCompetition(team, obstacles);

        System.out.println("☢☢☢☢☢☢☢☢☢☢☢☢show team Results☢☢☢☢☢☢☢☢☢☢☢☢");
        team.showResults();

        System.out.println("☢☢☢☢☢☢☢☢☢☢☢☢team members finished course☢☢☢☢☢☢☢☢☢☢☢☢");
        team.showMembersFinishedCourse();
    }
}