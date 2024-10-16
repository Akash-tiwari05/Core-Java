package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListRemoveDemo {
    public static void main(String[] args) {
        /*
        create list element
        read indexes
        if index is valid - remove the element from the list
        if index is not valid - display error
         */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(i);

        }
        System.out.println("List = "+ list);
        System.out.println("Enter the index is to remove = ");
        Scanner sc= new Scanner(System.in);
        int index = sc.nextInt();
        if(index <= list.size() - 1){
            list.remove(index);
            System.out.println("New List is = "+ list);
        }else{
            System.out.println("Index is Not Found....");
        }
        //to check the value
        System.out.println("Enter the element to check...");
        int ele = sc.nextInt();
        if(list.contains(ele)){

            System.out.println("Yes");
        }else{
            System.out.println(" No such ele Found....");

        }

    }
}
