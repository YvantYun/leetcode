package solution_4;

public class Palindrome {
    public boolean isPalindrome1(int x) {
        StringBuilder res = new StringBuilder();
        String str = String.valueOf(x);
        res.append(str);
        if(res.reverse().toString().equals(str)){
            return true;
        }else {
            return false;
        }
    }
    public boolean isPalindrome2(int x) {
        //当x < 0 有负号肯定不符合,同样如何是10的倍数尾数为0 只有0符合
        if(x <0 || (x %10==0 && x !=0)){
            return false;
        }
        int reverseX = 0;
        //x位数在减少  reverseX位数在增大，x为偶数长度,reverseX 和x 长度相等
        // x为奇数函数那么 会有 reverseX * 10 + 0;
        while (x > reverseX){
            //整数里  x% 10得到尾数
            //这样 得到反转的数字 reverseX
            // x/= 10 代表x去掉末尾的数字，类似于弹栈
            reverseX = reverseX * 10 + x %10;
            x = x /10;
        }

        return reverseX == x || x == reverseX /10;

    }


}
