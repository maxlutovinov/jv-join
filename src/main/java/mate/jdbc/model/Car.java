package mate.jdbc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private Long id;
    private String model;
    private Manufacturer manufacturer;
    private List<Driver> drivers;

    public Car(Long id, String model, Manufacturer manufacturer) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.drivers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(id, car.id)
                && Objects.equals(model, car.model)
                && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, manufacturer);
    }

    @Override
    public String toString() {
        return "Car{"
                + "id=" + id
                + ", model='" + model + '\''
                + ", manufacturer=" + manufacturer
                + System.lineSeparator()
                + ", drivers=" + drivers
                + '}';
    }

    @Override
    public int compareTo(Car c) {
        return (int) (id - c.id);
    }
}