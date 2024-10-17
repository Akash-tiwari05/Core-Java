package Exception;


public class TestException {
    public static void main(String[] args) {
//        int a = 10/0;//risky code
//        System.out.println(a);//risky code
        System.out.println("before try");
        try{
            System.out.println("Before risky code");
            int a = 10/0;//risky code
            System.out.println(a);//risky code
            System.out.println("After risky code");//after termision
        }
        catch (Exception e){
            System.out.println("In catch block");
            e.printStackTrace();
            System.out.println("to string "+ e.toString());
            System.out.println("get message" +e.getMessage());
        }
        System.out.println("Akash ");
        System.out.println("Tiwari");
    }
}
