import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class chap10 {

    @Test
    void CalendarEx1(){
        Calendar today = Calendar.getInstance();
        System.out.println("Calendar.YEAR = " + today.get(Calendar.YEAR));
        System.out.println("Calendar.MONTH = " + today.get(Calendar.MONTH));
        System.out.println("Calendar.WEEK_OF_YEAR = " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Calendar.WEEK_OF_MONTH = " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Calendar.DAY_OF_MONTH = " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar.DAY_OF_WEEK = " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar.DATE = " + today.get(Calendar.DATE));


    }

    @Test
    void localDateTimeTest(){
        LocalDateTime localDateTime = LocalDateTime.parse("2023-08-27T09:00:00");
        System.out.println("localDateTime = " + localDateTime);
        ZoneId zone = ZoneId.of("Asia/seoul");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zone);
    }

    @Test
    void hashMapTest(){
        Map<String,String> a = new HashMap<>();

        a.put("a","sa");
        a.put("b","sb");
        a.put("c","sc");
        a.put("d","sd");
        a.put("e","se");
        a.put("f","sf");

        Set<Map.Entry<String, String>> entries = a.entrySet();
        entries.forEach(x-> System.out.println("x.getKey() = " + x.getKey()+", "+"x.getValue() = "+x.getValue()));
    }


    @Test
    void ArrayListEx1(){
        ArrayList list1 = new ArrayList<>(10);

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList<>(list1.subList(1, 4));
        print(list1,list2);
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);
        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));
        list2.add("B");
        list2.add("C");
        list2.add("A");
        print(list1,list2);
        list2.set(3,"AA");
        print(list1,list2);

        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));

        for(int i=list2.size()-1;i>=0;i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }

        print(list1,list2);
    }

    void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
