package qianfeng;

/*
与 或
 */
public class class03 {
    public static void main(String[] args) {
        /*
        & 与 同时为真则为真，一个为假则为假
        | 或 一个为真则为真，同时为假才为假
        ^ 异或 只要不同就为真
        ！非
        && 短路与
        || 短路或
         */
        boolean a = true,b = false;
        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(1==1?1:0);
    }
}
