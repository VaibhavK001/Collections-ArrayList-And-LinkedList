import java.util.*;

public class RemoveByIterator{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Vaibhav");
        list.add("Prasad");
        list.add("Yash");
        list.add("Parth");
        list.add("Atharv");

        System.out.println(list);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String name =  itr.next();
            if(name.equals("Yash")){
                itr.remove();
            }
            else if (name.equals("Atharv")) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}