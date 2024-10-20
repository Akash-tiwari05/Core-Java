// creationg object with refrence variable
public class object{
    public static void main(String[] args) {
        object obj = new object(); // creating obj object class
        // new kewword use to alocate refrance memory in heap
        obj.m1();
        
    }
    public static void m1(){
        System.out.println("Hello");
    }
}