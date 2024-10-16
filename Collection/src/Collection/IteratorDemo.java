package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(110);
        li.add(40);
        li.add(70);
        System.out.println(li);
        Iterator<Integer> Iterator = li.iterator();
        while(Iterator.hasNext()){
            Integer data = Iterator.next();

            if(data == 20){
                Iterator.remove();
            }
            System.out.print(data + " ");

        }
        System.out.println();
        System.out.println(li);
        int count = 0;
        ListIterator<Integer> listIterator = li.listIterator();
        while(listIterator.hasNext()){
            Integer next = listIterator.next();
            System.out.println(next);
            count++;
            if(count ==2){
                while(listIterator.hasPrevious()){
                    Integer previous = listIterator.previous();
                    System.out.println(previous  );
                }
            }
        }
    }
}
