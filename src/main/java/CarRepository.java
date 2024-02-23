import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
    private List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinner() {
        if(cars.isEmpty()) throw new IllegalArgumentException("저장된 차가 없습니다.");


        Car maxPosCar = new Car("min");

        for (Car car : cars) {
            maxPosCar = maxPosCar.returnMaxPosCar(car);
        }

        Car finalMaxPosCar = maxPosCar;
        List<Car> winnerCars = cars.stream().filter(car -> car.isEqaulPosTo(finalMaxPosCar)).collect(Collectors.toList());
        return winnerCars;
    }
}
