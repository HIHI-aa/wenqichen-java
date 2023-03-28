public class Test2 {
    public static void main(String[] args) {
        int[] arr1={11,22,33,44,55};

        printArray(arr1);
        int max=maxArrayNumber(arr1);
        System.out.println(max);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }

    public static int maxArrayNumber(int[] arr){
        int maxNumber=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>maxNumber){
                maxNumber=arr[i];
            }

        }
        return maxNumber;
    }

}
