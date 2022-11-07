class Solution {
    public int maximum69Number (int num) {
        int place=3,req=0,temp=num;
        while(temp!=0){
            if(temp%10==6)
                req=place;
            temp/=10;
            place*=10;
        }
        return num+req;
    }
}