import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

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


    @Test
    void ArrayListLinkedListTest(){
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("===순차적으로 추가하기===");
        System.out.println("ArrayList: "+add1(al));
        System.out.println("LinkedList: "+add1(ll));
        System.out.println("===중간에 추가하기===");
        System.out.println("ArrayList: "+add2(al));
        System.out.println("LinkedList: "+add2(ll));

        System.out.println("===중간에 삭제하기===");
        System.out.println("ArrayList: "+remove2(al));
        System.out.println("LinkedList: "+remove2(ll));


        System.out.println("===순차적으로 삭제하기===");
        System.out.println("ArrayList: "+remove1(al));
        System.out.println("LinkedList: "+remove1(ll));


    }

    @Test
    void 접근시간테스트(){
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();
        add1(al);
        add1(ll);
        System.out.println("===접근시간 테스트===");
        System.out.println("ArrayList: "+access(al));
        System.out.println("LinkedList: "+access(ll));

    }

    @Test
    void ArrayListTest() {
        ArrayList<Integer> al = new ArrayList<>(200000);
        LinkedList<Integer> ll = new LinkedList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        ll.add(1);
        ll.add(2);
        ll.add(3);

        for (int i = 0; i < al.size(); i++) {
            System.out.println("al.get("+i+") = " + al.get(i));
        }

        for (int i = 0; i < ll.size(); i++) {
            System.out.println("ll.get("+i+") = " + ll.get(i));
        }


        for (int i = 0; i < ll.size(); i++) {
            System.out.println("ll.pop = " + ll.pop());
        }

    }

    long access(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) list.get(i);

        long end = System.currentTimeMillis();
        return end-start;
    }


    long add1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) list.add(i+"");

        long end = System.currentTimeMillis();
        return end-start;
    }

    long add2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) list.add(500,"X");

        long end = System.currentTimeMillis();
        return end-start;
    }

    long remove1(List list){
        long start = System.currentTimeMillis();
        for(int i = list.size()-1; i>=0; i--) list.remove(i);

        long end = System.currentTimeMillis();
        return end-start;
    }


    long remove2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) list.remove(i);

        long end = System.currentTimeMillis();
        return end-start;
    }


    @Test
    void StackQueueTest(){
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("1");
        st.push("2");
        st.push("3");

        q.offer("0");
        q.offer("1");
        q.offer("2");


        System.out.println("===stack===");
        while(!st.isEmpty()){
            System.out.println("st.pop() = " + st.pop());
        }

        System.out.println("===queue===");
        while(!q.isEmpty()){
            System.out.println("q.poll() = " + q.poll());
        }


    }


    @Test
    void ArrayListTestTest(){
        ArrayList<String> a = new ArrayList<>();

        for(long i =0; i<5000000L; i++){
            if(i%10 == 0){
                a.add("황인규");
            } else {
                a.add("편도훈");
            }
        }

        long start = System.currentTimeMillis();

        a.forEach(x-> {
            x.equals("황인규");

        });

        long end = System.currentTimeMillis();


        System.out.println("foreach = " + (end-start));

        start =System.currentTimeMillis();
        a.stream().map(x -> x.equals("황인규"));

        end = System.currentTimeMillis();
        System.out.println("stream map = " + (end-start));
    }


}
