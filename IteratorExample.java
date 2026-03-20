import java.util.*;
public class IteratorExample{
    public static void main(String[] args) {
        
        List<Object> list = new ArrayList();
        list.add("Tanmay");
        list.add(120);
        list.add('V');
        list.add(12.90);
        list.add(true);
        list.add(12.490f);

        System.out.println(list);

        Iterator<Object> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}