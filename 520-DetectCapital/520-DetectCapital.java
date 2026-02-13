// Last updated: 2/13/2026, 10:17:54 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        String open="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] ch=word.toCharArray();
        int count=0,index=0;
        for(int i=0;i<ch.length;i++){
            if(open.indexOf(ch[i])!=-1){
                count++;
                index=i;
            }
        }
        if(count==word.length()||(count==1 && index==0)||count==0){
            return true;
        }else{
            return false;
        }
    }
}