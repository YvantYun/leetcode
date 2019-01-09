package solution_1;

import java.util.Stack;

public class Resverse {
    public static int reverse1(int x){
        StringBuilder res = new StringBuilder();
        String str = String.valueOf(x);
        res.append(str);
        String rev = res.reverse().toString();
        return Integer.parseInt(rev);
    }

    public static int reverse2(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;//弹栈
            x /= 10; //弹栈后元素
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;//将弹栈后的元素*10压栈
        }
        return rev;

    }


    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse2(x));
    }
}
