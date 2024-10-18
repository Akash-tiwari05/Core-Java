package MultiThreading;

interface Demo{
    int a = 10; // by default public, static, final

    void method();// abstract, public
    //abstract: then I will depend on my child
}

class Test implements Demo{
    @Override
    public void method() {
        System.out.println("Hello");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.method();
    }
}
