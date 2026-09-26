class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        for(int i=0;i<digits.length;i++){
            s+=String.valueOf(digits[i]);
        }
     long a=Long.parseLong(s)+1;
        s="";
        s=String.valueOf(a);
        int [] n=new int[s.length()];
        for(int i=0;i<s.length();i++){
            n[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return n;
    }
}
