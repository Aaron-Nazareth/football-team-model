package teams;

import players.Player;

public class TeamService {

    public TeamService() {}

    // count empty spaces on team
    // return int
    // parameters: team
    public int countEmptySpacesOnTeam(Team team) {
        // Temporary variable to store a count
        int count = 0;
        // Loop through players array and count nulls
        for (Player player : team.getPlayers()) {
            // if statement
            // if player is null, add one to count
            if (player == null) {
                count++;
            }
        }
        return count;
    }


    public void addPlayerToTeam(Team team, Player player) {
        // Check if there is space on the team
        int spaces = countEmptySpacesOnTeam(team);
        // if there is, add the player
        if (spaces > 0) {
            // get players array from team
            Player[] players = team.getPlayers();

            // add player to first available empty space
            // loop through players array
            for (int i = 0; i < players.length; i++) {
                // if we find an empty space, add the player then break
                if (players[i] == null) {
                    players[i] = player;
                    break;
                }
            }
        }
    }
}
