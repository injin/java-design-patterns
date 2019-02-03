package memento.game;

import java.util.ArrayList;
import java.util.List;

// 상태클래스
public class Memento {
    int money;
    ArrayList<String> fruits;
    
    public int getMoney() {
        return money;
    }
    
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }
    
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    
    @SuppressWarnings("unchecked")
    List<String> getFruits() {
        return (List<String>)fruits.clone();
    }
    
}
