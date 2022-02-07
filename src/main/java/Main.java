import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Mohammed Salah", "RW", 11, 5);

        Manager klopp = new Manager("Jurgen Klopp");

        Team liverpool = new Team("Liverpool", klopp);


        TeamService teamService = new TeamService();

        int spacesInTeam = teamService.countEmptySpacesOnTeam(liverpool);
        System.out.println(spacesInTeam);
    }
}
