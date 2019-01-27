package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    
    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();
    
    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> itr = directory.iterator();
        while(itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            size += entry.getSize();
        }
        
        return size;
    }
    
    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> itr = directory.iterator();
        while(itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            entry.printList(prefix + "/" + name);
        }
    }
    
    

}
