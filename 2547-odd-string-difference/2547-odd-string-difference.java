class Solution {
    public String oddString(String[] words) {
        int n=words[0].length();
        List<int[]>ls=new ArrayList<>();
        for(String s:words){
            int arr[]=new int[s.length()-1];
            for(int i=0;i<s.length()-1;i++){
                arr[i]=s.charAt(i+1)-s.charAt(i);
            }
            ls.add(arr);
        }
        for(int i=1;i<ls.size()-1;i++){
            boolean l=false,r=false;
            int left[]=ls.get(i-1),mid[]=ls.get(i),right[]=ls.get(i+1);
            for(int j=0;j<n-1;j++){
                
                if(left[j]!=mid[j]){
                    l=true;
                    break;
                }
            }
            for(int j=0;j<n-1;j++){
                if(mid[j]!=right[j]){
                    r=true;            
                    break;
                }
            }
            if(l==false && r==true)return words[i+1];
            else if(l==true && r==false)return words[i-1];
            else if(l==true && r==true)return words[i];
            
            
        }
        return words[words.length-1];
    }
}