public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //  If the string array is emtpy
        if(strs.length == 0) {
            return "";
        }
        
        //  If the array only contains one string
        if(strs.length == 1) {
            return strs[0];
        }
        
        
        //  Find the longest common prefix of the first two strings
        String lcp = strs[0];
        
        //  Call the longestCommonPrefix function to check for match between the current lcp and the next string
        int i = 1;
        while(lcp != "" && i < strs.length) {
            lcp = longestCommonPrefix(lcp, strs[i]);
            i++;
        }
        
        return lcp;
    }
    
    //  Find the longest common prefix given two string
    public String longestCommonPrefix(String one, String two) {
        
        //  Find the length of the smallest string
        int length = Math.min(one.length(), two.length());
        //  Longest Common Prefix string
        String lcp = "";
        
        //  Iterate over the characters of shortest string
        for(int i = 0; i < length; i++) {
            if(one.charAt(i) == two.charAt(i)) {
                lcp += one.charAt(i);
            }
            else {
                return lcp;
            }
        }
        return lcp;
        
    }
}