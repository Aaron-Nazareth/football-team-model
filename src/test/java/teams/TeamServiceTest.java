package teams;

import managers.Manager;
import org.junit.jupiter.api.Test;
import players.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceTest {

    @Test
    void canCountEmptySpacesOnTeamWhenEmpty() {
        // Given
        Manager manager = new Manager("test manager");
        Team team = new Team("test fc", manager);
        TeamService underTest = new TeamService();
        // When
        int actual = underTest.countEmptySpacesOnTeam(team);
        // Then
        int expected = 11;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCountEmptySpacesOnTeamWithOnePlayer() {
        // Given
        Manager manager = new Manager("test manager");
        Team team = new Team("test fc", manager);
        Player player = new Player("testinho", "ST", 9, 3);
        TeamService underTest = new TeamService();
        team.getPlayers()[0] = player;
        // When
        int actual = underTest.countEmptySpacesOnTeam(team);
        // Then
        int expected = 10;
        assertThat(actual).isEqualTo(expected);
    }
}
