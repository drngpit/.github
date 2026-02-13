// Last updated: 2/13/2026, 10:18:11 AM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int k=0;
            int sum=num;
            while(sum!=0){
                int digit=sum%10;
                k+=digit;
                sum/=10;
            }
            num=k;
        }
        return num;
    }
}