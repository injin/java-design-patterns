package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support noSup = new NoSupport("No");
        Support specialSup = new SpecialSupport("special", 429);
        Support oddSup = new OddSupport("odd");
        Support limit100Sup = new LimitSupport("limit100", 100);
        Support limit200Sup = new LimitSupport("limit200", 200);
        Support limit300Sup = new LimitSupport("limit300", 300);
        
        noSup.setNext(limit100Sup).setNext(specialSup)
            .setNext(limit200Sup).setNext(oddSup).setNext(limit300Sup);
        for (int i=0; i < 500; i += 33) {
            noSup.support(new Trouble(i));
        }
    }
}
