package tack2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order newOrder = new Order();
        newOrder.setNber(1);
        newOrder.setCreateDate(LocalDate.now());
        newOrder.setCreateTime(LocalTime.now());
        Product newProduct = new Product();
        newProduct.setName("Веселый молочник");
        newProduct.setType(ProductType.MILK);
        newOrder.setPoduct(new ArrayList<>());
        newOrder.getProducts().add(newProduct);
        orders.add(newOrder);
        System.out.println(orders);

        Order newOrder1 = new Order();
        newOrder1.setNber(2);
        newOrder1.setCreateDate(LocalDate.now());
        newOrder1.setCreateTime(LocalTime.now());
        Product newProduct1 = new Product();
        newProduct.setName("Хлеб");
        newProduct.setType(ProductType.BREAD);
        newOrder1.setPoduct(new ArrayList<>());
        newOrder1.getProducts().add(newProduct1);
        orders.add(newOrder1);
        System.out.println(newOrder);


        Order newOrder2 = new Order();
        newOrder1.setNber(2);
        newOrder1.setCreateDate(LocalDate.now());
        newOrder1.setCreateTime(LocalTime.now());
        Product newProduct2 = new Product();
        newProduct.setName("Мука");
        newProduct.setType(ProductType.MEAL);
        newOrder1.setPoduct(new ArrayList<>());
        newOrder1.getProducts().add(newProduct2);
        orders.add(newOrder2);
        System.out.println(newOrder2);
    }
}

