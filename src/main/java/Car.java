import java.util.concurrent.ThreadLocalRandom;

public class Car {
    private final int FORWARD_NUM = 4;

    private Name name;
    private Position position; //음수는 안됨.

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public Name getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()) position.getPlus();
    }
    public void move(int randomNum) {
        if(randomNum >= FORWARD_NUM) position.getPlus();
    }
    public void move() {
        int randomNum = getRandomNum();
        if(randomNum >= 4) position.getPlus();
    }

    protected int getRandomNum() {
        int result = ThreadLocalRandom.current().nextInt(7) + 1;
        return result;
    }

    public Car returnMaxPosCar(Car bestPositionCar) {
        if(this.position.smallerThan(bestPositionCar.position)) {
            return bestPositionCar;
        }
        return this;
    }

    public int getPosValue() {
        return position.getPosition();
    }

    public boolean isEqaulPosTo(Car car) {
        return this.position.equals(car.position);
    }
}
