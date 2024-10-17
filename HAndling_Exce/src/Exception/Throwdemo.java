package Exception;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ThrowsTest{
    void m1() throws IOException {
       m2();
    }
    void m2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(":D/"));
    }
}


public class Throwdemo {
    public static void main(String[] args) throws IOException {
        ThrowsTest throwsTest = new ThrowsTest();
        throwsTest.m1();
    }
}
