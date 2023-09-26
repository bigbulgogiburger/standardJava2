package chap12Generics;


import org.junit.jupiter.api.Test;

public class EnumEx1 {

    @Test
    void enumTest(){
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class,"EAST");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d1==d2 = " + (d1 == d2));
        System.out.println("d1==d3 = " + (d1 == d3));
        System.out.println("(d1.equals(d3)) = " + (d1.equals(d3)));
        System.out.println("(d1.compareTo(d3)) = " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) = " + d1.compareTo(d2));

        switch (d1){
            case EAST:
                System.out.println("Direction is West");break;
            case SOUTH:
                System.out.println("Direction is SOUTH");break;
            case WEST:
                System.out.println("Direction is WEST");break;
            case NORTH:
                System.out.println("Direction is NORTH");break;
            default:
                System.out.println("Invalid direction");
                break;


        }

        Direction[] values = Direction.values();

        for (Direction value : values) {
            System.out.printf("%s=%d%n",value.name(),value.ordinal());
        }

    }
}


enum Direction{
    EAST,SOUTH,WEST,NORTH;
}
