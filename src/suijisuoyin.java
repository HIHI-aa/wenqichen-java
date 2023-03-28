import java.sql.SQLOutput;
import java.util.Random;

public class suijisuoyin {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomx= random.nextInt(arr.length);
            int temp=arr[randomx];
            arr[randomx]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
