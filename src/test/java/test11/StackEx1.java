package test11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    @Test
    public void test(){
        goUrl("1.nate");
        goUrl("2.yahoo");
        goUrl("3.naver");
        goUrl("4.daum");
        printStatus();
        goBack();
        System.out.println("===뒤로가기 버튼을 누른 후 ===");
        printStatus();
        goBack();
        System.out.println("===뒤로가기 버튼을 누른 후 ===");
        printStatus();

        goForward();
        System.out.println("=== 앞으로 가기 버튼을 누른 후 ===");
        printStatus();


        goUrl("codechobo.com");
        System.out.println("=== 새로운 주소로 이동 후에 ===");
        printStatus();
    }

    private static void printStatus() {
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println("현재화면은 '" +back.peek()+"' 입니다.");
        System.out.println();
    }



    public static void goUrl(String url){
        back.push(url);
        if(!forward.empty()){
            forward.clear();
        }
    }

    public static void goForward(){
        if(!forward.empty()){
            back.push(forward.pop());
        }
    }

    public static void goBack(){
        if(!back.empty()){
            forward.push(back.pop());
        }
    }
}
