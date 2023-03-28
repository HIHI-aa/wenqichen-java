public class Test5 {
    public static void main(String[] args) {
        //输出101-200之间的所有质数
        int num=0;
        for (int i = 101; i < 201; i++) {
            boolean flag=true;

            //判断i是否为质数
            for (int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    //跳出单层循环
                    break;
                }
            }

            if(flag){
                System.out.println(i+"为质数");
                num=num+1;
            }
        }
        System.out.println("共有"+num+"个质数");
    }
}
