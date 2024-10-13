package OOPS;

class Demo{
    int a =10;//instance area or instance variable
    
    void print(){
        String dog = "Skito";//local variable
        System.out.println(a);
        System.out.println(dog);
    }
    void display(){
        System.out.println(a);
//        System.out.println(dog); local variable
    }
}


public class variableDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
    }
}
