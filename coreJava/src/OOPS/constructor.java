package OOPS;

class Monkey{
    public void sound(){
        System.out.println("Kho kho");
    }

}

class Animal{
    Monkey monkey;
    public void m1(){
        System.out.println("m1");
    }
    public void sum (int a, int b){
        System.out.println(a + b);
    }
    // how to create our custom constructor
//    Animal(){
//        System.out.println("CONSTRUCTION CHAL RAHA HAI......");
//    }
//    Animal(int b){// jab mene yaha pe constructor define kardiye to default const nahi banega
//
//    }
    public void sound(){
        monkey.sound();
    }
}


public class constructor {
    public static void main(String[] args) {
        Animal ac = new Animal(  );// default constructor
//        ac.m1(); method call
//        ac.sum(2,4);//parameter constructor
        ac.sound();
    }
}
