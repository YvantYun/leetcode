package solution_5;

import solution_4.Palindrome;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        if(s == null || s.length() < 1) {
            return -1;
        }
        char[] a = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        int temp = 0;
        int val = 0;
        for(int i = 0 ; i < s.length() ;i++){
            if (i == 0 || map.get(a[i]) <= map.get(a[i-1])){
                res += map.get(a[i]);
            }else{
                res += map.get(a[i] - 2 * map.get(a[i-1]));
            }

        }
        return res;
    }
}
