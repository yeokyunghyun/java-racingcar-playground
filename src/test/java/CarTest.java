import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void randomMoveTest() {
/*
        Car car = new Car("pobi") {
            @Override
            protected int getRandomNum() {
                return 4;
            }
        };
*/

        Car car = new Car("pobi");
        car.move(4);
        Assertions.assertThat(car.getPosition()).isEqualTo(1);
        Assertions.assertThatThrownBy(() -> new Car("pobi")).isInstanceOf(IllegalArgumentException.class);
/*
        Car car2 = new Car("popo");
        MovingStrategy movingStrategy = new RandomMovingStrategy();
        car2.move(movingStrategy);
*/
    }
}
