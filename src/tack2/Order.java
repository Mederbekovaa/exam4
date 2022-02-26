package tack2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Order {
    private int num;
    private LocalDate dateOrder;


    private LocalTime timeOrder;
    private List<Product> products = new ArrayList<>();


    public int getNum() {
        return num;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public LocalTime getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(LocalTime timeOrder) {
        this.timeOrder = timeOrder;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public void setNum(int num) {
        this.num = num;
    }

    public void setCreateDate(LocalDate now) {
    }

    public void setNber(int i) {
    }

    public void setCreateTime(LocalTime now) {
    }

    public void setPoduct(ArrayList<Object> objects) {
    }


    public Collection<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "num=" + num +
                ", dateOrder=" + dateOrder +
                ", timeOrder=" + timeOrder +
                ", products=" + products +
                '}';
    }
}
