package solution_2;

import java.util.HashMap;
import java.util.Map;

public class NumJewelsInStones {
    public static int numJewelsInStone1(String J ,String S){
        char[] a = S.toCharArray();
        char[] b = J.toCharArray();
        int count = 0 ;
        if(a.length >50){
            return 0;
        }
        for(int i = 0; i <S.length(); i++){
            for(int j =0 ;j < J.length();j++){
                if(b[j] == a[i]){
                    count ++;
                }
            }
        }
        return count;
    }

    public static int numJewelsInStone2(String J ,String S){
        char[] a = S.toCharArray();
        char[] b = J.toCharArray();
        int count = 0;
        if(a.length > 50){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < J.length(); i ++){
            map.put(b[i],i);
        }

        for(int j = 0; j <S.length(); j++){
            if(map.containsKey(a[j])){
                count ++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String S = "aAAbbbb";
        String J = "aAb";
        System.out.println(numJewelsInStone2(J,S));

    }
}
