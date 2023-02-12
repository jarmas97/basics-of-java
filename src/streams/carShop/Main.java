package streams.carShop;

import streams.carShop.helpers.*;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static FakeDataBase fakeDataBase = new FakeDataBase();
    private static final List<Order> orderList = fakeDataBase.getOrders();
    private static final List<Customer> customerList = fakeDataBase.getCustomers();
    private static final List<Car> carList = fakeDataBase.getCars();

    public static void main(String[] args) {

//------LIST OF BLACK CARS
        List<Car> blackCars = carList.stream()
                .filter(car -> car.getCarColor().equals(CarColor.BLUE))
                .collect(Collectors.toList());

        blackCars.forEach(System.out::println);
    }
}
