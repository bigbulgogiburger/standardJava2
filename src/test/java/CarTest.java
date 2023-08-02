import org.junit.jupiter.api.Test;

public class CarTest {


    @Test
    void test1(){

        SCar car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        fe.water();

        car=fe;
        fe2 = (FireEngine) car;
        fe2.water();

    }

    @Test
    void test2(){
        SCar car = new SCar();
        SCar car2 = new SCar();
        FireEngine fe = null;

        car.drive();
        fe= (FireEngine) car;
        fe.drive();
        car2= fe;
        car2.drive();
    }
}
