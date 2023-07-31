import org.junit.jupiter.api.Test;


public class Flow26Ex {

    @Test
    void Test(){
        System.out.println("1 = " + 1);
    }

    @Test
    void FlowEx25_각자리수합더하기(){
        int num;
        int sum=0;

        num =123;

        while(num!=0){

            sum +=num%10;

            num /= 10;
        }

        System.out.println("sum = " + sum);
    }

    @Test
    void FlowEx29_369(){
        for(int i = 1; i<=333; i++){

            String a ="";
            int value = i;
            do{
                if((value%10)%3==0&&(value%10)!=0){
                    a+="짝";
                }
                value /= 10;

            }while(value!=0);
            System.out.println("i = "+i+", " + a);
        }
    }
}
