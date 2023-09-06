package test11;

import java.util.Comparator;

public class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable a1 = (Comparable) o1;
            Comparable a2 = (Comparable) o2;

            return a1.compareTo(a2) * -1;

        }

        return -1;
    }
}
