package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentdir = "";
    
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
        
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        
        Iterator<Entry> itr = directory.iterator();
        while(itr.hasNext()) {
            Entry entry = (Entry)itr.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }

}
