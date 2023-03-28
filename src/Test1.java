public class Test1 {
    public static void main(String[] args) {
        getLength(3.5,2.7);
        circle(4);
        int sum1=getSum(20,30,40);
        int sum2=getSum(40,50,60);
        int sum3=getSum(40,50,60);
        int sum4=getSum(70,80,90);

        System.out.println(sum1+sum2+sum3+sum4);

        double area1=compare(3.4,5.7);
        double area2=compare(3.5,4.9);
        if(area1>area2) System.out.println("第一个长方形面积大");
        else if (area1==area2) System.out.println("两个长方形面积一样大");
        else System.out.println("第二个长方形面积大");

    }

    public static void getLength(double len,double width) {
        double result=(len+width)*2;
        System.out.println(result);
    }
//    圆的面积
    public static void circle(double r) {
        double result=3.14*r*r;
        System.out.println(result);
    }
//    计算营业额
    public static int getSum(int num1,int num2,int num3){
        int result=num1+num2+num3;
        return result;
    }
//    比较长方形的面积
    public static double compare(double len,double width){
        double area=len*width;
        return area;
    }
}
