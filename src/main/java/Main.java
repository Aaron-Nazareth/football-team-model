import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

public class Main {

    public static void main(String[] args) {
        Player salah = new Player("Mohammed Salah", "RW", 11, 5);

        Manager klopp = new Manager("Jurgen Klopp");

        Team liverpool = new Team("Liverpool", klopp);


        TeamService teamService = new TeamService();

        int spacesInTeamBefore = teamService.countEmptySpacesOnTeam(liverpool);
        System.out.println(spacesInTeamBefore);

        teamService.addPlayerToTeam(liverpool, salah);

        int spacesInTeamAfter = teamService.countEmptySpacesOnTeam(liverpool);
        System.out.println(spacesInTeamAfter);
    }
}
