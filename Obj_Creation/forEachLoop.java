public class forEachLoop {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int j = 10;
        for (int i = 0; i < 5; i++){
             arr[i] = j;
             j = j+10;
         }
         for(int data:arr){
            System.out.println(data);
         }
    
    }
}
