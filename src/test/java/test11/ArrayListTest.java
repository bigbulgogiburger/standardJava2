package test11;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        // phone을 지네릭 타입으로 가지는 arrayList생성 -1
        // 기본생성자는 사이즈가 10인 리스트 생성
        ArrayList<Phone> phoneList1 = new ArrayList<>();


        //remove시의 equals 비교를 위해 미리 객체를 생성한다.
        Phone phone = new Phone("samsung", "galaxy10");
        // 핸드폰 4개의 회사와 기종을 입력한다.
        phoneList1.add(phone);
        phoneList1.add(new Phone("apple","iPhone10"));
        phoneList1.add(new Phone("nokia","aa"));
        phoneList1.add(new Phone("samsung","galaxy11"));


        //forEach로 list1 출력(순서대로)
        phoneList1.forEach(System.out::println);
        System.out.println(" ==================list1 출럭 종료================== ");


        // phone을 지네릭 타입으로 가지는 arrayList생성 -2
        ArrayList<Phone> phoneList2 = new ArrayList<>();


        // 핸드폰 2개의 회사와 기종을 입력한다.(리스트 1번의 0번째 폰과 리스트 2번의 0번째 폰의 회사와 기종은 같지만
        // new 했기 때문에 다른 객체이다 -> 기존 equals는 false)
        phoneList2.add(new Phone("samsung","galaxy10"));
        phoneList2.add(new Phone("apple","iPhone10"));
        //list1에 추가되었던 객체 추가.
        phoneList2.add(phone);

        //forEach로 list2 출력(순서대로)
        phoneList2.forEach(System.out::println);
        System.out.println(" ==================list2 출럭 종료================== ");



        // list1과 list2 합치기
        phoneList1.addAll(phoneList2);

        //forEach로 list1 출력(순서대로)
        //같은 객체 list1의 0번인덱스, list2의 2번인덱스가 들어갔지만 중복 허용으로 인하여 같은 객체가 중복 삽입 가능.
        phoneList1.forEach(System.out::println);
        System.out.println(" ==================list1 출럭 종료================== ");


        //equals 비교를 통하여 같은지 확인하고 지우기 때문에, 새로운 객체를 생성하여 remove해도 0번 인덱스의 객체가 삭제된다.
        phoneList1.remove(new Phone("samsung", "galaxy10"));
        //forEach로 list1 출력(순서대로)
        phoneList1.forEach(System.out::println);
        System.out.println(" ==================list1 출럭 종료================== ");

        //index를 찾는 메소드로 equals를 이용하여 찾기 때문에, 새로운 객체를 생성하여 찾아도 equals조건만 맞는다면 찾을 수 있다.
        //결과적으로 5번 인덱스를 반환한다.
        int lastIndex = phoneList1.lastIndexOf(new Phone("samsung", "galaxy10"));
        System.out.println("lastIndex = " + lastIndex);


    }
}


