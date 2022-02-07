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
}
