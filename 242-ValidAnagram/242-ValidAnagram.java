// Last updated: 2/13/2026, 10:18:12 AM
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }else{
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                k++;
            }else{
                k=0;
            }
        }
        if(k==a.length){
            return true;
        }else{
            return false;
        }
       }
    }
}