package Collection;



import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("one",1);
        treeMap.put("two",2);
        treeMap.put("three",3);
        System.out.println(treeMap );
    }
}
