import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        if(position < 0) throw new IllegalArgumentException("position은 0이상이어야 합니다.");
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public void getPlus() {
        this.position += 1;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public boolean smallerThan(Position comparePosition) {
        return this.position < comparePosition.position;
    }
}
//불변 클래스라고 함. immortal class