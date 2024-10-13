package String;

public class typeCasting {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("The integer value is "+ a);
        double data = a;//widening
        System.out.println("the double value: " + data);
        double num = 10.999;
        System.out.println("the double value: " + num);
        int b = (int)num;
        System.out.println("The integer value is "+ b);
    }
}
