package solution_3;

import java.util.HashMap;
import java.util.Map;

public class NumUniqueEmails {
    public static int numUniqueEmails(String[] emails){
        int count = 0;
        String[] newEmails = new String[emails.length];
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < emails.length; i ++){
            if(!emails[i].contains("@")){
                return -1;
            }
            String temp = emails[i].substring(0,emails[i].lastIndexOf("@"));
            String last= emails[i].substring(emails[i].lastIndexOf("@"),emails[i].length());
            String newEmail = temp.replace(".","");
            if(newEmail.contains("+")){
                newEmail = newEmail.substring(0,newEmail.lastIndexOf("+"));
            }
            newEmail = newEmail + last;
            map.put(newEmail,i);
        }
        count = map.size();
        return count;
    }

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] email ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int i = numUniqueEmails(email);
        System.out.println(i);
    }
}
