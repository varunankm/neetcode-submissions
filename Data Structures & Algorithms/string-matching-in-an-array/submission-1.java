class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> str=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<words.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(words[j].contains(s)){
                        str.add(s);
                    }
                }
            }
        }
        List<String> l=new ArrayList<>();
        for(String g:str) l.add(g);
        return l;
    }
}