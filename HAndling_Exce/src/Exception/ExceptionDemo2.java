package Exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        try{
             res = arr[9]; // primary logic
            throw new Exception("Request Fail due to Tech Error");
        }catch (Exception e){//not best practice first use child then use parent
              //handling code
             res = 10;// secondary logic
            System.out.println("Im In Catch");
            System.out.println(e.getMessage());
         }
        System.out.println(res);
    }
}
