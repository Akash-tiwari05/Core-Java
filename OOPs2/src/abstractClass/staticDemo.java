package abstractClass;

class Test {
    static int a = 10;// memory allocate class loading
    int b = 20;
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
//    public static void m1(){
//        System.out.println(b);//error
//    }
}


public class staticDemo {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test.a = 200;

        t1.b = 30;
        System.out.println("t1b = " +t1.b);
        Test t2 = new Test();
        t2.a = 200;
        t2.b = 40;
        System.out.println("t2b = " +t2.b);
        System.out.println(Test.a);
    }
}
