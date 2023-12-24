package condEx;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 31;
        
        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar ==0) {
            System.out.println("환전할 금액이 없다.");
        } else {
            System.out.printf("%d원입니다.",dollar*1300);
        }

    }
}
