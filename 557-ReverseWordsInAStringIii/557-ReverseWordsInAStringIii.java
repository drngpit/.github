// Last updated: 2/13/2026, 10:17:53 AM
class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        for(int i=0;i<str.length;i++){
            StringBuilder k=new StringBuilder(str[i]);
            k.reverse();
            res[i]=k.toString();
        }
        String result = String.join(" ", res);
        return result;
    }
}