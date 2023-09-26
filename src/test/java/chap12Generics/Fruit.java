package chap12Generics;


public class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }


}


class Apple extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
};

class Grape extends Fruit{

    @Override
    public String toString() {
        return "Grape";
    }
};

class Toy{};
