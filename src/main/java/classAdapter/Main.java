package classAdapter;

public class Main {

    //상속을 사용한 Adapter 패턴
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

}
