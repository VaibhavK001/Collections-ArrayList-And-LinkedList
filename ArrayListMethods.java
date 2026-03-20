import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.get(0));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(50));

        System.out.println(list.isEmpty());

        List<Integer> newlist = new ArrayList<>();
        newlist.add(90);
        newlist.add(80);
        list.addAll(newlist);
        System.out.println(list);

        list.clear();
        System.out.println(list);


        
    }
}