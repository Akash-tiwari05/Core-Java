package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); // Add Data iN lIST;
        if(list.isEmpty()){
            System.out.println("List IS Empt......");
        }else {
            System.out.println("List IS not Empty.");
        }
        list.add(10); // Add Data iN lIST;
        list.add(20);
        list.add(30);
        list.add(10); // duplicate data
        System.out.println(list);
        ////how to get index....
        System.out.println(list.get(3));
        for(int data:list){
            System.out.println(data);
        }
        System.out.println("Remove index");
    }
}
