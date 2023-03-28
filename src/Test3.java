import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //1.键盘录入机票原价，月份，头等舱或经济舱
        Scanner sc1=new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int ticket= sc1.nextInt();
        System.out.println("请输入月份：");
        int month=sc1.nextInt();
        System.out.println("请输入舱位 0为头等舱 1为经济舱：");
        int level=sc1.nextInt();

        //2.判断月份是旺季还是淡季
        if(month>=5&&month<=10){
            ticket = getAnInt(ticket, level, 0.9, 0.85);
        }else if((month>=1&&month<=4)||(month>=11&&month<=12)){
            ticket = getAnInt(ticket, level, 0.7, 0.65);
        }else {
            System.out.println("请输入合法的月份");
        }
        //3.判断机票是经济舱还是头等舱

        //4.根据实际情况算出对应的价格
        System.out.println(ticket);
    }

    public static int getAnInt(int ticket, int level, double v, double v2) {
        if (level == 0) {
            ticket = (int) (ticket * v);
        } else if (level == 1) {
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("请输入和法的舱位");
        }
        return ticket;
    }

}
