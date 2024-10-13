
class finalTest{
    final void m1(){
        System.out.println("hello");
    }
}
class test extends finalTest{

}

public class finalDemo {


    public static void main(String[] args) {
        final int a = 10; // value can't be change after assign
        System.out.println(a);
        finalTest t = new test();
        t.m1();
    }
}
