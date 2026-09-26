class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        char []ch=s.toCharArray();
        char []chs=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chs);
        return Arrays.equals(ch,chs);

    }
}
