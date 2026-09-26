class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
        char [] ch= details[i].toCharArray();
           String c =""+ch[11]+ch[12];
            int num = Integer.parseInt(c);
           if(num>60){
            count++;
           }
        }
        return count;
    }
}