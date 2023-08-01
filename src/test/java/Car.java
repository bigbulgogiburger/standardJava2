public class Car {

    String car;
    String gearType;
    String door;

    public Car(String car, String gearType, String door) {
        this.car = car;
        this.gearType = gearType;
        this.door = door;
    }
    public Car(Car c) {
        this.car = c.car;
        System.out.println("in constructor : "+(this.car==c.car));
        this.gearType = c.gearType;
        this.door = c.door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door='" + door + '\'' +
                '}';
    }

}
