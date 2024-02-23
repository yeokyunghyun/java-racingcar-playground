import java.util.concurrent.ThreadLocalRandom;

public class RandomMovingStrategy implements MovingStrategy{
    private final int FORWARD_MOVE = 4;

    @Override
    public boolean movable() {
        return getRandomNum() >= FORWARD_MOVE;
    }

    public int getRandomNum() {
        return ThreadLocalRandom.current().nextInt(7) + 1;
    }
}
