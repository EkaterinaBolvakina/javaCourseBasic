package lessons.lesson_41.practice_team.task_football;

import java.util.Arrays;
import java.util.List;

public class FootballTeamDemo {


    /*
    из коллекции команд отобрать:
    - самую сильную
    - все команды из Essen
     */
    public static void main(String[] args) {

        List<FootballTeam> footballTeams = Arrays.asList(
                new FootballTeam("Dusseldorf", 7),
                new FootballTeam("Essen", 4),
                new FootballTeam("Cologne", 5),
                new FootballTeam("Dortmund", 6),
                new FootballTeam("Bonn", 3),
                new FootballTeam("Berlin", 6),
                new FootballTeam("Leipzig", 5),
                new FootballTeam("Essen 2", 3),
                new FootballTeam("Essen 3", 3)
                );
        System.out.println("Best football team: "+
                footballTeams.stream()
                        .max((power1,power2) -> power1.getPower() - power2.getPower())
                        .orElse(null)
                );

        List<String> footballTeamsEssen = footballTeams.stream()
                .filter(name -> name.getName().contains("Essen"))
                .map(FootballTeam::getName)
                .toList();
        System.out.println("Football teams from Essen: "+footballTeamsEssen);






    }
}
