package tack4;

import java.util.List;
import java.util.Objects;

public class Student {

    private int pin;
    private String name;
    private List<Integer> bals;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculet (){
        int sum = 0;
        for (int i = 0; i < bals.size(); i++){
            sum = sum + bals.get(i);
        }
        return sum;
    }

    public List<Integer> getBals() {
        return bals;
    }

    public void setBals(List<Integer> bals) {
        this.bals = bals;
    }

    @Override
    public String toString() {
        return "Student{" +
                "pin=" + pin +
                ", name='" + name + '\'' +
                ", bals=" + bals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return pin == student.pin && Objects.equals(name, student.name) && Objects.equals(bals, student.bals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, name, bals);
    }


}
