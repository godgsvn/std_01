package qianfeng;

public class class02 {
    public static void main(String[] args) {
        int num1 = 6;
        int res = ++ num1 + 3;
        int res2 = num1 ++ +3;
        System.out.println(num1);
        System.out.println(res);
        System.out.println(res2);
        System.out.println("-----------------------");
        int y = 2;
        int res3 = y ++ + ++ y - y --;
//        2 + 4 - 4
        System.out.println(y ++);
        System.out.println(res3);
        System.out.println(y);
        /*
        ++在前面先计算再使用 ++ i = i + 1
        ++在后面先使用再计算 i ++ = i
         */
    }
}
