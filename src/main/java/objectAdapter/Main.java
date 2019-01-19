package objectAdapter;

import objectAdapter.Print;
import objectAdapter.PrintBanner;

public class Main {

    //위임을 사용한 Adapter 패턴
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
