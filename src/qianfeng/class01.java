package qianfeng;
/*
基础类型
 */
public class class01 {
    public static void main(String[] args) {
        String a = "String Type";

        /*
        讲小类型转化为大类型时候不需要强转，不存在丢失数据精度风险
        从int -> short时，可能丢失精度，当没有进行强转时候会报错
         */
        int num = 8;
        short l1 = (short) num;
        System.out.println("int to shrot " + l1);
        /*
        第一组num1 + num2的时候会当作数值类型相加
        直到遇到字符串的时候开始拼接
         */
        int num1 = 2,num2 = 3;
        System.out.println(num1 + num2 + "print" + num1 + num2);
        /*
        测试一下GitHub的功能
         */
    }
}
