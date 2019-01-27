package decorator;

public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display) { // 인스턴스 생성시 '내용물'을 인수로 지정
        this.display = display;
    }
}
