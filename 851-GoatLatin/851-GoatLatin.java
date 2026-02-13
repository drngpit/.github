// Last updated: 2/13/2026, 10:17:49 AM
class Solution {
    public String toGoatLatin(String sentence) {
        String[] str = sentence.split(" ");
        String[] res = new String[sentence.length()];
        String vow="aeiouAEIOU";
        String characterAsString = "a";
        for(int i=0;i<str.length;i++){
            String k=str[i];
            String repeatedString = characterAsString.repeat(i+2);
            if(vow.indexOf(k.charAt(0))!=-1){
               res[i]=k+"m"+repeatedString;
            }else{
                res[i]="";
                for(int j=1;j<k.length();j++){
                    res[i]=res[i]+k.charAt(j);
                }
                res[i]=res[i]+k.charAt(0)+"m"+repeatedString;
            }
        }
        List<String> values = new ArrayList<>();
        for (String data : res) {
            if (data != null) {
                values.add(data);
            }
        }
        String result = String.join(" ", values);
        return result;

    }
}