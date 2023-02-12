package streams.carShop.helpers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Order {

    private Customer customer;
    private List<Car> products;
    private LocalDate orderDate;

    public Order(Customer customer, List<Car> products, LocalDate orderDate) {
        this.customer = customer;
        this.products = products;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Car> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public BigDecimal getTotalCost() {
        BigDecimal result = BigDecimal.valueOf(0);
        for (Car car : getProducts()) {
            result = result.add(car.getPrice());
        }
        return result;
    }
}
