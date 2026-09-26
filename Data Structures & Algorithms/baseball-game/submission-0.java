class Solution {
    public int calPoints(String[] arr) {
        Stack <Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("+") || arr[i].equals("C") || arr[i].equals("D")){
                if(arr[i].equals("+")){
                    int a=(s.get(s.size()-1))+s.get((s.size()-2));
                    s.push(a);
                }
                if(arr[i].equals("C")){
                    s.pop();
                }if(arr[i].equals("D")){
                     int k=2*(s.get(s.size()-1));
                     s.push(k);
                }
            
            }else {
                int n=Integer.parseInt(arr[i]);
                s.push(n);
            }
        }
        int sum=0;
      for(int i: s){
        sum+=i;
      }
      return sum;
    }
}