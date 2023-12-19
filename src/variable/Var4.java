package variable;

public class Var4 {
    public static void main(String[] args) {
        int a; // .out의 Var4.class 파일을 보면 이 int a; 코드가 사라지는데,
                // 이유는 변수 a를 사용하지 않으나 메모리만 차지하기에 자바에서 지워버린다.
        System.out.println(a);

        /*
        * 변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다.
        * 그런데 그 공간에 기존에 어떤 값이 있었는지는 아무도 모른다.
        * 따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있는데,
        * 이런 문제를 예방하기 위해 자바는 변수를 초기화 하도록 강제한다.
        * */
    }
}
