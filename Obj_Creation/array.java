public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // store array
        // int j = 10;
        // for (int i = 0; i < 5; i++){
        //     arr[i] = j;
        //     j = j+10;
        // }

        // for (int i = 0;i < 5; i++){
        //     // System.out.println(arr[i]);
        // }
        int [] crr =  new int[5];
        int j = 0;
        int c = 9;
        while (j <  5) {
            crr[j] = c;
            c = c + 10;
            j++;
        }
        for (int i = 0; i < 5; i++){
             System.out.println(crr[i]);
        }
    }
}
