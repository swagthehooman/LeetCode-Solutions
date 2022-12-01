class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
                a++;
        }
        for(int i=n;i<s.length();i++){
           char x=s.charAt(i); if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
                b++;
        }
        return a==b;
    }
}