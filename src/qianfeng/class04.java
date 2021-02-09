package qianfeng;

import java.util.Scanner;

/*
你是我触碰不到的风
醒不来的梦
 */
public class class04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        String str2 = new String();
//        if (str == "你是我触碰不到的风"){
//            str2 = "醒不来的梦";
//        }
//        System.out.println(str2);
//        int i1 = scan.nextInt();
//        if(i1 == 1){
//            System.out.println(i1);
//        }
        /*
        格式化输出 printf
        % 占位符  后面传入对应位置的参数
         */
        int age;
        String name;
        System.out.println("请输入年龄：");
        age = scan.nextInt();
        System.out.println("请输入姓名：");
        name = scan.next();
        System.out.printf("姓名：%s,年龄：%d",name,age);
    }
}
