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

        try {
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
            teamService.addPlayerToTeam(liverpool, salah);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int spacesInTeamAfter = teamService.countEmptySpacesOnTeam(liverpool);
        System.out.println(spacesInTeamAfter);
    }
}
