import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingGameTest {
    @Test
    public void winner() {
        Car c1 = new Car("car1");
        Car c2 = new Car("car2");
        Car c3 = new Car("car3");
        RacingGame game = new RacingGame(5, Arrays.asList(c1, c2, c3));

        c1.go();
        c2.go();
        c2.go();
        c3.go();
        c3.go();
        assertThat(game.getWinner().equals(Arrays.asList(c2, c3))).isTrue();
    }
}
