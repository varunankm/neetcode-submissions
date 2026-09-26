class Solution {
    public int scoreOfString(String s) {
        
        char [] ch=s.toCharArray();
        int [] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
         int asciivalue=ch[i];
         arr[i]=asciivalue;
        }
        int ans=0;
        for(int j=0;j<arr.length-1;j++){
           ans+=Math.abs(arr[j+1]-arr[j]);
        }
        return ans;
        
    }
}