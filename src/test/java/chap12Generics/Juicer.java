package chap12Generics;

public class Juicer {
//    static Juice makeJuice(FruitBox<? extends Fruit> box){
//        String tmp = "";
//
//
//        for (Fruit fruit : box.getList()) {
//            tmp+= fruit + " ";
//        }
//        return new Juice(tmp);
//    }


    static<T extends Fruit> Juice makeJuice(FruitBox<T> box){
        String tmp = "";


        for (Fruit fruit : box.getList()) {
            tmp+= fruit + " ";
        }
        return new Juice(tmp);
    }
}

class Juice{

    String name;

    public Juice(String name) {
        this.name = name;
    }
}