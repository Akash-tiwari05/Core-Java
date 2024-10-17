package Exception;

import java.io.*;

class ExceptionTest{

    void print1(){
        print2();
        System.out.println("kya Hua");
    }
     void print2(){
        print3();
    }
    void print3(){
        print4();
    }
    void print4(){
        print5();
    }
    void print5(){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Jo Hogaa Dekha Jayega");
            e.printStackTrace();
        }
    }
}

public class ExceptionWorking {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.print1();
    }
}