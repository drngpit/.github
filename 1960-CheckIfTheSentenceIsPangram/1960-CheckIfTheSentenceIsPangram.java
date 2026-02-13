// Last updated: 2/13/2026, 10:17:48 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
       char ch[]=sentence.toCharArray();
       Set<Character> set=new LinkedHashSet<>();
       for(char c:ch){
        set.add(c);
       } 
       if(set.size()==26){
        return true;
       }
       return false;      
    }
}