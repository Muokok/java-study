package loop;

public class WhileEx2 {
    public static void main(String[] args) {

        int num = 2;
        int count = 1;

        while(count <=10){
            System.out.println(num);
            count++;
            num = num +2;
        }

        for(int i=1,number = 2; i<=10; i++, number +=2){
            System.out.println(i*2);
        }

    }
}
