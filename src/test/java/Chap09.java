import org.junit.jupiter.api.Test;

public class Chap09 {
    
    
    @Test
    void CloneEx1(){
        Point point1 = new Point(1,1,"S");

        System.out.println("point1 = " + point1);
        
        Point point2 = (Point) point1.clone();

        System.out.println("point2 = " + point2);

        System.out.println("point1==point2" + (point1==point2));

        System.out.println("(point2.a== point1.a) = " + (point2.a== point1.a));

    }

}
