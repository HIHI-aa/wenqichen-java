public class copyArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] copyArr=copyOfRange(arr1,3,7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArray=new int[to-from];
        //伪造索引
        int index=0;
        for (int i=from;i<to;i++){
            newArray[index]=arr[i];
            index++;
        }
        return newArray;
    }
}

