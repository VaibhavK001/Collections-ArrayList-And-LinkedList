import java.util.*;

public class RemoveElements{
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            Integer n = itr.next();
            if(n%2==0){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}