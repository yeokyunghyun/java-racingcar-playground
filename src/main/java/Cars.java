import java.util.List;

public class Cars {
    private CarRepository carRepository;

    public Cars(List<Car> cars) {
        carRepository = new CarRepository(cars);
    }

    public List<Car> findWinner() {
        return carRepository.findWinner();
    }
}
