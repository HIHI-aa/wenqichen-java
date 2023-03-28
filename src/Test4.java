import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        //实现长度为5的验证码，前四位为大写字母或者小写字母

        //1.大写字母和小写字母都放到数组中
        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表 a=97
            if(i<=25) {
                chs[i] = (char) (97 + i);
            }else {
                //A=65
                chs[i]=(char)(65-26+i);
            }
        }

        //2.随机抽取4次
        //随机抽取数组的索引
        String result="";
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int randonIndex=r.nextInt(chs.length);
            result=result+chs[randonIndex];
        }

        //3.随机抽取一个数字0-9
        int randomNumber=r.nextInt(10);
        result=result+randomNumber;
        System.out.println(result);
    }

}
