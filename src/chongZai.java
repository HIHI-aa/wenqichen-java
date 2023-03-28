public class chongZai {
    public static void main(String[] args) {
        compareInt(10,20);
        compareInt((byte) 10,(byte) 20);
        byte a1=10;
        byte b1=20;
        compareInt(a1,b1);
    }
    public static void compareInt(byte a,byte b){
        System.out.println(a==b);
    }
    public static void compareInt(short a,short b){
        System.out.println(a==b);
    }
    public static void compareInt(int a,int b){
        System.out.println(a==b);
    }
    public static void compareInt(long a,long b){
        System.out.println(a==b);
    }
}
