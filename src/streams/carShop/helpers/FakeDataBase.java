package streams.carShop.helpers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class FakeDataBase {

    private List<Order> orders = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();

    Car bentley1    = new Car("Bentley", "Speed Six Grafton Coupe FR2630 ", CarColor.BLACK, CarStatus.USED, BigDecimal.valueOf(12784200));
    Car lambo1      = new Car("Lamborghini", "Murciélago", CarColor.SILVER, CarStatus.NEW, BigDecimal.valueOf(1147200));
    Car tesla1      = new Car("Tesla", "Model S", CarColor.BLUE, CarStatus.NEW, BigDecimal.valueOf(424605));
    Car ferrari1    = new Car("Ferrari", "488 Spider", CarColor.RED, CarStatus.NEW, BigDecimal.valueOf(1880000));
    Car volkswagen1 = new Car("Volkswagen", "Passat", CarColor.SILVER, CarStatus.USED, BigDecimal.valueOf(48999));
    Car bolid1      = new Car("Aston Martin", "Bolid AMR22", CarColor.TURQUOISE, CarStatus.NEW, BigDecimal.valueOf(60345000));
    Car skoda1      = new Car("Skoda", "Octavia Kombi", CarColor.WHITE, CarStatus.USED, BigDecimal.valueOf(17500));
    Car volvo1      = new Car("Volvo", "XC40", CarColor.LIGHT_BLUE, CarStatus.NEW, BigDecimal.valueOf(139900));
    Car mitsubishi1 = new Car("Mitsubishi", "ASX", CarColor.BLUE, CarStatus.USED, BigDecimal.valueOf(46900));
    Car skoda2      = new Car("Skoda", "Rapid", CarColor.WHITE, CarStatus.NEW, BigDecimal.valueOf(28000));
    Car honda1      = new Car("Honda", "CRV", CarColor.BLACK, CarStatus.USED, BigDecimal.valueOf(30800));
    Car audi1       = new Car("Audi", "Q5", CarColor.BLACK, CarStatus.USED, BigDecimal.valueOf(45900));
    Car mercedes1   = new Car("Mercedes", "C 200", CarColor.SILVER, CarStatus.USED, BigDecimal.valueOf(19800));
    Car volvo2      = new Car("Volvo", "V60", CarColor.SILVER, CarStatus.USED, BigDecimal.valueOf(43500));

    Customer thomasShelby = new Customer("Thomas", "Shelby", 43);
    Customer bruceWayne = new Customer("Bruce", "Wayne", 32);
    Customer januszNosacz = new Customer("Janusz", "Nosacz", 41);
    Customer robertKubica = new Customer("Robert", "Kubica", 38);
    Customer janKowalski = new Customer("Jan", "Kowalski", 35);
    Customer patrycjaMakowska = new Customer("Patrycja", "Makowska", 21);
    Customer rebeccaHayes = new Customer("Rebecca", "Hayes", 24);
    Customer anneValentinne = new Customer("Anne", "Valentine", 26);
    Customer filipSims = new Customer("Filip", "Sims", 32);

    Order order0 = new Order(thomasShelby, Collections.singletonList(bentley1), LocalDate.of(2019, 5,23));
    Order order1 = new Order(bruceWayne, Arrays.asList(lambo1, tesla1, ferrari1), LocalDate.of(2022, 3, 14));
    Order order2 = new Order(januszNosacz, Collections.singletonList(volkswagen1), LocalDate.of(2022, 7, 9));
    Order order3 = new Order(robertKubica, Collections.singletonList(bolid1), LocalDate.of(2021, 1, 15));
    Order order4 = new Order(janKowalski, Collections.singletonList(skoda1), LocalDate.of(2023, 2, 11));
    Order order5 = new Order(patrycjaMakowska, Collections.singletonList(volvo1), LocalDate.of(2023, 2, 12));
    Order order6 = new Order(rebeccaHayes, Arrays.asList(mitsubishi1, skoda2), LocalDate.of(2022, 10, 14));
    Order order7 = new Order(anneValentinne, Arrays.asList(honda1, audi1), LocalDate.of(2022, 11, 4));
    Order order8 = new Order(filipSims, Arrays.asList(mercedes1, volvo2), LocalDate.of(2022, 9, 16));

    public List<Order> getOrders() {

        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order0);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        return orders;
    }

    public List<Customer> getCustomers() {
        customers.add(thomasShelby);
        customers.add(bruceWayne);
        customers.add(januszNosacz);
        customers.add(robertKubica);
        customers.add(janKowalski);
        customers.add(patrycjaMakowska);
        customers.add(rebeccaHayes);
        customers.add(anneValentinne);
        customers.add(filipSims);

        return customers;
    }

    public List<Car> getCars() {
        cars.add(bentley1);
        cars.add(lambo1);
        cars.add(tesla1);
        cars.add(ferrari1);
        cars.add(volkswagen1);
        cars.add(bolid1);
        cars.add(skoda1);
        cars.add(volvo1);
        cars.add(mitsubishi1);
        cars.add(skoda2);
        cars.add(honda1);
        cars.add(audi1);
        cars.add(mercedes1);
        cars.add(volvo2);

        return cars;
    }
}
