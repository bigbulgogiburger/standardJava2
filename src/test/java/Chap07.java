import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Chap07 {

    @Test
    void ReferenceParamEx3_배열처리메서드(){
        int[] arr = new int[]{1,3,9,4,2,10};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
    }

    private void sortArr(int[] arr) {

        for(int i = 0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }
            }
        }
    }

    private void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    @Test
    void factorialTest(){
        int a = 3;
        int startValue =1;
        int result = factorial(a,startValue);
        System.out.println("result = " + result);
    }

    private int factorial(int a,int currentValue) {

        if(a == 1) return currentValue;

            return factorial(a-1, currentValue * a);

    }

    @Test
    void varArgsEx(){
        String[] strArr = {"100","200","300"};
        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",","100","200","300"));
        System.out.println(concatenate(",",new String[0]));
        System.out.println(concatenate(","));
    }

    private String concatenate(String delim, String... args){
        String result = "";

        for(String a : args){
            result +=a+delim;
        }
        return result;
    }

//    private String concatenate(String... args){
//        String result = "";
//
//        for(String a : args){
//            result +=a;
//        }
//        return result;
//    }


    @Test
    void carTest3_생성자주소복사(){
        Car car1 = new Car("a","b","c");

        Car car2 = new Car(car1);

        System.out.println("car1 = car2 " + (car1.car==car2.car));

        System.out.println(car1.toString());

        car2.car="hyundai";

        System.out.println(car1.toString());

    }

    @Test
    void blockTest_초기화블럭(){
        System.out.println("true = " + true);
        Block block = new Block();
    }

    @Test
    void cardGame(){
        Deck deck = new Deck();
        Card pick = deck.pick();
        System.out.println("pick = " + pick);
    }

}
